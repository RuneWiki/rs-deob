package deob;

@ObfuscatedName("fs")
public final class class172 {

    @ObfuscatedName("fs.j")
    public class174 field2793 = new class174();

    public class172() {
        this.field2793.field2797 = this.field2793;
        this.field2793.field2796 = this.field2793;
    }

    @ObfuscatedName("fs.j(Lfy;)V")
    public void method3274(class174 arg0) {
        if (arg0.field2796 != null) {
            arg0.method3299();
        }
        arg0.field2796 = this.field2793.field2796;
        arg0.field2797 = this.field2793;
        arg0.field2796.field2797 = arg0;
        arg0.field2797.field2796 = arg0;
    }

    @ObfuscatedName("fs.r(Lfy;)V")
    public void method3271(class174 arg0) {
        if (arg0.field2796 != null) {
            arg0.method3299();
        }
        arg0.field2796 = this.field2793;
        arg0.field2797 = this.field2793.field2797;
        arg0.field2796.field2797 = arg0;
        arg0.field2797.field2796 = arg0;
    }

    @ObfuscatedName("fs.v()Lfy;")
    public class174 method3272() {
        class174 var1 = this.field2793.field2797;
        if (this.field2793 == var1) {
            return null;
        } else {
            var1.method3299();
            return var1;
        }
    }

    @ObfuscatedName("fs.p()Lfy;")
    public class174 method3273() {
        class174 var1 = this.field2793.field2797;
        return this.field2793 == var1 ? null : var1;
    }

    @ObfuscatedName("fs.e()V")
    public void method3278() {
        while (true) {
            class174 var1 = this.field2793.field2797;
            if (this.field2793 == var1) {
                return;
            }
            var1.method3299();
        }
    }
}
