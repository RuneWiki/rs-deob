package deob;

@ObfuscatedName("fr")
public final class class181 {

    @ObfuscatedName("fr.k")
    public class182 field2855 = new class182();

    public class181() {
        this.field2855.field2856 = this.field2855;
        this.field2855.field2857 = this.field2855;
    }

    @ObfuscatedName("fr.k(Lfl;)V")
    public void method3283(class182 arg0) {
        if (arg0.field2857 != null) {
            arg0.method3302();
        }
        arg0.field2857 = this.field2855.field2857;
        arg0.field2856 = this.field2855;
        arg0.field2857.field2856 = arg0;
        arg0.field2856.field2857 = arg0;
    }

    @ObfuscatedName("fr.b(Lfl;)V")
    public void method3297(class182 arg0) {
        if (arg0.field2857 != null) {
            arg0.method3302();
        }
        arg0.field2857 = this.field2855;
        arg0.field2856 = this.field2855.field2856;
        arg0.field2857.field2856 = arg0;
        arg0.field2856.field2857 = arg0;
    }

    @ObfuscatedName("fr.e()Lfl;")
    public class182 method3292() {
        class182 var1 = this.field2855.field2856;
        if (this.field2855 == var1) {
            return null;
        } else {
            var1.method3302();
            return var1;
        }
    }

    @ObfuscatedName("fr.i()Lfl;")
    public class182 method3286() {
        class182 var1 = this.field2855.field2856;
        return this.field2855 == var1 ? null : var1;
    }

    @ObfuscatedName("fr.t()V")
    public void method3287() {
        while (true) {
            class182 var1 = this.field2855.field2856;
            if (this.field2855 == var1) {
                return;
            }
            var1.method3302();
        }
    }
}
