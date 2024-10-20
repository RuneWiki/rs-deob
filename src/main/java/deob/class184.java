package deob;

@ObfuscatedName("gd")
public final class class184 {

    @ObfuscatedName("gd.c")
    public class185 field2874 = new class185();

    public class184() {
        this.field2874.field2876 = this.field2874;
        this.field2874.field2875 = this.field2874;
    }

    @ObfuscatedName("gd.c(Lgp;)V")
    public void method3296(class185 arg0) {
        if (arg0.field2875 != null) {
            arg0.method3310();
        }
        arg0.field2875 = this.field2874.field2875;
        arg0.field2876 = this.field2874;
        arg0.field2875.field2876 = arg0;
        arg0.field2876.field2875 = arg0;
    }

    @ObfuscatedName("gd.j(Lgp;)V")
    public void method3297(class185 arg0) {
        if (arg0.field2875 != null) {
            arg0.method3310();
        }
        arg0.field2875 = this.field2874;
        arg0.field2876 = this.field2874.field2876;
        arg0.field2875.field2876 = arg0;
        arg0.field2876.field2875 = arg0;
    }

    @ObfuscatedName("gd.y()Lgp;")
    public class185 method3298() {
        class185 var1 = this.field2874.field2876;
        if (this.field2874 == var1) {
            return null;
        } else {
            var1.method3310();
            return var1;
        }
    }

    @ObfuscatedName("gd.r()Lgp;")
    public class185 method3308() {
        class185 var1 = this.field2874.field2876;
        return this.field2874 == var1 ? null : var1;
    }

    @ObfuscatedName("gd.f()V")
    public void method3305() {
        while (true) {
            class185 var1 = this.field2874.field2876;
            if (this.field2874 == var1) {
                return;
            }
            var1.method3310();
        }
    }
}
