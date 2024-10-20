package deob;

@ObfuscatedName("ka")
public class class296 extends class288 {

    @ObfuscatedName("ka.c")
    public final class331 field3701;

    @ObfuscatedName("ka.n")
    public final class291 field3702;

    @ObfuscatedName("ka.s")
    public String field3700 = null;

    @ObfuscatedName("ka.v")
    public String field3704 = null;

    @ObfuscatedName("ka.k")
    public byte field3705;

    @ObfuscatedName("ka.o")
    public int field3706;

    @ObfuscatedName("ka.q")
    public int field3707 = 1;

    public class296(class331 arg0, class291 arg1) {
        super(100);
        this.field3701 = arg0;
        this.field3702 = arg1;
    }

    @ObfuscatedName("ka.y(I)Ljd;")
    public class285 method4988() {
        return new class284();
    }

    @ObfuscatedName("ka.c(II)[Ljd;")
    public class285[] method4989(int arg0) {
        return new class284[arg0];
    }

    @ObfuscatedName("ka.n(Ljava/lang/String;B)V")
    public final void method5104(String arg0) {
        this.field3700 = class306.method996(arg0);
    }

    @ObfuscatedName("ka.o(Ljava/lang/String;I)V")
    public final void method5105(String arg0) {
        this.field3704 = class306.method996(arg0);
    }

    @ObfuscatedName("ka.q(Lge;I)V")
    public final void method5106(class185 arg0) {
        this.method5105(arg0.method3277());
        long var2 = arg0.method3488();
        this.method5104(class306.method2585(var2));
        this.field3705 = arg0.method3319();
        int var4 = arg0.method3299();
        if (var4 == 255) {
            return;
        }
        this.method5001();
        for (int var5 = 0; var5 < var4; var5++) {
            class284 var6 = (class284) this.method5010(new class294(arg0.method3277(), this.field3701));
            int var7 = arg0.method3280();
            var6.method5061(var7, ++this.field3707 - 1);
            var6.field3685 = arg0.method3319();
            arg0.method3277();
            this.method5109(var6);
        }
    }

    @ObfuscatedName("ka.l(Lge;B)V")
    public final void method5111(class185 arg0) {
        class294 var2 = new class294(arg0.method3277(), this.field3701);
        int var3 = arg0.method3280();
        byte var4 = arg0.method3319();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5002() == 0) {
                return;
            }
            class284 var6 = (class284) this.method5043(var2);
            if (var6 != null && var6.method5062() == var3) {
                this.method5009(var6);
            }
            return;
        }
        arg0.method3277();
        class284 var7 = (class284) this.method5043(var2);
        if (var7 == null) {
            if (this.method5002() > this.field3675) {
                return;
            }
            var7 = (class284) this.method5010(var2);
        }
        var7.method5061(var3, ++this.field3707 - 1);
        var7.field3685 = var4;
        this.method5109(var7);
    }

    @ObfuscatedName("ka.bs(I)V")
    public final void method5120() {
        for (int var1 = 0; var1 < this.method5002(); var1++) {
            ((class284) this.method5047(var1)).method4950();
        }
    }

    @ObfuscatedName("ka.bf(I)V")
    public final void method5107() {
        for (int var1 = 0; var1 < this.method5002(); var1++) {
            ((class284) this.method5047(var1)).method4941();
        }
    }

    @ObfuscatedName("ka.be(Ljv;I)V")
    public final void method5109(class284 arg0) {
        if (arg0.method4962().equals(this.field3702.method1125())) {
            this.field3706 = arg0.field3685;
        }
    }
}
