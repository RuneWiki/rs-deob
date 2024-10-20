package deob;

@ObfuscatedName("vn")
public class class548 extends class511 {

    @ObfuscatedName("vn.aw")
    public static class316 field5396 = new class316(64);

    @ObfuscatedName("vn.ak")
    public int[][] field5394;

    @ObfuscatedName("vn.aj")
    public Object[][] field5393;

    @ObfuscatedName("ne.ap(Lpe;I)V")
    public static void method6347(class392 arg0) {
        Statics.field5395 = arg0;
    }

    @ObfuscatedName("os.aw(II)Lvn;")
    public static class548 method6909(int arg0) {
        class548 var1 = (class548) field5396.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5395.method7009(39, arg0);
        class548 var3 = new class548();
        if (var2 != null) {
            var3.method9145(new class558(var2));
        }
        var3.method9141();
        field5396.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("vn.ak(Lvl;B)V")
    public void method9145(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method9148(arg0, var2);
        }
    }

    @ObfuscatedName("vn.aj(Lvl;II)V")
    public void method9148(class558 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method9258();
        if (this.field5394 == null) {
            this.field5394 = new int[var3][];
        }
        for (int var4 = arg0.method9258(); var4 != 255; var4 = arg0.method9258()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method9258()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method9274();
            }
            this.field5394[var5] = var7;
            if (var6) {
                if (this.field5393 == null) {
                    this.field5393 = new Object[this.field5394.length][];
                }
                this.field5393[var5] = class551.method457(arg0, var7);
            }
        }
    }

    @ObfuscatedName("vn.ai(B)V")
    public void method9141() {
    }
}
