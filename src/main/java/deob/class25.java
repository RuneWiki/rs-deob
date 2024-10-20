package deob;

import java.util.Calendar;

@ObfuscatedName("w")
public class class25 {

    @ObfuscatedName("w.c")
    public static int[] field395 = new int[5];

    @ObfuscatedName("w.r")
    public static int[][] field383 = new int[5][5000];

    @ObfuscatedName("w.k")
    public static int[] field384 = new int[1000];

    @ObfuscatedName("w.e")
    public static String[] field385 = new String[1000];

    @ObfuscatedName("w.q")
    public static int field393 = 0;

    @ObfuscatedName("w.u")
    public static class17[] field387 = new class17[50];

    @ObfuscatedName("w.o")
    public static Calendar field386 = Calendar.getInstance();

    @ObfuscatedName("w.h")
    public static final String[] field380 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class25() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.f(II)V")
    public static void method757(int arg0) {
        if (arg0 == -1 || !class157.method2697(arg0)) {
            return;
        }
        class157[] var1 = Statics.field2638[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3.field2590 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field12 = var3.field2590;
                Statics.method116(var4);
            }
        }
    }
}
