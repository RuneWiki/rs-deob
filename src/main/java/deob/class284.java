package deob;

@ObfuscatedName("jq")
public class class284 extends class277 {

    @ObfuscatedName("jq.i")
    public final class338 field3609;

    @ObfuscatedName("jq.y")
    public final class280 field3610;

    @ObfuscatedName("jq.d")
    public String field3611 = null;

    @ObfuscatedName("jq.c")
    public String field3612 = null;

    @ObfuscatedName("jq.o")
    public byte field3613;

    @ObfuscatedName("jq.v")
    public int field3614;

    @ObfuscatedName("jq.k")
    public int field3615 = 1;

    public class284(class338 arg0, class280 arg1) {
        super(100);
        this.field3609 = arg0;
        this.field3610 = arg1;
    }

    @ObfuscatedName("jq.f(B)Ljy;")
    public class274 method4709() {
        return new class273();
    }

    @ObfuscatedName("jq.i(IB)[Ljy;")
    public class274[] method4710(int arg0) {
        return new class273[arg0];
    }

    @ObfuscatedName("jq.y(Ljava/lang/String;I)V")
    public final void method4843(String arg0) {
        String var2 = class289.method3256(class289.method3738(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3611 = var2;
    }

    @ObfuscatedName("jq.x(Ljava/lang/String;I)V")
    public final void method4844(String arg0) {
        String var2 = class289.method3256(class289.method3738(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3612 = var2;
    }

    @ObfuscatedName("jq.cg(Lkq;I)V")
    public final void method4845(class300 arg0) {
        this.method4844(arg0.method5119());
        long var2 = arg0.method5116();
        this.method4843(class289.method181(var2));
        this.field3613 = arg0.method5297();
        int var4 = arg0.method5110();
        if (var4 == 255) {
            return;
        }
        this.method4717();
        for (int var5 = 0; var5 < var4; var5++) {
            class273 var6 = (class273) this.method4726(new class283(arg0.method5119(), this.field3609));
            int var7 = arg0.method5112();
            var6.method4807(var7, ++this.field3615 - 1);
            var6.field3592 = arg0.method5297();
            arg0.method5119();
            this.method4850(var6);
        }
    }

    @ObfuscatedName("jq.ct(Lkq;I)V")
    public final void method4846(class300 arg0) {
        class283 var2 = new class283(arg0.method5119(), this.field3609);
        int var3 = arg0.method5112();
        byte var4 = arg0.method5297();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4765() == 0) {
                return;
            }
            class273 var6 = (class273) this.method4722(var2);
            if (var6 != null && var6.method4801() == var3) {
                this.method4725(var6);
            }
            return;
        }
        arg0.method5119();
        class273 var7 = (class273) this.method4722(var2);
        if (var7 == null) {
            if (this.method4765() > this.field3585) {
                return;
            }
            var7 = (class273) this.method4726(var2);
        }
        var7.method4807(var3, ++this.field3615 - 1);
        var7.field3592 = var4;
        this.method4850(var7);
    }

    @ObfuscatedName("jq.cr(I)V")
    public final void method4847() {
        for (int var1 = 0; var1 < this.method4765(); var1++) {
            ((class273) this.method4742(var1)).method4649();
        }
    }

    @ObfuscatedName("jq.cy(B)V")
    public final void method4852() {
        for (int var1 = 0; var1 < this.method4765(); var1++) {
            ((class273) this.method4742(var1)).method4652();
        }
    }

    @ObfuscatedName("jq.cz(Ljd;I)V")
    public final void method4850(class273 arg0) {
        if (arg0.method4678().equals(this.field3610.method1166())) {
            this.field3614 = arg0.field3592;
        }
    }
}
