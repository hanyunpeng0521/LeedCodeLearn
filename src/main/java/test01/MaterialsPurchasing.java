package test01;

import java.util.Scanner;

/**
 * 物资采购
 * 时间限制：C/C++语言 2000MS；其他语言 4000MS
 * 内存限制：C/C++语言 131072KB；其他语言 655360KB
 * 题目描述：
 * 某公司要建厂投产一种产品，已知该产品共需要k种不同的原材料才能生产，而在这个工厂周围有n个可供建厂的地址，同时这n个位置都生产该产品所需k种原材料中的一种，在这n个位置间存在一些通行的道路，我们可以视这些道路的长度都为1，保证这些位置之间两两都是连通的。
 * <p>
 * 很显然工厂面临一个很严峻的问题，就是原料采集，我们定义采集一种原材料的花费为工厂所在位置到最近的一个该材料的采集点的距离，在一个位置建厂的成本为k种原材料的采集花费之和。
 * <p>
 * 请你对每一个位置都求出其建厂的花费。
 * <p>
 * 输入
 * 输入第一行有三个正整数n,m,k，分别代表可供选择的建厂地址数量，编号为从1到n，这些地址之间的道路数量，生产所需的原材料数量，编号为1到k。(1<=n,m,<=50000,1<=k<=100)
 * <p>
 * 输入第二行包含n个正整数，第 i 个正整数a_i表示第i个地址是第a_i种原料的采集点。(1<=a_i<=k)
 * <p>
 * 接下来有m行，每行有两个正整数 u，v，表示u号位置和v号位置之间有一条连接的路径，可能存在重边或自环（如样例所示）。
 * <p>
 * 输出
 * 输出一行，包含 n个正整数，以空格分隔，第 i 个正整数表示第i个位置的建厂成本。
 * <p>
 * <p>
 * 样例输入
 * 5 5 3
 * 1 1 2 3 1
 * 1 4
 * 2 4
 * 3 4
 * 4 5
 * 4 3
 * 样例输出
 * 3 3 3 2 3
 *
 * @author hyp
 * Project name is LeedCodeLearn
 * Include in test01
 * hyp create at 20-3-12
 **/
public class MaterialsPurchasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        int[] aArr = new int[n];
        int[][] mArr = new int[m][2];
        for (int i = 0; i < aArr.length; i++) {
            aArr[i] = in.nextInt();
        }
        in.nextLine();
        for (int i = 0; i < mArr.length; i++) {
            mArr[i][0] = in.nextInt();
            mArr[i][1] = in.nextInt();
            in.nextLine();
        }


    }
}


