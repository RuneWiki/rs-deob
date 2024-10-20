package deob;

@ObfuscatedName("fx")
public class class168 {

    @ObfuscatedName("fx.w")
    public short[] field1791;

    @ObfuscatedName("fx.v")
    public short[] field1792;

    public class168(int arg0) {
        class188 var2 = class188.method2231(arg0);
        if (var2.method3304()) {
            this.field1791 = new short[var2.field2092.length];
            System.arraycopy(var2.field2092, 0, this.field1791, 0, this.field1791.length);
        }
        if (var2.method3305()) {
            this.field1792 = new short[var2.field2103.length];
            System.arraycopy(var2.field2103, 0, this.field1792, 0, this.field1792.length);
        }
    }

    @ObfuscatedName("du.s(ILqr;I)Lfx;")
    public static class168 method2416(int arg0, class444 arg1) {
        int var2 = arg1.method6929();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class168 var5 = new class168(arg0);
        if (var3) {
            int var6 = arg1.method6929();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1791 != null && var5.field1791.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method7120();
                    if (var8) {
                        var5.field1791[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method6929();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1792 != null && var5.field1792.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method7120();
                    if (var13) {
                        var5.field1792[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
