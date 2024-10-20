package deob;

@ObfuscatedName("gn")
public final class class188 {

    @ObfuscatedName("gn.s")
    public class198 field2463 = new class198();

    public class188() {
        this.field2463.field2492 = this.field2463;
        this.field2463.field2491 = this.field2463;
    }

    @ObfuscatedName("gn.s(Lgf;)V")
    public void method3268(class198 arg0) {
        if (arg0.field2491 != null) {
            arg0.method3413();
        }
        arg0.field2491 = this.field2463.field2491;
        arg0.field2492 = this.field2463;
        arg0.field2491.field2492 = arg0;
        arg0.field2492.field2491 = arg0;
    }

    @ObfuscatedName("gn.c(Lgf;)V")
    public void method3269(class198 arg0) {
        if (arg0.field2491 != null) {
            arg0.method3413();
        }
        arg0.field2491 = this.field2463;
        arg0.field2492 = this.field2463.field2492;
        arg0.field2491.field2492 = arg0;
        arg0.field2492.field2491 = arg0;
    }

    @ObfuscatedName("gn.f()Lgf;")
    public class198 method3270() {
        class198 var1 = this.field2463.field2492;
        if (this.field2463 == var1) {
            return null;
        } else {
            var1.method3413();
            return var1;
        }
    }

    @ObfuscatedName("gn.m()Lgf;")
    public class198 method3267() {
        class198 var1 = this.field2463.field2492;
        return this.field2463 == var1 ? null : var1;
    }

    @ObfuscatedName("gn.h()V")
    public void method3272() {
        while (true) {
            class198 var1 = this.field2463.field2492;
            if (this.field2463 == var1) {
                return;
            }
            var1.method3413();
        }
    }
}
