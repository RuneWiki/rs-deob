package deob;

@ObfuscatedName("gt")
public class class208 extends class407 {

    @ObfuscatedName("gt.c")
    public class200[] field2486;

    public class208(class317 arg0, class317 arg1, int arg2, boolean arg3) {
        class336 var5 = new class336();
        int var6 = arg0.method5425(arg2);
        this.field2486 = new class200[var6];
        int[] var7 = arg0.method5424(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method5499(arg2, var7[var8]);
            class204 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class204 var12 = (class204) var5.method5647(); var12 != null; var12 = (class204) var5.method5649()) {
                if (var12.field2405 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method5421(0, var11);
                } else {
                    var13 = arg1.method5421(var11, 0);
                }
                var10 = new class204(var11, var13);
                var5.method5660(var10);
            }
            this.field2486[var7[var8]] = new class200(var9, var10);
        }
    }

    @ObfuscatedName("gt.c(II)Z")
    public boolean method4093(int arg0) {
        return this.field2486[arg0].field2344;
    }
}
