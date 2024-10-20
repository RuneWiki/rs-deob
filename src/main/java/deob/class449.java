package deob;

import java.util.Random;

@ObfuscatedName("ra")
public class class449 {

    public class449() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ra.ab([BI[BII)V")
    public static void method7708(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        if (arg0 == arg2) {
            if (arg1 == arg3) {
                return;
            }
            if (arg3 > arg1 && arg3 < arg1 + arg4) {
                int var9 = arg4 - 1;
                int var5 = arg1 + var9;
                int var6 = arg3 + var9;
                int var7 = var5 - var9;
                int var10 = var7 + 7;
                while (var5 >= var10) {
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                }
                var7 = var10 - 7;
                while (var5 >= var7) {
                    arg2[var6--] = arg0[var5--];
                }
                return;
            }
        }
        int var8 = arg1 + arg4;
        int var11 = var8 - 7;
        while (arg1 < var11) {
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
        }
        var8 = var11 + 7;
        while (arg1 < var8) {
            arg2[arg3++] = arg0[arg1++];
        }
    }

    @ObfuscatedName("ra.ad([III)V")
    public static void method7693(int[] arg0, int arg1, int arg2) {
        int var3 = arg1 + arg2 - 7;
        while (arg1 < var3) {
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
            arg0[arg1++] = 0;
        }
        var3 += 7;
        while (arg1 < var3) {
            arg0[arg1++] = 0;
        }
    }

    @ObfuscatedName("ra.aq([IIII)V")
    public static void method7694(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0 && arg3 == 0) {
            arg2 = (int) (Math.random() * 2.147483647E9D);
            arg3 = (int) (Math.random() * 2.147483647E9D);
        }
        long var4 = (long) arg2 << 32 | (long) arg3;
        Random var6 = new Random(var4);
        for (int var7 = arg1 - 1; var7 > 0; var7--) {
            int var8 = var6.nextInt(var7 + 1);
            if (var7 != var8) {
                int var9 = arg0[var7];
                arg0[var7] = arg0[var8];
                arg0[var8] = var9;
            }
        }
    }
}
