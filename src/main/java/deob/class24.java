package deob;

@ObfuscatedName("o")
public class class24 extends class35 {

    @ObfuscatedName("o.c")
    public final int field179;

    @ObfuscatedName("o.x")
    public final class30 field183;

    @ObfuscatedName("o.t")
    public int field180;

    @ObfuscatedName("o.g")
    public class29 field181;

    @ObfuscatedName("o.l")
    public int field182;

    @ObfuscatedName("o.u")
    public int field187;

    public class24(class214 arg0, class214 arg1, int arg2, class30 arg3) {
        super(arg0, arg1);
        this.field179 = arg2;
        this.field183 = arg3;
        this.method236();
    }

    @ObfuscatedName("o.w(S)V")
    public void method236() {
        this.field180 = class254.method3035(this.field179).method4291().field3350;
        this.field181 = this.field183.method358(class242.method481(this.field180));
        class242 var1 = class242.method481(this.method166());
        class325 var2 = var1.method4033(false);
        if (var2 == null) {
            this.field182 = 0;
            this.field187 = 0;
        } else {
            this.field182 = var2.field3867;
            this.field187 = var2.field3868;
        }
    }

    @ObfuscatedName("o.c(I)I")
    public int method166() {
        return this.field180;
    }

    @ObfuscatedName("o.x(I)Lao;")
    public class29 method162() {
        return this.field181;
    }

    @ObfuscatedName("o.t(I)I")
    public int method174() {
        return this.field182;
    }

    @ObfuscatedName("o.g(I)I")
    public int method164() {
        return this.field187;
    }
}
