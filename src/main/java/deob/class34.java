package deob;

@ObfuscatedName("al")
public final class class34 extends class90 {

    @ObfuscatedName("al.s")
    public int field744;

    @ObfuscatedName("al.c")
    public int field749;

    @ObfuscatedName("al.f")
    public int field743;

    @ObfuscatedName("al.h")
    public int field742;

    @ObfuscatedName("al.a")
    public int field745;

    @ObfuscatedName("al.g")
    public int field746;

    @ObfuscatedName("al.k")
    public class202 field748;

    @ObfuscatedName("al.u")
    public int field751 = 0;

    @ObfuscatedName("al.b")
    public int field741 = 0;

    @ObfuscatedName("al.x")
    public boolean field750 = false;

    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field744 = arg0;
        this.field743 = arg1;
        this.field742 = arg2;
        this.field745 = arg3;
        this.field746 = arg4;
        this.field749 = arg5 + arg6;
        int var8 = class191.method827(this.field744).field2802;
        if (var8 == -1) {
            this.field750 = true;
        } else {
            this.field750 = false;
            this.field748 = class202.method1914(var8);
        }
    }

    @ObfuscatedName("al.s(II)V")
    public final void method667(int arg0) {
        if (this.field750) {
            return;
        }
        this.field741 += arg0;
        while (this.field741 > this.field748.field3064[this.field751]) {
            this.field741 -= this.field748.field3064[this.field751];
            this.field751++;
            if (this.field751 >= this.field748.field3076.length) {
                this.field750 = true;
                break;
            }
        }
    }

    @ObfuscatedName("al.f(I)Lcz;")
    public final class83 method195() {
        class191 var1 = class191.method827(this.field744);
        class83 var2;
        if (this.field750) {
            var2 = var1.method3150(-1);
        } else {
            var2 = var1.method3150(this.field751);
        }
        return var2 == null ? null : var2;
    }
}
