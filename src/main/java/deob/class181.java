package deob;

@ObfuscatedName("fn")
public final class class181 {

    @ObfuscatedName("fn.g")
    public class182 field2864 = new class182();

    public class181() {
        this.field2864.field2865 = this.field2864;
        this.field2864.field2866 = this.field2864;
    }

    @ObfuscatedName("fn.g(Lfl;)V")
    public void method3283(class182 arg0) {
        if (arg0.field2866 != null) {
            arg0.method3299();
        }
        arg0.field2866 = this.field2864.field2866;
        arg0.field2865 = this.field2864;
        arg0.field2866.field2865 = arg0;
        arg0.field2865.field2866 = arg0;
    }

    @ObfuscatedName("fn.v(Lfl;)V")
    public void method3284(class182 arg0) {
        if (arg0.field2866 != null) {
            arg0.method3299();
        }
        arg0.field2866 = this.field2864;
        arg0.field2865 = this.field2864.field2865;
        arg0.field2866.field2865 = arg0;
        arg0.field2865.field2866 = arg0;
    }

    @ObfuscatedName("fn.z()Lfl;")
    public class182 method3285() {
        class182 var1 = this.field2864.field2865;
        if (this.field2864 == var1) {
            return null;
        } else {
            var1.method3299();
            return var1;
        }
    }

    @ObfuscatedName("fn.h()Lfl;")
    public class182 method3296() {
        class182 var1 = this.field2864.field2865;
        return this.field2864 == var1 ? null : var1;
    }

    @ObfuscatedName("fn.k()V")
    public void method3287() {
        while (true) {
            class182 var1 = this.field2864.field2865;
            if (this.field2864 == var1) {
                return;
            }
            var1.method3299();
        }
    }
}
