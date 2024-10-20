package deob;

@ObfuscatedName("l")
public final class class26 extends class78 {

    @ObfuscatedName("l.k")
    public int field633;

    @ObfuscatedName("l.b")
    public int field638;

    @ObfuscatedName("l.e")
    public int field630;

    @ObfuscatedName("l.i")
    public int field628;

    @ObfuscatedName("l.t")
    public int field641;

    @ObfuscatedName("l.z")
    public int field636;

    @ObfuscatedName("l.g")
    public class38 field634;

    @ObfuscatedName("l.c")
    public int field635 = 0;

    @ObfuscatedName("l.o")
    public int field632 = 0;

    @ObfuscatedName("l.q")
    public boolean field637 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field633 = arg0;
        this.field630 = arg1;
        this.field628 = arg2;
        this.field641 = arg3;
        this.field636 = arg4;
        this.field638 = arg5 + arg6;
        int var8 = class39.method788(this.field633).field934;
        if (var8 == -1) {
            this.field637 = true;
        } else {
            this.field637 = false;
            this.field634 = class38.method595(var8);
        }
    }

    @ObfuscatedName("l.k(II)V")
    public final void method509(int arg0) {
        if (this.field637) {
            return;
        }
        this.field632 += arg0;
        while (this.field632 > this.field634.field902[this.field635]) {
            this.field632 -= this.field634.field902[this.field635];
            this.field635++;
            if (this.field635 >= this.field634.field906.length) {
                this.field637 = true;
                break;
            }
        }
    }

    @ObfuscatedName("l.b(I)Lck;")
    public final class98 method19() {
        class39 var1 = class39.method788(this.field633);
        class98 var2;
        if (this.field637) {
            var2 = var1.method738(-1);
        } else {
            var2 = var1.method738(this.field635);
        }
        return var2 == null ? null : var2;
    }
}
