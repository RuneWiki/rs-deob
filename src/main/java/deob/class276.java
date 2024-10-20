package deob;

@ObfuscatedName("ju")
public class class276 extends class277 {

    @ObfuscatedName("ju.y")
    public final class338 field3576;

    public class276(class338 arg0) {
        super(400);
        this.field3576 = arg0;
    }

    @ObfuscatedName("ju.f(B)Ljy;")
    public class274 method4709() {
        return new class278();
    }

    @ObfuscatedName("ju.i(IB)[Ljy;")
    public class274[] method4710(int arg0) {
        return new class278[arg0];
    }

    @ObfuscatedName("ju.y(Lkq;II)V")
    public void method4712(class300 arg0, int arg1) {
        while (true) {
            if (arg0.field3703 < arg1) {
                int var3 = arg0.method5110();
                boolean var4 = (var3 & 0x1) == 1;
                class283 var5 = new class283(arg0.method5119(), this.field3576);
                class283 var6 = new class283(arg0.method5119(), this.field3576);
                arg0.method5119();
                if (var5 != null && var5.method4823()) {
                    class278 var7 = (class278) this.method4722(var5);
                    if (var4) {
                        class278 var8 = (class278) this.method4722(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4725(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4730(var7, var5, var6);
                        continue;
                    }
                    if (this.method4765() < 400) {
                        int var9 = this.method4765();
                        class278 var10 = (class278) this.method4767(var5, var6);
                        var10.field3591 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
