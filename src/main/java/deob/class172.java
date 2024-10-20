package deob;

@ObfuscatedName("fs")
public final class class172 {

    @ObfuscatedName("fs.f")
    public class174 field2797 = new class174();

    public class172() {
        this.field2797.field2801 = this.field2797;
        this.field2797.field2800 = this.field2797;
    }

    @ObfuscatedName("fs.f(Lfj;)V")
    public void method3285(class174 arg0) {
        if (arg0.field2800 != null) {
            arg0.method3309();
        }
        arg0.field2800 = this.field2797.field2800;
        arg0.field2801 = this.field2797;
        arg0.field2800.field2801 = arg0;
        arg0.field2801.field2800 = arg0;
    }

    @ObfuscatedName("fs.t(Lfj;)V")
    public void method3281(class174 arg0) {
        if (arg0.field2800 != null) {
            arg0.method3309();
        }
        arg0.field2800 = this.field2797;
        arg0.field2801 = this.field2797.field2801;
        arg0.field2800.field2801 = arg0;
        arg0.field2801.field2800 = arg0;
    }

    @ObfuscatedName("fs.n()Lfj;")
    public class174 method3283() {
        class174 var1 = this.field2797.field2801;
        if (this.field2797 == var1) {
            return null;
        } else {
            var1.method3309();
            return var1;
        }
    }

    @ObfuscatedName("fs.e()Lfj;")
    public class174 method3284() {
        class174 var1 = this.field2797.field2801;
        return this.field2797 == var1 ? null : var1;
    }

    @ObfuscatedName("fs.l()V")
    public void method3282() {
        while (true) {
            class174 var1 = this.field2797.field2801;
            if (this.field2797 == var1) {
                return;
            }
            var1.method3309();
        }
    }
}
