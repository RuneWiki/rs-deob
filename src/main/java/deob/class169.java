package deob;

@ObfuscatedName("fn")
public class class169 {

    @ObfuscatedName("fn.l")
    public short[] field1848;

    @ObfuscatedName("fn.k")
    public short[] field1845;

    public class169(int arg0) {
        class189 var2 = class189.method2903(arg0);
        if (var2.method3341()) {
            this.field1848 = new short[var2.field2157.length];
            System.arraycopy(var2.field2157, 0, this.field1848, 0, this.field1848.length);
        }
        if (var2.method3342()) {
            this.field1845 = new short[var2.field2148.length];
            System.arraycopy(var2.field2148, 0, this.field1845, 0, this.field1845.length);
        }
    }

    @ObfuscatedName("dw.o(ILpx;B)Lfn;")
    public static class169 method2645(int arg0, class440 arg1) {
        int var2 = arg1.method7071();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class169 var5 = new class169(arg0);
        if (var3) {
            int var6 = arg1.method7071();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1848 != null && var5.field1848.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method7082();
                    if (var8) {
                        var5.field1848[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method7071();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1845 != null && var5.field1845.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method7082();
                    if (var13) {
                        var5.field1845[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
