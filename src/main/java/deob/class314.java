package deob;

@ObfuscatedName("lu")
public class class314 extends class323 {

    @ObfuscatedName("lu.u")
    public final class364 field3811;

    public class314(class364 arg0) {
        super(400);
        this.field3811 = arg0;
    }

    @ObfuscatedName("lu.f(I)Llt;")
    public class321 method5026() {
        return new class324();
    }

    @ObfuscatedName("lu.o(II)[Llt;")
    public class321[] method5027(int arg0) {
        return new class324[arg0];
    }

    @ObfuscatedName("lu.u(Lnu;II)V")
    public void method5032(class382 arg0, int arg1) {
        while (true) {
            if (arg0.field4155 < arg1) {
                int var3 = arg0.method5856();
                boolean var4 = (var3 & 0x1) == 1;
                class327 var5 = new class327(arg0.method5865(), this.field3811);
                class327 var6 = new class327(arg0.method5865(), this.field3811);
                arg0.method5865();
                if (var5 != null && var5.method5212()) {
                    class324 var7 = (class324) this.method5160(var5);
                    if (var4) {
                        class324 var8 = (class324) this.method5160(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5118(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5123(var7, var5, var6);
                        continue;
                    }
                    if (this.method5111() < 400) {
                        int var9 = this.method5111();
                        class324 var10 = (class324) this.method5120(var5, var6);
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
