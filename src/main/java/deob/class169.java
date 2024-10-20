package deob;

@ObfuscatedName("fj")
public class class169 {

    @ObfuscatedName("fj.i")
    public short[] field1792;

    @ObfuscatedName("fj.f")
    public short[] field1791;

    public class169(int arg0) {
        class189 var2 = Statics.method268(arg0);
        if (var2.method3385()) {
            this.field1792 = new short[var2.field2089.length];
            System.arraycopy(var2.field2089, 0, this.field1792, 0, this.field1792.length);
        }
        if (var2.method3371()) {
            this.field1791 = new short[var2.field2088.length];
            System.arraycopy(var2.field2088, 0, this.field1791, 0, this.field1791.length);
        }
    }

    @ObfuscatedName("mh.v(ILpi;I)Lfj;")
    public static class169 method5915(int arg0, class438 arg1) {
        int var2 = arg1.method6971();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class169 var5 = new class169(arg0);
        if (var3) {
            int var6 = arg1.method6971();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1792 != null && var5.field1792.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method7148();
                    if (var8) {
                        var5.field1792[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method6971();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1791 != null && var5.field1791.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method7148();
                    if (var13) {
                        var5.field1791[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
