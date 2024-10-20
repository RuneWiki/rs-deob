package deob;

@ObfuscatedName("fg")
public class class176 {

    @ObfuscatedName("fg.g")
    public class188 field2859 = new class188();

    @ObfuscatedName("fg.j")
    public class188 field2858;

    public class176() {
        this.field2859.field2884 = this.field2859;
        this.field2859.field2883 = this.field2859;
    }

    @ObfuscatedName("fg.g(Lgk;)V")
    public void method3130(class188 arg0) {
        if (arg0.field2883 != null) {
            arg0.method3253();
        }
        arg0.field2883 = this.field2859.field2883;
        arg0.field2884 = this.field2859;
        arg0.field2883.field2884 = arg0;
        arg0.field2884.field2883 = arg0;
    }

    @ObfuscatedName("fg.j()Lgk;")
    public class188 method3122() {
        class188 var1 = this.field2859.field2884;
        if (this.field2859 == var1) {
            this.field2858 = null;
            return null;
        } else {
            this.field2858 = var1.field2884;
            return var1;
        }
    }

    @ObfuscatedName("fg.z()Lgk;")
    public class188 method3127() {
        class188 var1 = this.field2858;
        if (this.field2859 == var1) {
            this.field2858 = null;
            return null;
        } else {
            this.field2858 = var1.field2884;
            return var1;
        }
    }
}
