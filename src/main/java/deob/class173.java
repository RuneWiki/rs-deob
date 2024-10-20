package deob;

@ObfuscatedName("gz")
public class class173 {

    @ObfuscatedName("gz.ag")
    public short[] field1846;

    @ObfuscatedName("gz.ak")
    public short[] field1847;

    public class173(int arg0) {
        class208 var2 = class208.method3193(arg0);
        if (var2.method3675()) {
            this.field1846 = new short[var2.field2236.length];
            System.arraycopy(var2.field2236, 0, this.field1846, 0, this.field1846.length);
        }
        if (var2.method3676()) {
            this.field1847 = new short[var2.field2221.length];
            System.arraycopy(var2.field2221, 0, this.field1847, 0, this.field1847.length);
        }
    }

    @ObfuscatedName("iw.aq(ILvp;B)Lgz;")
    public static class173 method3890(int arg0, class547 arg1) {
        int var2 = arg1.method8804();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class173 var5 = new class173(arg0);
        if (var3) {
            int var6 = arg1.method8804();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1846 != null && var5.field1846.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method8899();
                    if (var8) {
                        var5.field1846[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method8804();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1847 != null && var5.field1847.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method8899();
                    if (var13) {
                        var5.field1847[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
