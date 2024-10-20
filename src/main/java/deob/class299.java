package deob;

@ObfuscatedName("kp")
public class class299 extends class291 {

    @ObfuscatedName("kp.h")
    public final class334 field3722;

    @ObfuscatedName("kp.l")
    public final class294 field3720;

    @ObfuscatedName("kp.d")
    public String field3719 = null;

    @ObfuscatedName("kp.t")
    public String field3725 = null;

    @ObfuscatedName("kp.f")
    public byte field3723;

    @ObfuscatedName("kp.i")
    public int field3724;

    @ObfuscatedName("kp.m")
    public int field3726 = 1;

    public class299(class334 arg0, class294 arg1) {
        super(100);
        this.field3722 = arg0;
        this.field3720 = arg1;
    }

    @ObfuscatedName("kp.n(I)Lke;")
    public class288 method5155() {
        return new class287();
    }

    @ObfuscatedName("kp.h(IB)[Lke;")
    public class288[] method5156(int arg0) {
        return new class287[arg0];
    }

    @ObfuscatedName("kp.l(Ljava/lang/String;B)V")
    public final void method5282(String arg0) {
        String var2 = class309.method4436(class309.method3083(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3719 = var2;
    }

    @ObfuscatedName("kp.z(Ljava/lang/String;B)V")
    public final void method5288(String arg0) {
        String var2 = class309.method4436(class309.method3083(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3725 = var2;
    }

    @ObfuscatedName("kp.cf(Lgc;I)V")
    public final void method5284(class190 arg0) {
        this.method5288(arg0.method3520());
        long var2 = arg0.method3517();
        this.method5282(class309.method1037(var2));
        this.field3723 = arg0.method3512();
        int var4 = arg0.method3511();
        if (var4 == 255) {
            return;
        }
        this.method5163();
        for (int var5 = 0; var5 < var4; var5++) {
            class287 var6 = (class287) this.method5172(new class297(arg0.method3520(), this.field3722));
            int var7 = arg0.method3513();
            var6.method5237(var7, ++this.field3726 - 1);
            var6.field3703 = arg0.method3512();
            arg0.method3520();
            this.method5283(var6);
        }
    }

    @ObfuscatedName("kp.cm(Lgc;I)V")
    public final void method5285(class190 arg0) {
        class297 var2 = new class297(arg0.method3520(), this.field3722);
        int var3 = arg0.method3513();
        byte var4 = arg0.method3512();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5164() == 0) {
                return;
            }
            class287 var6 = (class287) this.method5211(var2);
            if (var6 != null && var6.method5236() == var3) {
                this.method5167(var6);
            }
            return;
        }
        arg0.method3520();
        class287 var7 = (class287) this.method5211(var2);
        if (var7 == null) {
            if (this.method5164() > this.field3697) {
                return;
            }
            var7 = (class287) this.method5172(var2);
        }
        var7.method5237(var3, ++this.field3726 - 1);
        var7.field3703 = var4;
        this.method5283(var7);
    }

    @ObfuscatedName("kp.cy(B)V")
    public final void method5293() {
        for (int var1 = 0; var1 < this.method5164(); var1++) {
            ((class287) this.method5174(var1)).method5107();
        }
    }

    @ObfuscatedName("kp.cx(I)V")
    public final void method5287() {
        for (int var1 = 0; var1 < this.method5164(); var1++) {
            ((class287) this.method5174(var1)).method5110();
        }
    }

    @ObfuscatedName("kp.cw(Lkw;I)V")
    public final void method5283(class287 arg0) {
        if (arg0.method5125().equals(this.field3720.method1167())) {
            this.field3724 = arg0.field3703;
        }
    }
}
