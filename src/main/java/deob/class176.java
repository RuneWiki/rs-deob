package deob;

@ObfuscatedName("fh")
public class class176 {

    @ObfuscatedName("fh.x")
    public class188 field2853 = new class188();

    @ObfuscatedName("fh.v")
    public class188 field2854;

    public class176() {
        this.field2853.field2878 = this.field2853;
        this.field2853.field2879 = this.field2853;
    }

    @ObfuscatedName("fh.x(Lgm;)V")
    public void method3210(class188 arg0) {
        if (arg0.field2879 != null) {
            arg0.method3350();
        }
        arg0.field2879 = this.field2853.field2879;
        arg0.field2878 = this.field2853;
        arg0.field2879.field2878 = arg0;
        arg0.field2878.field2879 = arg0;
    }

    @ObfuscatedName("fh.v()Lgm;")
    public class188 method3208() {
        class188 var1 = this.field2853.field2878;
        if (this.field2853 == var1) {
            this.field2854 = null;
            return null;
        } else {
            this.field2854 = var1.field2878;
            return var1;
        }
    }

    @ObfuscatedName("fh.m()Lgm;")
    public class188 method3212() {
        class188 var1 = this.field2854;
        if (this.field2853 == var1) {
            this.field2854 = null;
            return null;
        } else {
            this.field2854 = var1.field2878;
            return var1;
        }
    }
}
