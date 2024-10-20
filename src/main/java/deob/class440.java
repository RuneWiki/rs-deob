package deob;

@ObfuscatedName("pl")
public class class440 extends class407 {

    @ObfuscatedName("pl.p")
    public static class257 field4715 = new class257(64);

    @ObfuscatedName("pl.f")
    public Object[][] field4716;

    @ObfuscatedName("pl.n")
    public int[][] field4717;

    @ObfuscatedName("pl.k")
    public int field4714 = -1;

    @ObfuscatedName("v.c(Llv;B)V")
    public static void method114(class317 arg0) {
        Statics.field4719 = arg0;
    }

    @ObfuscatedName("bq.p(II)Lpl;")
    public static class440 method2106(int arg0) {
        class440 var1 = (class440) field4715.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4719.method5499(38, arg0);
        class440 var3 = new class440();
        if (var2 != null) {
            var3.method7103(new class445(var2));
        }
        var3.method7102();
        field4715.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("pl.f(Lqq;I)V")
    public void method7103(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method7099(arg0, var2);
        }
    }

    @ObfuscatedName("pl.n(II)[Ljava/lang/Object;")
    public Object[] method7100(int arg0) {
        return this.field4716 == null ? null : this.field4716[arg0];
    }

    @ObfuscatedName("pl.k(Lqq;II)V")
    public void method7099(class445 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method7196();
            if (this.field4716 == null) {
                this.field4716 = new Object[var3][];
                this.field4717 = new int[var3][];
            }
            for (int var4 = arg0.method7196(); var4 != 255; var4 = arg0.method7196()) {
                int var5 = arg0.method7196();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method7211();
                }
                this.field4716[var4] = class441.method6112(arg0, var6);
                this.field4717[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field4714 = arg0.method7217();
        }
    }

    @ObfuscatedName("pl.w(I)V")
    public void method7102() {
    }
}
