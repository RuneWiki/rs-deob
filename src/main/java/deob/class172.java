package deob;

@ObfuscatedName("fg")
public final class class172 {

    @ObfuscatedName("fg.i")
    public class174 field2801 = new class174();

    public class172() {
        this.field2801.field2805 = this.field2801;
        this.field2801.field2804 = this.field2801;
    }

    @ObfuscatedName("fg.i(Lfw;)V")
    public void method3246(class174 arg0) {
        if (arg0.field2804 != null) {
            arg0.method3270();
        }
        arg0.field2804 = this.field2801.field2804;
        arg0.field2805 = this.field2801;
        arg0.field2804.field2805 = arg0;
        arg0.field2805.field2804 = arg0;
    }

    @ObfuscatedName("fg.w(Lfw;)V")
    public void method3247(class174 arg0) {
        if (arg0.field2804 != null) {
            arg0.method3270();
        }
        arg0.field2804 = this.field2801;
        arg0.field2805 = this.field2801.field2805;
        arg0.field2804.field2805 = arg0;
        arg0.field2805.field2804 = arg0;
    }

    @ObfuscatedName("fg.f()Lfw;")
    public class174 method3259() {
        class174 var1 = this.field2801.field2805;
        if (this.field2801 == var1) {
            return null;
        } else {
            var1.method3270();
            return var1;
        }
    }

    @ObfuscatedName("fg.e()Lfw;")
    public class174 method3249() {
        class174 var1 = this.field2801.field2805;
        return this.field2801 == var1 ? null : var1;
    }

    @ObfuscatedName("fg.t()V")
    public void method3258() {
        while (true) {
            class174 var1 = this.field2801.field2805;
            if (this.field2801 == var1) {
                return;
            }
            var1.method3270();
        }
    }
}
