package deob;

@ObfuscatedName("ut")
public class class537 extends class500 {

    @ObfuscatedName("ut.al")
    public static class312 field5278 = new class312(64);

    @ObfuscatedName("ut.aj")
    public int[][] field5279;

    @ObfuscatedName("ut.az")
    public Object[][] field5277;

    @ObfuscatedName("lr.ak(Lor;B)V")
    public static void method5473(class387 arg0) {
        Statics.field5280 = arg0;
    }

    @ObfuscatedName("hi.al(II)Lut;")
    public static class537 method3371(int arg0) {
        class537 var1 = (class537) field5278.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5280.method6573(39, arg0);
        class537 var3 = new class537();
        if (var2 != null) {
            var3.method8673(new class546(var2));
        }
        var3.method8675();
        field5278.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ut.aj(Lua;I)V")
    public void method8673(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method8678(arg0, var2);
        }
    }

    @ObfuscatedName("ut.az(Lua;II)V")
    public void method8678(class546 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method8796();
        if (this.field5279 == null) {
            this.field5279 = new int[var3][];
        }
        for (int var4 = arg0.method8796(); var4 != 255; var4 = arg0.method8796()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method8796()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method8810();
            }
            this.field5279[var5] = var7;
            if (var6) {
                if (this.field5277 == null) {
                    this.field5277 = new Object[this.field5279.length][];
                }
                Object[][] var9 = this.field5277;
                int var11 = arg0.method8810();
                Object[] var12 = new Object[var7.length * var11];
                for (int var13 = 0; var13 < var11; var13++) {
                    for (int var14 = 0; var14 < var7.length; var14++) {
                        int var15 = var7.length * var13 + var14;
                        class534 var16 = class532.method5060(var7[var14]);
                        var12[var15] = var16.method8659(arg0);
                    }
                }
                var9[var5] = var12;
            }
        }
    }

    @ObfuscatedName("ut.af(I)V")
    public void method8675() {
    }

    @ObfuscatedName("ge.aa(B)V")
    public static void method3304() {
        field5278.method5572();
    }
}
