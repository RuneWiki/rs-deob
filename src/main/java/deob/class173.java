package deob;

@ObfuscatedName("fg")
public class class173 {

    @ObfuscatedName("fg.t")
    public class185 field2837 = new class185();

    @ObfuscatedName("fg.s")
    public class185 field2836;

    public class173() {
        this.field2837.field2862 = this.field2837;
        this.field2837.field2861 = this.field2837;
    }

    @ObfuscatedName("fg.t(Lgk;)V")
    public void method3187(class185 arg0) {
        if (arg0.field2861 != null) {
            arg0.method3312();
        }
        arg0.field2861 = this.field2837.field2861;
        arg0.field2862 = this.field2837;
        arg0.field2861.field2862 = arg0;
        arg0.field2862.field2861 = arg0;
    }

    @ObfuscatedName("fg.s()Lgk;")
    public class185 method3189() {
        class185 var1 = this.field2837.field2862;
        if (this.field2837 == var1) {
            this.field2836 = null;
            return null;
        } else {
            this.field2836 = var1.field2862;
            return var1;
        }
    }

    @ObfuscatedName("fg.f()Lgk;")
    public class185 method3190() {
        class185 var1 = this.field2836;
        if (this.field2837 == var1) {
            this.field2836 = null;
            return null;
        } else {
            this.field2836 = var1.field2862;
            return var1;
        }
    }
}
