package deob;

@ObfuscatedName("hi")
public class class211 {

    @ObfuscatedName("hi.f")
    public class212 field2495 = new class212();

    @ObfuscatedName("hi.h")
    public class212 field2494;

    public class211() {
        this.field2495.field2497 = this.field2495;
        this.field2495.field2496 = this.field2495;
    }

    @ObfuscatedName("hi.f(Lhy;)V")
    public void method3848(class212 arg0) {
        if (arg0.field2496 != null) {
            arg0.method3858();
        }
        arg0.field2496 = this.field2495.field2496;
        arg0.field2497 = this.field2495;
        arg0.field2496.field2497 = arg0;
        arg0.field2497.field2496 = arg0;
    }

    @ObfuscatedName("hi.h()Lhy;")
    public class212 method3849() {
        class212 var1 = this.field2495.field2497;
        if (this.field2495 == var1) {
            this.field2494 = null;
            return null;
        } else {
            this.field2494 = var1.field2497;
            return var1;
        }
    }

    @ObfuscatedName("hi.e()Lhy;")
    public class212 method3850() {
        class212 var1 = this.field2494;
        if (this.field2495 == var1) {
            this.field2494 = null;
            return null;
        } else {
            this.field2494 = var1.field2497;
            return var1;
        }
    }
}
