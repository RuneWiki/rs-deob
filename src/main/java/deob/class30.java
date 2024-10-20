package deob;

@ObfuscatedName("ae")
public final class class30 extends class85 {

    @ObfuscatedName("ae.f")
    public int field697;

    @ObfuscatedName("ae.s")
    public int field698;

    @ObfuscatedName("ae.q")
    public int field688;

    @ObfuscatedName("ae.g")
    public int field689;

    @ObfuscatedName("ae.m")
    public int field690;

    @ObfuscatedName("ae.t")
    public int field691;

    @ObfuscatedName("ae.j")
    public class43 field694;

    @ObfuscatedName("ae.n")
    public int field693 = 0;

    @ObfuscatedName("ae.l")
    public int field686 = 0;

    @ObfuscatedName("ae.i")
    public boolean field692 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field697 = arg0;
        this.field688 = arg1;
        this.field689 = arg2;
        this.field690 = arg3;
        this.field691 = arg4;
        this.field698 = arg5 + arg6;
        int var8 = class44.method732(this.field697).field1017;
        if (var8 == -1) {
            this.field692 = true;
        } else {
            this.field692 = false;
            this.field694 = Statics.method653(var8);
        }
    }

    @ObfuscatedName("ae.f(II)V")
    public final void method646(int arg0) {
        if (this.field692) {
            return;
        }
        this.field686 += arg0;
        while (this.field686 > this.field694.field995[this.field693]) {
            this.field686 -= this.field694.field995[this.field693];
            this.field693++;
            if (this.field693 >= this.field694.field992.length) {
                this.field692 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ae.q(I)Ldu;")
    public final class105 method16() {
        class44 var1 = class44.method732(this.field697);
        class105 var2;
        if (this.field692) {
            var2 = var1.method886(-1);
        } else {
            var2 = var1.method886(this.field693);
        }
        return var2 == null ? null : var2;
    }
}
