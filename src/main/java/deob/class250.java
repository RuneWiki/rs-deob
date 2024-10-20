package deob;

@ObfuscatedName("jk")
public class class250 extends class504 {

    @ObfuscatedName("jk.ac")
    public class238[] field2740;

    public class250(class391 arg0, class391 arg1, int arg2, boolean arg3) {
        class410 var5 = new class410();
        int var6 = arg0.method6792(arg2);
        this.field2740 = new class238[var6];
        int[] var7 = arg0.method6808(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method6782(arg2, var7[var8]);
            class244 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class244 var12 = (class244) var5.method7029(); var12 != null; var12 = (class244) var5.method7031()) {
                if (var12.field2626 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method6789(0, var11);
                } else {
                    var13 = arg1.method6789(var11, 0);
                }
                var10 = new class244(var11, var13);
                var5.method7051(var10);
            }
            this.field2740[var7[var8]] = new class238(var9, var10);
        }
    }

    @ObfuscatedName("jk.ac(II)Z")
    public boolean method4745(int arg0) {
        return this.field2740[arg0].field2555;
    }
}
