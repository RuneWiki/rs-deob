package deob;

@ObfuscatedName("gh")
public final class class196 {

    @ObfuscatedName("gh.n")
    public class206 field2573 = new class206();

    public class196() {
        this.field2573.field2601 = this.field2573;
        this.field2573.field2602 = this.field2573;
    }

    @ObfuscatedName("gh.n(Lgd;)V")
    public void method3372(class206 arg0) {
        if (arg0.field2602 != null) {
            arg0.method3515();
        }
        arg0.field2602 = this.field2573.field2602;
        arg0.field2601 = this.field2573;
        arg0.field2602.field2601 = arg0;
        arg0.field2601.field2602 = arg0;
    }

    @ObfuscatedName("gh.v(Lgd;)V")
    public void method3360(class206 arg0) {
        if (arg0.field2602 != null) {
            arg0.method3515();
        }
        arg0.field2602 = this.field2573;
        arg0.field2601 = this.field2573.field2601;
        arg0.field2602.field2601 = arg0;
        arg0.field2601.field2602 = arg0;
    }

    @ObfuscatedName("gh.y()Lgd;")
    public class206 method3361() {
        class206 var1 = this.field2573.field2601;
        if (this.field2573 == var1) {
            return null;
        } else {
            var1.method3515();
            return var1;
        }
    }

    @ObfuscatedName("gh.r()Lgd;")
    public class206 method3362() {
        class206 var1 = this.field2573.field2601;
        return this.field2573 == var1 ? null : var1;
    }

    @ObfuscatedName("gh.h()V")
    public void method3363() {
        while (true) {
            class206 var1 = this.field2573.field2601;
            if (this.field2573 == var1) {
                return;
            }
            var1.method3515();
        }
    }
}
