package deob;

@ObfuscatedName("vf")
public class class550 extends class511 {

    @ObfuscatedName("vf.aw")
    public static class316 field5404 = new class316(64);

    @ObfuscatedName("vf.ak")
    public Object[][] field5407;

    @ObfuscatedName("vf.aj")
    public int[][] field5405;

    @ObfuscatedName("vf.ai")
    public int field5408 = -1;

    @ObfuscatedName("jd.ap(Lpe;I)V")
    public static void method4481(class392 arg0) {
        Statics.field5406 = arg0;
    }

    @ObfuscatedName("lb.aw(II)Lvf;")
    public static class550 method5816(int arg0) {
        class550 var1 = (class550) field5404.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5406.method7009(38, arg0);
        class550 var3 = new class550();
        if (var2 != null) {
            var3.method9157(new class558(var2));
        }
        var3.method9173();
        field5404.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("vf.ak(Lvl;I)V")
    public void method9157(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method9164(arg0, var2);
        }
    }

    @ObfuscatedName("vf.aj(II)[Ljava/lang/Object;")
    public Object[] method9161(int arg0) {
        return this.field5407 == null ? null : this.field5407[arg0];
    }

    @ObfuscatedName("vf.ai(Lvl;IB)V")
    public void method9164(class558 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method9258();
            if (this.field5407 == null) {
                this.field5407 = new Object[var3][];
                this.field5405 = new int[var3][];
            }
            for (int var4 = arg0.method9258(); var4 != 255; var4 = arg0.method9258()) {
                int var5 = arg0.method9258();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method9274();
                }
                this.field5407[var4] = class551.method457(arg0, var6);
                this.field5405[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field5408 = arg0.method9280();
        }
    }

    @ObfuscatedName("vf.ay(I)V")
    public void method9173() {
    }

    @ObfuscatedName("rh.as(B)V")
    public static void method8115() {
        field5404.method5930();
    }
}
