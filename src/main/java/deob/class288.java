package deob;

@ObfuscatedName("kj")
public class class288 extends class289 {

    @ObfuscatedName("kj.q")
    public final class335 field3687;

    public class288(class335 arg0) {
        super(400);
        this.field3687 = arg0;
    }

    @ObfuscatedName("kj.m(I)Ljs;")
    public class286 method5022() {
        return new class290();
    }

    @ObfuscatedName("kj.f(II)[Ljs;")
    public class286[] method5031(int arg0) {
        return new class290[arg0];
    }

    @ObfuscatedName("kj.q(Lgr;IB)V")
    public void method5024(class202 arg0, int arg1) {
        while (true) {
            if (arg0.field2439 < arg1) {
                int var3 = arg0.method3551();
                boolean var4 = (var3 & 0x1) == 1;
                class295 var5 = new class295(arg0.method3426(), this.field3687);
                class295 var6 = new class295(arg0.method3426(), this.field3687);
                arg0.method3426();
                if (var5 != null && var5.method5133()) {
                    class290 var7 = (class290) this.method5040(var5);
                    if (var4) {
                        class290 var8 = (class290) this.method5040(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5043(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5057(var7, var5, var6);
                        continue;
                    }
                    if (this.method5036() < 400) {
                        int var9 = this.method5036();
                        class290 var10 = (class290) this.method5052(var5, var6);
                        var10.field3699 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
