package deob;

@ObfuscatedName("fx")
public class class173 {

    @ObfuscatedName("fx.i")
    public class185 field2843 = new class185();

    @ObfuscatedName("fx.c")
    public class185 field2842;

    public class173() {
        this.field2843.field2868 = this.field2843;
        this.field2843.field2867 = this.field2843;
    }

    @ObfuscatedName("fx.i(Lga;)V")
    public void method3209(class185 arg0) {
        if (arg0.field2867 != null) {
            arg0.method3324();
        }
        arg0.field2867 = this.field2843.field2867;
        arg0.field2868 = this.field2843;
        arg0.field2867.field2868 = arg0;
        arg0.field2868.field2867 = arg0;
    }

    @ObfuscatedName("fx.c()Lga;")
    public class185 method3208() {
        class185 var1 = this.field2843.field2868;
        if (this.field2843 == var1) {
            this.field2842 = null;
            return null;
        } else {
            this.field2842 = var1.field2868;
            return var1;
        }
    }

    @ObfuscatedName("fx.h()Lga;")
    public class185 method3213() {
        class185 var1 = this.field2842;
        if (this.field2843 == var1) {
            this.field2842 = null;
            return null;
        } else {
            this.field2842 = var1.field2868;
            return var1;
        }
    }
}
