package deob;

@ObfuscatedName("ns")
public class class382 {

    @ObfuscatedName("ns.f")
    public long field4467 = -1L;

    @ObfuscatedName("ns.w")
    public long field4466 = -1L;

    @ObfuscatedName("ns.v")
    public boolean field4472 = false;

    @ObfuscatedName("ns.s")
    public long field4468 = 0L;

    @ObfuscatedName("ns.z")
    public long field4474 = 0L;

    @ObfuscatedName("ns.j")
    public long field4470 = 0L;

    @ObfuscatedName("ns.i")
    public int field4471 = 0;

    @ObfuscatedName("ns.n")
    public int field4465 = 0;

    @ObfuscatedName("ns.l")
    public int field4473 = 0;

    @ObfuscatedName("ns.k")
    public int field4469 = 0;

    @ObfuscatedName("ns.f(I)V")
    public void method6810() {
        this.field4467 = class287.method3099();
    }

    @ObfuscatedName("ns.w(I)V")
    public void method6808() {
        if (this.field4467 != -1L) {
            this.field4474 = class287.method3099() - this.field4467;
            this.field4467 = -1L;
        }
    }

    @ObfuscatedName("ns.v(IB)V")
    public void method6822(int arg0) {
        this.field4466 = class287.method3099();
        this.field4471 = arg0;
    }

    @ObfuscatedName("ns.s(I)V")
    public void method6809() {
        if (this.field4466 != -1L) {
            this.field4468 = class287.method3099() - this.field4466;
            this.field4466 = -1L;
        }
        this.field4473++;
        this.field4472 = true;
    }

    @ObfuscatedName("ns.z(B)V")
    public void method6815() {
        this.field4472 = false;
        this.field4465 = 0;
    }

    @ObfuscatedName("ns.j(I)V")
    public void method6811() {
        this.method6809();
    }

    @ObfuscatedName("ns.i(Lrd;I)V")
    public void method6805(class474 arg0) {
        method5065(arg0, this.field4474);
        method5065(arg0, this.field4468);
        method5065(arg0, this.field4470);
        arg0.method7950(this.field4471);
        arg0.method7950(this.field4465);
        arg0.method7950(this.field4473);
        arg0.method7950(this.field4469);
    }

    @ObfuscatedName("jg.n(Lrd;J)V")
    public static void method5065(class474 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method7950((int) var3);
    }
}
