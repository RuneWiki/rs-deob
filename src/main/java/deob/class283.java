package deob;

@ObfuscatedName("jc")
public class class283 {

    @ObfuscatedName("jc.h")
    public long field3621 = -1L;

    @ObfuscatedName("jc.v")
    public long field3617 = -1L;

    @ObfuscatedName("jc.x")
    public boolean field3615 = false;

    @ObfuscatedName("jc.w")
    public long field3616 = 0L;

    @ObfuscatedName("jc.t")
    public long field3623 = 0L;

    @ObfuscatedName("jc.j")
    public long field3614 = 0L;

    @ObfuscatedName("jc.n")
    public int field3619 = 0;

    @ObfuscatedName("jc.p")
    public int field3620 = 0;

    @ObfuscatedName("jc.l")
    public int field3613 = 0;

    @ObfuscatedName("jc.z")
    public int field3622 = 0;

    @ObfuscatedName("jc.h(B)V")
    public void method4638() {
        this.field3621 = class308.method4891();
    }

    @ObfuscatedName("jc.v(I)V")
    public void method4646() {
        if (this.field3621 != -1L) {
            this.field3623 = class308.method4891() - this.field3621;
            this.field3621 = -1L;
        }
    }

    @ObfuscatedName("jc.x(IB)V")
    public void method4661(int arg0) {
        this.field3617 = class308.method4891();
        this.field3619 = arg0;
    }

    @ObfuscatedName("jc.w(I)V")
    public void method4641() {
        if (this.field3617 != -1L) {
            this.field3616 = class308.method4891() - this.field3617;
            this.field3617 = -1L;
        }
        this.field3613++;
        this.field3615 = true;
    }

    @ObfuscatedName("jc.t(B)V")
    public void method4642() {
        this.field3615 = false;
        this.field3620 = 0;
    }

    @ObfuscatedName("jc.j(I)V")
    public void method4643() {
        this.method4641();
    }

    @ObfuscatedName("jc.n(Lkj;I)V")
    public void method4637(class311 arg0) {
        long var2 = this.field3623;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method5099((int) var4);
        long var6 = this.field3616;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method5099((int) var8);
        long var10 = this.field3614;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method5099((int) var12);
        arg0.method5099(this.field3619);
        arg0.method5099(this.field3620);
        arg0.method5099(this.field3613);
        arg0.method5099(this.field3622);
    }
}
