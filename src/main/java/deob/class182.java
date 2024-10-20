package deob;

@ObfuscatedName("ft")
public final class class182 {

    @ObfuscatedName("ft.g")
    public class183 field2874 = new class183();

    public class182() {
        this.field2874.field2876 = this.field2874;
        this.field2874.field2875 = this.field2874;
    }

    @ObfuscatedName("ft.g(Lgy;)V")
    public void method3252(class183 arg0) {
        if (arg0.field2875 != null) {
            arg0.method3272();
        }
        arg0.field2875 = this.field2874.field2875;
        arg0.field2876 = this.field2874;
        arg0.field2875.field2876 = arg0;
        arg0.field2876.field2875 = arg0;
    }

    @ObfuscatedName("ft.i(Lgy;)V")
    public void method3268(class183 arg0) {
        if (arg0.field2875 != null) {
            arg0.method3272();
        }
        arg0.field2875 = this.field2874;
        arg0.field2876 = this.field2874.field2876;
        arg0.field2875.field2876 = arg0;
        arg0.field2876.field2875 = arg0;
    }

    @ObfuscatedName("ft.k()Lgy;")
    public class183 method3269() {
        class183 var1 = this.field2874.field2876;
        if (this.field2874 == var1) {
            return null;
        } else {
            var1.method3272();
            return var1;
        }
    }

    @ObfuscatedName("ft.e()Lgy;")
    public class183 method3254() {
        class183 var1 = this.field2874.field2876;
        return this.field2874 == var1 ? null : var1;
    }

    @ObfuscatedName("ft.w()V")
    public void method3262() {
        while (true) {
            class183 var1 = this.field2874.field2876;
            if (this.field2874 == var1) {
                return;
            }
            var1.method3272();
        }
    }
}
