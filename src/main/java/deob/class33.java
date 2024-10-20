package deob;

@ObfuscatedName("ae")
public class class33 extends class44 {

    @ObfuscatedName("ae.h")
    public final int field205;

    @ObfuscatedName("ae.v")
    public final class39 field202;

    @ObfuscatedName("ae.x")
    public int field203;

    @ObfuscatedName("ae.w")
    public class38 field204;

    @ObfuscatedName("ae.t")
    public int field206;

    @ObfuscatedName("ae.j")
    public int field209;

    public class33(class223 arg0, class223 arg1, int arg2, class39 arg3) {
        super(arg0, arg1);
        this.field205 = arg2;
        this.field202 = arg3;
        this.method310();
    }

    @ObfuscatedName("ae.f(I)V")
    public void method310() {
        this.field203 = class265.method325(this.field205).method4263().field3415;
        this.field204 = this.field202.method442(class253.method3211(this.field203));
        class253 var1 = class253.method3211(this.method244());
        class336 var2 = var1.method4038(false);
        if (var2 == null) {
            this.field206 = 0;
            this.field209 = 0;
        } else {
            this.field206 = var2.field3914;
            this.field209 = var2.field3912;
        }
    }

    @ObfuscatedName("ae.h(I)I")
    public int method244() {
        return this.field203;
    }

    @ObfuscatedName("ae.v(I)Lah;")
    public class38 method236() {
        return this.field204;
    }

    @ObfuscatedName("ae.x(B)I")
    public int method247() {
        return this.field206;
    }

    @ObfuscatedName("ae.w(I)I")
    public int method238() {
        return this.field209;
    }
}
