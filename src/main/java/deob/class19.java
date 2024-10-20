package deob;

@ObfuscatedName("i")
public final class class19 extends class93 {

    @ObfuscatedName("i.v")
    public int field275;

    @ObfuscatedName("i.f")
    public int field281;

    @ObfuscatedName("i.n")
    public int field276;

    @ObfuscatedName("i.c")
    public int field277;

    @ObfuscatedName("i.r")
    public int field278;

    @ObfuscatedName("i.k")
    public int field279;

    @ObfuscatedName("i.e")
    public class33 field280;

    @ObfuscatedName("i.q")
    public int field291 = 0;

    @ObfuscatedName("i.u")
    public int field282 = 0;

    @ObfuscatedName("i.s")
    public boolean field274 = false;

    public class19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field275 = arg0;
        this.field276 = arg1;
        this.field277 = arg2;
        this.field278 = arg3;
        this.field279 = arg4;
        this.field281 = arg5 + arg6;
        int var8 = class34.method239(this.field275).field885;
        if (var8 == -1) {
            this.field274 = true;
        } else {
            this.field274 = false;
            this.field280 = class33.method1401(var8);
        }
    }

    @ObfuscatedName("i.v(IB)V")
    public final void method153(int arg0) {
        if (this.field274) {
            return;
        }
        this.field282 += arg0;
        while (this.field282 > this.field280.field864[this.field291]) {
            this.field282 -= this.field280.field864[this.field291];
            this.field291++;
            if (this.field291 >= this.field280.field861.length) {
                this.field274 = true;
                break;
            }
        }
    }

    @ObfuscatedName("i.f(I)Ldf;")
    public final class111 method13() {
        class34 var1 = class34.method239(this.field275);
        class111 var2;
        if (this.field274) {
            var2 = var1.method743(-1);
        } else {
            var2 = var1.method743(this.field291);
        }
        return var2 == null ? null : var2;
    }
}
