package deob;

@ObfuscatedName("d")
public final class class19 extends class93 {

    @ObfuscatedName("d.p")
    public int field286;

    @ObfuscatedName("d.j")
    public int field281;

    @ObfuscatedName("d.w")
    public int field282;

    @ObfuscatedName("d.h")
    public int field283;

    @ObfuscatedName("d.v")
    public int field284;

    @ObfuscatedName("d.k")
    public int field290;

    @ObfuscatedName("d.g")
    public class33 field295;

    @ObfuscatedName("d.n")
    public int field285 = 0;

    @ObfuscatedName("d.c")
    public int field288 = 0;

    @ObfuscatedName("d.o")
    public boolean field289 = false;

    public class19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field286 = arg0;
        this.field282 = arg1;
        this.field283 = arg2;
        this.field284 = arg3;
        this.field290 = arg4;
        this.field281 = arg5 + arg6;
        int var8 = class34.method7(this.field286).field904;
        if (var8 == -1) {
            this.field289 = true;
        } else {
            this.field289 = false;
            this.field295 = class33.method751(var8);
        }
    }

    @ObfuscatedName("d.p(II)V")
    public final void method168(int arg0) {
        if (this.field289) {
            return;
        }
        this.field288 += arg0;
        while (this.field288 > this.field295.field883[this.field285]) {
            this.field288 -= this.field295.field883[this.field285];
            this.field285++;
            if (this.field285 >= this.field295.field876.length) {
                this.field289 = true;
                break;
            }
        }
    }

    @ObfuscatedName("d.j(I)Ldm;")
    public final class111 method19() {
        class34 var1 = class34.method7(this.field286);
        class111 var2;
        if (this.field289) {
            var2 = var1.method713(-1);
        } else {
            var2 = var1.method713(this.field285);
        }
        return var2 == null ? null : var2;
    }
}
