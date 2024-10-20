package deob;

@ObfuscatedName("d")
public final class class20 extends class94 {

    @ObfuscatedName("d.l")
    public int field291;

    @ObfuscatedName("d.b")
    public int field281;

    @ObfuscatedName("d.o")
    public int field295;

    @ObfuscatedName("d.w")
    public int field283;

    @ObfuscatedName("d.r")
    public int field284;

    @ObfuscatedName("d.k")
    public int field285;

    @ObfuscatedName("d.z")
    public class34 field286;

    @ObfuscatedName("d.g")
    public int field292 = 0;

    @ObfuscatedName("d.n")
    public int field288 = 0;

    @ObfuscatedName("d.j")
    public boolean field289 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field291 = arg0;
        this.field295 = arg1;
        this.field283 = arg2;
        this.field284 = arg3;
        this.field285 = arg4;
        this.field281 = arg5 + arg6;
        int var8 = class35.method2114(this.field291).field898;
        if (var8 == -1) {
            this.field289 = true;
        } else {
            this.field289 = false;
            this.field286 = class34.method2198(var8);
        }
    }

    @ObfuscatedName("d.l(IS)V")
    public final void method171(int arg0) {
        if (this.field289) {
            return;
        }
        this.field288 += arg0;
        while (this.field288 > this.field286.field877[this.field292]) {
            this.field288 -= this.field286.field877[this.field292];
            this.field292++;
            if (this.field292 >= this.field286.field872.length) {
                this.field289 = true;
                break;
            }
        }
    }

    @ObfuscatedName("d.b(I)Ldt;")
    public final class112 method11() {
        class35 var1 = class35.method2114(this.field291);
        class112 var2;
        if (this.field289) {
            var2 = var1.method742(-1);
        } else {
            var2 = var1.method742(this.field292);
        }
        return var2 == null ? null : var2;
    }
}
