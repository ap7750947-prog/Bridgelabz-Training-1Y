class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = 3.141592653589793;
        // Volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;
        // Convert radius to miles
        double radiusMiles = radiusKm * 0.621371;
        // Volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * pi * radiusMiles * radiusMiles * radiusMiles;
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}

	
