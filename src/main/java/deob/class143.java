package deob;

@ObfuscatedName("ei")
public class class143 extends class219 {

    @ObfuscatedName("ei.d")
    public class130[] field2047;

    public class143(class262 arg0, class262 arg1, int arg2, boolean arg3) {
        class218 var5 = new class218();
        int var6 = arg0.method4285(arg2);
        this.field2047 = new class130[var6];
        int[] var7 = arg0.method4364(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4273(arg2, var7[var8]);
            class137 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class137 var12 = (class137) var5.method3798(); var12 != null; var12 = (class137) var5.method3800()) {
                if (var12.field1959 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4321(0, var11);
                } else {
                    var13 = arg1.method4321(var11, 0);
                }
                var10 = new class137(var11, var13);
                var5.method3793(var10);
            }
            this.field2047[var7[var8]] = new class130(var9, var10);
        }
    }

    @ObfuscatedName("ei.d(IB)Z")
    public boolean method2901(int arg0) {
        return this.field2047[arg0].field1809;
    }
}
