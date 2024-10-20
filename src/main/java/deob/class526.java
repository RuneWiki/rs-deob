package deob;

@ObfuscatedName("uv")
public class class526 extends class489 {

    @ObfuscatedName("uv.ah")
    public static class304 field5168 = new class304(64);

    @ObfuscatedName("uv.af")
    public int[][] field5166;

    @ObfuscatedName("uv.at")
    public Object[][] field5167;

    @ObfuscatedName("rb.ah(II)Luv;")
    public static class526 method7545(int arg0) {
        class526 var1 = (class526) field5168.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5164.method6328(39, arg0);
        class526 var3 = new class526();
        if (var2 != null) {
            var3.method8348(new class535(var2));
        }
        var3.method8351();
        field5168.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("uv.af(Lur;B)V")
    public void method8348(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method8355(arg0, var2);
        }
    }

    @ObfuscatedName("uv.at(Lur;IB)V")
    public void method8355(class535 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method8462();
        if (this.field5166 == null) {
            this.field5166 = new int[var3][];
        }
        for (int var4 = arg0.method8462(); var4 != 255; var4 = arg0.method8462()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method8462()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method8676();
            }
            this.field5166[var5] = var7;
            if (var6) {
                if (this.field5167 == null) {
                    this.field5167 = new Object[this.field5166.length][];
                }
                Object[][] var9 = this.field5167;
                int var11 = arg0.method8676();
                Object[] var12 = new Object[var7.length * var11];
                for (int var13 = 0; var13 < var11; var13++) {
                    for (int var14 = 0; var14 < var7.length; var14++) {
                        int var15 = var7.length * var13 + var14;
                        class523 var16 = class521.method3603(var7[var14]);
                        var12[var15] = var16.method8321(arg0);
                    }
                }
                var9[var5] = var12;
            }
        }
    }

    @ObfuscatedName("uv.an(B)V")
    public void method8351() {
    }

    @ObfuscatedName("fn.ao(B)V")
    public static void method2971() {
        field5168.method5339();
    }
}
