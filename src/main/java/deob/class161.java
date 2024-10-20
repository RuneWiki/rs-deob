package deob;

@ObfuscatedName("ff")
public class class161 {

    @ObfuscatedName("ff.s")
    public short[] field1746;

    @ObfuscatedName("ff.e")
    public short[] field1747;

    public class161(int arg0) {
        class181 var2 = class181.method1538(arg0);
        if (var2.method3209()) {
            this.field1746 = new short[var2.field2030.length];
            System.arraycopy(var2.field2030, 0, this.field1746, 0, this.field1746.length);
        }
        if (var2.method3237()) {
            this.field1747 = new short[var2.field2067.length];
            System.arraycopy(var2.field2067, 0, this.field1747, 0, this.field1747.length);
        }
    }

    @ObfuscatedName("ag.c(ILpi;S)Lff;")
    public static class161 method720(int arg0, class421 arg1) {
        int var2 = arg1.method6686();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class161 var5 = new class161(arg0);
        if (var3) {
            int var6 = arg1.method6686();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1746 != null && var5.field1746.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method6666();
                    if (var8) {
                        var5.field1746[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method6686();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1747 != null && var5.field1747.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method6666();
                    if (var13) {
                        var5.field1747[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
