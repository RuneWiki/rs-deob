package deob;

@ObfuscatedName("fi")
public class class172 {

    @ObfuscatedName("fi.v")
    public class177 field2798 = new class177();

    @ObfuscatedName("fi.f")
    public class177 field2799;

    public class172() {
        this.field2798.field2811 = this.field2798;
        this.field2798.field2810 = this.field2798;
    }

    @ObfuscatedName("fi.v(Lfy;)V")
    public void method3262(class177 arg0) {
        if (arg0.field2810 != null) {
            arg0.method3319();
        }
        arg0.field2810 = this.field2798.field2810;
        arg0.field2811 = this.field2798;
        arg0.field2810.field2811 = arg0;
        arg0.field2811.field2810 = arg0;
    }

    @ObfuscatedName("fi.f()Lfy;")
    public class177 method3263() {
        class177 var1 = this.field2798.field2811;
        if (this.field2798 == var1) {
            this.field2799 = null;
            return null;
        } else {
            this.field2799 = var1.field2811;
            return var1;
        }
    }

    @ObfuscatedName("fi.n()Lfy;")
    public class177 method3256() {
        class177 var1 = this.field2799;
        if (this.field2798 == var1) {
            this.field2799 = null;
            return null;
        } else {
            this.field2799 = var1.field2811;
            return var1;
        }
    }
}
