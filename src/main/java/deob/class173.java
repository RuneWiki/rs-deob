package deob;

@ObfuscatedName("ft")
public class class173 {

    @ObfuscatedName("ft.g")
    public class185 field2849 = new class185();

    @ObfuscatedName("ft.v")
    public class185 field2848;

    public class173() {
        this.field2849.field2873 = this.field2849;
        this.field2849.field2874 = this.field2849;
    }

    @ObfuscatedName("ft.g(Lgl;)V")
    public void method3198(class185 arg0) {
        if (arg0.field2874 != null) {
            arg0.method3317();
        }
        arg0.field2874 = this.field2849.field2874;
        arg0.field2873 = this.field2849;
        arg0.field2874.field2873 = arg0;
        arg0.field2873.field2874 = arg0;
    }

    @ObfuscatedName("ft.v()Lgl;")
    public class185 method3192() {
        class185 var1 = this.field2849.field2873;
        if (this.field2849 == var1) {
            this.field2848 = null;
            return null;
        } else {
            this.field2848 = var1.field2873;
            return var1;
        }
    }

    @ObfuscatedName("ft.z()Lgl;")
    public class185 method3193() {
        class185 var1 = this.field2848;
        if (this.field2849 == var1) {
            this.field2848 = null;
            return null;
        } else {
            this.field2848 = var1.field2873;
            return var1;
        }
    }
}
