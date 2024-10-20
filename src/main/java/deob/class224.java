package deob;

@ObfuscatedName("hw")
public class class224 extends class435 {

    @ObfuscatedName("hw.f")
    public class215[] field2620;

    public class224(class337 arg0, class337 arg1, int arg2, boolean arg3) {
        class356 var5 = new class356();
        int var6 = arg0.method5982(arg2);
        this.field2620 = new class215[var6];
        int[] var7 = arg0.method5981(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method5990(arg2, var7[var8]);
            class219 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class219 var12 = (class219) var5.method6241(); var12 != null; var12 = (class219) var5.method6248()) {
                if (var12.field2525 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method6001(0, var11);
                } else {
                    var13 = arg1.method6001(var11, 0);
                }
                var10 = new class219(var11, var13);
                var5.method6236(var10);
            }
            this.field2620[var7[var8]] = new class215(var9, var10);
        }
    }

    @ObfuscatedName("hw.f(II)Z")
    public boolean method4294(int arg0) {
        return this.field2620[arg0].field2466;
    }
}
