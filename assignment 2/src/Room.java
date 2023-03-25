public class Room
{
    /**
     * setData - set the data of the room
     * @param roomNo - the number of the room
     * @param roomType - the type of the room
     * @param roomArea - the area of the room
     * @param acMachine - the ac machine of the room
     * displayData - display the data of the room
     * */

    private int roomNo;
    private String roomType;
    private String roomArea;
    private String acMachine;


    public void setData(int roomNo,String roomType,String roomArea,String acMachine)
    {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }

    public void displayData()
    {
        System.out.println("the number of room: "+roomNo+"" +
                ", the type of room: "+roomType+
                ", the room area: "+roomArea+
                ", the ac machine: "+acMachine);
    }
}

/**
 * Main_Room - the main class
 */

class Main_Room {
    public static void main(String[] args)
    {

        Room room1 = new Room();
        room1.setData(1,"single","20","yes");
        room1.displayData();

        Room room2 = new Room();
        room2.setData(2,"double","30","yes");
        room2.displayData();

        Room room3 = new Room();
        room3.setData(3,"triple","40","yes");
        room3.displayData(
);
    }
}