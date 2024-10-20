package deob;

@ObfuscatedName("ce")
public class class85 extends class207 {

    @ObfuscatedName("ce.z")
    public static class201 field1191 = new class201(128);

    @ObfuscatedName("ce.w")
    public int[] field1190;

    @ObfuscatedName("ce.s")
    public int[] field1197;

    @ObfuscatedName("ce.l")
    public String[] field1192;

    @ObfuscatedName("ce.u")
    public int field1193;

    @ObfuscatedName("ce.q")
    public int field1194;

    @ObfuscatedName("ce.k")
    public int field1189;

    @ObfuscatedName("ce.i")
    public int field1196;

    @ObfuscatedName("ce.x")
    public class198[] field1195;

    @ObfuscatedName("eo.z(II)Lce;")
    public static class85 method2869(int arg0) {
        class85 var1 = (class85) field1191.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field855.method4247(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class85 var3 = method98(var2);
            field1191.method3675(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("ek.w(IIB)Lce;")
    public static class85 method2874(int arg0, int arg1) {
        class85 var2 = (class85) field1191.method3681((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field855.method4264(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field855.method4311(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class85 var6 = method98(var5);
            if (var6 != null) {
                field1191.method3675(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("p.s([BI)Lce;")
    public static class85 method98(byte[] arg0) {
        class85 var1 = new class85();
        class183 var2 = new class183(arg0);
        var2.field2340 = var2.field2339.length - 2;
        int var3 = var2.method3253();
        int var4 = var2.field2339.length - 2 - var3 - 12;
        var2.field2340 = var4;
        int var5 = var2.method3374();
        var1.field1193 = var2.method3253();
        var1.field1194 = var2.method3253();
        var1.field1189 = var2.method3253();
        var1.field1196 = var2.method3253();
        int var6 = var2.method3247();
        if (var6 > 0) {
            var1.field1195 = var1.method1815(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3253();
                class198 var9 = new class198(var8 > 0 ? class188.method2961(var8) : 1);
                var1.field1195[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3374();
                    int var11 = var2.method3374();
                    var9.method3636(new class212(var11), (long) var10);
                }
            }
        }
        var2.field2340 = 0;
        var2.method3455();
        var1.field1190 = new int[var5];
        var1.field1197 = new int[var5];
        var1.field1192 = new String[var5];
        int var12 = 0;
        while (var2.field2340 < var4) {
            int var13 = var2.method3253();
            if (var13 == 3) {
                var1.field1192[var12] = var2.method3441();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1197[var12] = var2.method3247();
            } else {
                var1.field1197[var12] = var2.method3374();
            }
            var1.field1190[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("ce.l(II)[Lgu;")
    public class198[] method1815(int arg0) {
        return new class198[arg0];
    }
}
