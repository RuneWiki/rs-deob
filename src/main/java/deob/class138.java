package deob;

@ObfuscatedName("ea")
public class class138 extends class214 {

    @ObfuscatedName("ea.n")
    public class125[] field1879;

    public class138(class254 arg0, class254 arg1, int arg2, boolean arg3) {
        class213 var5 = new class213();
        int var6 = arg0.method4466(arg2);
        this.field1879 = new class125[var6];
        int[] var7 = arg0.method4465(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4494(arg2, var7[var8]);
            class132 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class132 var12 = (class132) var5.method3986(); var12 != null; var12 = (class132) var5.method3988()) {
                if (var12.field1784 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4462(0, var11);
                } else {
                    var13 = arg1.method4462(var11, 0);
                }
                var10 = new class132(var11, var13);
                var5.method3981(var10);
            }
            this.field1879[var7[var8]] = new class125(var9, var10);
        }
    }

    @ObfuscatedName("ea.n(IB)Z")
    public boolean method3077(int arg0) {
        return this.field1879[arg0].field1622;
    }
}
