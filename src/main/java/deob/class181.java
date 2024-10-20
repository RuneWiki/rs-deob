package deob;

@ObfuscatedName("fm")
public final class class181 {

    @ObfuscatedName("fm.k")
    public class182 field2864 = new class182();

    public class181() {
        this.field2864.field2866 = this.field2864;
        this.field2864.field2865 = this.field2864;
    }

    @ObfuscatedName("fm.k(Lfj;)V")
    public void method3242(class182 arg0) {
        if (arg0.field2865 != null) {
            arg0.method3256();
        }
        arg0.field2865 = this.field2864.field2865;
        arg0.field2866 = this.field2864;
        arg0.field2865.field2866 = arg0;
        arg0.field2866.field2865 = arg0;
    }

    @ObfuscatedName("fm.r(Lfj;)V")
    public void method3243(class182 arg0) {
        if (arg0.field2865 != null) {
            arg0.method3256();
        }
        arg0.field2865 = this.field2864;
        arg0.field2866 = this.field2864.field2866;
        arg0.field2865.field2866 = arg0;
        arg0.field2866.field2865 = arg0;
    }

    @ObfuscatedName("fm.y()Lfj;")
    public class182 method3244() {
        class182 var1 = this.field2864.field2866;
        if (this.field2864 == var1) {
            return null;
        } else {
            var1.method3256();
            return var1;
        }
    }

    @ObfuscatedName("fm.w()Lfj;")
    public class182 method3241() {
        class182 var1 = this.field2864.field2866;
        return this.field2864 == var1 ? null : var1;
    }

    @ObfuscatedName("fm.m()V")
    public void method3246() {
        while (true) {
            class182 var1 = this.field2864.field2866;
            if (this.field2864 == var1) {
                return;
            }
            var1.method3256();
        }
    }
}
