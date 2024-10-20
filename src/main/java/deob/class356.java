package deob;

@ObfuscatedName("mt")
public class class356 {

    @ObfuscatedName("mt.s")
    public long field4229 = -1L;

    @ObfuscatedName("mt.h")
    public long field4230 = -1L;

    @ObfuscatedName("mt.w")
    public boolean field4224 = false;

    @ObfuscatedName("mt.v")
    public long field4226 = 0L;

    @ObfuscatedName("mt.c")
    public long field4231 = 0L;

    @ObfuscatedName("mt.q")
    public long field4228 = 0L;

    @ObfuscatedName("mt.i")
    public int field4225 = 0;

    @ObfuscatedName("mt.k")
    public int field4227 = 0;

    @ObfuscatedName("mt.o")
    public int field4223 = 0;

    @ObfuscatedName("mt.n")
    public int field4232 = 0;

    @ObfuscatedName("mt.s(I)V")
    public void method5856() {
        this.field4229 = class270.method3146();
    }

    @ObfuscatedName("mt.h(I)V")
    public void method5867() {
        if (this.field4229 != -1L) {
            this.field4231 = class270.method3146() - this.field4229;
            this.field4229 = -1L;
        }
    }

    @ObfuscatedName("mt.w(IB)V")
    public void method5857(int arg0) {
        this.field4230 = class270.method3146();
        this.field4225 = arg0;
    }

    @ObfuscatedName("mt.v(B)V")
    public void method5858() {
        if (this.field4230 != -1L) {
            this.field4226 = class270.method3146() - this.field4230;
            this.field4230 = -1L;
        }
        this.field4223++;
        this.field4224 = true;
    }

    @ObfuscatedName("mt.c(I)V")
    public void method5860() {
        this.field4224 = false;
        this.field4227 = 0;
    }

    @ObfuscatedName("mt.q(I)V")
    public void method5877() {
        this.method5858();
    }

    @ObfuscatedName("mt.i(Lqr;I)V")
    public void method5876(class444 arg0) {
        method3923(arg0, this.field4231);
        method3923(arg0, this.field4226);
        method3923(arg0, this.field4228);
        arg0.method6913(this.field4225);
        arg0.method6913(this.field4227);
        arg0.method6913(this.field4223);
        arg0.method6913(this.field4232);
    }

    @ObfuscatedName("hl.k(Lqr;J)V")
    public static void method3923(class444 arg0, long arg1) {
        long var3 = arg1 / 10L;
        if (var3 < 0L) {
            var3 = 0L;
        } else if (var3 > 65535L) {
            var3 = 65535L;
        }
        arg0.method6913((int) var3);
    }
}
