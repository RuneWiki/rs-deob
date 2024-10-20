package deob;

@ObfuscatedName("ms")
public class class355 {

    @ObfuscatedName("ms.c")
    public long field4230 = -1L;

    @ObfuscatedName("ms.v")
    public long field4223 = -1L;

    @ObfuscatedName("ms.q")
    public boolean field4224 = false;

    @ObfuscatedName("ms.f")
    public long field4226 = 0L;

    @ObfuscatedName("ms.j")
    public long field4225 = 0L;

    @ObfuscatedName("ms.e")
    public long field4227 = 0L;

    @ObfuscatedName("ms.g")
    public int field4231 = 0;

    @ObfuscatedName("ms.w")
    public int field4229 = 0;

    @ObfuscatedName("ms.y")
    public int field4228 = 0;

    @ObfuscatedName("ms.i")
    public int field4222 = 0;

    @ObfuscatedName("ms.c(I)V")
    public void method5938() {
        this.field4230 = class269.method2567();
    }

    @ObfuscatedName("ms.v(I)V")
    public void method5939() {
        if (this.field4230 != -1L) {
            this.field4225 = class269.method2567() - this.field4230;
            this.field4230 = -1L;
        }
    }

    @ObfuscatedName("ms.q(IB)V")
    public void method5957(int arg0) {
        this.field4223 = class269.method2567();
        this.field4231 = arg0;
    }

    @ObfuscatedName("ms.f(I)V")
    public void method5940() {
        if (this.field4223 != -1L) {
            this.field4226 = class269.method2567() - this.field4223;
            this.field4223 = -1L;
        }
        this.field4228++;
        this.field4224 = true;
    }

    @ObfuscatedName("ms.j(I)V")
    public void method5942() {
        this.field4224 = false;
        this.field4229 = 0;
    }

    @ObfuscatedName("ms.e(I)V")
    public void method5943() {
        this.method5940();
    }

    @ObfuscatedName("ms.g(Lqt;I)V")
    public void method5944(class443 arg0) {
        method3497(arg0, this.field4225);
        method3497(arg0, this.field4226);
        method3497(arg0, this.field4227);
        arg0.method7244(this.field4231);
        arg0.method7244(this.field4229);
        arg0.method7244(this.field4228);
        arg0.method7244(this.field4222);
    }

    @ObfuscatedName("gp.w(Lqt;J)V")
    public static void method3497(class443 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method7244((int) var3);
    }
}
