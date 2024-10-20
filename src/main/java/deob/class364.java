package deob;

@ObfuscatedName("mi")
public class class364 extends class373 {

    @ObfuscatedName("mi.q")
    public final class423 field4284;

    public class364(class423 arg0) {
        super(400);
        this.field4284 = arg0;
    }

    @ObfuscatedName("mi.c(S)Lne;")
    public class371 method5998() {
        return new class374();
    }

    @ObfuscatedName("mi.v(II)[Lne;")
    public class371[] method5992(int arg0) {
        return new class374[arg0];
    }

    @ObfuscatedName("mi.q(Lqt;II)V")
    public void method5996(class443 arg0, int arg1) {
        while (true) {
            if (arg0.field4700 < arg1) {
                int var3 = arg0.method7047();
                boolean var4 = (var3 & 0x1) == 1;
                class464 var5 = new class464(arg0.method7057(), this.field4284);
                class464 var6 = new class464(arg0.method7057(), this.field4284);
                arg0.method7057();
                if (var5 != null && var5.method7619()) {
                    class374 var7 = (class374) this.method6100(var5);
                    if (var4) {
                        class374 var8 = (class374) this.method6100(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method6103(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method6108(var7, var5, var6);
                        continue;
                    }
                    if (this.method6096() < 400) {
                        int var9 = this.method6096();
                        class374 var10 = (class374) this.method6105(var5, var6);
                        var10.field4323 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
