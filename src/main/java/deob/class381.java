package deob;

@ObfuscatedName("ox")
public class class381 {

    @ObfuscatedName("ox.au")
    public class468 field4417 = new class468();

    @ObfuscatedName("ox.ae")
    public class468 field4416;

    public class381() {
        this.field4417.field4806 = this.field4417;
        this.field4417.field4805 = this.field4417;
    }

    @ObfuscatedName("ox.au(Lri;)V")
    public void method6516(class468 arg0) {
        if (arg0.field4805 != null) {
            arg0.method7693();
        }
        arg0.field4805 = this.field4417.field4805;
        arg0.field4806 = this.field4417;
        arg0.field4805.field4806 = arg0;
        arg0.field4806.field4805 = arg0;
    }

    @ObfuscatedName("ox.ae()Lri;")
    public class468 method6522() {
        class468 var1 = this.field4417.field4806;
        if (this.field4417 == var1) {
            this.field4416 = null;
            return null;
        } else {
            this.field4416 = var1.field4806;
            return var1;
        }
    }

    @ObfuscatedName("ox.ao()Lri;")
    public class468 method6518() {
        class468 var1 = this.field4416;
        if (this.field4417 == var1) {
            this.field4416 = null;
            return null;
        } else {
            this.field4416 = var1.field4806;
            return var1;
        }
    }
}
