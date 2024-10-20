package deob;

@ObfuscatedName("n")
public final class class19 extends class93 {

    @ObfuscatedName("n.j")
    public int field285;

    @ObfuscatedName("n.y")
    public class33 field276;

    @ObfuscatedName("n.x")
    public int field277;

    @ObfuscatedName("n.z")
    public int field275;

    @ObfuscatedName("n.c")
    public int field271;

    @ObfuscatedName("n.e")
    public int field272;

    @ObfuscatedName("n.s")
    public int field273;

    @ObfuscatedName("n.i")
    public int field283 = 0;

    @ObfuscatedName("n.g")
    public int field281 = 0;

    @ObfuscatedName("n.q")
    public boolean field279 = false;

    public class19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field285 = arg0;
        this.field272 = arg1;
        this.field273 = arg2;
        this.field277 = arg3;
        this.field275 = arg4;
        this.field271 = arg5 + arg6;
        int var8 = class34.method564(this.field285).field901;
        if (var8 == -1) {
            this.field279 = true;
        } else {
            this.field279 = false;
            this.field276 = class33.method2614(var8);
        }
    }

    @ObfuscatedName("n.j(II)V")
    public final void method159(int arg0) {
        if (this.field279) {
            return;
        }
        this.field281 += arg0;
        while (this.field281 > this.field276.field863[this.field283]) {
            this.field281 -= this.field276.field863[this.field283];
            this.field283++;
            if (this.field283 >= this.field276.field861.length) {
                this.field279 = true;
                break;
            }
        }
    }

    @ObfuscatedName("n.y(B)Ldh;")
    public final class111 method13() {
        class34 var1 = class34.method564(this.field285);
        class111 var2;
        if (this.field279) {
            var2 = var1.method719(-1);
        } else {
            var2 = var1.method719(this.field283);
        }
        return var2 == null ? null : var2;
    }
}
