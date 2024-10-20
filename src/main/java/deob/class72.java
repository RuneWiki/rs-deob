package deob;

@ObfuscatedName("bz")
public class class72 extends class406 {

    @ObfuscatedName("bz.s")
    public static class256 field955 = new class256(128);

    @ObfuscatedName("bz.h")
    public String field953;

    @ObfuscatedName("bz.w")
    public int[] field947;

    @ObfuscatedName("bz.v")
    public int[] field952;

    @ObfuscatedName("bz.c")
    public String[] field949;

    @ObfuscatedName("bz.q")
    public int field950;

    @ObfuscatedName("bz.i")
    public int field951;

    @ObfuscatedName("bz.k")
    public int field945;

    @ObfuscatedName("bz.o")
    public int field948;

    @ObfuscatedName("bz.n")
    public class420[] field954;

    @ObfuscatedName("d.s(II)Lbz;")
    public static class72 method93(int arg0) {
        class72 var1 = (class72) field955.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2168.method5179(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class72 var3 = method292(var2);
            field955.method4600(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("dl.h(IIII)Lbz;")
    public static class72 method2634(int arg0, int arg1, int arg2) {
        int var3 = class308.method6652(arg1, arg0);
        class72 var4 = method4905(var3, arg0);
        if (var4 == null) {
            int var5 = class308.method4895(arg2, arg0);
            class72 var6 = method4905(var5, arg0);
            return var6 == null ? null : var6;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("ka.w(IIB)Lbz;")
    public static class72 method4905(int arg0, int arg1) {
        class72 var2 = (class72) field955.method4599((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field2168.method5269(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field2168.method5186(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class72 var6 = method292(var5);
            if (var6 != null) {
                field955.method4600(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("x.v([BB)Lbz;")
    public static class72 method292(byte[] arg0) {
        class72 var1 = new class72();
        class444 var2 = new class444(arg0);
        var2.field4708 = var2.field4707.length - 2;
        int var3 = var2.method7120();
        int var4 = var2.field4707.length - 2 - var3 - 12;
        var2.field4708 = var4;
        int var5 = var2.method6934();
        var1.field950 = var2.method7120();
        var1.field951 = var2.method7120();
        var1.field945 = var2.method7120();
        var1.field948 = var2.method7120();
        int var6 = var2.method6929();
        if (var6 > 0) {
            var1.field954 = var1.method1835(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method7120();
                class420 var9 = new class420(var8 > 0 ? class272.method4475(var8) : 1);
                var1.field954[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method6934();
                    int var11 = var2.method6934();
                    var9.method6673(new class410(var11), (long) var10);
                }
            }
        }
        var2.field4708 = 0;
        var1.field953 = var2.method6938();
        var1.field947 = new int[var5];
        var1.field952 = new int[var5];
        var1.field949 = new String[var5];
        int var12 = 0;
        while (var2.field4708 < var4) {
            int var13 = var2.method7120();
            if (var13 == 3) {
                var1.field949[var12] = var2.method6975();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field952[var12] = var2.method6929();
            } else {
                var1.field952[var12] = var2.method6934();
            }
            var1.field947[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("bz.c(II)[Lpm;")
    public class420[] method1835(int arg0) {
        return new class420[arg0];
    }
}
