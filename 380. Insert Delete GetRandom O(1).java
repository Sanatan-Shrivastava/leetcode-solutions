class RandomizedSet {
    // ...HashSet for storing the numbers;

    public Set<Integer> set;

    public RandomizedSet() {
        set = new HashSet<>();
    }

    public boolean insert(int val) {
        /*
         * Inserts an item val into the set if not present. Returns true if the item was
         * not present, false otherwise.
         */
        if (set.contains(val)) {
            return false;
        } else {
            set.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        /*
         * Removes an item val from the set if present. Returns true if the item was
         * present, false otherwise.
         */
        if (set.contains(val)) {
            set.remove(val);
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        /*
         * Returns a random element from the current set of elements (it's guaranteed
         * that at least one element exists when this method is called). Each element
         * must have the same probability of being returned.
         */

        // generating a random number
        int random = (int) (Math.random() * set.size());

        // temporary list to access element on the 'random' index;
        List<Integer> temp = new ArrayList<>();

        temp.addAll(set);
        int randomNumber = temp.get(random);

        // returning the random number;
        return randomNumber;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */