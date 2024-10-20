package deob;

@ObfuscatedName("gp")
public class class199 {

    @ObfuscatedName("gp.s")
    public class200 field2494 = new class200();

    @ObfuscatedName("gp.c")
    public class200 field2493;

    public class199() {
        this.field2494.field2495 = this.field2494;
        this.field2494.field2496 = this.field2494;
    }

    @ObfuscatedName("gp.s(Lgc;)V")
    public void method3417(class200 arg0) {
        if (arg0.field2496 != null) {
            arg0.method3427();
        }
        arg0.field2496 = this.field2494.field2496;
        arg0.field2495 = this.field2494;
        arg0.field2496.field2495 = arg0;
        arg0.field2495.field2496 = arg0;
    }

    @ObfuscatedName("gp.c()Lgc;")
    public class200 method3419() {
        class200 var1 = this.field2494.field2495;
        if (this.field2494 == var1) {
            this.field2493 = null;
            return null;
        } else {
            this.field2493 = var1.field2495;
            return var1;
        }
    }

    @ObfuscatedName("gp.f()Lgc;")
    public class200 method3418() {
        class200 var1 = this.field2493;
        if (this.field2494 == var1) {
            this.field2493 = null;
            return null;
        } else {
            this.field2493 = var1.field2495;
            return var1;
        }
    }
}
