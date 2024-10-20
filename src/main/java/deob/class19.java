package deob;

@ObfuscatedName("q")
public final class class19 extends class93 {

    @ObfuscatedName("q.z")
    public int field287;

    @ObfuscatedName("q.h")
    public int field292;

    @ObfuscatedName("q.c")
    public int field283;

    @ObfuscatedName("q.p")
    public int field288;

    @ObfuscatedName("q.i")
    public int field285;

    @ObfuscatedName("q.v")
    public int field286;

    @ObfuscatedName("q.l")
    public class33 field296;

    @ObfuscatedName("q.m")
    public int field289 = 0;

    @ObfuscatedName("q.g")
    public int field290 = 0;

    @ObfuscatedName("q.t")
    public boolean field295 = false;

    public class19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field292 = arg0;
        this.field288 = arg1;
        this.field285 = arg2;
        this.field286 = arg3;
        this.field287 = arg4;
        this.field283 = arg5 + arg6;
        int var8 = Statics.method813(this.field292).field904;
        if (var8 == -1) {
            this.field295 = true;
        } else {
            this.field295 = false;
            this.field296 = class33.method2674(var8);
        }
    }

    @ObfuscatedName("q.z(II)V")
    public final void method166(int arg0) {
        if (this.field295) {
            return;
        }
        this.field290 += arg0;
        while (this.field290 > this.field296.field894[this.field289]) {
            this.field290 -= this.field296.field894[this.field289];
            this.field289++;
            if (this.field289 >= this.field296.field884.length) {
                this.field295 = true;
                break;
            }
        }
    }

    @ObfuscatedName("q.h(I)Ldh;")
    public final class111 method15() {
        class34 var1 = Statics.method813(this.field292);
        class111 var2;
        if (this.field295) {
            var2 = var1.method748(-1);
        } else {
            var2 = var1.method748(this.field289);
        }
        return var2 == null ? null : var2;
    }
}
