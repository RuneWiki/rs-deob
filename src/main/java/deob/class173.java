package deob;

@ObfuscatedName("fo")
public class class173 {

    @ObfuscatedName("fo.k")
    public class185 field2849 = new class185();

    @ObfuscatedName("fo.r")
    public class185 field2848;

    public class173() {
        this.field2849.field2874 = this.field2849;
        this.field2849.field2873 = this.field2849;
    }

    @ObfuscatedName("fo.k(Lgg;)V")
    public void method3157(class185 arg0) {
        if (arg0.field2873 != null) {
            arg0.method3273();
        }
        arg0.field2873 = this.field2849.field2873;
        arg0.field2874 = this.field2849;
        arg0.field2873.field2874 = arg0;
        arg0.field2874.field2873 = arg0;
    }

    @ObfuscatedName("fo.r()Lgg;")
    public class185 method3161() {
        class185 var1 = this.field2849.field2874;
        if (this.field2849 == var1) {
            this.field2848 = null;
            return null;
        } else {
            this.field2848 = var1.field2874;
            return var1;
        }
    }

    @ObfuscatedName("fo.y()Lgg;")
    public class185 method3156() {
        class185 var1 = this.field2848;
        if (this.field2849 == var1) {
            this.field2848 = null;
            return null;
        } else {
            this.field2848 = var1.field2874;
            return var1;
        }
    }
}
