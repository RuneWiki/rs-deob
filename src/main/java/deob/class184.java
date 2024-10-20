package deob;

@ObfuscatedName("gm")
public final class class184 {

    @ObfuscatedName("gm.g")
    public class185 field2874 = new class185();

    public class184() {
        this.field2874.field2876 = this.field2874;
        this.field2874.field2875 = this.field2874;
    }

    @ObfuscatedName("gm.g(Lgl;)V")
    public void method3233(class185 arg0) {
        if (arg0.field2875 != null) {
            arg0.method3235();
        }
        arg0.field2875 = this.field2874.field2875;
        arg0.field2876 = this.field2874;
        arg0.field2875.field2876 = arg0;
        arg0.field2876.field2875 = arg0;
    }

    @ObfuscatedName("gm.j(Lgl;)V")
    public void method3223(class185 arg0) {
        if (arg0.field2875 != null) {
            arg0.method3235();
        }
        arg0.field2875 = this.field2874;
        arg0.field2876 = this.field2874.field2876;
        arg0.field2875.field2876 = arg0;
        arg0.field2876.field2875 = arg0;
    }

    @ObfuscatedName("gm.z()Lgl;")
    public class185 method3224() {
        class185 var1 = this.field2874.field2876;
        if (this.field2874 == var1) {
            return null;
        } else {
            var1.method3235();
            return var1;
        }
    }

    @ObfuscatedName("gm.b()Lgl;")
    public class185 method3225() {
        class185 var1 = this.field2874.field2876;
        return this.field2874 == var1 ? null : var1;
    }

    @ObfuscatedName("gm.k()V")
    public void method3226() {
        while (true) {
            class185 var1 = this.field2874.field2876;
            if (this.field2874 == var1) {
                return;
            }
            var1.method3235();
        }
    }
}
