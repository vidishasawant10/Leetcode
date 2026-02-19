
public class DesignHashSet {
    //array to store the values index wise and by doing hash
    private boolean [][] storage;
    private int bucket;
    private int bucketItems;

    public DesignHashSet(){
        //generated squareroot of the total size of the keys, 100000 -> 1000 buckets and 1000 bucket items per buckets
        bucket = 1000;
        bucketItems = 1000;
        storage = new boolean[bucket][];
    }
    //hashing key for the primary array by taking modulos
    private int hashIndex1(int key){
        return key % bucket; //this gives row value
    }
    private int hashIndex2(int key){
        return key / bucketItems; //this gives column value
    }
    private void add(int key){
        int bucket = hashIndex1(key);
        int bucketItem = hashIndex2(key);
        
        //checking if the primary array is null, if so check the index value, 
        // if the index is 0 we add 1 element extra to avoid nested collision 
        //or else just create a boolean array of length 1000
        //eg: key = 12345 -> bucket = 345 % 1000 = 345, bucketItems = 12345 / 1000 = 12 so it represents theno itself
        if(storage[bucket] == null){
            if(bucket == 0){
                storage[bucket] = new boolean[bucketItems + 1]; 
            }else{
                storage[bucket] = new boolean[bucketItems];
            }
        }
        storage[bucket][bucketItem] = true;
    }
    
    private void remove(int key){
        int bucket = hashIndex1(key);
        int bucketItem = hashIndex2(key);
//if the bucket is already empty then we return because there is nothing to remove
        if(storage[bucket] == null){
            return;
        }
//if the bucket is not empty then we mark the value at the index as false to remove it
        storage[bucket][bucketItem] = false;
    }
    private boolean contains(int key){
        int bucket = hashIndex1(key);
        int bucketItem = hashIndex2(key);

        if(storage[bucket] == null){
            return false;
        }

        return storage[bucket][bucketItem];
    }
    public static void main(String args[]) {
        DesignHashSet hashSet = new DesignHashSet();

        hashSet.add(1);
        hashSet.add(2);
        // hashSet.printArr();
        System.out.println(hashSet.contains(1));
        System.out.println(hashSet.contains(3));
        hashSet.add(2);
        System.out.println(hashSet.contains(2));
        hashSet.remove(1);
        System.out.println(hashSet.contains(2));

    }

}
