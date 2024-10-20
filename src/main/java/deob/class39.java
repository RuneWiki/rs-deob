package deob;

import java.util.Calendar;

@ObfuscatedName("ao")
public class class39 {

    @ObfuscatedName("ao.h")
    public static int[] field822 = new int[5];

    @ObfuscatedName("ao.s")
    public static int[][] field823 = new int[5][5000];

    @ObfuscatedName("ao.k")
    public static int[] field824 = new int[1000];

    @ObfuscatedName("ao.u")
    public static String[] field819 = new String[1000];

    @ObfuscatedName("ao.n")
    public static int field826 = 0;

    @ObfuscatedName("ao.b")
    public static class15[] field829 = new class15[50];

    @ObfuscatedName("ao.p")
    public static Calendar field828 = Calendar.getInstance();

    @ObfuscatedName("ao.w")
    public static final String[] field827 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ao.o")
    public static int field830 = 0;

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.l(Ll;I)V")
    public static void method196(class1 arg0) {
        Statics.method2150(arg0, 200000);
    }

    @ObfuscatedName("cq.r(IB)V")
    public static void method2159(int arg0) {
        if (arg0 == -1 || !class177.method172(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2837[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3.field2889 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field9 = var3.field2889;
                Statics.method2150(var4, 2000000);
            }
        }
    }
}
