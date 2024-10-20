package deob;

@ObfuscatedName("uu")
public class class522 extends class485 {

    @ObfuscatedName("uu.ap")
    public static class302 field5117 = new class302(64);

    @ObfuscatedName("uu.af")
    public int[][] field5116;

    @ObfuscatedName("uu.aj")
    public Object[][] field5118;

    @ObfuscatedName("qp.am(II)Luu;")
    public static class522 method7418(int arg0) {
        class522 var1 = (class522) field5117.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5119.method6396(39, arg0);
        class522 var3 = new class522();
        if (var2 != null) {
            var3.method8445(new class531(var2));
        }
        var3.method8443();
        field5117.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("uu.ap(Luk;I)V")
    public void method8445(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method8446(arg0, var2);
        }
    }

    @ObfuscatedName("uu.af(Luk;IB)V")
    public void method8446(class531 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method8561();
        if (this.field5116 == null) {
            this.field5116 = new int[var3][];
        }
        for (int var4 = arg0.method8561(); var4 != 255; var4 = arg0.method8561()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method8561()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method8576();
            }
            this.field5116[var5] = var7;
            if (var6) {
                if (this.field5118 == null) {
                    this.field5118 = new Object[this.field5116.length][];
                }
                Object[][] var9 = this.field5118;
                int var11 = arg0.method8576();
                Object[] var12 = new Object[var7.length * var11];
                for (int var13 = 0; var13 < var11; var13++) {
                    for (int var14 = 0; var14 < var7.length; var14++) {
                        int var15 = var7.length * var13 + var14;
                        class519 var16 = class517.method4843(var7[var14]);
                        var12[var15] = var16.method8428(arg0);
                    }
                }
                var9[var5] = var12;
            }
        }
    }

    @ObfuscatedName("uu.aj(B)V")
    public void method8443() {
    }
}
