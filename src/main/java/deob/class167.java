package deob;

@ObfuscatedName("fl")
public class class167 extends class143 {

    @ObfuscatedName("fl.h")
    public class47[] field2490;

    public class167(class87 arg0, class87 arg1, int arg2, boolean arg3) {
        class105 var5 = new class105();
        int var6 = arg0.method1028(arg2);
        this.field2490 = new class47[var6];
        int[] var7 = arg0.method1084(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1024(arg2, var7[var8]);
            class135 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class135 var12 = (class135) var5.method1298(); var12 != null; var12 = (class135) var5.method1299()) {
                if (var12.field1717 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1026(0, var11);
                } else {
                    var13 = arg1.method1026(var11, 0);
                }
                var10 = new class135(var11, var13);
                var5.method1293(var10);
            }
            this.field2490[var7[var8]] = new class47(var9, var10);
        }
    }

    @ObfuscatedName("fl.k(IB)Z")
    public boolean method2651(int arg0) {
        return this.field2490[arg0].field669;
    }
}
