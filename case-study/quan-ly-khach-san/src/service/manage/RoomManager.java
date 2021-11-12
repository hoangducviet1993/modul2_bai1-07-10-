package service.manage;

import model.Room;
import model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RoomManager {
    public static ArrayList<Room> roomList;

    private RoomManager() {

    }

    public static ArrayList<Room> getRoomList() {
        if (roomList == null) {
            roomList = new ArrayList<>();
//            roomList.add(new Room(101, 10000, Room.READY, 1, 2));
//            roomList.add(new Room(102, 10000, Room.READY, 1, 1));
//            roomList.add(new Room(103, 20000, Room.READY, 2, 2));
        }
        return roomList;
    }

    public static void setRoomList(ArrayList<Room> roomList) {
        RoomManager.roomList = roomList;
    }

    public static void add(Room room) throws IOException {
        roomList.add(room);
        writeRoomToFile();
    }

    public static int findIndexById(int id) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getRoomId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static void edit() throws IOException {
        getRoomList();
        int roomId = 0;
        System.out.print("Nhập số phòng muốn sửa: ");
        while (findIndexById(roomId) == -1) {
            Scanner scanner = new Scanner(System.in);
            try {
                roomId = scanner.nextInt();
                if (findIndexById(roomId) == -1) {
                    System.err.println("Phòng không tồn tại! ");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error! ");
            }
        }
        delete(roomId);
        System.out.println("Nhập thông tin phòng: ");
        add(createRoom());
        System.out.println("Cập nhật thành công!!!");
    }

    public static void delete(int id) throws IOException {
        if (findIndexById(id) != -1) {
            roomList.remove(findIndexById(id));
        } else {
            System.out.println("Không có tài khoản cần xóa: ");
        }
        writeRoomToFile();
    }

    public static Room createRoom() {
        getRoomList();
        System.out.print("Nhập số phòng: ");
        int roomId = -1;
        while (findIndexById(roomId) != -1 || roomId < 0) {
            Scanner scanner = new Scanner(System.in);
            try {
                roomId = scanner.nextInt();
                if (findIndexById(roomId) != -1) {
                    System.err.println("Phòng đã tồn tại: ");
                }
                if (roomId < 0) {
                    System.err.println("Số phòng không hợp lệ: ");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error!! ");
            }
        }
        System.out.print("Nhập số giường ngủ: ");
        int numberOfBed = -1;
        while (numberOfBed < 0) {
            Scanner sc = new Scanner(System.in);
            try {
                numberOfBed = sc.nextInt();
                if (numberOfBed < 0) {
                    System.err.println("Số lượng giường ngủ không hợp lệ: ");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error!!");
            }
        }
        System.out.print("Nhập số nhà vệ sinh: ");
        int numberOfToilet = -1;
        while (numberOfToilet < 0) {
            Scanner sc = new Scanner(System.in);
            try {
                numberOfToilet = sc.nextInt();
                if (numberOfToilet < 0) {
                    System.err.println("Số lượng nhà vệ sinh không hợp lệ:.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error!!");
            }
        }
        System.out.print("Nhập giá phòng: ");
        int price = -1;
        while (price < 0) {
            Scanner sc = new Scanner(System.in);
            try {
                price = sc.nextInt();
                if (price < 0) {
                    System.err.println("Số tiền phải lớn hơn 0: ");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error!!");
            }
        }
        return new Room(roomId, price, Room.READY, numberOfBed, numberOfToilet);
    }

    public static void displayListRoom() {
        Collections.sort(roomList);
        System.out.println();
        System.out.println("____________________***  DANH SÁCH TOÀN BỘ PHÒNG  ***_____________________");
        System.out.printf("%-10s %-10s %-20s %-15s %-15s %n", "Số phòng", "Giá phòng", "Trạng thái phòng", "Số giường ngủ", "Số nhà VS");
        System.out.println();
        for (Room room : roomList) {
            System.out.println(room);
        }
        System.out.println("_________________________________________________________________________");
        System.out.println();

    }

    public static void displayReadyRoom() {

        for (Room room : roomList) {
            if (room.getStatus().equals(Room.READY)) {
                System.out.println(room);
            }
        }
        System.out.println("_____________________________________________________________________");
        System.out.println();
    }

    public static void findInformationById() {
        getRoomList();
        int roomId = 0;
        System.out.print("Nhập số phòng: ");
        while (findIndexById(roomId) == -1) {
            Scanner sc = new Scanner(System.in);
            try {
                roomId = sc.nextInt();
                if (findIndexById(roomId) == -1) {
                    System.err.println("Phòng không tồn tại. Vui lòng nhập lại.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Số phòng không hợp lệ. Vui lòng nhập lại");
            }
        }
        getInformationById(roomId);
    }

    public static void getInformationById(int id) {
        Room room = getRoomList().get(findIndexById(id));
        System.out.println();
        System.out.println("______________________***  THÔNG TIN VỀ PHÒNG " + id + " ***______________________");
        System.out.printf("%-10s %-10s %-20s %-15s %-15s %n", "Số phòng", "Giá phòng", "Trạng thái phòng", "Số giường ngủ", "Số nhà VS");
        System.out.println();
        System.out.println(room);
        System.out.println("__________________________________________________________________________");
        System.out.println();
    }

    public static void findInformationByPrice() {
        System.out.println("Nhập giá Min: ");
        int minPrice = -1;
        while (minPrice < 0) {
            Scanner sc = new Scanner(System.in);
            try {
                minPrice = sc.nextInt();
                if (minPrice < 0) {
                    System.err.println("Số tiền không hợp lệ:");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error!!");
            }
        }
        System.out.println("Nhập giá Max: ");
        int maxPrice = -1;
        while (maxPrice < 0 || maxPrice < minPrice) {
            Scanner sc = new Scanner(System.in);
            try {
                maxPrice = sc.nextInt();
                if (maxPrice < 0) {
                    System.err.println("Số tiền không hợp lệ: ");
                }
                if (maxPrice < minPrice) {
                    System.err.println("Giá tiền nhỏ hơn giá Min:");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error!!");
            }
        }
        getRoomByPrice(minPrice, maxPrice);
    }

    public static void getRoomByPrice(int minPrice, int maxPrice) {

        for (Room room : roomList) {
            if (room.getPrice() >= minPrice && room.getPrice() <= maxPrice) {
                System.out.println(room);
            }
        }
        System.out.println("_________________________________________________________________________");

    }



    public static void writeRoomToFile() throws IOException{
        Collections.sort(roomList);
        FileWriter fileWriter = new FileWriter("src/service/roomManageFile.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        StringBuilder str = new StringBuilder("Số phòng,Giá thuê phòng,Trạng thái hiện tại,Số giường ngủ, Số nhà vệ sinh");
        for (Room room : roomList) {
            str.append("\n").append(room.getRoomId()).append(",");
            str.append(room.getPrice()).append(",");
            str.append(room.getStatus()).append(",");
            str.append(room.getNumberOfBeds()).append(",");
            str.append(room.getNumberOfToilet());
        }
        bufferedWriter.write(str.toString());
        bufferedWriter.close();
    }

    public static void readRoomFromFile() throws IOException {
        roomList = new ArrayList<>();
        FileReader fileReader = new FileReader("src/service/roomManageFile.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String content = bufferedReader.readLine();
        while ((content = bufferedReader.readLine()) != null) {
            String[] array = content.split(",");
            int roomID = Integer.parseInt(array[0]);
            int price = Integer.parseInt(array[1]);
            String status = array[2];
            int numberOfBed = Integer.parseInt(array[3]);
            int numberOfToilet = Integer.parseInt(array[4]);
            roomList.add(new Room(roomID, price, status, numberOfBed, numberOfToilet));
        }
        bufferedReader.close();
        fileReader.close();
    }

//
}
