package deob;

@ObfuscatedName("gq")
public final class class186 {

    @ObfuscatedName("gq.j")
    public class196 field2445 = new class196();

    public class186() {
        this.field2445.field2473 = this.field2445;
        this.field2445.field2474 = this.field2445;
    }

    @ObfuscatedName("gq.j(Lge;)V")
    public void method3220(class196 arg0) {
        if (arg0.field2474 != null) {
            arg0.method3350();
        }
        arg0.field2474 = this.field2445.field2474;
        arg0.field2473 = this.field2445;
        arg0.field2474.field2473 = arg0;
        arg0.field2473.field2474 = arg0;
    }

    @ObfuscatedName("gq.h(Lge;)V")
    public void method3225(class196 arg0) {
        if (arg0.field2474 != null) {
            arg0.method3350();
        }
        arg0.field2474 = this.field2445;
        arg0.field2473 = this.field2445.field2473;
        arg0.field2474.field2473 = arg0;
        arg0.field2473.field2474 = arg0;
    }

    @ObfuscatedName("gq.f()Lge;")
    public class196 method3229() {
        class196 var1 = this.field2445.field2473;
        if (this.field2445 == var1) {
            return null;
        } else {
            var1.method3350();
            return var1;
        }
    }

    @ObfuscatedName("gq.p()Lge;")
    public class196 method3223() {
        class196 var1 = this.field2445.field2473;
        return this.field2445 == var1 ? null : var1;
    }

    @ObfuscatedName("gq.x()V")
    public void method3224() {
        while (true) {
            class196 var1 = this.field2445.field2473;
            if (this.field2445 == var1) {
                return;
            }
            var1.method3350();
        }
    }
}
