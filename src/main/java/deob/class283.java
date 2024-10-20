package deob;

@ObfuscatedName("jr")
public class class283 {

    @ObfuscatedName("jr.f")
    public long field3605 = -1L;

    @ObfuscatedName("jr.b")
    public long field3608 = -1L;

    @ObfuscatedName("jr.l")
    public boolean field3607 = false;

    @ObfuscatedName("jr.m")
    public long field3609 = 0L;

    @ObfuscatedName("jr.z")
    public long field3606 = 0L;

    @ObfuscatedName("jr.q")
    public long field3610 = 0L;

    @ObfuscatedName("jr.k")
    public int field3611 = 0;

    @ObfuscatedName("jr.c")
    public int field3612 = 0;

    @ObfuscatedName("jr.u")
    public int field3613 = 0;

    @ObfuscatedName("jr.t")
    public int field3614 = 0;

    @ObfuscatedName("jr.f(B)V")
    public void method4721() {
        this.field3605 = class308.method4786();
    }

    @ObfuscatedName("jr.b(I)V")
    public void method4733() {
        if (this.field3605 != -1L) {
            this.field3606 = class308.method4786() - this.field3605;
            this.field3605 = -1L;
        }
    }

    @ObfuscatedName("jr.l(II)V")
    public void method4739(int arg0) {
        this.field3608 = class308.method4786();
        this.field3611 = arg0;
    }

    @ObfuscatedName("jr.m(S)V")
    public void method4723() {
        if (this.field3608 != -1L) {
            this.field3609 = class308.method4786() - this.field3608;
            this.field3608 = -1L;
        }
        this.field3613++;
        this.field3607 = true;
    }

    @ObfuscatedName("jr.z(B)V")
    public void method4728() {
        this.field3607 = false;
        this.field3612 = 0;
    }

    @ObfuscatedName("jr.q(I)V")
    public void method4725() {
        this.method4723();
    }

    @ObfuscatedName("jr.k(Lkb;I)V")
    public void method4734(class311 arg0) {
        long var2 = this.field3606;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method5164((int) var4);
        long var6 = this.field3609;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method5164((int) var8);
        long var10 = this.field3610;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method5164((int) var12);
        arg0.method5164(this.field3611);
        arg0.method5164(this.field3612);
        arg0.method5164(this.field3613);
        arg0.method5164(this.field3614);
    }
}
