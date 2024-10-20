package deob;

@ObfuscatedName("hp")
public class class191 extends class502 {

    @ObfuscatedName("hp.ab")
    public class179[] field2095;

    public class191(class389 arg0, class389 arg1, int arg2, boolean arg3) {
        class408 var5 = new class408();
        int var6 = arg0.method6685(arg2);
        this.field2095 = new class179[var6];
        int[] var7 = arg0.method6647(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method6670(arg2, var7[var8]);
            class185 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class185 var12 = (class185) var5.method6907(); var12 != null; var12 = (class185) var5.method6896()) {
                if (var12.field1975 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method6645(0, var11);
                } else {
                    var13 = arg1.method6645(var11, 0);
                }
                var10 = new class185(var11, var13);
                var5.method6892(var10);
            }
            this.field2095[var7[var8]] = new class179(var9, var10);
        }
    }

    @ObfuscatedName("hp.ab(II)Z")
    public boolean method3837(int arg0) {
        return this.field2095[arg0].field1913;
    }
}
