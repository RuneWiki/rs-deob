package deob;

@ObfuscatedName("k")
public final class class20 extends class94 {

    @ObfuscatedName("k.p")
    public int field275;

    @ObfuscatedName("k.l")
    public int field280;

    @ObfuscatedName("k.d")
    public int field276;

    @ObfuscatedName("k.x")
    public int field278;

    @ObfuscatedName("k.o")
    public int field277;

    @ObfuscatedName("k.a")
    public int field279;

    @ObfuscatedName("k.w")
    public class34 field274;

    @ObfuscatedName("k.i")
    public int field281 = 0;

    @ObfuscatedName("k.y")
    public int field282 = 0;

    @ObfuscatedName("k.m")
    public boolean field283 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field275 = arg0;
        this.field276 = arg1;
        this.field277 = arg2;
        this.field278 = arg3;
        this.field279 = arg4;
        this.field280 = arg5 + arg6;
        int var8 = class35.method144(this.field275).field893;
        if (var8 == -1) {
            this.field283 = true;
        } else {
            this.field283 = false;
            this.field274 = class34.method93(var8);
        }
    }

    @ObfuscatedName("k.p(II)V")
    public final void method161(int arg0) {
        if (this.field283) {
            return;
        }
        this.field282 += arg0;
        while (this.field282 > this.field274.field871[this.field281]) {
            this.field282 -= this.field274.field871[this.field281];
            this.field281++;
            if (this.field281 >= this.field274.field869.length) {
                this.field283 = true;
                break;
            }
        }
    }

    @ObfuscatedName("k.l(I)Ldl;")
    public final class112 method9() {
        class35 var1 = class35.method144(this.field275);
        class112 var2;
        if (this.field283) {
            var2 = var1.method747(-1);
        } else {
            var2 = var1.method747(this.field281);
        }
        return var2 == null ? null : var2;
    }
}
