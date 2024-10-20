package deob;

@ObfuscatedName("nh")
public class class378 {

    @ObfuscatedName("nh.h")
    public long field4459 = -1L;

    @ObfuscatedName("nh.e")
    public long field4457 = -1L;

    @ObfuscatedName("nh.v")
    public boolean field4453 = false;

    @ObfuscatedName("nh.x")
    public long field4451 = 0L;

    @ObfuscatedName("nh.m")
    public long field4455 = 0L;

    @ObfuscatedName("nh.q")
    public long field4456 = 0L;

    @ObfuscatedName("nh.f")
    public int field4454 = 0;

    @ObfuscatedName("nh.r")
    public int field4458 = 0;

    @ObfuscatedName("nh.u")
    public int field4452 = 0;

    @ObfuscatedName("nh.b")
    public int field4460 = 0;

    @ObfuscatedName("nh.h(S)V")
    public void method6712() {
        this.field4459 = Statics.method1118();
    }

    @ObfuscatedName("nh.e(B)V")
    public void method6690() {
        if (this.field4459 != -1L) {
            this.field4455 = Statics.method1118() - this.field4459;
            this.field4459 = -1L;
        }
    }

    @ObfuscatedName("nh.v(IB)V")
    public void method6691(int arg0) {
        this.field4457 = Statics.method1118();
        this.field4454 = arg0;
    }

    @ObfuscatedName("nh.x(I)V")
    public void method6692() {
        if (this.field4457 != -1L) {
            this.field4451 = Statics.method1118() - this.field4457;
            this.field4457 = -1L;
        }
        this.field4452++;
        this.field4453 = true;
    }

    @ObfuscatedName("nh.m(I)V")
    public void method6693() {
        this.field4453 = false;
        this.field4458 = 0;
    }

    @ObfuscatedName("nh.q(I)V")
    public void method6688() {
        this.method6692();
    }

    @ObfuscatedName("nh.f(Lqy;B)V")
    public void method6695(class467 arg0) {
        long var2 = this.field4455;
        long var4 = var2 / 10L;
        if (var4 < 0L) {
            var4 = 0L;
        } else if (var4 > 65535L) {
            var4 = 65535L;
        }
        arg0.method7776((int) var4);
        long var6 = this.field4451;
        long var8 = var6 / 10L;
        if (var8 < 0L) {
            var8 = 0L;
        } else if (var8 > 65535L) {
            var8 = 65535L;
        }
        arg0.method7776((int) var8);
        long var10 = this.field4456;
        long var12 = var10 / 10L;
        if (var12 < 0L) {
            var12 = 0L;
        } else if (var12 > 65535L) {
            var12 = 65535L;
        }
        arg0.method7776((int) var12);
        arg0.method7776(this.field4454);
        arg0.method7776(this.field4458);
        arg0.method7776(this.field4452);
        arg0.method7776(this.field4460);
    }
}
