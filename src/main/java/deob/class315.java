package deob;

@ObfuscatedName("lo")
public class class315 extends class324 {

    @ObfuscatedName("lo.f")
    public final class365 field3806;

    public class315(class365 arg0) {
        super(400);
        this.field3806 = arg0;
    }

    @ObfuscatedName("lo.v(B)Llx;")
    public class322 method5146() {
        return new class325();
    }

    @ObfuscatedName("lo.n(II)[Llx;")
    public class322[] method5149(int arg0) {
        return new class325[arg0];
    }

    @ObfuscatedName("lo.f(Lnd;IS)V")
    public void method5147(class383 arg0, int arg1) {
        while (true) {
            if (arg0.field4158 < arg1) {
                int var3 = arg0.method5965();
                boolean var4 = (var3 & 0x1) == 1;
                class328 var5 = new class328(arg0.method5974(), this.field3806);
                class328 var6 = new class328(arg0.method5974(), this.field3806);
                arg0.method5974();
                if (var5 != null && var5.method5339()) {
                    class325 var7 = (class325) this.method5250(var5);
                    if (var4) {
                        class325 var8 = (class325) this.method5250(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5253(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5258(var7, var5, var6);
                        continue;
                    }
                    if (this.method5246() < 400) {
                        int var9 = this.method5246();
                        class325 var10 = (class325) this.method5255(var5, var6);
                        var10.field3849 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
