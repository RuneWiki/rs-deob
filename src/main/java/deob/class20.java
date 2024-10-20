package deob;

@ObfuscatedName("x")
public final class class20 extends class94 {

    @ObfuscatedName("x.g")
    public int field291;

    @ObfuscatedName("x.m")
    public int field275;

    @ObfuscatedName("x.v")
    public int field276;

    @ObfuscatedName("x.r")
    public int field277;

    @ObfuscatedName("x.n")
    public int field278;

    @ObfuscatedName("x.i")
    public int field279;

    @ObfuscatedName("x.s")
    public class34 field280;

    @ObfuscatedName("x.w")
    public int field285 = 0;

    @ObfuscatedName("x.d")
    public int field282 = 0;

    @ObfuscatedName("x.t")
    public boolean field283 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field291 = arg0;
        this.field276 = arg1;
        this.field277 = arg2;
        this.field278 = arg3;
        this.field279 = arg4;
        this.field275 = arg5 + arg6;
        int var8 = class35.method226(this.field291).field893;
        if (var8 == -1) {
            this.field283 = true;
        } else {
            this.field283 = false;
            this.field280 = class34.method1536(var8);
        }
    }

    @ObfuscatedName("x.g(II)V")
    public final void method151(int arg0) {
        if (this.field283) {
            return;
        }
        this.field282 += arg0;
        while (this.field282 > this.field280.field872[this.field285]) {
            this.field282 -= this.field280.field872[this.field285];
            this.field285++;
            if (this.field285 >= this.field280.field870.length) {
                this.field283 = true;
                break;
            }
        }
    }

    @ObfuscatedName("x.m(B)Ldf;")
    public final class112 method30() {
        class35 var1 = class35.method226(this.field291);
        class112 var2;
        if (this.field283) {
            var2 = var1.method738(-1);
        } else {
            var2 = var1.method738(this.field285);
        }
        return var2 == null ? null : var2;
    }
}
