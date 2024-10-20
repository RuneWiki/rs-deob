package deob;

@ObfuscatedName("v")
public final class class19 extends class93 {

    @ObfuscatedName("v.u")
    public int field303;

    @ObfuscatedName("v.k")
    public int field287;

    @ObfuscatedName("v.x")
    public int field291;

    @ObfuscatedName("v.m")
    public int field289;

    @ObfuscatedName("v.n")
    public int field292;

    @ObfuscatedName("v.q")
    public int field295;

    @ObfuscatedName("v.a")
    public class33 field293;

    @ObfuscatedName("v.g")
    public int field294 = 0;

    @ObfuscatedName("v.j")
    public int field290 = 0;

    @ObfuscatedName("v.l")
    public boolean field296 = false;

    public class19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field303 = arg0;
        this.field289 = arg1;
        this.field292 = arg2;
        this.field291 = arg3;
        this.field295 = arg4;
        this.field287 = arg5 + arg6;
        int var8 = class34.method203(this.field303).field904;
        if (var8 == -1) {
            this.field296 = true;
        } else {
            this.field296 = false;
            this.field293 = Statics.method147(var8);
        }
    }

    @ObfuscatedName("v.u(II)V")
    public final void method167(int arg0) {
        if (this.field296) {
            return;
        }
        this.field290 += arg0;
        while (this.field290 > this.field293.field878[this.field294]) {
            this.field290 -= this.field293.field878[this.field294];
            this.field294++;
            if (this.field294 >= this.field293.field884.length) {
                this.field296 = true;
                break;
            }
        }
    }

    @ObfuscatedName("v.k(B)Ldd;")
    public final class111 method30() {
        class34 var1 = class34.method203(this.field303);
        class111 var2;
        if (this.field296) {
            var2 = var1.method711(-1);
        } else {
            var2 = var1.method711(this.field294);
        }
        return var2 == null ? null : var2;
    }
}
