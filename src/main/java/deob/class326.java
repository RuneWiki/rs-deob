package deob;

@ObfuscatedName("lb")
public class class326 {

    @ObfuscatedName("lb.l")
    public long field3912 = -1L;

    @ObfuscatedName("lb.q")
    public long field3905 = -1L;

    @ObfuscatedName("lb.f")
    public boolean field3906 = false;

    @ObfuscatedName("lb.j")
    public long field3910 = 0L;

    @ObfuscatedName("lb.m")
    public long field3908 = 0L;

    @ObfuscatedName("lb.k")
    public long field3915 = 0L;

    @ObfuscatedName("lb.t")
    public int field3909 = 0;

    @ObfuscatedName("lb.a")
    public int field3911 = 0;

    @ObfuscatedName("lb.e")
    public int field3907 = 0;

    @ObfuscatedName("lb.i")
    public int field3913 = 0;

    @ObfuscatedName("lb.l(B)V")
    public void method5409() {
        this.field3912 = class398.method2299();
    }

    @ObfuscatedName("lb.q(B)V")
    public void method5410() {
        if (this.field3912 != -1L) {
            this.field3908 = class398.method2299() - this.field3912;
            this.field3912 = -1L;
        }
    }

    @ObfuscatedName("lb.f(II)V")
    public void method5411(int arg0) {
        this.field3905 = class398.method2299();
        this.field3909 = arg0;
    }

    @ObfuscatedName("lb.j(B)V")
    public void method5412() {
        if (this.field3905 != -1L) {
            this.field3910 = class398.method2299() - this.field3905;
            this.field3905 = -1L;
        }
        this.field3907++;
        this.field3906 = true;
    }

    @ObfuscatedName("lb.m(I)V")
    public void method5413() {
        this.field3906 = false;
        this.field3911 = 0;
    }

    @ObfuscatedName("lb.k(I)V")
    public void method5414() {
        this.method5412();
    }

    @ObfuscatedName("lb.t(Lot;I)V")
    public void method5431(class401 arg0) {
        long var2 = this.field3908;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method6256((int) var4);
        long var6 = this.field3910;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method6256((int) var8);
        long var10 = this.field3915;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method6256((int) var12);
        arg0.method6256(this.field3909);
        arg0.method6256(this.field3911);
        arg0.method6256(this.field3907);
        arg0.method6256(this.field3913);
    }
}
