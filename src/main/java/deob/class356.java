package deob;

@ObfuscatedName("mn")
public class class356 {

    @ObfuscatedName("mn.o")
    public long field4244 = -1L;

    @ObfuscatedName("mn.q")
    public long field4235 = -1L;

    @ObfuscatedName("mn.l")
    public boolean field4236 = false;

    @ObfuscatedName("mn.k")
    public long field4234 = 0L;

    @ObfuscatedName("mn.a")
    public long field4238 = 0L;

    @ObfuscatedName("mn.m")
    public long field4239 = 0L;

    @ObfuscatedName("mn.p")
    public int field4243 = 0;

    @ObfuscatedName("mn.s")
    public int field4241 = 0;

    @ObfuscatedName("mn.r")
    public int field4242 = 0;

    @ObfuscatedName("mn.v")
    public int field4237 = 0;

    @ObfuscatedName("mn.o(I)V")
    public void method5878() {
        this.field4244 = class270.method2485();
    }

    @ObfuscatedName("mn.q(I)V")
    public void method5879() {
        if (this.field4244 != -1L) {
            this.field4238 = class270.method2485() - this.field4244;
            this.field4244 = -1L;
        }
    }

    @ObfuscatedName("mn.l(II)V")
    public void method5873(int arg0) {
        this.field4235 = class270.method2485();
        this.field4243 = arg0;
    }

    @ObfuscatedName("mn.k(I)V")
    public void method5874() {
        if (this.field4235 != -1L) {
            this.field4234 = class270.method2485() - this.field4235;
            this.field4235 = -1L;
        }
        this.field4242++;
        this.field4236 = true;
    }

    @ObfuscatedName("mn.a(I)V")
    public void method5875() {
        this.field4236 = false;
        this.field4241 = 0;
    }

    @ObfuscatedName("mn.m(I)V")
    public void method5876() {
        this.method5874();
    }

    @ObfuscatedName("mn.p(Lpx;I)V")
    public void method5887(class440 arg0) {
        long var2 = this.field4238;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method6877((int) var4);
        long var6 = this.field4234;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method6877((int) var8);
        long var10 = this.field4239;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method6877((int) var12);
        arg0.method6877(this.field4243);
        arg0.method6877(this.field4241);
        arg0.method6877(this.field4242);
        arg0.method6877(this.field4237);
    }
}
