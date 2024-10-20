package deob;

@ObfuscatedName("y")
public final class class19 extends class93 {

    @ObfuscatedName("y.g")
    public int field291;

    @ObfuscatedName("y.e")
    public int field276;

    @ObfuscatedName("y.n")
    public int field282;

    @ObfuscatedName("y.j")
    public int field278;

    @ObfuscatedName("y.i")
    public int field279;

    @ObfuscatedName("y.o")
    public int field281;

    @ObfuscatedName("y.l")
    public class33 field275;

    @ObfuscatedName("y.p")
    public int field293 = 0;

    @ObfuscatedName("y.t")
    public int field283 = 0;

    @ObfuscatedName("y.w")
    public boolean field284 = false;

    public class19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field291 = arg0;
        this.field282 = arg1;
        this.field278 = arg2;
        this.field279 = arg3;
        this.field281 = arg4;
        this.field276 = arg5 + arg6;
        int var8 = class34.method895(this.field291).field894;
        if (var8 == -1) {
            this.field284 = true;
        } else {
            this.field284 = false;
            this.field275 = class33.method224(var8);
        }
    }

    @ObfuscatedName("y.g(IB)V")
    public final void method155(int arg0) {
        if (this.field284) {
            return;
        }
        this.field283 += arg0;
        while (this.field283 > this.field275.field862[this.field293]) {
            this.field283 -= this.field275.field862[this.field293];
            this.field293++;
            if (this.field293 >= this.field275.field863.length) {
                this.field284 = true;
                break;
            }
        }
    }

    @ObfuscatedName("y.e(I)Ldk;")
    public final class111 method19() {
        class34 var1 = class34.method895(this.field291);
        class111 var2;
        if (this.field284) {
            var2 = var1.method749(-1);
        } else {
            var2 = var1.method749(this.field293);
        }
        return var2 == null ? null : var2;
    }
}
