package deob;

@ObfuscatedName("py")
public class class400 {

    @ObfuscatedName("py.aq")
    public class487 field4524 = new class487();

    @ObfuscatedName("py.aw")
    public class487 field4525;

    public class400() {
        this.field4524.field4910 = this.field4524;
        this.field4524.field4911 = this.field4524;
    }

    @ObfuscatedName("py.aq(Lsw;)V")
    public void method6813(class487 arg0) {
        if (arg0.field4911 != null) {
            arg0.method7985();
        }
        arg0.field4911 = this.field4524.field4911;
        arg0.field4910 = this.field4524;
        arg0.field4911.field4910 = arg0;
        arg0.field4910.field4911 = arg0;
    }

    @ObfuscatedName("py.aw()Lsw;")
    public class487 method6812() {
        class487 var1 = this.field4524.field4910;
        if (this.field4524 == var1) {
            this.field4525 = null;
            return null;
        } else {
            this.field4525 = var1.field4910;
            return var1;
        }
    }

    @ObfuscatedName("py.al()Lsw;")
    public class487 method6815() {
        class487 var1 = this.field4525;
        if (this.field4524 == var1) {
            this.field4525 = null;
            return null;
        } else {
            this.field4525 = var1.field4910;
            return var1;
        }
    }
}
