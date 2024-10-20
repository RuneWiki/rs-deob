package deob;

@ObfuscatedName("dj")
public class class44 extends class77 {

    @ObfuscatedName("dj.j")
    public class154[] field363;

    public class44(class81 arg0, class81 arg1, int arg2, boolean arg3) {
        class13 var5 = new class13();
        int var6 = arg0.method1093(arg2);
        this.field363 = new class154[var6];
        int[] var7 = arg0.method1113(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1083(arg2, var7[var8]);
            class47 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class47 var12 = (class47) var5.method253(); var12 != null; var12 = (class47) var5.method255()) {
                if (var12.field382 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1145(0, var11);
                } else {
                    var13 = arg1.method1145(var11, 0);
                }
                var10 = new class47(var11, var13);
                var5.method248(var10);
            }
            this.field363[var7[var8]] = new class154(var9, var10);
        }
    }

    @ObfuscatedName("dj.j(II)Z")
    public boolean method727(int arg0) {
        return this.field363[arg0].field2326;
    }
}
