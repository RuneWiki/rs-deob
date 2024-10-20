package deob;

@ObfuscatedName("hj")
public class class217 extends class425 {

    @ObfuscatedName("hj.a")
    public class209[] field2535;

    public class217(class330 arg0, class330 arg1, int arg2, boolean arg3) {
        class349 var5 = new class349();
        int var6 = arg0.method5793(arg2);
        this.field2535 = new class209[var6];
        int[] var7 = arg0.method5792(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method5859(arg2, var7[var8]);
            class213 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class213 var12 = (class213) var5.method6040(); var12 != null; var12 = (class213) var5.method6034()) {
                if (var12.field2445 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method5819(0, var11);
                } else {
                    var13 = arg1.method5819(var11, 0);
                }
                var10 = new class213(var11, var13);
                var5.method6031(var10);
            }
            this.field2535[var7[var8]] = new class209(var9, var10);
        }
    }

    @ObfuscatedName("hj.a(II)Z")
    public boolean method4117(int arg0) {
        return this.field2535[arg0].field2386;
    }
}
