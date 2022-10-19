package homework1;

import org.junit.jupiter.api.Test;

public class LivingRoomObjects {
    @Test
    public void homework1() {

        Candle candle = new Candle();
        candle.setBurningTime(6);
        candle.setColour("black");
        candle.setLength(20.00);
        candle.setSize("large");
        candle.setShape("cylinder");

        System.out.println("Black Candle");
        System.out.println("Shape: " + candle.getShape());
        System.out.println("Burning time: " + candle.getBurningTime());
        System.out.println("Length: " + candle.getLength());
        System.out.println("Size: " + candle.getSize());
        System.out.println(" ");

        Cat cat = new Cat();
        cat.setColour("Black and White");
        cat.setAge(5);
        cat.setName("Mici");
        cat.setRace("Unknown");
        cat.setWeight(3.5);

        System.out.println("Mici, the happy kitty.");
        System.out.println("Age: " + cat.getAge());
        System.out.println("Colour: " + cat.getColour());
        System.out.println("Race: " + cat.getRace());
        System.out.println("Name: " + cat.getName());
        System.out.println("Weight: " + cat.getWeight());
        System.out.println(" ");

        CatHouse catHouse = new CatHouse();
        catHouse.setColour("Pink");
        catHouse.setShape("Rectangular");
        catHouse.setHeight(73.66);
        catHouse.setWidth(74.93);
        catHouse.setLength(48.26);
        catHouse.setMaximumWeight(20);

        System.out.println("Cat House");
        System.out.println("Colour: " + catHouse.getColour());
        System.out.println("Length: " + catHouse.getLength());
        System.out.println("Height: " + catHouse.getHeight());
        System.out.println("Shape: " + catHouse.getShape());
        System.out.println("Width: " + catHouse.getWidth());
        System.out.println("Maximum weight: " + catHouse.getMaximumWeight());
        System.out.println(" ");

        CoffeeTable coffeeTable = new CoffeeTable();
        coffeeTable.setSize("Medium");
        coffeeTable.setBlueLights(true);
        coffeeTable.setStyle("Modern");
        coffeeTable.setMaterial("Wood, tempered glass, lights, mirror");
        coffeeTable.setWatts(4);
        coffeeTable.setWeight(29);

        System.out.println("Infinity led coffee table");
        System.out.println("Material: " + coffeeTable.getMaterial());
        System.out.println("Style: " + coffeeTable.getStyle());
        System.out.println("Size: " + coffeeTable.getSize());
        System.out.println("Weight: " + coffeeTable.getWeight());
        System.out.println("Watts:" + coffeeTable.getWatts());
        System.out.println("Blue lights setting: " + coffeeTable.isBlueLights());
        System.out.println(" ");

        Pillow pillow = new Pillow();
        pillow.setMaterial("Cotton");
        pillow.setShape("Square");
        pillow.setSize("Small");
        pillow.setSoftness("Extra soft");
        pillow.setThickness(10.16);

        System.out.println("Fluffy Pillow ");
        System.out.println("Material: " + pillow.getMaterial());
        System.out.println("Shape: " + pillow.getShape());
        System.out.println("Size: " + pillow.getSize());
        System.out.println("Softness: " + pillow.getSoftness());
        System.out.println("Thickness: " + pillow.getThickness());
        System.out.println(" ");

        PlayStation playStation = new PlayStation();
        playStation.setMaker("SONY");
        playStation.setModel("PS4 Pro");
        playStation.setMemory(864.1);
        playStation.setVoltage(250);
        playStation.setWeight(3.3);

        System.out.println("Playstation");
        System.out.println("Maker: " + playStation.getMaker());
        System.out.println("Memory: " + playStation.getMemory());
        System.out.println("Model: " + playStation.getModel());
        System.out.println("Weight: " + playStation.getWeight());
        System.out.println("Voltage: " + playStation.getVoltage());
        System.out.println(" ");

        Stool stool = new Stool();
        stool.setColour("Rose gold");
        stool.setShape("Rectangular");
        stool.setDepth(76.2);
        stool.setVolume(80);
        stool.setMaterials("Linen, solid wood, foam");

        System.out.println("Stool with lid");
        System.out.println("Colour: " + stool.getColour());
        System.out.println("Shape: " + stool.getShape());
        System.out.println("Depth: " + stool.getDepth());
        System.out.println("Materials: " + stool.getMaterials());
        System.out.println("Volume: " + stool.getVolume());
        System.out.println(" ");

        TV tv = new TV();
        tv.setMaker("LG");
        tv.setWidth(55);
        tv.setDescription("LED screen");
        tv.setResolution(4);
        tv.setType("HDR");

        System.out.println("TV ");
        System.out.println("Maker: " + tv.getMaker());
        System.out.println("Type: " + tv.getType());
        System.out.println("Description: " + tv.getDescription());
        System.out.println("Resolution: " + tv.getResolution());
        System.out.println("Width: " + tv.getWidth());
        System.out.println(" ");

        Vase vase = new Vase();
        vase.setColour("Gray and White");
        vase.setDepth(12.7);
        vase.setMaterial("Mud");
        vase.setSize("Small");
        vase.setShape("Bottle Vase");

        System.out.println("Vase");
        System.out.println("Colour: " + vase.getColour());
        System.out.println("Depth: " + vase.getDepth());
        System.out.println("Material: " + vase.getMaterial());
        System.out.println("Shape: " + vase.getShape());
        System.out.println("Size: " + vase.getSize());
        System.out.println(" ");

        WallClock wallClock = new WallClock();
        wallClock.setMaterials("Wood and plastic.");
        wallClock.setShape("Round");
        wallClock.setColours("Multicolor picture");
        wallClock.setDecoration(true);
        wallClock.setWatts(1); //1 battery

        System.out.println("Wall clock");
        System.out.println("Colours: " + wallClock.getColours());
        System.out.println("Materials: " + wallClock.getMaterials());
        System.out.println("Shape: " + wallClock.getShape());
        System.out.println("Decoration CAT PRINT: " + wallClock.isDecoration());
        System.out.println("Watts : " + wallClock.getWatts());
    }
}
