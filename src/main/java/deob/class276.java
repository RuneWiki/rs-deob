package deob;

@ObfuscatedName("ju")
public class class276 extends class277 {

    @ObfuscatedName("ju.b")
    public final class338 field3600;

    public class276(class338 arg0) {
        super(400);
        this.field3600 = arg0;
    }

    @ObfuscatedName("ju.u(I)Ljr;")
    public class274 method4732() {
        return new class278();
    }

    @ObfuscatedName("ju.f(IB)[Ljr;")
    public class274[] method4742(int arg0) {
        return new class278[arg0];
    }

    @ObfuscatedName("ju.b(Lkg;II)V")
    public void method4734(class300 arg0, int arg1) {
        while (true) {
            if (arg0.field3707 < arg1) {
                int var3 = arg0.method5138();
                boolean var4 = (var3 & 0x1) == 1;
                class283 var5 = new class283(arg0.method5147(), this.field3600);
                class283 var6 = new class283(arg0.method5147(), this.field3600);
                arg0.method5147();
                if (var5 != null && var5.method4835()) {
                    class278 var7 = (class278) this.method4751(var5);
                    if (var4) {
                        class278 var8 = (class278) this.method4751(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4768(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4791(var7, var5, var6);
                        continue;
                    }
                    if (this.method4747() < 400) {
                        int var9 = this.method4747();
                        class278 var10 = (class278) this.method4756(var5, var6);
                        var10.field3609 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
