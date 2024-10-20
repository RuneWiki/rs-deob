package deob;

@ObfuscatedName("uw")
public class class539 extends class500 {

    @ObfuscatedName("uw.al")
    public static class312 field5288 = new class312(64);

    @ObfuscatedName("uw.aj")
    public Object[][] field5290;

    @ObfuscatedName("uw.az")
    public int[][] field5287;

    @ObfuscatedName("uw.af")
    public int field5291 = -1;

    @ObfuscatedName("qk.ak(II)Luw;")
    public static class539 method7588(int arg0) {
        class539 var1 = (class539) field5288.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5289.method6573(38, arg0);
        class539 var3 = new class539();
        if (var2 != null) {
            var3.method8697(new class546(var2));
        }
        var3.method8700();
        field5288.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("uw.al(Lua;B)V")
    public void method8697(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method8699(arg0, var2);
        }
    }

    @ObfuscatedName("uw.aj(II)[Ljava/lang/Object;")
    public Object[] method8698(int arg0) {
        return this.field5290 == null ? null : this.field5290[arg0];
    }

    @ObfuscatedName("uw.az(Lua;IB)V")
    public void method8699(class546 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method8796();
            if (this.field5290 == null) {
                this.field5290 = new Object[var3][];
                this.field5287 = new int[var3][];
            }
            for (int var4 = arg0.method8796(); var4 != 255; var4 = arg0.method8796()) {
                int var5 = arg0.method8796();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method8810();
                }
                Object[][] var8 = this.field5290;
                int var10 = arg0.method8810();
                Object[] var11 = new Object[var6.length * var10];
                for (int var12 = 0; var12 < var10; var12++) {
                    for (int var13 = 0; var13 < var6.length; var13++) {
                        int var14 = var6.length * var12 + var13;
                        class534 var15 = class532.method5060(var6[var13]);
                        var11[var14] = var15.method8659(arg0);
                    }
                }
                var8[var4] = var11;
                this.field5287[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field5291 = arg0.method8816();
        }
    }

    @ObfuscatedName("uw.af(I)V")
    public void method8700() {
    }
}
