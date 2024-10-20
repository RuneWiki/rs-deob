package deob;

@ObfuscatedName("cc")
public class class98 extends class195 {

    @ObfuscatedName("cc.n")
    public class83[] field1701;

    public class98(class158 arg0, class158 arg1, int arg2, boolean arg3) {
        class190 var5 = new class190();
        int var6 = arg0.method2898(arg2);
        this.field1701 = new class83[var6];
        int[] var7 = arg0.method2868(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2859(arg2, var7[var8]);
            class97 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class97 var12 = (class97) var5.method3382(); var12 != null; var12 = (class97) var5.method3384()) {
                if (var12.field1694 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2876(0, var11);
                } else {
                    var13 = arg1.method2876(var11, 0);
                }
                var10 = new class97(var11, var13);
                var5.method3377(var10);
            }
            this.field1701[var7[var8]] = new class83(var9, var10);
        }
    }

    @ObfuscatedName("cc.n(II)Z")
    public boolean method1995(int arg0) {
        return this.field1701[arg0].field1475;
    }
}
