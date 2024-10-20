package deob;

@ObfuscatedName("fp")
public final class class182 {

    @ObfuscatedName("fp.g")
    public class183 field2871 = new class183();

    public class182() {
        this.field2871.field2872 = this.field2871;
        this.field2871.field2873 = this.field2871;
    }

    @ObfuscatedName("fp.g(Lgk;)V")
    public void method3239(class183 arg0) {
        if (arg0.field2873 != null) {
            arg0.method3257();
        }
        arg0.field2873 = this.field2871.field2873;
        arg0.field2872 = this.field2871;
        arg0.field2873.field2872 = arg0;
        arg0.field2872.field2873 = arg0;
    }

    @ObfuscatedName("fp.s(Lgk;)V")
    public void method3240(class183 arg0) {
        if (arg0.field2873 != null) {
            arg0.method3257();
        }
        arg0.field2873 = this.field2871;
        arg0.field2872 = this.field2871.field2872;
        arg0.field2873.field2872 = arg0;
        arg0.field2872.field2873 = arg0;
    }

    @ObfuscatedName("fp.v()Lgk;")
    public class183 method3254() {
        class183 var1 = this.field2871.field2872;
        if (this.field2871 == var1) {
            return null;
        } else {
            var1.method3257();
            return var1;
        }
    }

    @ObfuscatedName("fp.o()Lgk;")
    public class183 method3243() {
        class183 var1 = this.field2871.field2872;
        return this.field2871 == var1 ? null : var1;
    }

    @ObfuscatedName("fp.k()V")
    public void method3250() {
        while (true) {
            class183 var1 = this.field2871.field2872;
            if (this.field2871 == var1) {
                return;
            }
            var1.method3257();
        }
    }
}
