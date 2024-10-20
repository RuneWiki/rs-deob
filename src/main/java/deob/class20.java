package deob;

@ObfuscatedName("m")
public final class class20 extends class94 {

    @ObfuscatedName("m.b")
    public int field307;

    @ObfuscatedName("m.c")
    public int field302;

    @ObfuscatedName("m.j")
    public int field303;

    @ObfuscatedName("m.i")
    public int field304;

    @ObfuscatedName("m.k")
    public int field305;

    @ObfuscatedName("m.q")
    public int field306;

    @ObfuscatedName("m.t")
    public class34 field311;

    @ObfuscatedName("m.v")
    public int field308 = 0;

    @ObfuscatedName("m.y")
    public int field309 = 0;

    @ObfuscatedName("m.w")
    public boolean field310 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field307 = arg0;
        this.field303 = arg1;
        this.field304 = arg2;
        this.field305 = arg3;
        this.field306 = arg4;
        this.field302 = arg5 + arg6;
        int var8 = class35.method216(this.field307).field909;
        if (var8 == -1) {
            this.field310 = true;
        } else {
            this.field310 = false;
            this.field311 = Statics.method61(var8);
        }
    }

    @ObfuscatedName("m.b(IB)V")
    public final void method184(int arg0) {
        if (this.field310) {
            return;
        }
        this.field309 += arg0;
        while (this.field309 > this.field311.field888[this.field308]) {
            this.field309 -= this.field311.field888[this.field308];
            this.field308++;
            if (this.field308 >= this.field311.field891.length) {
                this.field310 = true;
                break;
            }
        }
    }

    @ObfuscatedName("m.c(I)Ldr;")
    public final class112 method13() {
        class35 var1 = class35.method216(this.field307);
        class112 var2;
        if (this.field310) {
            var2 = var1.method731(-1);
        } else {
            var2 = var1.method731(this.field308);
        }
        return var2 == null ? null : var2;
    }
}
