package deob;

@ObfuscatedName("jr")
public class class282 {

    @ObfuscatedName("jr.x")
    public long field3586 = -1L;

    @ObfuscatedName("jr.m")
    public long field3578 = -1L;

    @ObfuscatedName("jr.k")
    public boolean field3582 = false;

    @ObfuscatedName("jr.d")
    public long field3580 = 0L;

    @ObfuscatedName("jr.w")
    public long field3581 = 0L;

    @ObfuscatedName("jr.v")
    public long field3577 = 0L;

    @ObfuscatedName("jr.q")
    public int field3579 = 0;

    @ObfuscatedName("jr.z")
    public int field3584 = 0;

    @ObfuscatedName("jr.t")
    public int field3585 = 0;

    @ObfuscatedName("jr.e")
    public int field3587 = 0;

    @ObfuscatedName("jr.x(I)V")
    public void method4655() {
        this.field3586 = Statics.method3668();
    }

    @ObfuscatedName("jr.m(I)V")
    public void method4654() {
        if (this.field3586 != -1L) {
            this.field3581 = Statics.method3668() - this.field3586;
            this.field3586 = -1L;
        }
    }

    @ObfuscatedName("jr.k(IB)V")
    public void method4648(int arg0) {
        this.field3578 = Statics.method3668();
        this.field3579 = arg0;
    }

    @ObfuscatedName("jr.d(I)V")
    public void method4649() {
        if (this.field3578 != -1L) {
            this.field3580 = Statics.method3668() - this.field3578;
            this.field3578 = -1L;
        }
        this.field3585++;
        this.field3582 = true;
    }

    @ObfuscatedName("jr.w(I)V")
    public void method4650() {
        this.field3582 = false;
        this.field3584 = 0;
    }

    @ObfuscatedName("jr.v(I)V")
    public void method4651() {
        this.method4649();
    }

    @ObfuscatedName("jr.q(Lkb;I)V")
    public void method4652(class310 arg0) {
        long var2 = this.field3581;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method5122((int) var4);
        long var6 = this.field3580;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method5122((int) var8);
        long var10 = this.field3577;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method5122((int) var12);
        arg0.method5122(this.field3579);
        arg0.method5122(this.field3584);
        arg0.method5122(this.field3585);
        arg0.method5122(this.field3587);
    }
}
