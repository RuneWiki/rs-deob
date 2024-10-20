package deob;

@ObfuscatedName("la")
public final class class320 {

    @ObfuscatedName("la.c")
    public class382 field3961 = new class382();

    public class320() {
        this.field3961.field4250 = this.field3961;
        this.field3961.field4251 = this.field3961;
    }

    @ObfuscatedName("la.c(Lnc;)V")
    public void method5285(class382 arg0) {
        if (arg0.field4251 != null) {
            arg0.method6159();
        }
        arg0.field4251 = this.field3961.field4251;
        arg0.field4250 = this.field3961;
        arg0.field4251.field4250 = arg0;
        arg0.field4250.field4251 = arg0;
    }

    @ObfuscatedName("la.b(Lnc;)V")
    public void method5290(class382 arg0) {
        if (arg0.field4251 != null) {
            arg0.method6159();
        }
        arg0.field4251 = this.field3961;
        arg0.field4250 = this.field3961.field4250;
        arg0.field4251.field4250 = arg0;
        arg0.field4250.field4251 = arg0;
    }

    @ObfuscatedName("la.p()Lnc;")
    public class382 method5287() {
        class382 var1 = this.field3961.field4250;
        return this.field3961 == var1 ? null : var1;
    }
}
