package deob;

@ObfuscatedName("ch")
public class class97 extends class185 {

    @ObfuscatedName("ch.e")
    public class82[] field1681;

    public class97(class149 arg0, class149 arg1, int arg2, boolean arg3) {
        class180 var5 = new class180();
        int var6 = arg0.method2730(arg2);
        this.field1681 = new class82[var6];
        int[] var7 = arg0.method2733(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2721(arg2, var7[var8]);
            class96 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class96 var12 = (class96) var5.method3226(); var12 != null; var12 = (class96) var5.method3231()) {
                if (var12.field1668 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2726(0, var11);
                } else {
                    var13 = arg1.method2726(var11, 0);
                }
                var10 = new class96(var11, var13);
                var5.method3224(var10);
            }
            this.field1681[var7[var8]] = new class82(var9, var10);
        }
    }

    @ObfuscatedName("ch.e(II)Z")
    public boolean method1966(int arg0) {
        return this.field1681[arg0].field1459;
    }
}
