package deob;

@ObfuscatedName("fb")
public class class176 {

    @ObfuscatedName("fb.c")
    public class188 field2859 = new class188();

    @ObfuscatedName("fb.j")
    public class188 field2858;

    public class176() {
        this.field2859.field2883 = this.field2859;
        this.field2859.field2884 = this.field2859;
    }

    @ObfuscatedName("fb.c(Lgk;)V")
    public void method3195(class188 arg0) {
        if (arg0.field2884 != null) {
            arg0.method3331();
        }
        arg0.field2884 = this.field2859.field2884;
        arg0.field2883 = this.field2859;
        arg0.field2884.field2883 = arg0;
        arg0.field2883.field2884 = arg0;
    }

    @ObfuscatedName("fb.j()Lgk;")
    public class188 method3196() {
        class188 var1 = this.field2859.field2883;
        if (this.field2859 == var1) {
            this.field2858 = null;
            return null;
        } else {
            this.field2858 = var1.field2883;
            return var1;
        }
    }

    @ObfuscatedName("fb.y()Lgk;")
    public class188 method3197() {
        class188 var1 = this.field2858;
        if (this.field2859 == var1) {
            this.field2858 = null;
            return null;
        } else {
            this.field2858 = var1.field2883;
            return var1;
        }
    }
}
