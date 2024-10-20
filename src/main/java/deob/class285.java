package deob;

@ObfuscatedName("jz")
public class class285 extends class277 {

    @ObfuscatedName("jz.x")
    public final class338 field3612;

    @ObfuscatedName("jz.t")
    public final class280 field3605;

    @ObfuscatedName("jz.z")
    public String field3604 = null;

    @ObfuscatedName("jz.n")
    public String field3607 = null;

    @ObfuscatedName("jz.h")
    public byte field3606;

    @ObfuscatedName("jz.f")
    public int field3609;

    @ObfuscatedName("jz.s")
    public int field3610 = 1;

    public class285(class338 arg0, class280 arg1) {
        super(100);
        this.field3612 = arg0;
        this.field3605 = arg1;
    }

    @ObfuscatedName("jz.c(I)Ljw;")
    public class274 method4718() {
        return new class273();
    }

    @ObfuscatedName("jz.x(II)[Ljw;")
    public class274[] method4712(int arg0) {
        return new class273[arg0];
    }

    @ObfuscatedName("jz.t(Ljava/lang/String;I)V")
    public final void method4841(String arg0) {
        String var2 = class289.method3815(class289.method915(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3604 = var2;
    }

    @ObfuscatedName("jz.v(Ljava/lang/String;B)V")
    public final void method4846(String arg0) {
        String var2 = class289.method3815(class289.method915(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3607 = var2;
    }

    @ObfuscatedName("jz.d(Lkz;I)V")
    public final void method4843(class300 arg0) {
        this.method4846(arg0.method5112());
        long var2 = arg0.method5143();
        this.method4841(Statics.method3039(var2));
        this.field3606 = arg0.method5168();
        int var4 = arg0.method5103();
        if (var4 == 255) {
            return;
        }
        this.method4723();
        for (int var5 = 0; var5 < var4; var5++) {
            class273 var6 = (class273) this.method4722(new class283(arg0.method5112(), this.field3612));
            int var7 = arg0.method5304();
            var6.method4796(var7, ++this.field3610 - 1);
            var6.field3580 = arg0.method5168();
            arg0.method5112();
            this.method4842(var6);
        }
    }

    @ObfuscatedName("jz.z(Lkz;I)V")
    public final void method4860(class300 arg0) {
        class283 var2 = new class283(arg0.method5112(), this.field3612);
        int var3 = arg0.method5304();
        byte var4 = arg0.method5168();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4784() == 0) {
                return;
            }
            class273 var6 = (class273) this.method4728(var2);
            if (var6 != null && var6.method4797() == var3) {
                this.method4731(var6);
            }
            return;
        }
        arg0.method5112();
        class273 var7 = (class273) this.method4728(var2);
        if (var7 == null) {
            if (this.method4784() > this.field3571) {
                return;
            }
            var7 = (class273) this.method4722(var2);
        }
        var7.method4796(var3, ++this.field3610 - 1);
        var7.field3580 = var4;
        this.method4842(var7);
    }

    @ObfuscatedName("jz.cl(B)V")
    public final void method4844() {
        for (int var1 = 0; var1 < this.method4784(); var1++) {
            ((class273) this.method4734(var1)).method4671();
        }
    }

    @ObfuscatedName("jz.ca(I)V")
    public final void method4845() {
        for (int var1 = 0; var1 < this.method4784(); var1++) {
            ((class273) this.method4734(var1)).method4665();
        }
    }

    @ObfuscatedName("jz.ck(Ljl;I)V")
    public final void method4842(class273 arg0) {
        if (arg0.method4683().equals(this.field3605.method1138())) {
            this.field3609 = arg0.field3580;
        }
    }
}
