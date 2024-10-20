package deob;

@ObfuscatedName("gx")
public class class180 {

    @ObfuscatedName("gx.aw")
    public short[] field1900;

    @ObfuscatedName("gx.ac")
    public short[] field1899;

    public class180(int arg0) {
        class202 var2 = class202.method2286(arg0);
        if (var2.method3712()) {
            this.field1900 = new short[var2.field2221.length];
            System.arraycopy(var2.field2221, 0, this.field1900, 0, this.field1900.length);
        }
        if (var2.method3728()) {
            this.field1899 = new short[var2.field2223.length];
            System.arraycopy(var2.field2223, 0, this.field1899, 0, this.field1899.length);
        }
    }

    @ObfuscatedName("cw.af(ILsg;I)Lgx;")
    public static class180 method2015(int arg0, class489 arg1) {
        int var2 = arg1.method8248();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class180 var5 = new class180(arg0);
        if (var3) {
            int var6 = arg1.method8248();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1900 != null && var5.field1900.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method8250();
                    if (var8) {
                        var5.field1900[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method8248();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1899 != null && var5.field1899.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method8250();
                    if (var13) {
                        var5.field1899[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
