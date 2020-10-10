import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
//	Robotics
//        Somewhere in the future, there is a robotics factory. The current project is assembly line robots.
//        Each robot has a processing time, the time it needs to process a product. When a robot is free it should take a product for processing and log his name, product and processing start time.
//        Each robot processes a product coming from the assembly line. A product is coming from the line each second (so the first product should appear at [start time + 1 second]). If a product passes the line and there is not a free robot to take it, it should be queued at the end of the line again.
//        The robots are standing on the line in the order of their appearance.
//        Input
//        •	On the first line, you will get the names of the robots and their processing times in format "robotName-processTime;robotName-processTime;robotName-processTime"
//        •	On the second line, you will get the starting time in format "hh:mm:ss"
//        •	Next, until the "End" command, you will get a product on each line.
//        Examples
//        Input
//        ROB-15;SS2-10;NX8000-3
//        8:00:00
//        detail
//        glass
//        wood
//        apple
//        End

//        Output
//        ROB - detail [08:00:01]
//        SS2 - glass [08:00:02]
//        NX8000 - wood [08:00:03]
//        NX8000 - apple [08:00:06]

//        Input
//        ROB-60
//        7:59:59
//        detail
//        glass
//        wood
//        sock
//        End

//        Output
//        ROB - detail [08:00:00]
//        ROB - sock [08:01:00]
//        ROB - wood [08:02:00]
//        ROB - glass [08:03:00]

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputRobots = scanner.nextLine().split(";");

        Map<String, Integer> robots = splitRobotsDataIntoLinkedMap(inputRobots);

        int[] processTimes = new int[robots.size()];

        String[] time = scanner.nextLine().split(":");
        
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int secounds = Integer.parseInt(time[2]);
        
        long totalSecounds = hours * 3600 + minutes * 60 + secounds;

        ArrayDeque<String> products = new ArrayDeque<>();

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            products.add(line);
            line = scanner.nextLine();
        }

        while (!products.isEmpty()) {
            
            totalSecounds++;
            
            String current = products.poll();

            decreaseProcessTime(processTimes);

            if(!assignJob(robots, processTimes, current , totalSecounds)){
                products.offer(current);
            }
            
        }


    }

    private static void decreaseProcessTime(int[] processTimes) {
        for (int i = 0; i < processTimes.length; i++) {
            if (processTimes[i]> 0){
                --processTimes[i];
            }
        }
    }

    private static boolean assignJob(Map<String, Integer> robots, int[] processTimes, String current, long totalSecounds) {
        for (int i = 0; i < processTimes.length; i++) {
            if (processTimes[i] == 0) {
                int count = 0;
                for (Map.Entry<String, Integer> entry : robots.entrySet()) {
                    if (count == i) {
                        processTimes[i] = entry.getValue();
                        logJobAssigned(entry.getKey(), current, totalSecounds);
                        return true;
                    }
                    count++;
                }
            }
        }
        return false;
    }

    private static void logJobAssigned(String name, String product, long totalSecounds) {
        long hours = totalSecounds / 3600;
        long minutes = (totalSecounds % 3600) / 60;
        long secounds = totalSecounds % 60;

        System.out.println(String.format("%s - %s [%02d:%02d:%02d]",name,product,hours,minutes,secounds));
    }


    private static Map<String, Integer> splitRobotsDataIntoLinkedMap(String[] inputRobots) {
        Map<String, Integer> robots = new LinkedHashMap<>();

        for (int i = 0; i < inputRobots.length; i++) {
            String line = inputRobots[i];
            int index = line.indexOf("-");

            String name = line.substring(0, index);
            int time = Integer.parseInt(line.substring(index + 1));

            robots.put(name, time);
        }
        return robots;
    }


}
