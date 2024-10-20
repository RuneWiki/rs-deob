package deob;

@ObfuscatedName("fk")
public final class class182 {

    @ObfuscatedName("fk.n")
    public class183 field2875 = new class183();

    public class182() {
        this.field2875.field2877 = this.field2875;
        this.field2875.field2876 = this.field2875;
    }

    @ObfuscatedName("fk.n(Lgr;)V")
    public void method3244(class183 arg0) {
        if (arg0.field2876 != null) {
            arg0.method3253();
        }
        arg0.field2876 = this.field2875.field2876;
        arg0.field2877 = this.field2875;
        arg0.field2876.field2877 = arg0;
        arg0.field2877.field2876 = arg0;
    }

    @ObfuscatedName("fk.x(Lgr;)V")
    public void method3238(class183 arg0) {
        if (arg0.field2876 != null) {
            arg0.method3253();
        }
        arg0.field2876 = this.field2875;
        arg0.field2877 = this.field2875.field2877;
        arg0.field2876.field2877 = arg0;
        arg0.field2877.field2876 = arg0;
    }

    @ObfuscatedName("fk.k()Lgr;")
    public class183 method3239() {
        class183 var1 = this.field2875.field2877;
        if (this.field2875 == var1) {
            return null;
        } else {
            var1.method3253();
            return var1;
        }
    }

    @ObfuscatedName("fk.i()Lgr;")
    public class183 method3237() {
        class183 var1 = this.field2875.field2877;
        return this.field2875 == var1 ? null : var1;
    }

    @ObfuscatedName("fk.d()V")
    public void method3241() {
        while (true) {
            class183 var1 = this.field2875.field2877;
            if (this.field2875 == var1) {
                return;
            }
            var1.method3253();
        }
    }
}
