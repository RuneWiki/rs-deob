package deob;

@ObfuscatedName("ff")
public class class176 {

    @ObfuscatedName("ff.l")
    public class188 field2858 = new class188();

    @ObfuscatedName("ff.y")
    public class188 field2859;

    public class176() {
        this.field2858.field2884 = this.field2858;
        this.field2858.field2883 = this.field2858;
    }

    @ObfuscatedName("ff.l(Lgm;)V")
    public void method3252(class188 arg0) {
        if (arg0.field2883 != null) {
            arg0.method3370();
        }
        arg0.field2883 = this.field2858.field2883;
        arg0.field2884 = this.field2858;
        arg0.field2883.field2884 = arg0;
        arg0.field2884.field2883 = arg0;
    }

    @ObfuscatedName("ff.y()Lgm;")
    public class188 method3242() {
        class188 var1 = this.field2858.field2884;
        if (this.field2858 == var1) {
            this.field2859 = null;
            return null;
        } else {
            this.field2859 = var1.field2884;
            return var1;
        }
    }

    @ObfuscatedName("ff.g()Lgm;")
    public class188 method3243() {
        class188 var1 = this.field2859;
        if (this.field2858 == var1) {
            this.field2859 = null;
            return null;
        } else {
            this.field2859 = var1.field2884;
            return var1;
        }
    }
}
