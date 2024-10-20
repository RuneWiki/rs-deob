package deob;

@ObfuscatedName("x")
public class class19 extends class35 {

    @ObfuscatedName("x.z")
    public final int field118;

    @ObfuscatedName("x.n")
    public final class29 field126;

    @ObfuscatedName("x.v")
    public final int field120;

    @ObfuscatedName("x.u")
    public final int field122;

    public class19(class214 arg0, class214 arg1, int arg2, class29 arg3) {
        super(arg0, arg1);
        this.field118 = arg2;
        this.field126 = arg3;
        class242 var5 = class242.method2284(this.method196());
        class325 var6 = var5.method3947(false);
        if (var6 == null) {
            this.field120 = 0;
            this.field122 = 0;
        } else {
            this.field120 = var6.field3870;
            this.field122 = var6.field3871;
        }
    }

    @ObfuscatedName("x.z(B)I")
    public int method196() {
        return this.field118;
    }

    @ObfuscatedName("x.n(I)Law;")
    public class29 method190() {
        return this.field126;
    }

    @ObfuscatedName("x.v(I)I")
    public int method192() {
        return this.field120;
    }

    @ObfuscatedName("x.u(I)I")
    public int method203() {
        return this.field122;
    }
}
