package deob;

@ObfuscatedName("km")
public class class297 {

    @ObfuscatedName("km.v")
    public class346 field3713 = new class346();

    @ObfuscatedName("km.n")
    public class346 field3712;

    public class297() {
        this.field3713.field3930 = this.field3713;
        this.field3713.field3929 = this.field3713;
    }

    @ObfuscatedName("km.v(Lmz;)V")
    public void method4831(class346 arg0) {
        if (arg0.field3929 != null) {
            arg0.method5484();
        }
        arg0.field3929 = this.field3713.field3929;
        arg0.field3930 = this.field3713;
        arg0.field3929.field3930 = arg0;
        arg0.field3930.field3929 = arg0;
    }

    @ObfuscatedName("km.n()Lmz;")
    public class346 method4835() {
        class346 var1 = this.field3713.field3930;
        if (this.field3713 == var1) {
            this.field3712 = null;
            return null;
        } else {
            this.field3712 = var1.field3930;
            return var1;
        }
    }

    @ObfuscatedName("km.f()Lmz;")
    public class346 method4838() {
        class346 var1 = this.field3712;
        if (this.field3713 == var1) {
            this.field3712 = null;
            return null;
        } else {
            this.field3712 = var1.field3930;
            return var1;
        }
    }
}
