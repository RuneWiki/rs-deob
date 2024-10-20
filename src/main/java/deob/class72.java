package deob;

@ObfuscatedName("be")
public class class72 extends class365 {

    @ObfuscatedName("be.l")
    public static class236 field954 = new class236(128);

    @ObfuscatedName("be.q")
    public String field957;

    @ObfuscatedName("be.f")
    public int[] field945;

    @ObfuscatedName("be.j")
    public int[] field948;

    @ObfuscatedName("be.m")
    public String[] field949;

    @ObfuscatedName("be.k")
    public int field950;

    @ObfuscatedName("be.t")
    public int field951;

    @ObfuscatedName("be.a")
    public int field946;

    @ObfuscatedName("be.e")
    public int field953;

    @ObfuscatedName("be.i")
    public class379[] field952;

    @ObfuscatedName("q.l(IB)Lbe;")
    public static class72 method13(int arg0) {
        class72 var1 = (class72) field954.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1352.method4756(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class72 var3 = method1035(var2);
            field954.method4225(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("gq.q(IIII)Lbe;")
    public static class72 method3565(int arg0, int arg1, int arg2) {
        int var3 = class281.method4021(arg1, arg0);
        class72 var4 = method1932(var3, arg0);
        if (var4 == null) {
            int var5 = (-3 - arg2 << 8) + arg0;
            class72 var7 = method1932(var5, arg0);
            return var7 == null ? null : var7;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("bl.f(III)Lbe;")
    public static class72 method1932(int arg0, int arg1) {
        class72 var2 = (class72) field954.method4223((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1352.method4771(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1352.method4762(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class72 var6 = method1035(var5);
            if (var6 != null) {
                field954.method4225(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("bu.j([BI)Lbe;")
    public static class72 method1035(byte[] arg0) {
        class72 var1 = new class72();
        class401 var2 = new class401(arg0);
        var2.field4292 = var2.field4294.length - 2;
        int var3 = var2.method6284();
        int var4 = var2.field4294.length - 2 - var3 - 12;
        var2.field4292 = var4;
        int var5 = var2.method6277();
        var1.field950 = var2.method6284();
        var1.field951 = var2.method6284();
        var1.field946 = var2.method6284();
        var1.field953 = var2.method6284();
        int var6 = var2.method6272();
        if (var6 > 0) {
            var1.field952 = var1.method1865(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method6284();
                class379 var9 = new class379(var8 > 0 ? class246.method2634(var8) : 1);
                var1.field952[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method6277();
                    int var11 = var2.method6277();
                    var9.method6043(new class369(var11), (long) var10);
                }
            }
        }
        var2.field4292 = 0;
        var1.field957 = var2.method6280();
        var1.field945 = new int[var5];
        var1.field948 = new int[var5];
        var1.field949 = new String[var5];
        int var12 = 0;
        while (var2.field4292 < var4) {
            int var13 = var2.method6284();
            if (var13 == 3) {
                var1.field949[var12] = var2.method6474();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field948[var12] = var2.method6272();
            } else {
                var1.field948[var12] = var2.method6277();
            }
            var1.field945[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("be.m(II)[Lnz;")
    public class379[] method1865(int arg0) {
        return new class379[arg0];
    }
}
