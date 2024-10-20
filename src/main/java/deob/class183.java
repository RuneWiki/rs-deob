package deob;

@ObfuscatedName("he")
public class class183 {

    @ObfuscatedName("he.av")
    public short[] field1891;

    @ObfuscatedName("he.as")
    public short[] field1889;

    public class183(int arg0) {
        class206 var2 = class206.method5155(arg0);
        if (var2.method3637()) {
            this.field1891 = new short[var2.field2210.length];
            System.arraycopy(var2.field2210, 0, this.field1891, 0, this.field1891.length);
        }
        if (var2.method3681()) {
            this.field1889 = new short[var2.field2245.length];
            System.arraycopy(var2.field2245, 0, this.field1889, 0, this.field1889.length);
        }
    }

    @ObfuscatedName("gb.at(ILtz;I)Lhe;")
    public static class183 method3062(int arg0, class501 arg1) {
        int var2 = arg1.method8129();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class183 var5 = new class183(arg0);
        if (var3) {
            int var6 = arg1.method8129();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1891 != null && var5.field1891.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method8195();
                    if (var8) {
                        var5.field1891[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method8129();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1889 != null && var5.field1889.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method8195();
                    if (var13) {
                        var5.field1889[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
