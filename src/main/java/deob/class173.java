package deob;

@ObfuscatedName("fj")
public class class173 {

    @ObfuscatedName("fj.k")
    public class185 field2840 = new class185();

    @ObfuscatedName("fj.b")
    public class185 field2839;

    public class173() {
        this.field2840.field2865 = this.field2840;
        this.field2840.field2864 = this.field2840;
    }

    @ObfuscatedName("fj.k(Lgo;)V")
    public void method3182(class185 arg0) {
        if (arg0.field2864 != null) {
            arg0.method3319();
        }
        arg0.field2864 = this.field2840.field2864;
        arg0.field2865 = this.field2840;
        arg0.field2864.field2865 = arg0;
        arg0.field2865.field2864 = arg0;
    }

    @ObfuscatedName("fj.b()Lgo;")
    public class185 method3181() {
        class185 var1 = this.field2840.field2865;
        if (this.field2840 == var1) {
            this.field2839 = null;
            return null;
        } else {
            this.field2839 = var1.field2865;
            return var1;
        }
    }

    @ObfuscatedName("fj.e()Lgo;")
    public class185 method3184() {
        class185 var1 = this.field2839;
        if (this.field2840 == var1) {
            this.field2839 = null;
            return null;
        } else {
            this.field2839 = var1.field2865;
            return var1;
        }
    }
}
