/*A bus has n stops numbered from 0 to n - 1 that form a circle. We know the distance between all pairs of neighboring stops where distance[i]
     is the distance between the stops number i and (i + 1) % n.

  The bus goes along both directions i.e. clockwise and counterclockwise.

  Return the shortest distance between the given start and destination stops.
 */

public class Task1184{
    
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockwiseSum = 0, counterclockwiseSum = 0;
        for(int i = start; i != destination; i++){
            if(i == distance.length) i -= (distance.length);
            if(i == destination) break;
            clockwiseSum += distance[i];
        }

        for(int i = destination; i != start; i++){
            if(i == distance.length) i -= (distance.length);
            if(i == start) break;
            counterclockwiseSum += distance[i];
        }
        if(start == destination) return 0;
        return Math.min(clockwiseSum, counterclockwiseSum);
    }    
    
    public static void main(String[] args) {
        int[] distance = new int[]{6,47,48,31,10,27,46,33,52,33,38,25,32,45,36,3,0,33,22,53,8,13,18,1,44,41,14,5,38,25,48};
        System.out.println(distanceBetweenBusStops(distance, 22, 0));
    }
}