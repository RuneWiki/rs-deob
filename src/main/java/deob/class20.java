package deob;

@ObfuscatedName("w")
public final class class20 extends class94 {

    @ObfuscatedName("w.j")
    public int field289;

    @ObfuscatedName("w.f")
    public int field287;

    @ObfuscatedName("w.o")
    public int field288;

    @ObfuscatedName("w.h")
    public int field297;

    @ObfuscatedName("w.u")
    public int field290;

    @ObfuscatedName("w.a")
    public int field291;

    @ObfuscatedName("w.q")
    public class34 field292;

    @ObfuscatedName("w.t")
    public int field293 = 0;

    @ObfuscatedName("w.n")
    public int field294 = 0;

    @ObfuscatedName("w.i")
    public boolean field286 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field289 = arg0;
        this.field288 = arg1;
        this.field297 = arg2;
        this.field290 = arg3;
        this.field291 = arg4;
        this.field287 = arg5 + arg6;
        int var8 = class35.method113(this.field289).field914;
        if (var8 == -1) {
            this.field286 = true;
        } else {
            this.field286 = false;
            this.field292 = class34.method612(var8);
        }
    }

    @ObfuscatedName("w.j(II)V")
    public final void method174(int arg0) {
        if (this.field286) {
            return;
        }
        this.field294 += arg0;
        while (this.field294 > this.field292.field881[this.field293]) {
            this.field294 -= this.field292.field881[this.field293];
            this.field293++;
            if (this.field293 >= this.field292.field879.length) {
                this.field286 = true;
                break;
            }
        }
    }

    @ObfuscatedName("w.f(B)Ldo;")
    public final class112 method19() {
        class35 var1 = class35.method113(this.field289);
        class112 var2;
        if (this.field286) {
            var2 = var1.method755(-1);
        } else {
            var2 = var1.method755(this.field293);
        }
        return var2 == null ? null : var2;
    }
}
