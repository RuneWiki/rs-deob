package deob;

@ObfuscatedName("j")
public final class class20 extends class94 {

    @ObfuscatedName("j.p")
    public int field289;

    @ObfuscatedName("j.i")
    public int field286;

    @ObfuscatedName("j.o")
    public int field278;

    @ObfuscatedName("j.n")
    public int field279;

    @ObfuscatedName("j.l")
    public int field280;

    @ObfuscatedName("j.v")
    public int field281;

    @ObfuscatedName("j.g")
    public class34 field282;

    @ObfuscatedName("j.x")
    public int field277 = 0;

    @ObfuscatedName("j.c")
    public int field284 = 0;

    @ObfuscatedName("j.f")
    public boolean field288 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field289 = arg0;
        this.field278 = arg1;
        this.field279 = arg2;
        this.field280 = arg3;
        this.field281 = arg4;
        this.field286 = arg5 + arg6;
        int var8 = class35.method2756(this.field289).field908;
        if (var8 == -1) {
            this.field288 = true;
        } else {
            this.field288 = false;
            this.field282 = class34.method160(var8);
        }
    }

    @ObfuscatedName("j.p(IS)V")
    public final void method179(int arg0) {
        if (this.field288) {
            return;
        }
        this.field284 += arg0;
        while (this.field284 > this.field282.field882[this.field277]) {
            this.field284 -= this.field282.field882[this.field277];
            this.field277++;
            if (this.field277 >= this.field282.field881.length) {
                this.field288 = true;
                break;
            }
        }
    }

    @ObfuscatedName("j.i(I)Ldj;")
    public final class112 method21() {
        class35 var1 = class35.method2756(this.field289);
        class112 var2;
        if (this.field288) {
            var2 = var1.method780(-1);
        } else {
            var2 = var1.method780(this.field277);
        }
        return var2 == null ? null : var2;
    }
}
