package deob;

@ObfuscatedName("jo")
public class class284 {

    @ObfuscatedName("jo.m")
    public long field3675 = -1L;

    @ObfuscatedName("jo.f")
    public long field3677 = -1L;

    @ObfuscatedName("jo.q")
    public boolean field3673 = false;

    @ObfuscatedName("jo.w")
    public long field3674 = 0L;

    @ObfuscatedName("jo.o")
    public long field3672 = 0L;

    @ObfuscatedName("jo.u")
    public long field3676 = 0L;

    @ObfuscatedName("jo.g")
    public int field3679 = 0;

    @ObfuscatedName("jo.l")
    public int field3678 = 0;

    @ObfuscatedName("jo.e")
    public int field3671 = 0;

    @ObfuscatedName("jo.x")
    public int field3680 = 0;

    @ObfuscatedName("jo.m(I)V")
    public void method4946() {
        this.field3675 = class204.method3658();
    }

    @ObfuscatedName("jo.f(B)V")
    public void method4953() {
        if (this.field3675 != -1L) {
            this.field3672 = class204.method3658() - this.field3675;
            this.field3675 = -1L;
        }
    }

    @ObfuscatedName("jo.q(II)V")
    public void method4948(int arg0) {
        this.field3677 = class204.method3658();
        this.field3679 = arg0;
    }

    @ObfuscatedName("jo.w(I)V")
    public void method4960() {
        if (this.field3677 != -1L) {
            this.field3674 = class204.method3658() - this.field3677;
            this.field3677 = -1L;
        }
        this.field3671++;
        this.field3673 = true;
    }

    @ObfuscatedName("jo.o(S)V")
    public void method4950() {
        this.field3673 = false;
        this.field3678 = 0;
    }

    @ObfuscatedName("jo.u(I)V")
    public void method4951() {
        this.method4960();
    }

    @ObfuscatedName("jo.g(Lgr;I)V")
    public void method4947(class202 arg0) {
        long var2 = this.field3672;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method3402((int) var4);
        long var6 = this.field3674;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method3402((int) var8);
        long var10 = this.field3676;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method3402((int) var12);
        arg0.method3402(this.field3679);
        arg0.method3402(this.field3678);
        arg0.method3402(this.field3671);
        arg0.method3402(this.field3680);
    }
}
