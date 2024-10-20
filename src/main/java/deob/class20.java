package deob;

@ObfuscatedName("k")
public final class class20 extends class95 {

    @ObfuscatedName("k.i")
    public int field289;

    @ObfuscatedName("k.b")
    public int field284;

    @ObfuscatedName("k.r")
    public int field285;

    @ObfuscatedName("k.l")
    public int field286;

    @ObfuscatedName("k.s")
    public int field287;

    @ObfuscatedName("k.d")
    public int field288;

    @ObfuscatedName("k.e")
    public class35 field298;

    @ObfuscatedName("k.u")
    public int field290 = 0;

    @ObfuscatedName("k.q")
    public int field291 = 0;

    @ObfuscatedName("k.o")
    public boolean field292 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field289 = arg0;
        this.field285 = arg1;
        this.field286 = arg2;
        this.field287 = arg3;
        this.field288 = arg4;
        this.field284 = arg5 + arg6;
        int var8 = Statics.method623(this.field289).field913;
        if (var8 == -1) {
            this.field292 = true;
        } else {
            this.field292 = false;
            this.field298 = class35.method708(var8);
        }
    }

    @ObfuscatedName("k.i(II)V")
    public final void method189(int arg0) {
        if (this.field292) {
            return;
        }
        this.field291 += arg0;
        while (this.field291 > this.field298.field890[this.field290]) {
            this.field291 -= this.field298.field890[this.field290];
            this.field290++;
            if (this.field290 >= this.field298.field901.length) {
                this.field292 = true;
                break;
            }
        }
    }

    @ObfuscatedName("k.b(I)Ldt;")
    public final class113 method26() {
        class36 var1 = Statics.method623(this.field289);
        class113 var2;
        if (this.field292) {
            var2 = var1.method756(-1);
        } else {
            var2 = var1.method756(this.field290);
        }
        return var2 == null ? null : var2;
    }
}
