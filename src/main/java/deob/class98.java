package deob;

@ObfuscatedName("ct")
public class class98 extends class195 {

    @ObfuscatedName("ct.w")
    public static class190 field1523 = new class190(128);

    @ObfuscatedName("ct.s")
    public int[] field1522;

    @ObfuscatedName("ct.q")
    public int[] field1528;

    @ObfuscatedName("ct.o")
    public String[] field1527;

    @ObfuscatedName("ct.g")
    public int field1525;

    @ObfuscatedName("ct.v")
    public int field1526;

    @ObfuscatedName("ct.p")
    public int field1521;

    @ObfuscatedName("ct.e")
    public int field1529;

    @ObfuscatedName("ct.d")
    public class187[] field1524;

    @ObfuscatedName("fr.w(II)Lct;")
    public static class98 method2811(int arg0) {
        class98 var1 = (class98) field1523.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field449.method3876(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class98 var3 = method161(var2);
            field1523.method3371(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("cw.s(Lhy;IIB)Lct;")
    public static class98 method1603(class220 arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0.field2789;
        class98 var5 = method102(var3, arg0);
        if (var5 == null) {
            int var6 = class225.method937(arg2, arg0);
            class98 var7 = method102(var6, arg0);
            return var7 == null ? null : var7;
        } else {
            return var5;
        }
    }

    @ObfuscatedName("h.q(ILhy;I)Lct;")
    public static class98 method102(int arg0, class220 arg1) {
        class98 var2 = (class98) field1523.method3357((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field449.method3955(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field449.method3916(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class98 var6 = method161(var5);
            if (var6 != null) {
                field1523.method3371(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("r.o([BB)Lct;")
    public static class98 method161(byte[] arg0) {
        class98 var1 = new class98();
        class174 var2 = new class174(arg0);
        var2.field2390 = var2.field2389.length - 2;
        int var3 = var2.method3178();
        int var4 = var2.field2389.length - 2 - var3 - 12;
        var2.field2390 = var4;
        int var5 = var2.method3131();
        var1.field1525 = var2.method3178();
        var1.field1526 = var2.method3178();
        var1.field1521 = var2.method3178();
        var1.field1529 = var2.method3178();
        int var6 = var2.method2971();
        if (var6 > 0) {
            var1.field1524 = var1.method1746(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3178();
                class187 var9 = new class187(class178.method629(var8));
                var1.field1524[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3131();
                    int var11 = var2.method3131();
                    var9.method3324(new class199(var11), (long) var10);
                }
            }
        }
        var2.field2390 = 0;
        var2.method2979();
        var1.field1522 = new int[var5];
        var1.field1528 = new int[var5];
        var1.field1527 = new String[var5];
        int var12 = 0;
        while (var2.field2390 < var4) {
            int var13 = var2.method3178();
            if (var13 == 3) {
                var1.field1527[var12] = var2.method3111();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1528[var12] = var2.method2971();
            } else {
                var1.field1528[var12] = var2.method3131();
            }
            var1.field1522[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("ct.g(II)[Lgk;")
    public class187[] method1746(int arg0) {
        return new class187[arg0];
    }
}
