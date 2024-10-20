package deob;

@ObfuscatedName("fy")
public class class168 {

    @ObfuscatedName("fy.q")
    public short[] field1815;

    @ObfuscatedName("fy.f")
    public short[] field1816;

    public class168(int arg0) {
        class188 var2 = class188.method3161(arg0);
        if (var2.method3412()) {
            this.field1815 = new short[var2.field2105.length];
            System.arraycopy(var2.field2105, 0, this.field1815, 0, this.field1815.length);
        }
        if (var2.method3403()) {
            this.field1816 = new short[var2.field2107.length];
            System.arraycopy(var2.field2107, 0, this.field1816, 0, this.field1816.length);
        }
    }

    @ObfuscatedName("dy.c(ILqt;I)Lfy;")
    public static class168 method2484(int arg0, class443 arg1) {
        int var2 = arg1.method7047();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class168 var5 = new class168(arg0);
        if (var3) {
            int var6 = arg1.method7047();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1815 != null && var5.field1815.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method7049();
                    if (var8) {
                        var5.field1815[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method7047();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1816 != null && var5.field1816.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method7049();
                    if (var13) {
                        var5.field1816[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
