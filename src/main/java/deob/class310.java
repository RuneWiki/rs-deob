package deob;

@ObfuscatedName("kv")
public class class310 {

    @ObfuscatedName("kv.v")
    public long field3769 = -1L;

    @ObfuscatedName("kv.n")
    public long field3767 = -1L;

    @ObfuscatedName("kv.f")
    public boolean field3770 = false;

    @ObfuscatedName("kv.y")
    public long field3771 = 0L;

    @ObfuscatedName("kv.p")
    public long field3768 = 0L;

    @ObfuscatedName("kv.j")
    public long field3772 = 0L;

    @ObfuscatedName("kv.r")
    public int field3773 = 0;

    @ObfuscatedName("kv.b")
    public int field3774 = 0;

    @ObfuscatedName("kv.d")
    public int field3775 = 0;

    @ObfuscatedName("kv.s")
    public int field3776 = 0;

    @ObfuscatedName("kv.v(I)V")
    public void method5129() {
        this.field3769 = class380.method2744();
    }

    @ObfuscatedName("kv.n(B)V")
    public void method5117() {
        if (this.field3769 != -1L) {
            this.field3768 = class380.method2744() - this.field3769;
            this.field3769 = -1L;
        }
    }

    @ObfuscatedName("kv.f(II)V")
    public void method5118(int arg0) {
        this.field3767 = class380.method2744();
        this.field3773 = arg0;
    }

    @ObfuscatedName("kv.y(B)V")
    public void method5119() {
        if (this.field3767 != -1L) {
            this.field3771 = class380.method2744() - this.field3767;
            this.field3767 = -1L;
        }
        this.field3775++;
        this.field3770 = true;
    }

    @ObfuscatedName("kv.p(I)V")
    public void method5120() {
        this.field3770 = false;
        this.field3774 = 0;
    }

    @ObfuscatedName("kv.j(I)V")
    public void method5121() {
        this.method5119();
    }

    @ObfuscatedName("kv.r(Lnd;I)V")
    public void method5125(class383 arg0) {
        long var2 = this.field3768;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method6166((int) var4);
        long var6 = this.field3771;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method6166((int) var8);
        long var10 = this.field3772;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method6166((int) var12);
        arg0.method6166(this.field3773);
        arg0.method6166(this.field3774);
        arg0.method6166(this.field3775);
        arg0.method6166(this.field3776);
    }
}
