package datastructures;

public class Array {
    private int size;
    private int[] arr;

    private int counter=0;

    public Array(int size){
        this.size = size;
        this.arr = this.createArray();
    }

    public int[] createArray(){
        System.out.println("New Array Created with size "+size);
        return new int[size];
    }

    public void insert(int val){
        if (counter<size){
            arr[counter++] = val;
        }
        else{
            this.size *= 2 ;
            int[] newArr = createArray();
            for(int i=0;i<arr.length;i++){
                newArr[i] = arr[i];
            }
            newArr[counter++] = val;
            this.arr = newArr.clone();
        }
    }

    public void remove(int index){
        if(index>=0&&index<this.counter){
            this.size--;
            int[] newArr = createArray();
            for (int i=0;i<this.counter;i++){
                if (i==index){
                    continue;
                }
                else if(i<index) {
                        newArr[i] = arr[i];
                    }
                else {
                        newArr[i-1]=arr[i];
                    }
                }
            this.arr= newArr.clone();
            this.counter--;
            }
        else{
            throw new IllegalArgumentException();
        }
        }

    public void print(){
        for(int i:arr){
            System.out.println(i);
        }
    }

    public int indexOf(int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val)
                return i;
        }
        return -1;
    }

}
