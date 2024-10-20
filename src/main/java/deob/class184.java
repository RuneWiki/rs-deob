package deob;

@ObfuscatedName("gi")
public final class class184 {

    @ObfuscatedName("gi.l")
    public class185 field2874 = new class185();

    public class184() {
        this.field2874.field2876 = this.field2874;
        this.field2874.field2875 = this.field2874;
    }

    @ObfuscatedName("gi.l(Lgk;)V")
    public void method3335(class185 arg0) {
        if (arg0.field2875 != null) {
            arg0.method3349();
        }
        arg0.field2875 = this.field2874.field2875;
        arg0.field2876 = this.field2874;
        arg0.field2875.field2876 = arg0;
        arg0.field2876.field2875 = arg0;
    }

    @ObfuscatedName("gi.y(Lgk;)V")
    public void method3336(class185 arg0) {
        if (arg0.field2875 != null) {
            arg0.method3349();
        }
        arg0.field2875 = this.field2874;
        arg0.field2876 = this.field2874.field2876;
        arg0.field2875.field2876 = arg0;
        arg0.field2876.field2875 = arg0;
    }

    @ObfuscatedName("gi.g()Lgk;")
    public class185 method3337() {
        class185 var1 = this.field2874.field2876;
        if (this.field2874 == var1) {
            return null;
        } else {
            var1.method3349();
            return var1;
        }
    }

    @ObfuscatedName("gi.j()Lgk;")
    public class185 method3344() {
        class185 var1 = this.field2874.field2876;
        return this.field2874 == var1 ? null : var1;
    }

    @ObfuscatedName("gi.w()V")
    public void method3339() {
        while (true) {
            class185 var1 = this.field2874.field2876;
            if (this.field2874 == var1) {
                return;
            }
            var1.method3349();
        }
    }
}
