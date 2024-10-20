package deob;

@ObfuscatedName("kx")
public class class299 extends class300 {

    @ObfuscatedName("kx.t")
    public final class336 field3836;

    public class299(class336 arg0) {
        super(400);
        this.field3836 = arg0;
    }

    @ObfuscatedName("kx.o(B)Lku;")
    public class297 method4904() {
        return new class301();
    }

    @ObfuscatedName("kx.k(II)[Lku;")
    public class297[] method4905(int arg0) {
        return new class301[arg0];
    }

    @ObfuscatedName("kx.t(Lgc;IB)V")
    public void method4906(class195 arg0, int arg1) {
        while (true) {
            if (arg0.field2575 < arg1) {
                int var3 = arg0.method3205();
                boolean var4 = (var3 & 0x1) == 1;
                class306 var5 = new class306(arg0.method3284(), this.field3836);
                class306 var6 = new class306(arg0.method3284(), this.field3836);
                arg0.method3284();
                if (var5 != null && var5.method5017()) {
                    class301 var7 = (class301) this.method4936(var5);
                    if (var4) {
                        class301 var8 = (class301) this.method4936(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4923(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4928(var7, var5, var6);
                        continue;
                    }
                    if (this.method4916() < 400) {
                        int var9 = this.method4916();
                        class301 var10 = (class301) this.method4925(var5, var6);
                        var10.field3845 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
