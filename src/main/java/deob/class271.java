package deob;

@ObfuscatedName("jo")
public final class class271 {

    @ObfuscatedName("jo.f")
    public class346 field3380 = new class346();

    public class271() {
        this.field3380.field3936 = this.field3380;
        this.field3380.field3934 = this.field3380;
    }

    @ObfuscatedName("jo.f(Lmz;)V")
    public void method4148(class346 arg0) {
        if (arg0.field3934 != null) {
            arg0.method5349();
        }
        arg0.field3934 = this.field3380.field3934;
        arg0.field3936 = this.field3380;
        arg0.field3934.field3936 = arg0;
        arg0.field3936.field3934 = arg0;
    }

    @ObfuscatedName("jo.o(Lmz;)V")
    public void method4144(class346 arg0) {
        if (arg0.field3934 != null) {
            arg0.method5349();
        }
        arg0.field3934 = this.field3380;
        arg0.field3936 = this.field3380.field3936;
        arg0.field3934.field3936 = arg0;
        arg0.field3936.field3934 = arg0;
    }

    @ObfuscatedName("jo.u()Lmz;")
    public class346 method4151() {
        class346 var1 = this.field3380.field3936;
        return this.field3380 == var1 ? null : var1;
    }
}
