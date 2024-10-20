package deob;

@ObfuscatedName("fh")
public class class173 {

    @ObfuscatedName("fh.e")
    public class185 field2839 = new class185();

    @ObfuscatedName("fh.v")
    public class185 field2838;

    public class173() {
        this.field2839.field2864 = this.field2839;
        this.field2839.field2863 = this.field2839;
    }

    @ObfuscatedName("fh.e(Lgo;)V")
    public void method3148(class185 arg0) {
        if (arg0.field2863 != null) {
            arg0.method3270();
        }
        arg0.field2863 = this.field2839.field2863;
        arg0.field2864 = this.field2839;
        arg0.field2863.field2864 = arg0;
        arg0.field2864.field2863 = arg0;
    }

    @ObfuscatedName("fh.v()Lgo;")
    public class185 method3149() {
        class185 var1 = this.field2839.field2864;
        if (this.field2839 == var1) {
            this.field2838 = null;
            return null;
        } else {
            this.field2838 = var1.field2864;
            return var1;
        }
    }

    @ObfuscatedName("fh.i()Lgo;")
    public class185 method3151() {
        class185 var1 = this.field2838;
        if (this.field2839 == var1) {
            this.field2838 = null;
            return null;
        } else {
            this.field2838 = var1.field2864;
            return var1;
        }
    }
}
