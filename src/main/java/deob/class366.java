package deob;

@ObfuscatedName("nu")
public class class366 extends class375 {

    @ObfuscatedName("nu.f")
    public final class425 field4323;

    public class366(class425 arg0) {
        super(400);
        this.field4323 = arg0;
    }

    @ObfuscatedName("nu.c(B)Lnc;")
    public class373 method6155() {
        return new class376();
    }

    @ObfuscatedName("nu.p(IB)[Lnc;")
    public class373[] method6159(int arg0) {
        return new class376[arg0];
    }

    @ObfuscatedName("nu.f(Lqq;IB)V")
    public void method6157(class445 arg0, int arg1) {
        while (true) {
            if (arg0.field4735 < arg1) {
                int var3 = arg0.method7196();
                boolean var4 = (var3 & 0x1) == 1;
                class466 var5 = new class466(arg0.method7206(), this.field4323);
                class466 var6 = new class466(arg0.method7206(), this.field4323);
                arg0.method7206();
                if (var5 != null && var5.method7784()) {
                    class376 var7 = (class376) this.method6250(var5);
                    if (var4) {
                        class376 var8 = (class376) this.method6250(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method6253(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method6252(var7, var5, var6);
                        continue;
                    }
                    if (this.method6246() < 400) {
                        int var9 = this.method6246();
                        class376 var10 = (class376) this.method6304(var5, var6);
                        var10.field4363 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
