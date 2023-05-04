/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utslabpbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface RemoteBehavior {
    void performAction();
}

class Maju implements RemoteBehavior {
    public void performAction() {
        System.out.println("mobil maju");
    }
}

class Mundur implements RemoteBehavior {
    public void performAction() {
        System.out.println("mobil mundur");
    }
}

class BelokKiri implements RemoteBehavior {
    public void performAction() {
        System.out.println("mobil belok kiri");
    }
}

class BelokKanan implements RemoteBehavior {
    public void performAction() {
        System.out.println("mobil belok kanan");
    }
}

class Klakson implements RemoteBehavior {
    public void performAction() {
        System.out.println("mobil mengeluarkan suara klakson");
    }
}

class HeadLampOn implements RemoteBehavior {
    public void performAction() {
        System.out.println("lampu depan mobil nyala");
    }
}

class HeadLampOff implements RemoteBehavior {
    public void performAction() {
        System.out.println("lampu depan mobil mati");
    }
}

class RemoteButton {
    private String label;
    private RemoteBehavior behavior;

    public RemoteButton(String label, RemoteBehavior behavior) {
        this.label = label;
        this.behavior = behavior;
    }

    public String getLabel() {
        return label;
    }

    public void click() {
        behavior.performAction();
    }
}

class RemoteControl {
    private List<RemoteButton> buttons;

    public RemoteControl() {
        buttons = new ArrayList<RemoteButton>();
        buttons.add(new RemoteButton("Maju", new Maju()));
        buttons.add(new RemoteButton("Mundur", new Mundur()));
        buttons.add(new RemoteButton("BelokKiri", new BelokKiri()));
        buttons.add(new RemoteButton("BelokKanan", new BelokKanan()));
        buttons.add(new RemoteButton("Klakson", new Klakson()));
        buttons.add(new RemoteButton("HeadLampOn", new HeadLampOn()));
        buttons.add(new RemoteButton("HeadLampOff", new HeadLampOff()));
    }

    public void draw() {
        // Display remote control interface
    }

    public void buttonClicked(int index) {
        RemoteButton button = buttons.get(index);
        button.click();
    }
}

class MobileRemoteControl {
    private RemoteControl remoteControl;
    private int batteryLevel;

    public MobileRemoteControl() {
        remoteControl = new RemoteControl();
        batteryLevel = 100;
    }

    public void draw() {
    }

    public void buttonClicked(int index) {
        remoteControl.buttonClicked(index);
        batteryLevel -= 5; 
        // penurunan baterai sebanyakk 5% setiap kali tombol diketik/digunakan
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}

public class No1 {

    public static void main(String[] args) {
        MobileRemoteControl mobileRemoteControl = new MobileRemoteControl();
        mobileRemoteControl.draw();
 
    Scanner scanner = new Scanner(System.in);
    int selectedButtonIndex = -1;
    
    while (selectedButtonIndex != 0) {
        System.out.print("Ketik angka yang diinginkan (ketik 0 jika ingin menutup program) : ");
        selectedButtonIndex = scanner.nextInt();
        
        if (selectedButtonIndex > 0 && selectedButtonIndex <= 7) {
            mobileRemoteControl.buttonClicked(selectedButtonIndex - 1);
            System.out.println("Baterai: " + mobileRemoteControl.getBatteryLevel() + "%");
        } else if (selectedButtonIndex != 0) {
            System.out.println("Angka yang ada masukkan salah, silakan coba lagi 1-6");
        }
    }
    
    System.out.println("Program di tutup");

    }
    
}
