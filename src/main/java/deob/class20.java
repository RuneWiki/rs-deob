package deob;

@ObfuscatedName("s")
public final class class20 extends class94 {

    @ObfuscatedName("s.i")
    public int field312;

    @ObfuscatedName("s.p")
    public int field308;

    @ObfuscatedName("s.a")
    public int field302;

    @ObfuscatedName("s.l")
    public int field305;

    @ObfuscatedName("s.q")
    public int field303;

    @ObfuscatedName("s.b")
    public int field307;

    @ObfuscatedName("s.u")
    public class34 field306;

    @ObfuscatedName("s.d")
    public int field309 = 0;

    @ObfuscatedName("s.m")
    public int field310 = 0;

    @ObfuscatedName("s.v")
    public boolean field311 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field312 = arg0;
        this.field302 = arg1;
        this.field305 = arg2;
        this.field303 = arg3;
        this.field307 = arg4;
        this.field308 = arg5 + arg6;
        int var8 = class35.method37(this.field312).field914;
        if (var8 == -1) {
            this.field311 = true;
        } else {
            this.field311 = false;
            this.field306 = class34.method763(var8);
        }
    }

    @ObfuscatedName("s.i(IB)V")
    public final void method176(int arg0) {
        if (this.field311) {
            return;
        }
        this.field310 += arg0;
        while (this.field310 > this.field306.field892[this.field309]) {
            this.field310 -= this.field306.field892[this.field309];
            this.field309++;
            if (this.field309 >= this.field306.field890.length) {
                this.field311 = true;
                break;
            }
        }
    }

    @ObfuscatedName("s.p(I)Ldc;")
    public final class112 method26() {
        class35 var1 = class35.method37(this.field312);
        class112 var2;
        if (this.field311) {
            var2 = var1.method728(-1);
        } else {
            var2 = var1.method728(this.field309);
        }
        return var2 == null ? null : var2;
    }
}
