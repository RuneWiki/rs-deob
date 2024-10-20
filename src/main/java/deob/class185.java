package deob;

@ObfuscatedName("gm")
public final class class185 {

    @ObfuscatedName("gm.d")
    public class195 field2462 = new class195();

    public class185() {
        this.field2462.field2491 = this.field2462;
        this.field2462.field2490 = this.field2462;
    }

    @ObfuscatedName("gm.d(Lgg;)V")
    public void method3309(class195 arg0) {
        if (arg0.field2490 != null) {
            arg0.method3449();
        }
        arg0.field2490 = this.field2462.field2490;
        arg0.field2491 = this.field2462;
        arg0.field2490.field2491 = arg0;
        arg0.field2491.field2490 = arg0;
    }

    @ObfuscatedName("gm.k(Lgg;)V")
    public void method3298(class195 arg0) {
        if (arg0.field2490 != null) {
            arg0.method3449();
        }
        arg0.field2490 = this.field2462;
        arg0.field2491 = this.field2462.field2491;
        arg0.field2490.field2491 = arg0;
        arg0.field2491.field2490 = arg0;
    }

    @ObfuscatedName("gm.e()Lgg;")
    public class195 method3297() {
        class195 var1 = this.field2462.field2491;
        if (this.field2462 == var1) {
            return null;
        } else {
            var1.method3449();
            return var1;
        }
    }

    @ObfuscatedName("gm.p()Lgg;")
    public class195 method3308() {
        class195 var1 = this.field2462.field2491;
        return this.field2462 == var1 ? null : var1;
    }

    @ObfuscatedName("gm.q()V")
    public void method3299() {
        while (true) {
            class195 var1 = this.field2462.field2491;
            if (this.field2462 == var1) {
                return;
            }
            var1.method3449();
        }
    }
}
