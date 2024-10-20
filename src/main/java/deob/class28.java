package deob;

@ObfuscatedName("au")
public final class class28 extends class80 {

    @ObfuscatedName("au.y")
    public class40 field669;

    @ObfuscatedName("au.k")
    public int field671;

    @ObfuscatedName("au.g")
    public int field670;

    @ObfuscatedName("au.n")
    public int field665;

    @ObfuscatedName("au.t")
    public int field664;

    @ObfuscatedName("au.e")
    public int field667;

    @ObfuscatedName("au.q")
    public int field668;

    @ObfuscatedName("au.z")
    public int field675 = 0;

    @ObfuscatedName("au.v")
    public int field666 = 0;

    @ObfuscatedName("au.b")
    public boolean field672 = false;

    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field671 = arg0;
        this.field665 = arg1;
        this.field664 = arg2;
        this.field667 = arg3;
        this.field668 = arg4;
        this.field670 = arg5 + arg6;
        int var8 = class41.method2077(this.field671).field968;
        if (var8 == -1) {
            this.field672 = true;
        } else {
            this.field672 = false;
            this.field669 = class40.method547(var8);
        }
    }

    @ObfuscatedName("au.y(II)V")
    public final void method600(int arg0) {
        if (this.field672) {
            return;
        }
        this.field666 += arg0;
        while (this.field666 > this.field669.field950[this.field675]) {
            this.field666 -= this.field669.field950[this.field675];
            this.field675++;
            if (this.field675 >= this.field669.field949.length) {
                this.field672 = true;
                break;
            }
        }
    }

    @ObfuscatedName("au.k(I)Lch;")
    public final class100 method16() {
        class41 var1 = class41.method2077(this.field671);
        class100 var2;
        if (this.field672) {
            var2 = var1.method799(-1);
        } else {
            var2 = var1.method799(this.field675);
        }
        return var2 == null ? null : var2;
    }
}
