package deob;

@ObfuscatedName("fe")
public class class161 {

    @ObfuscatedName("fe.p")
    public short[] field1733;

    @ObfuscatedName("fe.m")
    public short[] field1739;

    public class161(int arg0) {
        class181 var2 = class181.method2432(arg0);
        if (var2.method3251()) {
            this.field1733 = new short[var2.field2035.length];
            System.arraycopy(var2.field2035, 0, this.field1733, 0, this.field1733.length);
        }
        if (var2.method3263()) {
            this.field1739 = new short[var2.field2025.length];
            System.arraycopy(var2.field2025, 0, this.field1739, 0, this.field1739.length);
        }
    }

    @ObfuscatedName("dz.c(ILpi;B)Lfe;")
    public static class161 method2605(int arg0, class419 arg1) {
        int var2 = arg1.method6781();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class161 var5 = new class161(arg0);
        if (var3) {
            int var6 = arg1.method6781();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1733 != null && var5.field1733.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method6672();
                    if (var8) {
                        var5.field1733[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method6781();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1739 != null && var5.field1739.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method6672();
                    if (var13) {
                        var5.field1739[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
