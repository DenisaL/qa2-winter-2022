package homework1;

public class CoffeeTable {
//        -----------------------ATTRIBUTES------------------------
        private String material;
        private String style;
        private String size;
        private double weight;
        private int watts;
        private boolean blueLights;

//        -------------------------------------GETTERS/SETTERS-----------------------------


        public String getMaterial() {
                return material;
        }

        public void setMaterial(String material) {
                this.material = material;
        }

        public String getStyle() {
                return style;
        }

        public void setStyle(String style) {
                this.style = style;
        }

        public String getSize() {
                return size;
        }

        public void setSize(String size) {
                this.size = size;
        }

        public double getWeight() {
                return weight;
        }

        public void setWeight(double weight) {
                this.weight = weight;
        }

        public int getWatts() {
                return watts;
        }

        public void setWatts(int watts) {
                this.watts = watts;
        }

        public boolean isBlueLights() {
                return blueLights;
        }

        public void setBlueLights(boolean blueLights) {
                this.blueLights = blueLights;
        }
}
