package deob;

@ObfuscatedName("lr")
public class class338 {

    @ObfuscatedName("lr.v")
    public class403 field4089 = new class403();

    @ObfuscatedName("lr.c")
    public class403 field4090;

    public class338() {
        this.field4089.field4401 = this.field4089;
        this.field4089.field4402 = this.field4089;
    }

    @ObfuscatedName("lr.v(Lot;)V")
    public void method5643(class403 arg0) {
        if (arg0.field4402 != null) {
            arg0.method6495();
        }
        arg0.field4402 = this.field4089.field4402;
        arg0.field4401 = this.field4089;
        arg0.field4402.field4401 = arg0;
        arg0.field4401.field4402 = arg0;
    }

    @ObfuscatedName("lr.c()Lot;")
    public class403 method5644() {
        class403 var1 = this.field4089.field4401;
        if (this.field4089 == var1) {
            this.field4090 = null;
            return null;
        } else {
            this.field4090 = var1.field4401;
            return var1;
        }
    }

    @ObfuscatedName("lr.i()Lot;")
    public class403 method5647() {
        class403 var1 = this.field4090;
        if (this.field4089 == var1) {
            this.field4090 = null;
            return null;
        } else {
            this.field4090 = var1.field4401;
            return var1;
        }
    }
}
