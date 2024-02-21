package Workbook1;
import java.util.Queue;
public class Tester {

    public static void print(Queue<Integer> q)
    {
        int x = 0;
        Queue<Integer> temp = new Queue<Integer>();


        while(!q.isEmpty())
        {
            x = q.remove();
            temp.add(x);
            System.out.println(x);
        }

        while(!temp.isEmpty())
        {
            q.add(temp.remove());
        }

    }

    public static int queueSize(Queue<Integer> q)
    {
        int count = 0;
        int x = 0;
        Queue<Integer> temp = new Queue<Integer>();
        while(!q.isEmpty())
        {
            x = q.remove();
            temp.add(x);

            count++;
        }

        while(!temp.isEmpty())
        {
            q.add(temp.remove());
        }

        return count;
    }


    public static int queueSum(Queue<Integer> q)
    {
        int sum = 0;
        int x = 0;

        Queue<Integer> temp = new Queue<Integer>();
        while(!q.isEmpty())
        {
            x = q.remove();
            temp.add(x);

            sum += x;
        }

        while(!temp.isEmpty())
        {
            q.add(temp.remove());
        }

        return sum;

    }

    public static int secondNum(Queue<Integer> q)
    {
        int x = 0;
        Queue<Integer> temp = new Queue<Integer>();
        while(!q.isEmpty())
        {
            x = q.remove();
            temp.add(x);
        }

        while(!temp.isEmpty())
        {
            q.add(temp.remove());
        }

        temp.remove();
        int wantedNum = temp.remove();

        return wantedNum;

    }

    public static int biggerQueueSum(Queue<Integer> q1, Queue<Integer> q2)
    {
        if (queueSum(q1) > queueSum(q2))
        {
            return queueSum(q1);
        }

        else if (queueSum(q1) < queueSum(q2))
        {
            return queueSum(q2);
        }

        else
        {
            return 0;
        }
    }


    public static boolean perfectQueue(Queue<Integer> q)
    {
        int queueLength = queueSize(q);
        int x = 0;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        Queue<Integer> temp = new Queue<Integer>();
        while(!q.isEmpty())
        {
            x = q.remove();
            temp.add(x);
            q.add(x);
        }

        while(!temp.isEmpty())
        {
            q.add(temp.remove());
        }

        for(int i = 0; i < queueLength / 2; i++)
        {
            x = temp.remove();
            firstHalfSum += x;

        }

        for(int j = 0; j < queueLength / 2; j++)
        {
            x = temp.remove();
            secondHalfSum += x;
        }

        if(firstHalfSum % 2 == 0 && secondHalfSum % 2 == 0)
            return (firstHalfSum == secondHalfSum);

        else
        {
            return false;
        }

    }
    public static boolean isExist (Queue<Integer> q)
    {
        int x = 0;
        Queue<Integer> temp = new Queue<Integer>();

        while(!q.isEmpty())
        {
            x = q.remove();
            temp.add(x);
        }
    }
    public static boolean problematicQueue(Queue<Integer> q)
    {
        boolean problematic = false;

        int x = 0;
        Queue<Integer> temp = new Queue<Integer>();
        while(!q.isEmpty())
        {
            x = q.remove();
            temp.add(x);
        }

        while(!temp.isEmpty())
        {
            q.add(temp.remove());
        }

        for(int i = 1; i<=100; i++)
        {
            if(!q.isExist(i))
            {
                problematic = true;
            }
        }

        return problematic;

    }



}
