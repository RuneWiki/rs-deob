package deob;

@ObfuscatedName("fi")
public final class class181 {

    @ObfuscatedName("fi.e")
    public class182 field2854 = new class182();

    public class181() {
        this.field2854.field2855 = this.field2854;
        this.field2854.field2856 = this.field2854;
    }

    @ObfuscatedName("fi.e(Lfa;)V")
    public void method3238(class182 arg0) {
        if (arg0.field2856 != null) {
            arg0.method3254();
        }
        arg0.field2856 = this.field2854.field2856;
        arg0.field2855 = this.field2854;
        arg0.field2856.field2855 = arg0;
        arg0.field2855.field2856 = arg0;
    }

    @ObfuscatedName("fi.v(Lfa;)V")
    public void method3239(class182 arg0) {
        if (arg0.field2856 != null) {
            arg0.method3254();
        }
        arg0.field2856 = this.field2854;
        arg0.field2855 = this.field2854.field2855;
        arg0.field2856.field2855 = arg0;
        arg0.field2855.field2856 = arg0;
    }

    @ObfuscatedName("fi.i()Lfa;")
    public class182 method3241() {
        class182 var1 = this.field2854.field2855;
        if (this.field2854 == var1) {
            return null;
        } else {
            var1.method3254();
            return var1;
        }
    }

    @ObfuscatedName("fi.g()Lfa;")
    public class182 method3244() {
        class182 var1 = this.field2854.field2855;
        return this.field2854 == var1 ? null : var1;
    }

    @ObfuscatedName("fi.x()V")
    public void method3249() {
        while (true) {
            class182 var1 = this.field2854.field2855;
            if (this.field2854 == var1) {
                return;
            }
            var1.method3254();
        }
    }
}
