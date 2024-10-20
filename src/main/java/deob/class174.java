package deob;

@ObfuscatedName("fe")
public class class174 {

    @ObfuscatedName("fe.g")
    public class186 field2859 = new class186();

    @ObfuscatedName("fe.i")
    public class186 field2858;

    public class174() {
        this.field2859.field2883 = this.field2859;
        this.field2859.field2884 = this.field2859;
    }

    @ObfuscatedName("fe.g(Lgq;)V")
    public void method3162(class186 arg0) {
        if (arg0.field2884 != null) {
            arg0.method3296();
        }
        arg0.field2884 = this.field2859.field2884;
        arg0.field2883 = this.field2859;
        arg0.field2884.field2883 = arg0;
        arg0.field2883.field2884 = arg0;
    }

    @ObfuscatedName("fe.i()Lgq;")
    public class186 method3163() {
        class186 var1 = this.field2859.field2883;
        if (this.field2859 == var1) {
            this.field2858 = null;
            return null;
        } else {
            this.field2858 = var1.field2883;
            return var1;
        }
    }

    @ObfuscatedName("fe.k()Lgq;")
    public class186 method3169() {
        class186 var1 = this.field2858;
        if (this.field2859 == var1) {
            this.field2858 = null;
            return null;
        } else {
            this.field2858 = var1.field2883;
            return var1;
        }
    }
}
