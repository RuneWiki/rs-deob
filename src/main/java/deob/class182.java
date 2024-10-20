package deob;

@ObfuscatedName("fp")
public final class class182 {

    @ObfuscatedName("fp.k")
    public class183 field2866 = new class183();

    public class182() {
        this.field2866.field2868 = this.field2866;
        this.field2866.field2867 = this.field2866;
    }

    @ObfuscatedName("fp.k(Lgj;)V")
    public void method3331(class183 arg0) {
        if (arg0.field2867 != null) {
            arg0.method3346();
        }
        arg0.field2867 = this.field2866.field2867;
        arg0.field2868 = this.field2866;
        arg0.field2867.field2868 = arg0;
        arg0.field2868.field2867 = arg0;
    }

    @ObfuscatedName("fp.y(Lgj;)V")
    public void method3344(class183 arg0) {
        if (arg0.field2867 != null) {
            arg0.method3346();
        }
        arg0.field2867 = this.field2866;
        arg0.field2868 = this.field2866.field2868;
        arg0.field2867.field2868 = arg0;
        arg0.field2868.field2867 = arg0;
    }

    @ObfuscatedName("fp.s()Lgj;")
    public class183 method3332() {
        class183 var1 = this.field2866.field2868;
        if (this.field2866 == var1) {
            return null;
        } else {
            var1.method3346();
            return var1;
        }
    }

    @ObfuscatedName("fp.g()Lgj;")
    public class183 method3333() {
        class183 var1 = this.field2866.field2868;
        return this.field2866 == var1 ? null : var1;
    }

    @ObfuscatedName("fp.h()V")
    public void method3330() {
        while (true) {
            class183 var1 = this.field2866.field2868;
            if (this.field2866 == var1) {
                return;
            }
            var1.method3346();
        }
    }
}
