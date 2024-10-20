package deob;

@ObfuscatedName("et")
public class class137 {

    @ObfuscatedName("et.v")
    public short[] field1543;

    @ObfuscatedName("et.y")
    public short[] field1542;

    public class137(int arg0) {
        class156 var2 = class156.method4403(arg0);
        if (var2.method2773()) {
            this.field1543 = new short[var2.field1809.length];
            System.arraycopy(var2.field1809, 0, this.field1543, 0, this.field1543.length);
        }
        if (var2.method2826()) {
            this.field1542 = new short[var2.field1824.length];
            System.arraycopy(var2.field1824, 0, this.field1542, 0, this.field1542.length);
        }
    }

    @ObfuscatedName("cz.f(ILnt;S)Let;")
    public static class137 method1770(int arg0, class384 arg1) {
        int var2 = arg1.method5902();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class137 var5 = new class137(arg0);
        if (var3) {
            int var6 = arg1.method5902();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1543 != null && var5.field1543.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method5899();
                    if (var8) {
                        var5.field1543[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method5902();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1542 != null && var5.field1542.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method5899();
                    if (var13) {
                        var5.field1542[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
