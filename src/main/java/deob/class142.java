package deob;

@ObfuscatedName("eu")
public class class142 extends class162 {

    @ObfuscatedName("eu.f")
    public final int field1575;

    @ObfuscatedName("eu.o")
    public final class145 field1578;

    @ObfuscatedName("eu.u")
    public int field1574;

    @ObfuscatedName("eu.p")
    public class157 field1577;

    @ObfuscatedName("eu.b")
    public int field1580;

    @ObfuscatedName("eu.e")
    public int field1579;

    public class142(class221 arg0, class221 arg1, int arg2, class145 arg3) {
        super(arg0, arg1);
        this.field1575 = arg2;
        this.field1578 = arg3;
        this.method2367();
    }

    @ObfuscatedName("eu.f(I)V")
    public void method2367() {
        this.field1574 = class295.method182(this.field1575).method4611().field3617;
        this.field1577 = this.field1578.method2521(class280.method4995(this.field1574));
        class280 var1 = class280.method4995(this.method2372());
        class395 var2 = var1.method4344(false);
        if (var2 == null) {
            this.field1580 = 0;
            this.field1579 = 0;
        } else {
            this.field1580 = var2.field4245;
            this.field1579 = var2.field4244;
        }
    }

    @ObfuscatedName("eu.o(B)I")
    public int method2372() {
        return this.field1574;
    }

    @ObfuscatedName("eu.u(I)Lfi;")
    public class157 method2366() {
        return this.field1577;
    }

    @ObfuscatedName("eu.p(I)I")
    public int method2370() {
        return this.field1580;
    }

    @ObfuscatedName("eu.b(I)I")
    public int method2375() {
        return this.field1579;
    }
}
