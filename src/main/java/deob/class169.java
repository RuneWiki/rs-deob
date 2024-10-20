package deob;

@ObfuscatedName("gb")
public class class169 {

    @ObfuscatedName("gb.af")
    public short[] field1797;

    @ObfuscatedName("gb.aj")
    public short[] field1795;

    public class169(int arg0) {
        class203 var2 = class203.method5762(arg0);
        if (var2.method3679()) {
            this.field1797 = new short[var2.field2157.length];
            System.arraycopy(var2.field2157, 0, this.field1797, 0, this.field1797.length);
        }
        if (var2.method3668()) {
            this.field1795 = new short[var2.field2196.length];
            System.arraycopy(var2.field2196, 0, this.field1795, 0, this.field1795.length);
        }
    }

    @ObfuscatedName("pk.am(ILuk;I)Lgb;")
    public static class169 method6834(int arg0, class531 arg1) {
        int var2 = arg1.method8561();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class169 var5 = new class169(arg0);
        if (var3) {
            int var6 = arg1.method8561();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1797 != null && var5.field1797.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method8775();
                    if (var8) {
                        var5.field1797[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method8561();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1795 != null && var5.field1795.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method8775();
                    if (var13) {
                        var5.field1795[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
