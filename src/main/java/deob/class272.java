package deob;

@ObfuscatedName("jd")
public class class272 {

    @ObfuscatedName("jd.s")
    public long field3567 = -1L;

    @ObfuscatedName("jd.j")
    public long field3559 = -1L;

    @ObfuscatedName("jd.i")
    public boolean field3561 = false;

    @ObfuscatedName("jd.k")
    public long field3562 = 0L;

    @ObfuscatedName("jd.u")
    public long field3563 = 0L;

    @ObfuscatedName("jd.n")
    public long field3560 = 0L;

    @ObfuscatedName("jd.t")
    public int field3565 = 0;

    @ObfuscatedName("jd.q")
    public int field3566 = 0;

    @ObfuscatedName("jd.x")
    public int field3564 = 0;

    @ObfuscatedName("jd.d")
    public int field3568 = 0;

    @ObfuscatedName("jd.s(B)V")
    public void method4580() {
        this.field3567 = class297.method4369();
    }

    @ObfuscatedName("jd.j(I)V")
    public void method4581() {
        if (this.field3567 != -1L) {
            this.field3563 = class297.method4369() - this.field3567;
            this.field3567 = -1L;
        }
    }

    @ObfuscatedName("jd.i(IB)V")
    public void method4582(int arg0) {
        this.field3559 = class297.method4369();
        this.field3565 = arg0;
    }

    @ObfuscatedName("jd.k(I)V")
    public void method4583() {
        if (this.field3559 != -1L) {
            this.field3562 = class297.method4369() - this.field3559;
            this.field3559 = -1L;
        }
        this.field3564++;
        this.field3561 = true;
    }

    @ObfuscatedName("jd.u(I)V")
    public void method4608() {
        this.field3561 = false;
        this.field3566 = 0;
    }

    @ObfuscatedName("jd.n(B)V")
    public void method4584() {
        this.method4583();
    }

    @ObfuscatedName("jd.t(Lky;I)V")
    public void method4586(class300 arg0) {
        long var2 = this.field3563;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method5037((int) var4);
        long var6 = this.field3562;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method5037((int) var8);
        long var10 = this.field3560;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method5037((int) var12);
        arg0.method5037(this.field3565);
        arg0.method5037(this.field3566);
        arg0.method5037(this.field3564);
        arg0.method5037(this.field3568);
    }
}
