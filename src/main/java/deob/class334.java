package deob;

@ObfuscatedName("la")
public final class class334 {

    @ObfuscatedName("la.v")
    public class404 field4081 = new class404();

    public class334() {
        this.field4081.field4403 = this.field4081;
        this.field4081.field4405 = this.field4081;
    }

    @ObfuscatedName("la.v(Loz;)V")
    public void method5517(class404 arg0) {
        if (arg0.field4405 != null) {
            arg0.method6500();
        }
        arg0.field4405 = this.field4081.field4405;
        arg0.field4403 = this.field4081;
        arg0.field4405.field4403 = arg0;
        arg0.field4403.field4405 = arg0;
    }

    @ObfuscatedName("la.c(Loz;)V")
    public void method5518(class404 arg0) {
        if (arg0.field4405 != null) {
            arg0.method6500();
        }
        arg0.field4405 = this.field4081;
        arg0.field4403 = this.field4081.field4403;
        arg0.field4405.field4403 = arg0;
        arg0.field4403.field4405 = arg0;
    }

    @ObfuscatedName("la.i()Loz;")
    public class404 method5520() {
        class404 var1 = this.field4081.field4403;
        return this.field4081 == var1 ? null : var1;
    }
}
