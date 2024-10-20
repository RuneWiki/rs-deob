package deob;

@ObfuscatedName("jy")
public class class274 {

    @ObfuscatedName("jy.m")
    public class184 field3606 = new class184();

    @ObfuscatedName("jy.f")
    public class184 field3607;

    public class274() {
        this.field3606.field2136 = this.field3606;
        this.field3606.field2137 = this.field3606;
    }

    @ObfuscatedName("jy.m(Lgh;)V")
    public void method4900(class184 arg0) {
        if (arg0.field2137 != null) {
            arg0.method3299();
        }
        arg0.field2137 = this.field3606.field2137;
        arg0.field2136 = this.field3606;
        arg0.field2137.field2136 = arg0;
        arg0.field2136.field2137 = arg0;
    }

    @ObfuscatedName("jy.f()Lgh;")
    public class184 method4894() {
        class184 var1 = this.field3606.field2136;
        if (this.field3606 == var1) {
            this.field3607 = null;
            return null;
        } else {
            this.field3607 = var1.field2136;
            return var1;
        }
    }

    @ObfuscatedName("jy.q()Lgh;")
    public class184 method4895() {
        class184 var1 = this.field3607;
        if (this.field3606 == var1) {
            this.field3607 = null;
            return null;
        } else {
            this.field3607 = var1.field2136;
            return var1;
        }
    }
}
