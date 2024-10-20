package deob;

@ObfuscatedName("fy")
public class class180 {

    @ObfuscatedName("fy.v")
    public short[] field1914;

    @ObfuscatedName("fy.s")
    public short[] field1915;

    public class180(int arg0) {
        class201 var2 = class201.method2583(arg0);
        if (var2.method3706()) {
            this.field1914 = new short[var2.field2219.length];
            System.arraycopy(var2.field2219, 0, this.field1914, 0, this.field1914.length);
        }
        if (var2.method3707()) {
            this.field1915 = new short[var2.field2221.length];
            System.arraycopy(var2.field2221, 0, this.field1915, 0, this.field1915.length);
        }
    }

    @ObfuscatedName("gs.f(ILrd;B)Lfy;")
    public static class180 method3509(int arg0, class474 arg1) {
        int var2 = arg1.method7964();
        boolean var3 = (var2 & 0x1) != 0;
        boolean var4 = (var2 & 0x2) != 0;
        class180 var5 = new class180(arg0);
        if (var3) {
            int var6 = arg1.method7964();
            int[] var7 = new int[] { var6 & 0xF, var6 >> 4 & 0xF };
            boolean var8 = var5.field1914 != null && var5.field1914.length == var7.length;
            for (int var9 = 0; var9 < 2; var9++) {
                if (var7[var9] != 15) {
                    short var10 = (short) arg1.method8032();
                    if (var8) {
                        var5.field1914[var7[var9]] = var10;
                    }
                }
            }
        }
        if (var4) {
            int var11 = arg1.method7964();
            int[] var12 = new int[] { var11 & 0xF, var11 >> 4 & 0xF };
            boolean var13 = var5.field1915 != null && var5.field1915.length == var12.length;
            for (int var14 = 0; var14 < 2; var14++) {
                if (var12[var14] != 15) {
                    short var15 = (short) arg1.method8032();
                    if (var13) {
                        var5.field1915[var12[var14]] = var15;
                    }
                }
            }
        }
        return var5;
    }
}
