class ParkingSystem {
    Map<Integer, Integer> map;
    int sc;
    int mc;
    int bg;
    int maxsc;
    int maxmc;
    int maxbc;
    public ParkingSystem(int big, int medium, int small) {
        maxsc = small;
        maxmc = medium;
        maxbc = big;
        map = new HashMap<>();
        map.put(1, maxbc);
        map.put(2, maxmc);
        map.put(3, maxsc);
    }
    
    public boolean addCar(int carType) {
        if (carType == 1) {
            if (maxbc == 0) {
                return false;
            } else {
                maxbc -= 1;
                map.put(carType, maxbc);
            }
        } else if (carType == 2) {
            if (maxmc == 0) {
                return false;
            } else {
                maxmc -= 1;
                map.put(carType, maxmc);
            }
        } else {
            if (maxsc == 0) {
                return false;
            } else {
                maxsc -= 1;
                map.put(carType, maxsc);
            }
        }
        
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
