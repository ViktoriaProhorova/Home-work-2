import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int channel;
        String[] Channels = {
                "Channel0", "Channel1", "Channel2",
                "Channel3", "Channel4", "Channel5",
                "Channel6", "Channel7"
        };
        do {
            System.out.print("Click any channel from 1 to 7 - ");
            channel = new Scanner(System.in).nextInt();
            if (channel != 0) {
                if ((channel > 7) || (channel < 0)) {
                    System.out.println("Clicked channel doesn't exist. Please click any channel from 1 to 7.");
                } else {
                    System.out.println(Channels[channel]);
                }
            }
        } while (channel != 0);
    }
}
