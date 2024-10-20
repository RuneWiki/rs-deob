package deob;

@ObfuscatedName("au")
public final class class28 extends class80 {

    @ObfuscatedName("au.t")
    public int field646;

    @ObfuscatedName("au.b")
    public int field641;

    @ObfuscatedName("au.p")
    public int field652;

    @ObfuscatedName("au.e")
    public int field642;

    @ObfuscatedName("au.i")
    public int field644;

    @ObfuscatedName("au.o")
    public int field645;

    @ObfuscatedName("au.f")
    public class40 field643;

    @ObfuscatedName("au.d")
    public int field647 = 0;

    @ObfuscatedName("au.j")
    public int field648 = 0;

    @ObfuscatedName("au.x")
    public boolean field649 = false;

    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field646 = arg0;
        this.field652 = arg1;
        this.field642 = arg2;
        this.field644 = arg3;
        this.field645 = arg4;
        this.field641 = arg5 + arg6;
        int var8 = class41.method113(this.field646).field941;
        if (var8 == -1) {
            this.field649 = true;
        } else {
            this.field649 = false;
            this.field643 = class40.method168(var8);
        }
    }

    @ObfuscatedName("au.t(II)V")
    public final void method615(int arg0) {
        if (this.field649) {
            return;
        }
        this.field648 += arg0;
        while (this.field648 > this.field643.field920[this.field647]) {
            this.field648 -= this.field643.field920[this.field647];
            this.field647++;
            if (this.field647 >= this.field643.field918.length) {
                this.field649 = true;
                break;
            }
        }
    }

    @ObfuscatedName("au.b(B)Lcs;")
    public final class100 method14() {
        class41 var1 = class41.method113(this.field646);
        class100 var2;
        if (this.field649) {
            var2 = var1.method827(-1);
        } else {
            var2 = var1.method827(this.field647);
        }
        return var2 == null ? null : var2;
    }
}
