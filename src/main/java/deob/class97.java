package deob;

@ObfuscatedName("cc")
public class class97 extends class185 {

    @ObfuscatedName("cc.f")
    public class82[] field1680;

    public class97(class149 arg0, class149 arg1, int arg2, boolean arg3) {
        class180 var5 = new class180();
        int var6 = arg0.method2773(arg2);
        this.field1680 = new class82[var6];
        int[] var7 = arg0.method2817(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2763(arg2, var7[var8]);
            class96 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class96 var12 = (class96) var5.method3285(); var12 != null; var12 = (class96) var5.method3286()) {
                if (var12.field1672 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2804(0, var11);
                } else {
                    var13 = arg1.method2804(var11, 0);
                }
                var10 = new class96(var11, var13);
                var5.method3276(var10);
            }
            this.field1680[var7[var8]] = new class82(var9, var10);
        }
    }

    @ObfuscatedName("cc.f(II)Z")
    public boolean method2013(int arg0) {
        return this.field1680[arg0].field1453;
    }
}
