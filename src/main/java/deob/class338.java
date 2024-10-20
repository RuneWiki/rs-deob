package deob;

@ObfuscatedName("lg")
public class class338 {

    @ObfuscatedName("lg.c")
    public long field4042 = -1L;

    @ObfuscatedName("lg.b")
    public long field4049 = -1L;

    @ObfuscatedName("lg.p")
    public boolean field4044 = false;

    @ObfuscatedName("lg.m")
    public long field4045 = 0L;

    @ObfuscatedName("lg.t")
    public long field4046 = 0L;

    @ObfuscatedName("lg.s")
    public long field4051 = 0L;

    @ObfuscatedName("lg.j")
    public int field4047 = 0;

    @ObfuscatedName("lg.w")
    public int field4048 = 0;

    @ObfuscatedName("lg.n")
    public int field4050 = 0;

    @ObfuscatedName("lg.r")
    public int field4043 = 0;

    @ObfuscatedName("lg.c(I)V")
    public void method5683() {
        this.field4042 = class416.method5860();
    }

    @ObfuscatedName("lg.b(I)V")
    public void method5661() {
        if (this.field4042 != -1L) {
            this.field4046 = class416.method5860() - this.field4042;
            this.field4042 = -1L;
        }
    }

    @ObfuscatedName("lg.p(II)V")
    public void method5662(int arg0) {
        this.field4049 = class416.method5860();
        this.field4047 = arg0;
    }

    @ObfuscatedName("lg.m(I)V")
    public void method5664() {
        if (this.field4049 != -1L) {
            this.field4045 = class416.method5860() - this.field4049;
            this.field4049 = -1L;
        }
        this.field4050++;
        this.field4044 = true;
    }

    @ObfuscatedName("lg.t(I)V")
    public void method5668() {
        this.field4044 = false;
        this.field4048 = 0;
    }

    @ObfuscatedName("lg.s(I)V")
    public void method5674() {
        this.method5664();
    }

    @ObfuscatedName("lg.j(Lpi;I)V")
    public void method5666(class419 arg0) {
        long var2 = this.field4046;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method6654((int) var4);
        long var6 = this.field4045;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method6654((int) var8);
        long var10 = this.field4051;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method6654((int) var12);
        arg0.method6654(this.field4047);
        arg0.method6654(this.field4048);
        arg0.method6654(this.field4050);
        arg0.method6654(this.field4043);
    }
}
