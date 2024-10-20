package deob;

@ObfuscatedName("jr")
public class class273 {

    @ObfuscatedName("jr.q")
    public long field3604 = -1L;

    @ObfuscatedName("jr.w")
    public long field3603 = -1L;

    @ObfuscatedName("jr.e")
    public boolean field3606 = false;

    @ObfuscatedName("jr.p")
    public long field3608 = 0L;

    @ObfuscatedName("jr.k")
    public long field3605 = 0L;

    @ObfuscatedName("jr.l")
    public long field3607 = 0L;

    @ObfuscatedName("jr.b")
    public int field3609 = 0;

    @ObfuscatedName("jr.i")
    public int field3610 = 0;

    @ObfuscatedName("jr.c")
    public int field3602 = 0;

    @ObfuscatedName("jr.f")
    public int field3611 = 0;

    @ObfuscatedName("jr.q(I)V")
    public void method4620() {
        this.field3604 = class298.method3576();
    }

    @ObfuscatedName("jr.w(I)V")
    public void method4608() {
        if (this.field3604 != -1L) {
            this.field3605 = class298.method3576() - this.field3604;
            this.field3604 = -1L;
        }
    }

    @ObfuscatedName("jr.e(II)V")
    public void method4611(int arg0) {
        this.field3603 = class298.method3576();
        this.field3609 = arg0;
    }

    @ObfuscatedName("jr.p(B)V")
    public void method4629() {
        if (this.field3603 != -1L) {
            this.field3608 = class298.method3576() - this.field3603;
            this.field3603 = -1L;
        }
        this.field3602++;
        this.field3606 = true;
    }

    @ObfuscatedName("jr.k(I)V")
    public void method4613() {
        this.field3606 = false;
        this.field3610 = 0;
    }

    @ObfuscatedName("jr.l(I)V")
    public void method4615() {
        this.method4629();
    }

    @ObfuscatedName("jr.b(Lkf;I)V")
    public void method4614(class301 arg0) {
        long var2 = this.field3605;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method5052((int) var4);
        long var6 = this.field3608;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method5052((int) var8);
        long var10 = this.field3607;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method5052((int) var12);
        arg0.method5052(this.field3609);
        arg0.method5052(this.field3610);
        arg0.method5052(this.field3602);
        arg0.method5052(this.field3611);
    }
}
