package deob;

@ObfuscatedName("em")
public class class139 extends class176 {

    @ObfuscatedName("em.a")
    public class126[] field1868;

    public class139(class234 arg0, class234 arg1, int arg2, boolean arg3) {
        class262 var5 = new class262();
        int var6 = arg0.method3953(arg2);
        this.field1868 = new class126[var6];
        int[] var7 = arg0.method3887(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3873(arg2, var7[var8]);
            class133 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class133 var12 = (class133) var5.method4581(); var12 != null; var12 = (class133) var5.method4589()) {
                if (var12.field1776 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3881(0, var11);
                } else {
                    var13 = arg1.method3881(var11, 0);
                }
                var10 = new class133(var11, var13);
                var5.method4576(var10);
            }
            this.field1868[var7[var8]] = new class126(var9, var10);
        }
    }

    @ObfuscatedName("em.a(II)Z")
    public boolean method3094(int arg0) {
        return this.field1868[arg0].field1609;
    }
}
