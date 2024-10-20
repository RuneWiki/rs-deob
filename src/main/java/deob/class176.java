package deob;

@ObfuscatedName("ft")
public class class176 {

    @ObfuscatedName("ft.f")
    public class188 field2855 = new class188();

    @ObfuscatedName("ft.k")
    public class188 field2856;

    public class176() {
        this.field2855.field2880 = this.field2855;
        this.field2855.field2881 = this.field2855;
    }

    @ObfuscatedName("ft.f(Lgv;)V")
    public void method3234(class188 arg0) {
        if (arg0.field2881 != null) {
            arg0.method3361();
        }
        arg0.field2881 = this.field2855.field2881;
        arg0.field2880 = this.field2855;
        arg0.field2881.field2880 = arg0;
        arg0.field2880.field2881 = arg0;
    }

    @ObfuscatedName("ft.k()Lgv;")
    public class188 method3235() {
        class188 var1 = this.field2855.field2880;
        if (this.field2855 == var1) {
            this.field2856 = null;
            return null;
        } else {
            this.field2856 = var1.field2880;
            return var1;
        }
    }

    @ObfuscatedName("ft.y()Lgv;")
    public class188 method3236() {
        class188 var1 = this.field2856;
        if (this.field2855 == var1) {
            this.field2856 = null;
            return null;
        } else {
            this.field2856 = var1.field2880;
            return var1;
        }
    }
}
