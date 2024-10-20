package deob;

@ObfuscatedName("mu")
public class class357 {

    @ObfuscatedName("mu.c")
    public long field4269 = -1L;

    @ObfuscatedName("mu.p")
    public long field4273 = -1L;

    @ObfuscatedName("mu.f")
    public boolean field4266 = false;

    @ObfuscatedName("mu.n")
    public long field4267 = 0L;

    @ObfuscatedName("mu.k")
    public long field4268 = 0L;

    @ObfuscatedName("mu.w")
    public long field4264 = 0L;

    @ObfuscatedName("mu.s")
    public int field4270 = 0;

    @ObfuscatedName("mu.q")
    public int field4271 = 0;

    @ObfuscatedName("mu.m")
    public int field4272 = 0;

    @ObfuscatedName("mu.x")
    public int field4265 = 0;

    @ObfuscatedName("mu.c(I)V")
    public void method6084() {
        this.field4269 = class271.method5624();
    }

    @ObfuscatedName("mu.p(I)V")
    public void method6089() {
        if (this.field4269 != -1L) {
            this.field4268 = class271.method5624() - this.field4269;
            this.field4269 = -1L;
        }
    }

    @ObfuscatedName("mu.f(II)V")
    public void method6086(int arg0) {
        this.field4273 = class271.method5624();
        this.field4270 = arg0;
    }

    @ObfuscatedName("mu.n(B)V")
    public void method6083() {
        if (this.field4273 != -1L) {
            this.field4267 = class271.method5624() - this.field4273;
            this.field4273 = -1L;
        }
        this.field4272++;
        this.field4266 = true;
    }

    @ObfuscatedName("mu.k(B)V")
    public void method6106() {
        this.field4266 = false;
        this.field4271 = 0;
    }

    @ObfuscatedName("mu.w(I)V")
    public void method6107() {
        this.method6083();
    }

    @ObfuscatedName("mu.s(Lqq;I)V")
    public void method6090(class445 arg0) {
        method637(arg0, this.field4268);
        method637(arg0, this.field4267);
        method637(arg0, this.field4264);
        arg0.method7286(this.field4270);
        arg0.method7286(this.field4271);
        arg0.method7286(this.field4272);
        arg0.method7286(this.field4265);
    }

    @ObfuscatedName("aa.q(Lqq;J)V")
    public static void method637(class445 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method7286((int) var3);
    }
}
