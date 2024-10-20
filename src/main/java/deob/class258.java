package deob;

@ObfuscatedName("jl")
public class class258 extends class500 {

    @ObfuscatedName("jl.ak")
    public class246[] field2810;

    public class258(class387 arg0, class387 arg1, int arg2, boolean arg3) {
        class406 var5 = new class406();
        int var6 = arg0.method6591(arg2);
        this.field2810 = new class246[var6];
        int[] var7 = arg0.method6581(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method6573(arg2, var7[var8]);
            class252 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class252 var12 = (class252) var5.method6834(); var12 != null; var12 = (class252) var5.method6842()) {
                if (var12.field2697 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method6579(0, var11);
                } else {
                    var13 = arg1.method6579(var11, 0);
                }
                var10 = new class252(var11, var13);
                var5.method6829(var10);
            }
            this.field2810[var7[var8]] = new class246(var9, var10);
        }
    }

    @ObfuscatedName("jl.ak(IB)Z")
    public boolean method4745(int arg0) {
        return this.field2810[arg0].field2637;
    }
}
