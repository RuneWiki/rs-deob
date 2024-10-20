package deob;

@ObfuscatedName("je")
public class class283 {

    @ObfuscatedName("je.y")
    public long field3657 = -1L;

    @ObfuscatedName("je.c")
    public long field3651 = -1L;

    @ObfuscatedName("je.n")
    public boolean field3653 = false;

    @ObfuscatedName("je.u")
    public long field3654 = 0L;

    @ObfuscatedName("je.i")
    public long field3655 = 0L;

    @ObfuscatedName("je.r")
    public long field3652 = 0L;

    @ObfuscatedName("je.j")
    public int field3656 = 0;

    @ObfuscatedName("je.p")
    public int field3658 = 0;

    @ObfuscatedName("je.e")
    public int field3659 = 0;

    @ObfuscatedName("je.s")
    public int field3660 = 0;

    @ObfuscatedName("je.y(I)V")
    public void method4911() {
        this.field3657 = class187.method1700();
    }

    @ObfuscatedName("je.c(I)V")
    public void method4913() {
        if (this.field3657 != -1L) {
            this.field3655 = class187.method1700() - this.field3657;
            this.field3657 = -1L;
        }
    }

    @ObfuscatedName("je.n(IB)V")
    public void method4936(int arg0) {
        this.field3651 = class187.method1700();
        this.field3656 = arg0;
    }

    @ObfuscatedName("je.u(B)V")
    public void method4927() {
        if (this.field3651 != -1L) {
            this.field3654 = class187.method1700() - this.field3651;
            this.field3651 = -1L;
        }
        this.field3659++;
        this.field3653 = true;
    }

    @ObfuscatedName("je.i(I)V")
    public void method4916() {
        this.field3653 = false;
        this.field3658 = 0;
    }

    @ObfuscatedName("je.p(I)V")
    public void method4917() {
        this.method4927();
    }

    @ObfuscatedName("je.e(Lge;I)V")
    public void method4918(class185 arg0) {
        long var2 = this.field3655;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method3254((int) var4);
        long var6 = this.field3654;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method3254((int) var8);
        long var10 = this.field3652;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method3254((int) var12);
        arg0.method3254(this.field3656);
        arg0.method3254(this.field3658);
        arg0.method3254(this.field3659);
        arg0.method3254(this.field3660);
    }
}
