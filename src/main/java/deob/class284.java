package deob;

@ObfuscatedName("jg")
public class class284 {

    @ObfuscatedName("jg.b")
    public long field3779 = -1L;

    @ObfuscatedName("jg.s")
    public long field3772 = -1L;

    @ObfuscatedName("jg.r")
    public boolean field3770 = false;

    @ObfuscatedName("jg.g")
    public long field3773 = 0L;

    @ObfuscatedName("jg.x")
    public long field3771 = 0L;

    @ObfuscatedName("jg.f")
    public long field3775 = 0L;

    @ObfuscatedName("jg.u")
    public int field3776 = 0;

    @ObfuscatedName("jg.t")
    public int field3777 = 0;

    @ObfuscatedName("jg.k")
    public int field3778 = 0;

    @ObfuscatedName("jg.n")
    public int field3774 = 0;

    @ObfuscatedName("jg.b(I)V")
    public void method4608() {
        this.field3779 = class183.method1711();
    }

    @ObfuscatedName("jg.s(B)V")
    public void method4615() {
        if (this.field3779 != -1L) {
            this.field3771 = class183.method1711() - this.field3779;
            this.field3779 = -1L;
        }
    }

    @ObfuscatedName("jg.r(II)V")
    public void method4610(int arg0) {
        this.field3772 = class183.method1711();
        this.field3776 = arg0;
    }

    @ObfuscatedName("jg.g(B)V")
    public void method4616() {
        if (this.field3772 != -1L) {
            this.field3773 = class183.method1711() - this.field3772;
            this.field3772 = -1L;
        }
        this.field3778++;
        this.field3770 = true;
    }

    @ObfuscatedName("jg.x(I)V")
    public void method4622() {
        this.field3770 = false;
        this.field3777 = 0;
    }

    @ObfuscatedName("jg.f(I)V")
    public void method4613() {
        this.method4616();
    }

    @ObfuscatedName("jg.u(Lfs;I)V")
    public void method4614(class181 arg0) {
        long var2 = this.field3771;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method2930((int) var4);
        long var6 = this.field3773;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method2930((int) var8);
        long var10 = this.field3775;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method2930((int) var12);
        arg0.method2930(this.field3776);
        arg0.method2930(this.field3777);
        arg0.method2930(this.field3778);
        arg0.method2930(this.field3774);
    }
}
