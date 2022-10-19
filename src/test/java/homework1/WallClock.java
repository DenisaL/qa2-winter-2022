package homework1;

public class WallClock {
//    --------------------------ATTRIBUTES---------------------
        private String shape;
        private String colours;
        private String materials;
        private int watts;
        private boolean decoration;

//        ---------------------------------GETTERS/SETTERS-----------------------


        public String getShape() {
                return shape;
        }

        public void setShape(String shape) {
                this.shape = shape;
        }

        public String getColours() {
                return colours;
        }

        public void setColours(String colours) {
                this.colours = colours;
        }

        public String getMaterials() {
                return materials;
        }

        public void setMaterials(String materials) {
                this.materials = materials;
        }

        public int getWatts() {
                return watts;
        }

        public void setWatts(int watts) {
                this.watts = watts;
        }

        public boolean isDecoration() {
                return decoration;
        }

        public void setDecoration(boolean decoration) {
                this.decoration = decoration;
        }
}
