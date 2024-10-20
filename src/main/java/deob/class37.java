package deob;

import java.util.Calendar;

@ObfuscatedName("aw")
public class class37 {

    @ObfuscatedName("aw.j")
    public static int[] field784 = new int[5];

    @ObfuscatedName("aw.k")
    public static int[][] field787 = new int[5][5000];

    @ObfuscatedName("aw.i")
    public static int[] field785 = new int[1000];

    @ObfuscatedName("aw.m")
    public static String[] field778 = new String[1000];

    @ObfuscatedName("aw.p")
    public static int field779 = 0;

    @ObfuscatedName("aw.h")
    public static class15[] field780 = new class15[50];

    @ObfuscatedName("aw.b")
    public static Calendar field781 = Calendar.getInstance();

    @ObfuscatedName("aw.f")
    public static final String[] field782 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("aw.y")
    public static int field786 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fu.n(Ln;I)V")
    public static void method2960(class1 arg0) {
        Statics.method2902(arg0, 200000);
    }

    @ObfuscatedName("cp.s(II)V")
    public static void method1925(int arg0) {
        if (arg0 == -1 || !class173.method585(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2840[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2814 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field2 = var3.field2814;
                Statics.method2902(var4, 2000000);
            }
        }
    }
}
