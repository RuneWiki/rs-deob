package deob;

@ObfuscatedName("ef")
public class class143 extends class219 {

    @ObfuscatedName("ef.o")
    public class130[] field2071;

    public class143(class262 arg0, class262 arg1, int arg2, boolean arg3) {
        class218 var5 = new class218();
        int var6 = arg0.method4207(arg2);
        this.field2071 = new class130[var6];
        int[] var7 = arg0.method4168(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4241(arg2, var7[var8]);
            class137 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class137 var12 = (class137) var5.method3707(); var12 != null; var12 = (class137) var5.method3697()) {
                if (var12.field1977 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4165(0, var11);
                } else {
                    var13 = arg1.method4165(var11, 0);
                }
                var10 = new class137(var11, var13);
                var5.method3690(var10);
            }
            this.field2071[var7[var8]] = new class130(var9, var10);
        }
    }

    @ObfuscatedName("ef.o(II)Z")
    public boolean method2828(int arg0) {
        return this.field2071[arg0].field1825;
    }
}
