package deob;

@ObfuscatedName("om")
public class class394 extends class403 {

    @ObfuscatedName("om.v")
    public final class454 field4536;

    public class394(class454 arg0) {
        super(400);
        this.field4536 = arg0;
    }

    @ObfuscatedName("om.f(I)Low;")
    public class401 method6946() {
        return new class404();
    }

    @ObfuscatedName("om.w(II)[Low;")
    public class401[] method6950(int arg0) {
        return new class404[arg0];
    }

    @ObfuscatedName("om.v(Lrd;IB)V")
    public void method6947(class474 arg0, int arg1) {
        while (true) {
            if (arg0.field4939 < arg1) {
                int var3 = arg0.method7964();
                boolean var4 = (var3 & 0x1) == 1;
                class497 var5 = new class497(arg0.method7983(), this.field4536);
                class497 var6 = new class497(arg0.method7983(), this.field4536);
                arg0.method7983();
                if (var5 != null && var5.method8558()) {
                    class404 var7 = (class404) this.method7055(var5);
                    if (var4) {
                        class404 var8 = (class404) this.method7055(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method7097(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method7063(var7, var5, var6);
                        continue;
                    }
                    if (this.method7052() < 400) {
                        int var9 = this.method7052();
                        class404 var10 = (class404) this.method7060(var5, var6);
                        var10.field4572 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
