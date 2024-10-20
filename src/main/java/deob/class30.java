package deob;

@ObfuscatedName("au")
public final class class30 extends class85 {

    @ObfuscatedName("au.l")
    public int field703;

    @ObfuscatedName("au.e")
    public int field691;

    @ObfuscatedName("au.q")
    public int field699;

    @ObfuscatedName("au.o")
    public int field701;

    @ObfuscatedName("au.g")
    public int field694;

    @ObfuscatedName("au.m")
    public int field695;

    @ObfuscatedName("au.b")
    public class43 field696;

    @ObfuscatedName("au.p")
    public int field697 = 0;

    @ObfuscatedName("au.t")
    public int field698 = 0;

    @ObfuscatedName("au.w")
    public boolean field690 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field703 = arg0;
        this.field699 = arg1;
        this.field701 = arg2;
        this.field694 = arg3;
        this.field695 = arg4;
        this.field691 = arg5 + arg6;
        int var8 = class44.method3632(this.field703).field1004;
        if (var8 == -1) {
            this.field690 = true;
        } else {
            this.field690 = false;
            this.field696 = class43.method2304(var8);
        }
    }

    @ObfuscatedName("au.l(IB)V")
    public final void method658(int arg0) {
        if (this.field690) {
            return;
        }
        this.field698 += arg0;
        while (this.field698 > this.field696.field984[this.field697]) {
            this.field698 -= this.field696.field984[this.field697];
            this.field697++;
            if (this.field697 >= this.field696.field981.length) {
                this.field690 = true;
                break;
            }
        }
    }

    @ObfuscatedName("au.q(B)Ldt;")
    public final class105 method18() {
        class44 var1 = class44.method3632(this.field703);
        class105 var2;
        if (this.field690) {
            var2 = var1.method902(-1);
        } else {
            var2 = var1.method902(this.field697);
        }
        return var2 == null ? null : var2;
    }
}
