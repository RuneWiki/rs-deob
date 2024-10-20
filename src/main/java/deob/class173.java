package deob;

@ObfuscatedName("fv")
public class class173 {

    @ObfuscatedName("fv.b")
    public class178 field2796 = new class178();

    @ObfuscatedName("fv.e")
    public class178 field2797;

    public class173() {
        this.field2796.field2808 = this.field2796;
        this.field2796.field2809 = this.field2796;
    }

    @ObfuscatedName("fv.b(Lfr;)V")
    public void method3280(class178 arg0) {
        if (arg0.field2809 != null) {
            arg0.method3333();
        }
        arg0.field2809 = this.field2796.field2809;
        arg0.field2808 = this.field2796;
        arg0.field2809.field2808 = arg0;
        arg0.field2808.field2809 = arg0;
    }

    @ObfuscatedName("fv.e()Lfr;")
    public class178 method3281() {
        class178 var1 = this.field2796.field2808;
        if (this.field2796 == var1) {
            this.field2797 = null;
            return null;
        } else {
            this.field2797 = var1.field2808;
            return var1;
        }
    }

    @ObfuscatedName("fv.g()Lfr;")
    public class178 method3283() {
        class178 var1 = this.field2797;
        if (this.field2796 == var1) {
            this.field2797 = null;
            return null;
        } else {
            this.field2797 = var1.field2808;
            return var1;
        }
    }
}
