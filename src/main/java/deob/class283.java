package deob;

@ObfuscatedName("jy")
public class class283 {

    @ObfuscatedName("jy.c")
    public long field3654 = -1L;

    @ObfuscatedName("jy.q")
    public long field3647 = -1L;

    @ObfuscatedName("jy.m")
    public boolean field3649 = false;

    @ObfuscatedName("jy.j")
    public long field3648 = 0L;

    @ObfuscatedName("jy.g")
    public long field3650 = 0L;

    @ObfuscatedName("jy.i")
    public long field3651 = 0L;

    @ObfuscatedName("jy.h")
    public int field3652 = 0;

    @ObfuscatedName("jy.l")
    public int field3646 = 0;

    @ObfuscatedName("jy.d")
    public int field3653 = 0;

    @ObfuscatedName("jy.o")
    public int field3655 = 0;

    @ObfuscatedName("jy.c(I)V")
    public void method4896() {
        this.field3654 = class187.method918();
    }

    @ObfuscatedName("jy.q(I)V")
    public void method4897() {
        if (this.field3654 != -1L) {
            this.field3650 = class187.method918() - this.field3654;
            this.field3654 = -1L;
        }
    }

    @ObfuscatedName("jy.m(II)V")
    public void method4898(int arg0) {
        this.field3647 = class187.method918();
        this.field3652 = arg0;
    }

    @ObfuscatedName("jy.j(I)V")
    public void method4895() {
        if (this.field3647 != -1L) {
            this.field3648 = class187.method918() - this.field3647;
            this.field3647 = -1L;
        }
        this.field3653++;
        this.field3649 = true;
    }

    @ObfuscatedName("jy.g(I)V")
    public void method4900() {
        this.field3649 = false;
        this.field3646 = 0;
    }

    @ObfuscatedName("jy.i(I)V")
    public void method4902() {
        this.method4895();
    }

    @ObfuscatedName("jy.h(Lgg;I)V")
    public void method4906(class185 arg0) {
        long var2 = this.field3650;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method3383((int) var4);
        long var6 = this.field3648;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method3383((int) var8);
        long var10 = this.field3651;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method3383((int) var12);
        arg0.method3383(this.field3652);
        arg0.method3383(this.field3646);
        arg0.method3383(this.field3653);
        arg0.method3383(this.field3655);
    }
}
