package deob;

@ObfuscatedName("gx")
public class class199 {

    @ObfuscatedName("gx.w")
    public class200 field2496 = new class200();

    @ObfuscatedName("gx.o")
    public class200 field2495;

    public class199() {
        this.field2496.field2498 = this.field2496;
        this.field2496.field2497 = this.field2496;
    }

    @ObfuscatedName("gx.w(Lgi;)V")
    public void method3336(class200 arg0) {
        if (arg0.field2497 != null) {
            arg0.method3344();
        }
        arg0.field2497 = this.field2496.field2497;
        arg0.field2498 = this.field2496;
        arg0.field2497.field2498 = arg0;
        arg0.field2498.field2497 = arg0;
    }

    @ObfuscatedName("gx.o()Lgi;")
    public class200 method3337() {
        class200 var1 = this.field2496.field2498;
        if (this.field2496 == var1) {
            this.field2495 = null;
            return null;
        } else {
            this.field2495 = var1.field2498;
            return var1;
        }
    }

    @ObfuscatedName("gx.x()Lgi;")
    public class200 method3338() {
        class200 var1 = this.field2495;
        if (this.field2496 == var1) {
            this.field2495 = null;
            return null;
        } else {
            this.field2495 = var1.field2498;
            return var1;
        }
    }
}
