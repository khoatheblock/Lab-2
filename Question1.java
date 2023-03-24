import java.util.*;
import java.util.Scanner;
import java.util.Random;
class Question1
{
    static int width, height;
    public int n = 4;
    Random random = new Random();
    int[] parh = {};
    int[] parw = {};
    int[] parn = {};
    for (int i = 0; i < 3; i++)
    {
        parw[i] = random.nextInt(width);
        parh[i] = random.nextInt(height); 
        parn[i] = i + 1;
    }
    class Singleton
    {
        private static Singleton box[][];
        private Singleton() {}
        public Singleton getInstance()
        {
            for (int i = 0; i < width; i++)
            {
                for (int j = 0; j < height; j++)
                {
                    if (box[i][j] == null)
                    {
                        box[i][j] = new Singleton();
                    }
                    return box[i][j];
                }
            }
        }
    }
    void simulation(int step)
    {
        if (step == -1)
        {
            System.out.println("Aborted.");
            return;
        }
        else for (int i = 0; i < step; i++)
        {
            for (int m = 0; m < n; m++)
            {
                if (parn[i] != 0)
                {
                    int j = random.nextInt(8 - 1) + 1;
                    if (j == 1)
                    {
                        parh[i] = parh[i] - 1;
                        if (parw[i] < 0 || parw[i] > width || parh[i] < 0  || parh[i] > height)
                        {
                            System.out.println("Error with the movement of the particle.");
                            return;
                        }
                        for (int b = 0; b < n; b++)
                        {
                            for (int a = 0; a < n; a++)
                            {
                                if (parw[b] == parw[a] && parh[b] == parh[a])
                                {
                                    parw[n - 1] = random.nextInt(width);
                                    parh[n - 1] = random.nextInt(height); 
                                    parn[n - 1] = n;
                                    n++;
                                }
                            }
                        }
                    }
                    if (j == 2)
                    {
                        parh[i] = parh[i] - 1;
                        parw[i] = parw[i] + 1;
                        if (parw[i] < 0 || parw[i] > width || parh[i] < 0  || parh[i] > height)
                        {
                            System.out.println("Error with the movement of the particle.");
                            return;
                        }
                        for (int b = 0; b < n; b++)
                        {
                            for (int a = 0; a < n; a++)
                            {
                                if (parw[b] == parw[a] && parh[b] == parh[a])
                                {
                                    parw[n - 1] = random.nextInt(width);
                                    parh[n - 1] = random.nextInt(height); 
                                    parn[n - 1] = n;
                                    n++;
                                }
                            }
                        }
                    }
                    if (j == 3)
                    {
                        parw[i] = parw[i] + 1;
                        if (parw[i] < 0 || parw[i] > width || parh[i] < 0  || parh[i] > height)
                        {
                            System.out.println("Error with the movement of the particle.");
                            return;
                        }
                        for (int b = 0; b < n; b++)
                        {
                            for (int a = 0; a < n; a++)
                            {
                                if (parw[b] == parw[a] && parh[b] == parh[a])
                                {
                                    parw[n - 1] = random.nextInt(width);
                                    parh[n - 1] = random.nextInt(height); 
                                    parn[n - 1] = n;
                                    n++;
                                }
                            }
                        }
                    }
                    if (j == 4)
                    {
                        parh[i] = parh[i] + 1;
                        parw[i] = parw[i] + 1;
                        if (parw[i] < 0 || parw[i] > width || parh[i] < 0  || parh[i] > height)
                        {
                            System.out.println("Error with the movement of the particle.");
                            return;
                        }
                        for (int b = 0; b < n; b++)
                        {
                            for (int a = 0; a < n; a++)
                            {
                                if (parw[b] == parw[a] && parh[b] == parh[a])
                                {
                                    parw[n - 1] = random.nextInt(width);
                                    parh[n - 1] = random.nextInt(height); 
                                    parn[n - 1] = n;
                                    n++;
                                }
                            }
                        }
                    }
                    if (j == 5)
                    {
                        parh[i] = parh[i] + 1;
                        if (parw[i] < 0 || parw[i] > width || parh[i] < 0  || parh[i] > height)
                        {
                            System.out.println("Error with the movement of the particle.");
                            return;
                        }
                        for (int b = 0; b < n; b++)
                        {
                            for (int a = 0; a < n; a++)
                            {
                                if (parw[b] == parw[a] && parh[b] == parh[a])
                                {
                                    parw[n - 1] = random.nextInt(width);
                                    parh[n - 1] = random.nextInt(height); 
                                    parn[n - 1] = n;
                                    n++;
                                }
                            }
                        }
                    }
                    if (j == 6)
                    {
                        parh[i] = parh[i] + 1;
                        parw[i] = parw[i] - 1;
                        if (parw[i] < 0 || parw[i] > width || parh[i] < 0  || parh[i] > height)
                        {
                            System.out.println("Error with the movement of the particle.");
                            return;
                        }
                        for (int b = 0; b < n; b++)
                        {
                            for (int a = 0; a < n; a++)
                            {
                                if (parw[b] == parw[a] && parh[b] == parh[a])
                                {
                                    parw[n - 1] = random.nextInt(width);
                                    parh[n - 1] = random.nextInt(height); 
                                    parn[n - 1] = n;
                                    n++;
                                }
                            }
                        }
                    }
                    if (j == 7)
                    {
                        parw[i] = parw[i] - 1;
                        if (parw[i] < 0 || parw[i] > width || parh[i] < 0  || parh[i] > height)
                        {
                            System.out.println("Error with the movement of the particle.");
                            return;
                        }
                        for (int b = 0; b < n; b++)
                        {
                            for (int a = 0; a < n; a++)
                            {
                                if (parw[b] == parw[a] && parh[b] == parh[a])
                                {
                                    parw[n - 1] = random.nextInt(width);
                                    parh[n - 1] = random.nextInt(height); 
                                    parn[n - 1] = n;
                                    n++;
                                }
                            }
                        }
                    }
                    if (j == 8)
                    {
                        parh[i] = parh[i] - 1;
                        parw[i] = parw[i] - 1;
                        if (parw[i] < 0 || parw[i] > width || parh[i] < 0  || parh[i] > height)
                        {
                            System.out.println("Error with the movement of the particle.");
                            return;
                        }
                        for (int b = 0; b < n; b++)
                        {
                            for (int a = 0; a < n; a++)
                            {
                                if (parw[b] == parw[a] && parh[b] == parh[a])
                                {
                                    parw[n - 1] = random.nextInt(width);
                                    parh[n - 1] = random.nextInt(height); 
                                    parn[n - 1] = n;
                                    n++;
                                }
                            }
                        }
                    }
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                } 
                else i = 0;
            }
        }
    }
    String display(int width, int height)
    {
        for (int g = 0; g < height; g++)
        {
            for (int h = 0; h < width; h++)
            {
                if (g == 1 || g == height || h == 1 || h == width || ((parw[i] != 0) && (parh[i] != 0) && (parn[i] != 0)))
                {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
        }
    }
    public static void main(String[] args)
    {
        Question1 box[][];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = input.nextInt();
        System.out.println("Enter height ");
        int height = input.nextInt();
        input.close();
        while (1 < 2)
        {
            System.out.println("Enter number of steps for simulation (-1 to abort): ");
            int step = input.nextInt();
            box[width][height].simulation(step);
            box[width][height].display(width, height);
            if (step == -1)
            {
                break;
            }
        }
    }
}