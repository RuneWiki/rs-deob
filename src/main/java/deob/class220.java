package deob;

@ObfuscatedName("ha")
public class class220 extends class428 {

    @ObfuscatedName("ha.h")
    public class211[] field2613;

    public class220(class333 arg0, class333 arg1, int arg2, boolean arg3) {
        class352 var5 = new class352();
        int var6 = arg0.method5869(arg2);
        this.field2613 = new class211[var6];
        int[] var7 = arg0.method5854(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method5909(arg2, var7[var8]);
            class215 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class215 var12 = (class215) var5.method6086(); var12 != null; var12 = (class215) var5.method6088()) {
                if (var12.field2522 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method5852(0, var11);
                } else {
                    var13 = arg1.method5852(var11, 0);
                }
                var10 = new class215(var11, var13);
                var5.method6081(var10);
            }
            this.field2613[var7[var8]] = new class211(var9, var10);
        }
    }

    @ObfuscatedName("ha.h(II)Z")
    public boolean method4232(int arg0) {
        return this.field2613[arg0].field2458;
    }
}
