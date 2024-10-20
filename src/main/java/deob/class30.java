package deob;

@ObfuscatedName("af")
public final class class30 extends class85 {

    @ObfuscatedName("af.i")
    public int field691;

    @ObfuscatedName("af.v")
    public int field697;

    @ObfuscatedName("af.r")
    public int field694;

    @ObfuscatedName("af.n")
    public int field692;

    @ObfuscatedName("af.x")
    public int field693;

    @ObfuscatedName("af.q")
    public int field702;

    @ObfuscatedName("af.h")
    public class43 field695;

    @ObfuscatedName("af.d")
    public int field690 = 0;

    @ObfuscatedName("af.c")
    public int field696 = 0;

    @ObfuscatedName("af.y")
    public boolean field698 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field691 = arg0;
        this.field694 = arg1;
        this.field692 = arg2;
        this.field693 = arg3;
        this.field702 = arg4;
        this.field697 = arg5 + arg6;
        int var8 = class44.method2267(this.field691).field1009;
        if (var8 == -1) {
            this.field698 = true;
        } else {
            this.field698 = false;
            this.field695 = class43.method2299(var8);
        }
    }

    @ObfuscatedName("af.i(II)V")
    public final void method674(int arg0) {
        if (this.field698) {
            return;
        }
        this.field696 += arg0;
        while (this.field696 > this.field695.field985[this.field690]) {
            this.field696 -= this.field695.field985[this.field690];
            this.field690++;
            if (this.field690 >= this.field695.field983.length) {
                this.field698 = true;
                break;
            }
        }
    }

    @ObfuscatedName("af.r(I)Ldj;")
    public final class105 method18() {
        class44 var1 = class44.method2267(this.field691);
        class105 var2;
        if (this.field698) {
            var2 = var1.method900(-1);
        } else {
            var2 = var1.method900(this.field690);
        }
        return var2 == null ? null : var2;
    }
}
