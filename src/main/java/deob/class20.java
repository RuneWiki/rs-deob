package deob;

@ObfuscatedName("l")
public final class class20 extends class94 {

    @ObfuscatedName("l.j")
    public int field297;

    @ObfuscatedName("l.r")
    public int field289;

    @ObfuscatedName("l.v")
    public int field281;

    @ObfuscatedName("l.p")
    public int field279;

    @ObfuscatedName("l.e")
    public int field283;

    @ObfuscatedName("l.d")
    public int field285;

    @ObfuscatedName("l.y")
    public class34 field295;

    @ObfuscatedName("l.x")
    public int field286 = 0;

    @ObfuscatedName("l.t")
    public int field284 = 0;

    @ObfuscatedName("l.i")
    public boolean field288 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field297 = arg0;
        this.field281 = arg1;
        this.field279 = arg2;
        this.field283 = arg3;
        this.field285 = arg4;
        this.field289 = arg5 + arg6;
        int var8 = class35.method233(this.field297).field900;
        if (var8 == -1) {
            this.field288 = true;
        } else {
            this.field288 = false;
            this.field295 = class34.method2349(var8);
        }
    }

    @ObfuscatedName("l.j(II)V")
    public final void method189(int arg0) {
        if (this.field288) {
            return;
        }
        this.field284 += arg0;
        while (this.field284 > this.field295.field878[this.field286]) {
            this.field284 -= this.field295.field878[this.field286];
            this.field286++;
            if (this.field286 >= this.field295.field876.length) {
                this.field288 = true;
                break;
            }
        }
    }

    @ObfuscatedName("l.r(B)Ldt;")
    public final class112 method18() {
        class35 var1 = class35.method233(this.field297);
        class112 var2;
        if (this.field288) {
            var2 = var1.method736(-1);
        } else {
            var2 = var1.method736(this.field286);
        }
        return var2 == null ? null : var2;
    }
}
