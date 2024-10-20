package deob;

@ObfuscatedName("s")
public final class class20 extends class94 {

    @ObfuscatedName("s.t")
    public int field320;

    @ObfuscatedName("s.l")
    public int field305;

    @ObfuscatedName("s.c")
    public int field306;

    @ObfuscatedName("s.d")
    public int field304;

    @ObfuscatedName("s.b")
    public int field318;

    @ObfuscatedName("s.i")
    public int field309;

    @ObfuscatedName("s.p")
    public class34 field314;

    @ObfuscatedName("s.y")
    public int field308 = 0;

    @ObfuscatedName("s.u")
    public int field312 = 0;

    @ObfuscatedName("s.z")
    public boolean field313 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field320 = arg0;
        this.field306 = arg1;
        this.field304 = arg2;
        this.field318 = arg3;
        this.field309 = arg4;
        this.field305 = arg5 + arg6;
        int var8 = class35.method711(this.field320).field925;
        if (var8 == -1) {
            this.field313 = true;
        } else {
            this.field313 = false;
            this.field314 = Statics.method31(var8);
        }
    }

    @ObfuscatedName("s.t(IB)V")
    public final void method181(int arg0) {
        if (this.field313) {
            return;
        }
        this.field312 += arg0;
        while (this.field312 > this.field314.field900[this.field308]) {
            this.field312 -= this.field314.field900[this.field308];
            this.field308++;
            if (this.field308 >= this.field314.field903.length) {
                this.field313 = true;
                break;
            }
        }
    }

    @ObfuscatedName("s.l(I)Ldk;")
    public final class112 method18() {
        class35 var1 = class35.method711(this.field320);
        class112 var2;
        if (this.field313) {
            var2 = var1.method773(-1);
        } else {
            var2 = var1.method773(this.field308);
        }
        return var2 == null ? null : var2;
    }
}
