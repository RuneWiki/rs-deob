package deob;

@ObfuscatedName("fj")
public class class173 {

    @ObfuscatedName("fj.t")
    public class185 field2837 = new class185();

    @ObfuscatedName("fj.o")
    public class185 field2838;

    public class173() {
        this.field2837.field2863 = this.field2837;
        this.field2837.field2862 = this.field2837;
    }

    @ObfuscatedName("fj.t(Lgc;)V")
    public void method3122(class185 arg0) {
        if (arg0.field2862 != null) {
            arg0.method3259();
        }
        arg0.field2862 = this.field2837.field2862;
        arg0.field2863 = this.field2837;
        arg0.field2862.field2863 = arg0;
        arg0.field2863.field2862 = arg0;
    }

    @ObfuscatedName("fj.o()Lgc;")
    public class185 method3124() {
        class185 var1 = this.field2837.field2863;
        if (this.field2837 == var1) {
            this.field2838 = null;
            return null;
        } else {
            this.field2838 = var1.field2863;
            return var1;
        }
    }

    @ObfuscatedName("fj.i()Lgc;")
    public class185 method3123() {
        class185 var1 = this.field2838;
        if (this.field2837 == var1) {
            this.field2838 = null;
            return null;
        } else {
            this.field2838 = var1.field2863;
            return var1;
        }
    }
}
