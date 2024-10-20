package deob;

import java.util.Calendar;

@ObfuscatedName("ab")
public class class34 {

    @ObfuscatedName("ab.q")
    public static int[] field738 = new int[5];

    @ObfuscatedName("ab.r")
    public static int[][] field739 = new int[5][5000];

    @ObfuscatedName("ab.v")
    public static int[] field740 = new int[1000];

    @ObfuscatedName("ab.y")
    public static String[] field743 = new String[1000];

    @ObfuscatedName("ab.k")
    public static int field736 = 0;

    @ObfuscatedName("ab.c")
    public static class14[] field747 = new class14[50];

    @ObfuscatedName("ab.a")
    public static Calendar field744 = Calendar.getInstance();

    @ObfuscatedName("ab.f")
    public static final String[] field742 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ab.i")
    public static int field746 = 0;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("r.o(Lo;I)V")
    public static void method74(class1 arg0) {
        Statics.method2145(arg0, 200000);
    }

    @ObfuscatedName("w.g(II)V")
    public static void method533(int arg0) {
        if (arg0 == -1 || !class164.method817(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2743[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3.field2718 != null) {
                class1 var4 = new class1();
                var4.field10 = var3;
                var4.field8 = var3.field2718;
                Statics.method2145(var4, 2000000);
            }
        }
    }
}
