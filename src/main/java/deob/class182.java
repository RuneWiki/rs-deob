package deob;

@ObfuscatedName("fd")
public final class class182 {

    @ObfuscatedName("fd.p")
    public class183 field2868 = new class183();

    public class182() {
        this.field2868.field2870 = this.field2868;
        this.field2868.field2869 = this.field2868;
    }

    @ObfuscatedName("fd.p(Lgl;)V")
    public void method3341(class183 arg0) {
        if (arg0.field2869 != null) {
            arg0.method3356();
        }
        arg0.field2869 = this.field2868.field2869;
        arg0.field2870 = this.field2868;
        arg0.field2869.field2870 = arg0;
        arg0.field2870.field2869 = arg0;
    }

    @ObfuscatedName("fd.g(Lgl;)V")
    public void method3342(class183 arg0) {
        if (arg0.field2869 != null) {
            arg0.method3356();
        }
        arg0.field2869 = this.field2868;
        arg0.field2870 = this.field2868.field2870;
        arg0.field2869.field2870 = arg0;
        arg0.field2870.field2869 = arg0;
    }

    @ObfuscatedName("fd.x()Lgl;")
    public class183 method3343() {
        class183 var1 = this.field2868.field2870;
        if (this.field2868 == var1) {
            return null;
        } else {
            var1.method3356();
            return var1;
        }
    }

    @ObfuscatedName("fd.c()Lgl;")
    public class183 method3349() {
        class183 var1 = this.field2868.field2870;
        return this.field2868 == var1 ? null : var1;
    }

    @ObfuscatedName("fd.n()V")
    public void method3344() {
        while (true) {
            class183 var1 = this.field2868.field2870;
            if (this.field2868 == var1) {
                return;
            }
            var1.method3356();
        }
    }
}
