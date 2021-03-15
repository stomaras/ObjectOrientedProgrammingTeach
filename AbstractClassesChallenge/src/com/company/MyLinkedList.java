package com.company;

public class MyLinkedList implements NodeList{

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // the list was empty so this item becomes the head of the List
            this.root = newItem;
            return true;
        }
        // We must start comparing from the head of the List
        // We get head item the head of the List with the above mentioned way
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0){
                // newItem is greater, move right if possible
                // So if ther is some way we can actually go forward.
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next , so insert at the end of the list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // new item is less so insert before.
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // the previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // new item is is equal with current item
                System.out.println(newItem.getValue() + " is already present, not added. ");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item : " + item.getValue());
        }
        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // found the item to delte
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(comparison < 0){
                currentItem = currentItem.next();
            } else {
                return false;
            }
        }
        // We have reached at the end of the list
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The List is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
