package deob;

@ObfuscatedName("jg")
public class class285 extends class277 {

    @ObfuscatedName("jg.f")
    public final class338 field3634;

    @ObfuscatedName("jg.b")
    public final class280 field3637;

    @ObfuscatedName("jg.i")
    public String field3636 = null;

    @ObfuscatedName("jg.k")
    public String field3639 = null;

    @ObfuscatedName("jg.x")
    public byte field3638;

    @ObfuscatedName("jg.o")
    public int field3633;

    @ObfuscatedName("jg.e")
    public int field3640 = 1;

    public class285(class338 arg0, class280 arg1) {
        super(100);
        this.field3634 = arg0;
        this.field3637 = arg1;
    }

    @ObfuscatedName("jg.u(I)Ljr;")
    public class274 method4732() {
        return new class273();
    }

    @ObfuscatedName("jg.f(IB)[Ljr;")
    public class274[] method4742(int arg0) {
        return new class273[arg0];
    }

    @ObfuscatedName("jg.b(Ljava/lang/String;I)V")
    public final void method4881(String arg0) {
        this.field3636 = class289.method77(arg0);
    }

    @ObfuscatedName("jg.o(Ljava/lang/String;B)V")
    public final void method4862(String arg0) {
        this.field3639 = class289.method77(arg0);
    }

    @ObfuscatedName("jg.e(Lkg;I)V")
    public final void method4863(class300 arg0) {
        this.method4862(arg0.method5147());
        long var2 = arg0.method5144();
        this.method4881(class289.method3662(var2));
        this.field3638 = arg0.method5139();
        int var4 = arg0.method5138();
        if (var4 == 255) {
            return;
        }
        this.method4746();
        for (int var5 = 0; var5 < var4; var5++) {
            class273 var6 = (class273) this.method4755(new class283(arg0.method5147(), this.field3634));
            int var7 = arg0.method5337();
            var6.method4817(var7, ++this.field3640 - 1);
            var6.field3612 = arg0.method5139();
            arg0.method5147();
            this.method4864(var6);
        }
    }

    @ObfuscatedName("jg.cr(Lkg;I)V")
    public final void method4874(class300 arg0) {
        class283 var2 = new class283(arg0.method5147(), this.field3634);
        int var3 = arg0.method5337();
        byte var4 = arg0.method5139();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4747() == 0) {
                return;
            }
            class273 var6 = (class273) this.method4751(var2);
            if (var6 != null && var6.method4818() == var3) {
                this.method4768(var6);
            }
            return;
        }
        arg0.method5147();
        class273 var7 = (class273) this.method4751(var2);
        if (var7 == null) {
            if (this.method4747() > this.field3605) {
                return;
            }
            var7 = (class273) this.method4755(var2);
        }
        var7.method4817(var3, ++this.field3640 - 1);
        var7.field3612 = var4;
        this.method4864(var7);
    }

    @ObfuscatedName("jg.ck(I)V")
    public final void method4865() {
        for (int var1 = 0; var1 < this.method4747(); var1++) {
            ((class273) this.method4757(var1)).method4690();
        }
    }

    @ObfuscatedName("jg.cb(B)V")
    public final void method4866() {
        for (int var1 = 0; var1 < this.method4747(); var1++) {
            ((class273) this.method4757(var1)).method4693();
        }
    }

    @ObfuscatedName("jg.cy(Ljs;I)V")
    public final void method4864(class273 arg0) {
        if (arg0.method4716().equals(this.field3637.method1171())) {
            this.field3633 = arg0.field3612;
        }
    }
}
