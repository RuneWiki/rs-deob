package deob;

@ObfuscatedName("kh")
public class class309 {

    @ObfuscatedName("kh.f")
    public long field3777 = -1L;

    @ObfuscatedName("kh.o")
    public long field3773 = -1L;

    @ObfuscatedName("kh.u")
    public boolean field3774 = false;

    @ObfuscatedName("kh.p")
    public long field3775 = 0L;

    @ObfuscatedName("kh.b")
    public long field3772 = 0L;

    @ObfuscatedName("kh.e")
    public long field3779 = 0L;

    @ObfuscatedName("kh.k")
    public int field3776 = 0;

    @ObfuscatedName("kh.g")
    public int field3778 = 0;

    @ObfuscatedName("kh.h")
    public int field3780 = 0;

    @ObfuscatedName("kh.n")
    public int field3781 = 0;

    @ObfuscatedName("kh.f(I)V")
    public void method4996() {
        this.field3777 = class379.method1540();
    }

    @ObfuscatedName("kh.o(I)V")
    public void method4997() {
        if (this.field3777 != -1L) {
            this.field3772 = class379.method1540() - this.field3777;
            this.field3777 = -1L;
        }
    }

    @ObfuscatedName("kh.u(IB)V")
    public void method4998(int arg0) {
        this.field3773 = class379.method1540();
        this.field3776 = arg0;
    }

    @ObfuscatedName("kh.p(I)V")
    public void method5006() {
        if (this.field3773 != -1L) {
            this.field3775 = class379.method1540() - this.field3773;
            this.field3773 = -1L;
        }
        this.field3780++;
        this.field3774 = true;
    }

    @ObfuscatedName("kh.b(B)V")
    public void method5000() {
        this.field3774 = false;
        this.field3778 = 0;
    }

    @ObfuscatedName("kh.e(I)V")
    public void method5001() {
        this.method5006();
    }

    @ObfuscatedName("kh.k(Lnu;B)V")
    public void method5002(class382 arg0) {
        long var2 = this.field3772;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method5853((int) var4);
        long var6 = this.field3775;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method5853((int) var8);
        long var10 = this.field3779;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method5853((int) var12);
        arg0.method5853(this.field3776);
        arg0.method5853(this.field3778);
        arg0.method5853(this.field3780);
        arg0.method5853(this.field3781);
    }
}
