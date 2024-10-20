package deob;

@ObfuscatedName("jf")
public class class284 {

    @ObfuscatedName("jf.d")
    public long field3775 = -1L;

    @ObfuscatedName("jf.x")
    public long field3773 = -1L;

    @ObfuscatedName("jf.k")
    public boolean field3777 = false;

    @ObfuscatedName("jf.z")
    public long field3774 = 0L;

    @ObfuscatedName("jf.v")
    public long field3776 = 0L;

    @ObfuscatedName("jf.m")
    public long field3772 = 0L;

    @ObfuscatedName("jf.b")
    public int field3778 = 0;

    @ObfuscatedName("jf.t")
    public int field3779 = 0;

    @ObfuscatedName("jf.p")
    public int field3781 = 0;

    @ObfuscatedName("jf.r")
    public int field3780 = 0;

    @ObfuscatedName("jf.d(I)V")
    public void method4740() {
        this.field3775 = class183.method2932();
    }

    @ObfuscatedName("jf.x(B)V")
    public void method4741() {
        if (this.field3775 != -1L) {
            this.field3776 = class183.method2932() - this.field3775;
            this.field3775 = -1L;
        }
    }

    @ObfuscatedName("jf.k(II)V")
    public void method4742(int arg0) {
        this.field3773 = class183.method2932();
        this.field3778 = arg0;
    }

    @ObfuscatedName("jf.z(B)V")
    public void method4739() {
        if (this.field3773 != -1L) {
            this.field3774 = class183.method2932() - this.field3773;
            this.field3773 = -1L;
        }
        this.field3781++;
        this.field3777 = true;
    }

    @ObfuscatedName("jf.v(I)V")
    public void method4744() {
        this.field3777 = false;
        this.field3779 = 0;
    }

    @ObfuscatedName("jf.m(I)V")
    public void method4745() {
        this.method4739();
    }

    @ObfuscatedName("jf.b(Lfr;I)V")
    public void method4743(class181 arg0) {
        long var2 = this.field3776;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method3021((int) var4);
        long var6 = this.field3774;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method3021((int) var8);
        long var10 = this.field3772;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method3021((int) var12);
        arg0.method3021(this.field3778);
        arg0.method3021(this.field3779);
        arg0.method3021(this.field3781);
        arg0.method3021(this.field3780);
    }
}
