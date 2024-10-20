package deob;

@ObfuscatedName("nr")
public class class375 {

    @ObfuscatedName("nr.a")
    public long field4402 = -1L;

    @ObfuscatedName("nr.f")
    public long field4399 = -1L;

    @ObfuscatedName("nr.c")
    public boolean field4400 = false;

    @ObfuscatedName("nr.x")
    public long field4401 = 0L;

    @ObfuscatedName("nr.h")
    public long field4398 = 0L;

    @ObfuscatedName("nr.j")
    public long field4403 = 0L;

    @ObfuscatedName("nr.y")
    public int field4404 = 0;

    @ObfuscatedName("nr.d")
    public int field4406 = 0;

    @ObfuscatedName("nr.n")
    public int field4405 = 0;

    @ObfuscatedName("nr.r")
    public int field4407 = 0;

    @ObfuscatedName("nr.a(B)V")
    public void method6581() {
        this.field4402 = class280.method2629();
    }

    @ObfuscatedName("nr.f(I)V")
    public void method6582() {
        if (this.field4402 != -1L) {
            this.field4398 = class280.method2629() - this.field4402;
            this.field4402 = -1L;
        }
    }

    @ObfuscatedName("nr.c(IS)V")
    public void method6595(int arg0) {
        this.field4399 = class280.method2629();
        this.field4404 = arg0;
    }

    @ObfuscatedName("nr.x(I)V")
    public void method6598() {
        if (this.field4399 != -1L) {
            this.field4401 = class280.method2629() - this.field4399;
            this.field4399 = -1L;
        }
        this.field4405++;
        this.field4400 = true;
    }

    @ObfuscatedName("nr.h(I)V")
    public void method6584() {
        this.field4400 = false;
        this.field4406 = 0;
    }

    @ObfuscatedName("nr.j(B)V")
    public void method6585() {
        this.method6598();
    }

    @ObfuscatedName("nr.y(Lqr;I)V")
    public void method6586(class464 arg0) {
        method4594(arg0, this.field4398);
        method4594(arg0, this.field4401);
        method4594(arg0, this.field4403);
        arg0.method7775(this.field4404);
        arg0.method7775(this.field4406);
        arg0.method7775(this.field4405);
        arg0.method7775(this.field4407);
    }

    @ObfuscatedName("ii.d(Lqr;J)V")
    public static void method4594(class464 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method7775((int) var3);
    }
}
