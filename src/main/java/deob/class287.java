package deob;

@ObfuscatedName("kl")
public class class287 extends class288 {

    @ObfuscatedName("kl.m")
    public final class331 field3665;

    public class287(class331 arg0) {
        super(400);
        this.field3665 = arg0;
    }

    @ObfuscatedName("kl.c(B)Ljx;")
    public class285 method4967() {
        return new class289();
    }

    @ObfuscatedName("kl.q(II)[Ljx;")
    public class285[] method4958(int arg0) {
        return new class289[arg0];
    }

    @ObfuscatedName("kl.m(Lgg;IB)V")
    public void method4959(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2386 < arg1) {
                int var3 = arg0.method3243();
                boolean var4 = (var3 & 0x1) == 1;
                class294 var5 = new class294(arg0.method3251(), this.field3665);
                class294 var6 = new class294(arg0.method3251(), this.field3665);
                arg0.method3251();
                if (var5 != null && var5.method5076()) {
                    class289 var7 = (class289) this.method4974(var5);
                    if (var4) {
                        class289 var8 = (class289) this.method4974(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4977(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4982(var7, var5, var6);
                        continue;
                    }
                    if (this.method4970() < 400) {
                        int var9 = this.method4970();
                        class289 var10 = (class289) this.method4979(var5, var6);
                        var10.field3674 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
