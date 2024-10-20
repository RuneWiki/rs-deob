package deob;

@ObfuscatedName("ln")
public class class331 extends class340 {

    @ObfuscatedName("ln.f")
    public final class383 field3934;

    public class331(class383 arg0) {
        super(400);
        this.field3934 = arg0;
    }

    @ObfuscatedName("ln.l(I)Llu;")
    public class338 method5438() {
        return new class341();
    }

    @ObfuscatedName("ln.q(II)[Llu;")
    public class338[] method5439(int arg0) {
        return new class341[arg0];
    }

    @ObfuscatedName("ln.f(Lot;II)V")
    public void method5447(class401 arg0, int arg1) {
        while (true) {
            if (arg0.field4292 < arg1) {
                int var3 = arg0.method6272();
                boolean var4 = (var3 & 0x1) == 1;
                class422 var5 = new class422(arg0.method6474(), this.field3934);
                class422 var6 = new class422(arg0.method6474(), this.field3934);
                arg0.method6474();
                if (var5 != null && var5.method6817()) {
                    class341 var7 = (class341) this.method5541(var5);
                    if (var4) {
                        class341 var8 = (class341) this.method5541(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5544(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5549(var7, var5, var6);
                        continue;
                    }
                    if (this.method5564() < 400) {
                        int var9 = this.method5564();
                        class341 var10 = (class341) this.method5599(var5, var6);
                        var10.field3972 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
