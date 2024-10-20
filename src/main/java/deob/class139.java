package deob;

@ObfuscatedName("es")
public class class139 extends class176 {

    @ObfuscatedName("es.c")
    public class126[] field1885;

    public class139(class235 arg0, class235 arg1, int arg2, boolean arg3) {
        class263 var5 = new class263();
        int var6 = arg0.method3848(arg2);
        this.field1885 = new class126[var6];
        int[] var7 = arg0.method3847(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3845(arg2, var7[var8]);
            class133 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class133 var12 = (class133) var5.method4543(); var12 != null; var12 = (class133) var5.method4564()) {
                if (var12.field1795 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3885(0, var11);
                } else {
                    var13 = arg1.method3885(var11, 0);
                }
                var10 = new class133(var11, var13);
                var5.method4545(var10);
            }
            this.field1885[var7[var8]] = new class126(var9, var10);
        }
    }

    @ObfuscatedName("es.c(II)Z")
    public boolean method3066(int arg0) {
        return this.field1885[arg0].field1623;
    }
}
