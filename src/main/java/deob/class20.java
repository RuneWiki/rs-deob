package deob;

@ObfuscatedName("i")
public final class class20 extends class94 {

    @ObfuscatedName("i.d")
    public int field296;

    @ObfuscatedName("i.g")
    public int field279;

    @ObfuscatedName("i.a")
    public int field292;

    @ObfuscatedName("i.t")
    public int field281;

    @ObfuscatedName("i.f")
    public int field282;

    @ObfuscatedName("i.c")
    public int field283;

    @ObfuscatedName("i.p")
    public class34 field288;

    @ObfuscatedName("i.s")
    public int field285 = 0;

    @ObfuscatedName("i.k")
    public int field286 = 0;

    @ObfuscatedName("i.m")
    public boolean field287 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field296 = arg0;
        this.field292 = arg1;
        this.field281 = arg2;
        this.field282 = arg3;
        this.field283 = arg4;
        this.field279 = arg5 + arg6;
        int var8 = class35.method102(this.field296).field896;
        if (var8 == -1) {
            this.field287 = true;
        } else {
            this.field287 = false;
            this.field288 = class34.method136(var8);
        }
    }

    @ObfuscatedName("i.d(II)V")
    public final void method168(int arg0) {
        if (this.field287) {
            return;
        }
        this.field286 += arg0;
        while (this.field286 > this.field288.field877[this.field285]) {
            this.field286 -= this.field288.field877[this.field285];
            this.field285++;
            if (this.field285 >= this.field288.field871.length) {
                this.field287 = true;
                break;
            }
        }
    }

    @ObfuscatedName("i.g(I)Ldd;")
    public final class112 method18() {
        class35 var1 = class35.method102(this.field296);
        class112 var2;
        if (this.field287) {
            var2 = var1.method715(-1);
        } else {
            var2 = var1.method715(this.field285);
        }
        return var2 == null ? null : var2;
    }
}
