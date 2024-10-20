package deob;

import java.util.Calendar;

@ObfuscatedName("al")
public class class34 {

    @ObfuscatedName("al.w")
    public static int[] field751 = new int[5];

    @ObfuscatedName("al.t")
    public static int[][] field754 = new int[5][5000];

    @ObfuscatedName("al.s")
    public static int[] field750 = new int[1000];

    @ObfuscatedName("al.c")
    public static String[] field747 = new String[1000];

    @ObfuscatedName("al.d")
    public static int field755 = 0;

    @ObfuscatedName("al.v")
    public static class14[] field756 = new class14[50];

    @ObfuscatedName("al.n")
    public static Calendar field758 = Calendar.getInstance();

    @ObfuscatedName("al.x")
    public static final String[] field759 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("al.o")
    public static int field752 = 0;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eo.p(Lp;I)V")
    public static void method2786(class1 arg0) {
        Statics.method2814(arg0, 200000);
    }

    @ObfuscatedName("dv.e(II)V")
    public static void method2438(int arg0) {
        if (arg0 == -1 || !class164.method3121(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2642[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3.field2731 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field8 = var3.field2731;
                Statics.method2814(var4, 2000000);
            }
        }
    }
}
