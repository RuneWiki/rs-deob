package deob;

@ObfuscatedName("kz")
public final class class308 {

    @ObfuscatedName("kz.l")
    public class365 field3823 = new class365();

    public class308() {
        this.field3823.field4069 = this.field3823;
        this.field3823.field4070 = this.field3823;
    }

    @ObfuscatedName("kz.l(Lnu;)V")
    public void method5008(class365 arg0) {
        if (arg0.field4070 != null) {
            arg0.method5771();
        }
        arg0.field4070 = this.field3823.field4070;
        arg0.field4069 = this.field3823;
        arg0.field4070.field4069 = arg0;
        arg0.field4069.field4070 = arg0;
    }

    @ObfuscatedName("kz.q(Lnu;)V")
    public void method5005(class365 arg0) {
        if (arg0.field4070 != null) {
            arg0.method5771();
        }
        arg0.field4070 = this.field3823;
        arg0.field4069 = this.field3823.field4069;
        arg0.field4070.field4069 = arg0;
        arg0.field4069.field4070 = arg0;
    }

    @ObfuscatedName("kz.f()Lnu;")
    public class365 method5006() {
        class365 var1 = this.field3823.field4069;
        return this.field3823 == var1 ? null : var1;
    }
}
