package deob;

@ObfuscatedName("jz")
public class class285 extends class286 {

    @ObfuscatedName("jz.q")
    public final class323 field3637;

    public class285(class323 arg0) {
        super(400);
        this.field3637 = arg0;
    }

    @ObfuscatedName("jz.w(B)Ljn;")
    public class283 method4946() {
        return new class287();
    }

    @ObfuscatedName("jz.m(II)[Ljn;")
    public class283[] method4943(int arg0) {
        return new class287[arg0];
    }

    @ObfuscatedName("jz.q(Lgy;IB)V")
    public void method4944(class183 arg0, int arg1) {
        while (true) {
            if (arg0.field2360 < arg1) {
                int var3 = arg0.method3436();
                boolean var4 = (var3 & 0x1) == 1;
                class292 var5 = new class292(arg0.method3271(), this.field3637);
                class292 var6 = new class292(arg0.method3271(), this.field3637);
                arg0.method3271();
                if (var5 != null && var5.method5049()) {
                    class287 var7 = (class287) this.method4979(var5);
                    if (var4) {
                        class287 var8 = (class287) this.method4979(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4969(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4950(var7, var5, var6);
                        continue;
                    }
                    if (this.method4952() < 400) {
                        int var9 = this.method4952();
                        class287 var10 = (class287) this.method4978(var5, var6);
                        var10.field3647 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
