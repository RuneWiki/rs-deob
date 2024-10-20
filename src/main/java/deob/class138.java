package deob;

@ObfuscatedName("ei")
public class class138 extends class214 {

    @ObfuscatedName("ei.a")
    public class125[] field1883;

    public class138(class255 arg0, class255 arg1, int arg2, boolean arg3) {
        class213 var5 = new class213();
        int var6 = arg0.method4419(arg2);
        this.field1883 = new class125[var6];
        int[] var7 = arg0.method4433(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4422(arg2, var7[var8]);
            class132 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class132 var12 = (class132) var5.method3990(); var12 != null; var12 = (class132) var5.method3984()) {
                if (var12.field1791 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4430(0, var11);
                } else {
                    var13 = arg1.method4430(var11, 0);
                }
                var10 = new class132(var11, var13);
                var5.method3966(var10);
            }
            this.field1883[var7[var8]] = new class125(var9, var10);
        }
    }

    @ObfuscatedName("ei.a(IB)Z")
    public boolean method3069(int arg0) {
        return this.field1883[arg0].field1637;
    }
}
