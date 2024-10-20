package deob;

@ObfuscatedName("hh")
public class class223 extends class243 {

    @ObfuscatedName("hh.s")
    public final int field2690;

    @ObfuscatedName("hh.h")
    public final class226 field2687;

    @ObfuscatedName("hh.w")
    public int field2688;

    @ObfuscatedName("hh.v")
    public class238 field2689;

    @ObfuscatedName("hh.c")
    public int field2691;

    @ObfuscatedName("hh.q")
    public int field2692;

    public class223(class290 arg0, class290 arg1, int arg2, class226 arg3) {
        super(arg0, arg1);
        this.field2690 = arg2;
        this.field2687 = arg3;
        this.method4098();
    }

    @ObfuscatedName("hh.s(I)V")
    public void method4098() {
        this.field2688 = class187.method2907(this.field2690).method3247().field2064;
        this.field2689 = this.field2687.method4254(class171.method3061(this.field2688));
        class171 var1 = class171.method3061(this.method4097());
        class457 var2 = var1.method2961(false);
        if (var2 == null) {
            this.field2691 = 0;
            this.field2692 = 0;
        } else {
            this.field2691 = var2.field4799;
            this.field2692 = var2.field4797;
        }
    }

    @ObfuscatedName("hh.h(B)I")
    public int method4097() {
        return this.field2688;
    }

    @ObfuscatedName("hh.w(B)Liw;")
    public class238 method4100() {
        return this.field2689;
    }

    @ObfuscatedName("hh.v(I)I")
    public int method4114() {
        return this.field2691;
    }

    @ObfuscatedName("hh.c(I)I")
    public int method4102() {
        return this.field2692;
    }
}
