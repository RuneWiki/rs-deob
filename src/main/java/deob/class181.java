package deob;

@ObfuscatedName("gv")
public class class181 {

    @ObfuscatedName("gv.ac")
    public short[] field1872;

    @ObfuscatedName("gv.ab")
    public short[] field1873;

    public class181(int arg0) {
        class204 var2 = class204.method3453(arg0);
        if (var2.method3663()) {
            this.field1872 = new short[var2.field2187.length];
            System.arraycopy(var2.field2187, 0, this.field1872, 0, this.field1872.length);
        }
        if (var2.method3606()) {
            this.field1873 = new short[var2.field2184.length];
            System.arraycopy(var2.field2184, 0, this.field1873, 0, this.field1873.length);
        }
    }

    @ObfuscatedName("lc.aj(ILsy;B)Lgv;")
    public static class181 method5260(int arg0, class478 arg1) {
        int var2 = arg1.method7909();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class181 var5 = new class181(arg0);
        if (var3) {
            int var6 = arg1.method7909();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1872 != null && var5.field1872.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method7905();
                    if (var8) {
                        var5.field1872[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method7909();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1873 != null && var5.field1873.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method7905();
                    if (var13) {
                        var5.field1873[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
