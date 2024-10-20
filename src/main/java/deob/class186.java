package deob;

@ObfuscatedName("gf")
public final class class186 {

    @ObfuscatedName("gf.p")
    public class187 field2890 = new class187();

    public class186() {
        this.field2890.field2891 = this.field2890;
        this.field2890.field2892 = this.field2890;
    }

    @ObfuscatedName("gf.p(Lgo;)V")
    public void method3315(class187 arg0) {
        if (arg0.field2892 != null) {
            arg0.method3331();
        }
        arg0.field2892 = this.field2890.field2892;
        arg0.field2891 = this.field2890;
        arg0.field2892.field2891 = arg0;
        arg0.field2891.field2892 = arg0;
    }

    @ObfuscatedName("gf.y(Lgo;)V")
    public void method3316(class187 arg0) {
        if (arg0.field2892 != null) {
            arg0.method3331();
        }
        arg0.field2892 = this.field2890;
        arg0.field2891 = this.field2890.field2891;
        arg0.field2892.field2891 = arg0;
        arg0.field2891.field2892 = arg0;
    }

    @ObfuscatedName("gf.d()Lgo;")
    public class187 method3317() {
        class187 var1 = this.field2890.field2891;
        if (this.field2890 == var1) {
            return null;
        } else {
            var1.method3331();
            return var1;
        }
    }

    @ObfuscatedName("gf.c()Lgo;")
    public class187 method3327() {
        class187 var1 = this.field2890.field2891;
        return this.field2890 == var1 ? null : var1;
    }

    @ObfuscatedName("gf.r()V")
    public void method3318() {
        while (true) {
            class187 var1 = this.field2890.field2891;
            if (this.field2890 == var1) {
                return;
            }
            var1.method3331();
        }
    }
}
