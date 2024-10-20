package deob;

@ObfuscatedName("bl")
public class class72 extends class387 {

    @ObfuscatedName("bl.c")
    public static class249 field967 = new class249(128);

    @ObfuscatedName("bl.l")
    public String field961;

    @ObfuscatedName("bl.s")
    public int[] field962;

    @ObfuscatedName("bl.e")
    public int[] field964;

    @ObfuscatedName("bl.r")
    public String[] field973;

    @ObfuscatedName("bl.o")
    public int field965;

    @ObfuscatedName("bl.i")
    public int field972;

    @ObfuscatedName("bl.w")
    public int field963;

    @ObfuscatedName("bl.v")
    public int field968;

    @ObfuscatedName("bl.a")
    public class401[] field969;

    @ObfuscatedName("ci.c(II)Lbl;")
    public static class72 method2195(int arg0) {
        class72 var1 = (class72) field967.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1671.method5066(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class72 var3 = method1006(var2);
            field967.method4482(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("bb.l(IIIB)Lbl;")
    public static class72 method1799(int arg0, int arg1, int arg2) {
        int var3 = class299.method79(arg1, arg0);
        class72 var4 = method1872(var3, arg0);
        if (var4 == null) {
            int var5 = class299.method3944(arg2, arg0);
            class72 var6 = method1872(var5, arg0);
            return var6 == null ? null : var6;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("ba.s(III)Lbl;")
    public static class72 method1872(int arg0, int arg1) {
        class72 var2 = (class72) field967.method4472((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1671.method5046(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1671.method5056(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class72 var6 = method1006(var5);
            if (var6 != null) {
                field967.method4482(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("bx.e([BI)Lbl;")
    public static class72 method1006(byte[] arg0) {
        class72 var1 = new class72();
        class421 var2 = new class421(arg0);
        var2.field4512 = var2.field4511.length - 2;
        int var3 = var2.method6666();
        int var4 = var2.field4511.length - 2 - var3 - 12;
        var2.field4512 = var4;
        int var5 = var2.method6669();
        var1.field965 = var2.method6666();
        var1.field972 = var2.method6666();
        var1.field963 = var2.method6666();
        var1.field968 = var2.method6666();
        int var6 = var2.method6686();
        if (var6 > 0) {
            var1.field969 = var1.method1884(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method6666();
                class401 var9 = new class401(var8 > 0 ? class264.method5144(var8) : 1);
                var1.field969[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method6669();
                    int var11 = var2.method6669();
                    var9.method6432(new class391(var11), (long) var10);
                }
            }
        }
        var2.field4512 = 0;
        var1.field961 = var2.method6721();
        var1.field962 = new int[var5];
        var1.field964 = new int[var5];
        var1.field973 = new String[var5];
        int var12 = 0;
        while (var2.field4512 < var4) {
            int var13 = var2.method6666();
            if (var13 == 3) {
                var1.field973[var12] = var2.method6674();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field964[var12] = var2.method6686();
            } else {
                var1.field964[var12] = var2.method6669();
            }
            var1.field962[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("bl.r(IB)[Lon;")
    public class401[] method1884(int arg0) {
        return new class401[arg0];
    }
}
