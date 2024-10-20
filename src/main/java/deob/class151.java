package deob;

@ObfuscatedName("ey")
public class class151 {

    @ObfuscatedName("ey.s")
    public short[] field1599;

    @ObfuscatedName("ey.a")
    public short[] field1601;

    public class151(int arg0) {
        class170 var2 = class170.method2586(arg0);
        if (var2.method3050()) {
            this.field1599 = new short[var2.field1907.length];
            System.arraycopy(var2.field1907, 0, this.field1599, 0, this.field1599.length);
        }
        if (var2.method3029()) {
            this.field1601 = new short[var2.field1891.length];
            System.arraycopy(var2.field1891, 0, this.field1601, 0, this.field1601.length);
        }
    }

    @ObfuscatedName("fw.i(ILop;B)Ley;")
    public static class151 method2838(int arg0, class401 arg1) {
        int var2 = arg1.method6240();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class151 var5 = new class151(arg0);
        if (var3) {
            int var6 = arg1.method6240();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1599 != null && var5.field1599.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method6242();
                    if (var8) {
                        var5.field1599[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method6240();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1601 != null && var5.field1601.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method6242();
                    if (var13) {
                        var5.field1601[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
