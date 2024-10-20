package deob;

@ObfuscatedName("jp")
public class class283 {

    @ObfuscatedName("jp.g")
    public long field3687 = -1L;

    @ObfuscatedName("jp.r")
    public long field3679 = -1L;

    @ObfuscatedName("jp.e")
    public boolean field3681 = false;

    @ObfuscatedName("jp.q")
    public long field3682 = 0L;

    @ObfuscatedName("jp.c")
    public long field3683 = 0L;

    @ObfuscatedName("jp.l")
    public long field3680 = 0L;

    @ObfuscatedName("jp.b")
    public int field3685 = 0;

    @ObfuscatedName("jp.w")
    public int field3686 = 0;

    @ObfuscatedName("jp.n")
    public int field3684 = 0;

    @ObfuscatedName("jp.i")
    public int field3688 = 0;

    @ObfuscatedName("jp.g(I)V")
    public void method5103() {
        this.field3687 = class187.method2664();
    }

    @ObfuscatedName("jp.r(I)V")
    public void method5088() {
        if (this.field3687 != -1L) {
            this.field3683 = class187.method2664() - this.field3687;
            this.field3687 = -1L;
        }
    }

    @ObfuscatedName("jp.e(IB)V")
    public void method5089(int arg0) {
        this.field3679 = class187.method2664();
        this.field3685 = arg0;
    }

    @ObfuscatedName("jp.q(I)V")
    public void method5090() {
        if (this.field3679 != -1L) {
            this.field3682 = class187.method2664() - this.field3679;
            this.field3679 = -1L;
        }
        this.field3684++;
        this.field3681 = true;
    }

    @ObfuscatedName("jp.c(I)V")
    public void method5091() {
        this.field3681 = false;
        this.field3686 = 0;
    }

    @ObfuscatedName("jp.i(B)V")
    public void method5087() {
        this.method5090();
    }

    @ObfuscatedName("jp.p(Lgl;B)V")
    public void method5093(class185 arg0) {
        long var2 = this.field3683;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method3450((int) var4);
        long var6 = this.field3682;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method3450((int) var8);
        long var10 = this.field3680;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method3450((int) var12);
        arg0.method3450(this.field3685);
        arg0.method3450(this.field3686);
        arg0.method3450(this.field3684);
        arg0.method3450(this.field3688);
    }
}
