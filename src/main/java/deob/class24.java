package deob;

@ObfuscatedName("d")
public class class24 extends class35 {

    @ObfuscatedName("d.z")
    public final int field181;

    @ObfuscatedName("d.n")
    public final class30 field178;

    @ObfuscatedName("d.v")
    public int field179;

    @ObfuscatedName("d.u")
    public class29 field176;

    @ObfuscatedName("d.r")
    public int field180;

    @ObfuscatedName("d.p")
    public int field177;

    public class24(class214 arg0, class214 arg1, int arg2, class30 arg3) {
        super(arg0, arg1);
        this.field181 = arg2;
        this.field178 = arg3;
        this.method269();
    }

    @ObfuscatedName("d.f(B)V")
    public void method269() {
        this.field179 = class254.method1148(this.field181).method4158().field3336;
        this.field176 = this.field178.method407(class242.method2284(this.field179));
        class242 var1 = class242.method2284(this.method196());
        class325 var2 = var1.method3947(false);
        if (var2 == null) {
            this.field180 = 0;
            this.field177 = 0;
        } else {
            this.field180 = var2.field3870;
            this.field177 = var2.field3871;
        }
    }

    @ObfuscatedName("d.z(B)I")
    public int method196() {
        return this.field179;
    }

    @ObfuscatedName("d.n(I)Law;")
    public class29 method190() {
        return this.field176;
    }

    @ObfuscatedName("d.v(I)I")
    public int method192() {
        return this.field180;
    }

    @ObfuscatedName("d.u(I)I")
    public int method203() {
        return this.field177;
    }
}
