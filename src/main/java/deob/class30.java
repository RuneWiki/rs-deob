package deob;

@ObfuscatedName("al")
public final class class30 extends class85 {

    @ObfuscatedName("al.z")
    public int field673;

    @ObfuscatedName("al.q")
    public int field679;

    @ObfuscatedName("al.k")
    public int field667;

    @ObfuscatedName("al.f")
    public int field668;

    @ObfuscatedName("al.d")
    public int field669;

    @ObfuscatedName("al.l")
    public int field670;

    @ObfuscatedName("al.r")
    public class43 field672;

    @ObfuscatedName("al.g")
    public int field666 = 0;

    @ObfuscatedName("al.h")
    public int field674 = 0;

    @ObfuscatedName("al.n")
    public boolean field675 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field679 = arg0;
        this.field668 = arg1;
        this.field669 = arg2;
        this.field670 = arg3;
        this.field673 = arg4;
        this.field667 = arg5 + arg6;
        int var8 = class44.method216(this.field679).field1004;
        if (var8 == -1) {
            this.field675 = true;
        } else {
            this.field675 = false;
            this.field672 = class43.method72(var8);
        }
    }

    @ObfuscatedName("al.z(IB)V")
    public final void method619(int arg0) {
        if (this.field675) {
            return;
        }
        this.field674 += arg0;
        while (this.field674 > this.field672.field981[this.field666]) {
            this.field674 -= this.field672.field981[this.field666];
            this.field666++;
            if (this.field666 >= this.field672.field974.length) {
                this.field675 = true;
                break;
            }
        }
    }

    @ObfuscatedName("al.k(I)Ldb;")
    public final class105 method18() {
        class44 var1 = class44.method216(this.field679);
        class105 var2;
        if (this.field675) {
            var2 = var1.method860(-1);
        } else {
            var2 = var1.method860(this.field666);
        }
        return var2 == null ? null : var2;
    }
}
