package deob;

@ObfuscatedName("g")
public final class class19 extends class93 {

    @ObfuscatedName("g.c")
    public int field286;

    @ObfuscatedName("g.j")
    public int field283;

    @ObfuscatedName("g.f")
    public int field282;

    @ObfuscatedName("g.y")
    public class33 field288;

    @ObfuscatedName("g.x")
    public int field291;

    @ObfuscatedName("g.e")
    public int field285;

    @ObfuscatedName("g.m")
    public int field287;

    @ObfuscatedName("g.s")
    public int field289 = 0;

    @ObfuscatedName("g.p")
    public int field297 = 0;

    @ObfuscatedName("g.w")
    public boolean field294 = false;

    public class19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field286 = arg0;
        this.field282 = arg1;
        this.field285 = arg2;
        this.field291 = arg3;
        this.field287 = arg4;
        this.field283 = arg5 + arg6;
        int var8 = class34.method135(this.field286).field895;
        if (var8 == -1) {
            this.field294 = true;
        } else {
            this.field294 = false;
            this.field288 = class33.method2589(var8);
        }
    }

    @ObfuscatedName("g.c(II)V")
    public final void method162(int arg0) {
        if (this.field294) {
            return;
        }
        this.field297 += arg0;
        while (this.field297 > this.field288.field864[this.field289]) {
            this.field297 -= this.field288.field864[this.field289];
            this.field289++;
            if (this.field289 >= this.field288.field857.length) {
                this.field294 = true;
                break;
            }
        }
    }

    @ObfuscatedName("g.j(B)Ldf;")
    public final class111 method18() {
        class34 var1 = class34.method135(this.field286);
        class111 var2;
        if (this.field294) {
            var2 = var1.method708(-1);
        } else {
            var2 = var1.method708(this.field289);
        }
        return var2 == null ? null : var2;
    }
}
