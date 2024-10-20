package deob;

@ObfuscatedName("gt")
public class class208 extends class406 {

    @ObfuscatedName("gt.o")
    public class200[] field2494;

    public class208(class316 arg0, class316 arg1, int arg2, boolean arg3) {
        class335 var5 = new class335();
        int var6 = arg0.method5200(arg2);
        this.field2494 = new class200[var6];
        int[] var7 = arg0.method5252(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method5249(arg2, var7[var8]);
            class204 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class204 var12 = (class204) var5.method5431(); var12 != null; var12 = (class204) var5.method5419()) {
                if (var12.field2412 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method5196(0, var11);
                } else {
                    var13 = arg1.method5196(var11, 0);
                }
                var10 = new class204(var11, var13);
                var5.method5413(var10);
            }
            this.field2494[var7[var8]] = new class200(var9, var10);
        }
    }

    @ObfuscatedName("gt.o(IB)Z")
    public boolean method3906(int arg0) {
        return this.field2494[arg0].field2353;
    }
}
