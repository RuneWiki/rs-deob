package deob;

@ObfuscatedName("en")
public class class139 extends class181 {

    @ObfuscatedName("en.m")
    public class126[] field1870;

    public class139(class245 arg0, class245 arg1, int arg2, boolean arg3) {
        class273 var5 = new class273();
        int var6 = arg0.method4168(arg2);
        this.field1870 = new class126[var6];
        int[] var7 = arg0.method4167(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4156(arg2, var7[var8]);
            class133 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class133 var12 = (class133) var5.method4856(); var12 != null; var12 = (class133) var5.method4858()) {
                if (var12.field1775 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4164(0, var11);
                } else {
                    var13 = arg1.method4164(var11, 0);
                }
                var10 = new class133(var11, var13);
                var5.method4851(var10);
            }
            this.field1870[var7[var8]] = new class126(var9, var10);
        }
    }

    @ObfuscatedName("en.m(II)Z")
    public boolean method2981(int arg0) {
        return this.field1870[arg0].field1620;
    }
}
