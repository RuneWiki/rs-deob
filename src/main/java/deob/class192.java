package deob;

@ObfuscatedName("gr")
public final class class192 {

    @ObfuscatedName("gr.b")
    public class202 field2532 = new class202();

    public class192() {
        this.field2532.field2561 = this.field2532;
        this.field2532.field2560 = this.field2532;
    }

    @ObfuscatedName("gr.b(Lgh;)V")
    public void method3286(class202 arg0) {
        if (arg0.field2560 != null) {
            arg0.method3428();
        }
        arg0.field2560 = this.field2532.field2560;
        arg0.field2561 = this.field2532;
        arg0.field2560.field2561 = arg0;
        arg0.field2561.field2560 = arg0;
    }

    @ObfuscatedName("gr.s(Lgh;)V")
    public void method3297(class202 arg0) {
        if (arg0.field2560 != null) {
            arg0.method3428();
        }
        arg0.field2560 = this.field2532;
        arg0.field2561 = this.field2532.field2561;
        arg0.field2560.field2561 = arg0;
        arg0.field2561.field2560 = arg0;
    }

    @ObfuscatedName("gr.r()Lgh;")
    public class202 method3288() {
        class202 var1 = this.field2532.field2561;
        if (this.field2532 == var1) {
            return null;
        } else {
            var1.method3428();
            return var1;
        }
    }

    @ObfuscatedName("gr.g()Lgh;")
    public class202 method3289() {
        class202 var1 = this.field2532.field2561;
        return this.field2532 == var1 ? null : var1;
    }

    @ObfuscatedName("gr.x()V")
    public void method3294() {
        while (true) {
            class202 var1 = this.field2532.field2561;
            if (this.field2532 == var1) {
                return;
            }
            var1.method3428();
        }
    }
}
