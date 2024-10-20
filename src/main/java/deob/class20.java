package deob;

@ObfuscatedName("z")
public final class class20 extends class94 {

    @ObfuscatedName("z.a")
    public int field288;

    @ObfuscatedName("z.r")
    public int field275;

    @ObfuscatedName("z.u")
    public int field276;

    @ObfuscatedName("z.t")
    public int field277;

    @ObfuscatedName("z.k")
    public int field278;

    @ObfuscatedName("z.x")
    public int field279;

    @ObfuscatedName("z.v")
    public class34 field281;

    @ObfuscatedName("z.g")
    public int field284 = 0;

    @ObfuscatedName("z.n")
    public int field282 = 0;

    @ObfuscatedName("z.q")
    public boolean field283 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field288 = arg0;
        this.field276 = arg1;
        this.field277 = arg2;
        this.field278 = arg3;
        this.field279 = arg4;
        this.field275 = arg5 + arg6;
        int var8 = class35.method651(this.field288).field888;
        if (var8 == -1) {
            this.field283 = true;
        } else {
            this.field283 = false;
            this.field281 = class34.method30(var8);
        }
    }

    @ObfuscatedName("z.a(IB)V")
    public final void method144(int arg0) {
        if (this.field283) {
            return;
        }
        this.field282 += arg0;
        while (this.field282 > this.field281.field865[this.field284]) {
            this.field282 -= this.field281.field865[this.field284];
            this.field284++;
            if (this.field284 >= this.field281.field863.length) {
                this.field283 = true;
                break;
            }
        }
    }

    @ObfuscatedName("z.r(I)Ldw;")
    public final class112 method18() {
        class35 var1 = class35.method651(this.field288);
        class112 var2;
        if (this.field283) {
            var2 = var1.method686(-1);
        } else {
            var2 = var1.method686(this.field284);
        }
        return var2 == null ? null : var2;
    }
}
