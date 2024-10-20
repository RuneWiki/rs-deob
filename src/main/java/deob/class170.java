package deob;

@ObfuscatedName("gx")
public class class170 {

    @ObfuscatedName("gx.ar")
    public short[] field1793;

    @ObfuscatedName("gx.ao")
    public short[] field1794;

    public class170(int arg0) {
        class203 var2 = class203.method3907(arg0);
        if (var2.method3650()) {
            this.field1793 = new short[var2.field2134.length];
            System.arraycopy(var2.field2134, 0, this.field1793, 0, this.field1793.length);
        }
        if (var2.method3637()) {
            this.field1794 = new short[var2.field2143.length];
            System.arraycopy(var2.field2143, 0, this.field1794, 0, this.field1794.length);
        }
    }

    @ObfuscatedName("ly.at(ILuj;I)Lgx;")
    public static class170 method5314(int arg0, class527 arg1) {
        int var2 = arg1.method8410();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class170 var5 = new class170(arg0);
        if (var3) {
            int var6 = arg1.method8410();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1793 != null && var5.field1793.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method8412();
                    if (var8) {
                        var5.field1793[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method8410();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1794 != null && var5.field1794.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method8412();
                    if (var13) {
                        var5.field1794[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
