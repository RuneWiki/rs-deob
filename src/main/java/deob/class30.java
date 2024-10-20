package deob;

@ObfuscatedName("ac")
public final class class30 extends class85 {

    @ObfuscatedName("ac.m")
    public int field657;

    @ObfuscatedName("ac.l")
    public int field653;

    @ObfuscatedName("ac.y")
    public class43 field652;

    @ObfuscatedName("ac.u")
    public int field654;

    @ObfuscatedName("ac.k")
    public int field655;

    @ObfuscatedName("ac.j")
    public int field656;

    @ObfuscatedName("ac.i")
    public int field658;

    @ObfuscatedName("ac.x")
    public int field659 = 0;

    @ObfuscatedName("ac.g")
    public int field661 = 0;

    @ObfuscatedName("ac.e")
    public boolean field660 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field657 = arg0;
        this.field654 = arg1;
        this.field655 = arg2;
        this.field656 = arg3;
        this.field658 = arg4;
        this.field653 = arg5 + arg6;
        int var8 = class44.method875(this.field657).field977;
        if (var8 == -1) {
            this.field660 = true;
        } else {
            this.field660 = false;
            this.field652 = class43.method2262(var8);
        }
    }

    @ObfuscatedName("ac.m(II)V")
    public final void method677(int arg0) {
        if (this.field660) {
            return;
        }
        this.field661 += arg0;
        while (this.field661 > this.field652.field957[this.field659]) {
            this.field661 -= this.field652.field957[this.field659];
            this.field659++;
            if (this.field659 >= this.field652.field955.length) {
                this.field660 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ac.y(I)Ldb;")
    public final class105 method16() {
        class44 var1 = class44.method875(this.field657);
        class105 var2;
        if (this.field660) {
            var2 = var1.method922(-1);
        } else {
            var2 = var1.method922(this.field659);
        }
        return var2 == null ? null : var2;
    }
}
