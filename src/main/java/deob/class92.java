package deob;

@ObfuscatedName("cs")
public class class92 extends class214 {

    @ObfuscatedName("cs.a")
    public static class208 field1270 = new class208(128);

    @ObfuscatedName("cs.s")
    public int[] field1271;

    @ObfuscatedName("cs.g")
    public int[] field1269;

    @ObfuscatedName("cs.x")
    public String[] field1278;

    @ObfuscatedName("cs.h")
    public int field1273;

    @ObfuscatedName("cs.f")
    public int field1274;

    @ObfuscatedName("cs.p")
    public int field1272;

    @ObfuscatedName("cs.m")
    public int field1276;

    @ObfuscatedName("cs.q")
    public class205[] field1277;

    @ObfuscatedName("de.g(IIB)Lcs;")
    public static class92 method2674(int arg0, int arg1) {
        class92 var2 = (class92) field1270.method3885((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1976.method4439(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1976.method4429(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class92 var6 = method959(var5);
            if (var6 != null) {
                field1270.method3878(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("be.x([BB)Lcs;")
    public static class92 method959(byte[] arg0) {
        class92 var1 = new class92();
        class190 var2 = new class190(arg0);
        var2.field2419 = var2.field2420.length - 2;
        int var3 = var2.method3610();
        int var4 = var2.field2420.length - 2 - var3 - 12;
        var2.field2419 = var4;
        int var5 = var2.method3460();
        var1.field1273 = var2.method3610();
        var1.field1274 = var2.method3610();
        var1.field1272 = var2.method3610();
        var1.field1276 = var2.method3610();
        int var6 = var2.method3443();
        if (var6 > 0) {
            var1.field1277 = var1.method2075(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3610();
                class205 var9 = new class205(var8 > 0 ? class195.method97(var8) : 1);
                var1.field1277[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3460();
                    int var11 = var2.method3460();
                    var9.method3859(new class219(var11), (long) var10);
                }
            }
        }
        var2.field2419 = 0;
        var2.method3463();
        var1.field1271 = new int[var5];
        var1.field1269 = new int[var5];
        var1.field1278 = new String[var5];
        int var12 = 0;
        while (var2.field2419 < var4) {
            int var13 = var2.method3610();
            if (var13 == 3) {
                var1.field1278[var12] = var2.method3647();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1269[var12] = var2.method3443();
            } else {
                var1.field1269[var12] = var2.method3460();
            }
            var1.field1271[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("cs.h(IB)[Lgs;")
    public class205[] method2075(int arg0) {
        return new class205[arg0];
    }
}
