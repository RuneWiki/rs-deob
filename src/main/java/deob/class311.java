package deob;

@ObfuscatedName("ki")
public class class311 {

    @ObfuscatedName("ki.f")
    public long field3771 = -1L;

    @ObfuscatedName("ki.e")
    public long field3772 = -1L;

    @ObfuscatedName("ki.v")
    public boolean field3773 = false;

    @ObfuscatedName("ki.y")
    public long field3778 = 0L;

    @ObfuscatedName("ki.j")
    public long field3775 = 0L;

    @ObfuscatedName("ki.o")
    public long field3776 = 0L;

    @ObfuscatedName("ki.m")
    public int field3774 = 0;

    @ObfuscatedName("ki.r")
    public int field3779 = 0;

    @ObfuscatedName("ki.h")
    public int field3777 = 0;

    @ObfuscatedName("ki.d")
    public int field3780 = 0;

    @ObfuscatedName("ki.f(I)V")
    public void method5094() {
        this.field3771 = class381.method4000();
    }

    @ObfuscatedName("ki.e(I)V")
    public void method5076() {
        if (this.field3771 != -1L) {
            this.field3775 = class381.method4000() - this.field3771;
            this.field3771 = -1L;
        }
    }

    @ObfuscatedName("ki.v(IB)V")
    public void method5079(int arg0) {
        this.field3772 = class381.method4000();
        this.field3774 = arg0;
    }

    @ObfuscatedName("ki.y(I)V")
    public void method5080() {
        if (this.field3772 != -1L) {
            this.field3778 = class381.method4000() - this.field3772;
            this.field3772 = -1L;
        }
        this.field3777++;
        this.field3773 = true;
    }

    @ObfuscatedName("ki.j(B)V")
    public void method5081() {
        this.field3773 = false;
        this.field3779 = 0;
    }

    @ObfuscatedName("ki.o(I)V")
    public void method5082() {
        this.method5080();
    }

    @ObfuscatedName("ki.m(Lnt;I)V")
    public void method5095(class384 arg0) {
        method48(arg0, this.field3775);
        method48(arg0, this.field3778);
        method48(arg0, this.field3776);
        arg0.method5881(this.field3774);
        arg0.method5881(this.field3779);
        arg0.method5881(this.field3777);
        arg0.method5881(this.field3780);
    }

    @ObfuscatedName("y.r(Lnt;J)V")
    public static void method48(class384 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method5881((int) var3);
    }
}
