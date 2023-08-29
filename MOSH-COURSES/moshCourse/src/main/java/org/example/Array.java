package org.example;

public class Array {
    private  int [] items;
    private int count;
    private int max;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item){
       //if the array is full , resize it
        if(items.length == count){
            // create a new array (twice the size)
            int [] newItems = new int[count * 2];
           // copy all the existing items
            for(int i = 0; i < count; i++)
                    newItems[i] = items[i];
            // Set "items" to this new array
            items = newItems;
        }

        // add an item in the last position of the array
        items[count] = item;
        // add 1 extra to the count
        count ++;
    }

    public void removeAt(int index){
        // Validate the index
        if(index < 0 || index >= count)
            throw  new  IllegalArgumentException();
        // Shift the items to the left to fill the hole

        for(int i = index; i < count; i++)
            items[i] = items[i + 1];

        count --;
    }

    public int indexOf(int item){
        for(int i = 0; i < count; i++)
            if(items[i] == item)
                return i;
        return -1;
    }

    public int max(){
        if(count == 0){
            throw new IllegalArgumentException("The array is empty");
        }
        max = items[0];
        for(int i = 0; i < count; i++)
           if(items[i] > max){
               max=items[i];
           }


        return max;
    }

    public void intersect(int[] inputArray) {
        for(int i = 0; i< count; i++)
            for(int j = 0; j< inputArray.length; j++)
             if(items[i] == inputArray[j]){
                 System.out.println(items[i]);
             }

    }

    public void reverse(int[] inputArray){
        for(int i= inputArray.length - 1 ; i>=0 ; i--){
            System.out.println(inputArray[i]);
        }
    }

    public void insertAt(int item, int index) {
        if (index < 0 || index > count) {
            throw new IllegalArgumentException("Invalid index");
        }

        if (count == items.length) {
            resizeArray();
        }

        for (int i = count - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }

        items[index] = item;
        count++;
    }

    private void resizeArray() {
        int[] newItems = new int[items.length * 2];
        for (int i = 0; i < count; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
    }


    public void print(){
        for(int i = 0; i < count; i++)
            System.out.println(items[i]);
    }


}


//insert method
// remove method
// index of method

