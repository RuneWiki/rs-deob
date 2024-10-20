package deob;

@ObfuscatedName("hu")
public class class232 {

    @ObfuscatedName("hu.b")
    public static int[] field2738 = new int[32];

    @ObfuscatedName("hu.q")
    public static int[] field2737;

    @ObfuscatedName("hu.o")
    public static int[] field2740;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2738[var1] = var0 - 1;
            var0 += var0;
        }
        field2737 = new int[2000];
        field2740 = new int[2000];
    }

    public class232() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.b(II)I")
    public static int method248(int arg0) {
        class271 var1 = (class271) class271.field3474.method3658((long) arg0);
        class271 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field293.method4158(14, arg0);
            class271 var4 = new class271();
            if (var3 != null) {
                var4.method4453(new class194(var3));
            }
            class271.field3474.method3659(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field3471;
        int var7 = var2.field3473;
        int var8 = var2.field3472;
        int var9 = field2738[var8 - var7];
        return field2740[var6] >> var7 & var9;
    }

    @ObfuscatedName("cl.q(III)V")
    public static void method1727(int arg0, int arg1) {
        class271 var2 = (class271) class271.field3474.method3658((long) arg0);
        class271 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field293.method4158(14, arg0);
            class271 var5 = new class271();
            if (var4 != null) {
                var5.method4453(new class194(var4));
            }
            class271.field3474.method3659(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3471;
        int var8 = var3.field3473;
        int var9 = var3.field3472;
        int var10 = field2738[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        field2740[var7] = field2740[var7] & ~var11 | arg1 << var8 & var11;
    }
}
