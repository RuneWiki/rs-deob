package deob;

@ObfuscatedName("nq")
public class class384 extends class393 {

    @ObfuscatedName("nq.c")
    public final class444 field4457;

    public class384(class444 arg0) {
        super(400);
        this.field4457 = arg0;
    }

    @ObfuscatedName("nq.a(B)Loj;")
    public class391 method6649() {
        return new class394();
    }

    @ObfuscatedName("nq.f(II)[Loj;")
    public class391[] method6650(int arg0) {
        return new class394[arg0];
    }

    @ObfuscatedName("nq.c(Lqr;IS)V")
    public void method6655(class464 arg0, int arg1) {
        while (true) {
            if (arg0.field4864 < arg1) {
                int var3 = arg0.method7735();
                boolean var4 = (var3 & 0x1) == 1;
                class486 var5 = new class486(arg0.method7725(), this.field4457);
                class486 var6 = new class486(arg0.method7725(), this.field4457);
                arg0.method7725();
                if (var5 != null && var5.method8296()) {
                    class394 var7 = (class394) this.method6761(var5);
                    if (var4) {
                        class394 var8 = (class394) this.method6761(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method6764(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method6811(var7, var5, var6);
                        continue;
                    }
                    if (this.method6803() < 400) {
                        int var9 = this.method6803();
                        class394 var10 = (class394) this.method6766(var5, var6);
                        var10.field4493 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
