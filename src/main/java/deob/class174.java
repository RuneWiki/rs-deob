package deob;

@ObfuscatedName("fy")
public class class174 {

    @ObfuscatedName("fy.g")
    public class186 field2845 = new class186();

    @ObfuscatedName("fy.s")
    public class186 field2846;

    public class174() {
        this.field2845.field2870 = this.field2845;
        this.field2845.field2871 = this.field2845;
    }

    @ObfuscatedName("fy.g(Lgo;)V")
    public void method3150(class186 arg0) {
        if (arg0.field2871 != null) {
            arg0.method3276();
        }
        arg0.field2871 = this.field2845.field2871;
        arg0.field2870 = this.field2845;
        arg0.field2871.field2870 = arg0;
        arg0.field2870.field2871 = arg0;
    }

    @ObfuscatedName("fy.s()Lgo;")
    public class186 method3151() {
        class186 var1 = this.field2845.field2870;
        if (this.field2845 == var1) {
            this.field2846 = null;
            return null;
        } else {
            this.field2846 = var1.field2870;
            return var1;
        }
    }

    @ObfuscatedName("fy.h()Lgo;")
    public class186 method3158() {
        class186 var1 = this.field2846;
        if (this.field2845 == var1) {
            this.field2846 = null;
            return null;
        } else {
            this.field2846 = var1.field2870;
            return var1;
        }
    }
}
