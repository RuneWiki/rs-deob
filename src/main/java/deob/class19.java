package deob;

@ObfuscatedName("y")
public class class19 extends class35 {

    @ObfuscatedName("y.c")
    public final int field124;

    @ObfuscatedName("y.x")
    public final class29 field121;

    @ObfuscatedName("y.t")
    public final int field122;

    @ObfuscatedName("y.g")
    public final int field123;

    public class19(class214 arg0, class214 arg1, int arg2, class29 arg3) {
        super(arg0, arg1);
        this.field124 = arg2;
        this.field121 = arg3;
        class242 var5 = class242.method481(this.method166());
        class325 var6 = var5.method4033(false);
        if (var6 == null) {
            this.field122 = 0;
            this.field123 = 0;
        } else {
            this.field122 = var6.field3867;
            this.field123 = var6.field3868;
        }
    }

    @ObfuscatedName("y.c(I)I")
    public int method166() {
        return this.field124;
    }

    @ObfuscatedName("y.x(I)Lao;")
    public class29 method162() {
        return this.field121;
    }

    @ObfuscatedName("y.t(I)I")
    public int method174() {
        return this.field122;
    }

    @ObfuscatedName("y.g(I)I")
    public int method164() {
        return this.field123;
    }
}
