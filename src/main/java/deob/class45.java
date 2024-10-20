package deob;

@ObfuscatedName("ay")
public class class45 extends class349 {

    @ObfuscatedName("ay.s")
    public int field378;

    @ObfuscatedName("ay.t")
    public int field389;

    @ObfuscatedName("ay.v")
    public int field379;

    @ObfuscatedName("ay.j")
    public String field380;

    @ObfuscatedName("ay.l")
    public class406 field381;

    @ObfuscatedName("ay.n")
    public class329 field382 = class329.field3874;

    @ObfuscatedName("ay.w")
    public class329 field377 = class329.field3874;

    @ObfuscatedName("ay.f")
    public String field385;

    @ObfuscatedName("ay.o")
    public String field388;

    public class45(int arg0, String arg1, String arg2, String arg3) {
        this.method789(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ay.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method789(int arg0, String arg1, String arg2, String arg3) {
        this.field378 = class85.method4992();
        this.field389 = client.field452;
        this.field379 = arg0;
        this.field380 = arg1;
        this.method796();
        this.field385 = arg2;
        this.field388 = arg3;
        this.method797();
        this.method793();
    }

    @ObfuscatedName("ay.t(I)V")
    public void method797() {
        this.field382 = class329.field3874;
    }

    @ObfuscatedName("ay.v(I)Z")
    public final boolean method813() {
        if (class329.field3874 == this.field382) {
            this.method792();
        }
        return class329.field3872 == this.field382;
    }

    @ObfuscatedName("ay.j(B)V")
    public void method792() {
        this.field382 = Statics.field80.field712.method5243(this.field381) ? class329.field3872 : class329.field3873;
    }

    @ObfuscatedName("ay.l(I)V")
    public void method793() {
        this.field377 = class329.field3874;
    }

    @ObfuscatedName("ay.n(I)Z")
    public final boolean method806() {
        if (class329.field3874 == this.field377) {
            this.method790();
        }
        return class329.field3872 == this.field377;
    }

    @ObfuscatedName("ay.w(I)V")
    public void method790() {
        this.field377 = Statics.field80.field713.method5243(this.field381) ? class329.field3872 : class329.field3873;
    }

    @ObfuscatedName("ay.f(I)V")
    public final void method796() {
        if (this.field380 == null) {
            this.field381 = null;
        } else {
            this.field381 = new class406(client.method1559(this.field380), Statics.field761);
        }
    }
}
