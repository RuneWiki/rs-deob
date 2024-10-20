package deob;

@ObfuscatedName("eq")
public class class142 extends class206 {

    @ObfuscatedName("eq.p")
    public class129[] field2017;

    public class142(class247 arg0, class247 arg1, int arg2, boolean arg3) {
        class205 var5 = new class205();
        int var6 = arg0.method4044(arg2);
        this.field2017 = new class129[var6];
        int[] var7 = arg0.method4043(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4032(arg2, var7[var8]);
            class136 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class136 var12 = (class136) var5.method3581(); var12 != null; var12 = (class136) var5.method3597()) {
                if (var12.field1926 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4057(0, var11);
                } else {
                    var13 = arg1.method4057(var11, 0);
                }
                var10 = new class136(var11, var13);
                var5.method3572(var10);
            }
            this.field2017[var7[var8]] = new class129(var9, var10);
        }
    }

    @ObfuscatedName("eq.p(II)Z")
    public boolean method2805(int arg0) {
        return this.field2017[arg0].field1767;
    }
}
