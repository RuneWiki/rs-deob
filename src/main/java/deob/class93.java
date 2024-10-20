package deob;

@ObfuscatedName("cr")
public class class93 extends class174 {

    @ObfuscatedName("cr.z")
    public class78[] field1644;

    public class93(class142 arg0, class142 arg1, int arg2, boolean arg3) {
        class171 var5 = new class171();
        int var6 = arg0.method2755(arg2);
        this.field1644 = new class78[var6];
        int[] var7 = arg0.method2749(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2768(arg2, var7[var8]);
            class92 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class92 var12 = (class92) var5.method3236(); var12 != null; var12 = (class92) var5.method3228()) {
                if (var12.field1633 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2767(0, var11);
                } else {
                    var13 = arg1.method2767(var11, 0);
                }
                var10 = new class92(var11, var13);
                var5.method3221(var10);
            }
            this.field1644[var7[var8]] = new class78(var9, var10);
        }
    }

    @ObfuscatedName("cr.z(IB)Z")
    public boolean method1983(int arg0) {
        return this.field1644[arg0].field1400;
    }
}
