package deob;

@ObfuscatedName("gg")
public class class185 {

    @ObfuscatedName("gg.e")
    public class197 field2935 = new class197();

    @ObfuscatedName("gg.a")
    public class197 field2936;

    public class185() {
        this.field2935.field2961 = this.field2935;
        this.field2935.field2960 = this.field2935;
    }

    @ObfuscatedName("gg.e(Lgw;)V")
    public void method3337(class197 arg0) {
        if (arg0.field2960 != null) {
            arg0.method3458();
        }
        arg0.field2960 = this.field2935.field2960;
        arg0.field2961 = this.field2935;
        arg0.field2960.field2961 = arg0;
        arg0.field2961.field2960 = arg0;
    }

    @ObfuscatedName("gg.a()Lgw;")
    public class197 method3329() {
        class197 var1 = this.field2935.field2961;
        if (this.field2935 == var1) {
            this.field2936 = null;
            return null;
        } else {
            this.field2936 = var1.field2961;
            return var1;
        }
    }

    @ObfuscatedName("gg.l()Lgw;")
    public class197 method3327() {
        class197 var1 = this.field2936;
        if (this.field2935 == var1) {
            this.field2936 = null;
            return null;
        } else {
            this.field2936 = var1.field2961;
            return var1;
        }
    }
}
