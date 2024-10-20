package deob;

@ObfuscatedName("au")
public final class class30 extends class86 {

    @ObfuscatedName("au.s")
    public int field699;

    @ObfuscatedName("au.j")
    public int field692;

    @ObfuscatedName("au.p")
    public int field690;

    @ObfuscatedName("au.x")
    public int field688;

    @ObfuscatedName("au.d")
    public int field689;

    @ObfuscatedName("au.u")
    public int field693;

    @ObfuscatedName("au.o")
    public class43 field694;

    @ObfuscatedName("au.b")
    public int field702 = 0;

    @ObfuscatedName("au.k")
    public int field696 = 0;

    @ObfuscatedName("au.c")
    public boolean field697 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field699 = arg0;
        this.field690 = arg1;
        this.field689 = arg2;
        this.field688 = arg3;
        this.field693 = arg4;
        this.field692 = arg5 + arg6;
        int var8 = class44.method3263(this.field699).field1009;
        if (var8 == -1) {
            this.field697 = true;
        } else {
            this.field697 = false;
            this.field694 = class43.method43(var8);
        }
    }

    @ObfuscatedName("au.s(II)V")
    public final void method630(int arg0) {
        if (this.field697) {
            return;
        }
        this.field696 += arg0;
        while (this.field696 > this.field694.field1000[this.field702]) {
            this.field696 -= this.field694.field1000[this.field702];
            this.field702++;
            if (this.field702 >= this.field694.field987.length) {
                this.field697 = true;
                break;
            }
        }
    }

    @ObfuscatedName("au.p(B)Ldh;")
    public final class106 method14() {
        class44 var1 = class44.method3263(this.field699);
        class106 var2;
        if (this.field697) {
            var2 = var1.method859(-1);
        } else {
            var2 = var1.method859(this.field702);
        }
        return var2 == null ? null : var2;
    }
}
