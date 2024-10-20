package deob;

@ObfuscatedName("ag")
public final class class28 extends class80 {

    @ObfuscatedName("ag.b")
    public int field636;

    @ObfuscatedName("ag.e")
    public int field634;

    @ObfuscatedName("ag.a")
    public int field635;

    @ObfuscatedName("ag.k")
    public int field642;

    @ObfuscatedName("ag.p")
    public int field637;

    @ObfuscatedName("ag.l")
    public int field638;

    @ObfuscatedName("ag.u")
    public class40 field639;

    @ObfuscatedName("ag.o")
    public int field640 = 0;

    @ObfuscatedName("ag.m")
    public int field641 = 0;

    @ObfuscatedName("ag.q")
    public boolean field633 = false;

    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field636 = arg0;
        this.field635 = arg1;
        this.field642 = arg2;
        this.field637 = arg3;
        this.field638 = arg4;
        this.field634 = arg5 + arg6;
        int var8 = class41.method174(this.field636).field940;
        if (var8 == -1) {
            this.field633 = true;
        } else {
            this.field633 = false;
            this.field639 = class40.method512(var8);
        }
    }

    @ObfuscatedName("ag.b(II)V")
    public final void method562(int arg0) {
        if (this.field633) {
            return;
        }
        this.field641 += arg0;
        while (this.field641 > this.field639.field925[this.field640]) {
            this.field641 -= this.field639.field925[this.field640];
            this.field640++;
            if (this.field640 >= this.field639.field928.length) {
                this.field633 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ag.e(I)Lcx;")
    public final class100 method16() {
        class41 var1 = class41.method174(this.field636);
        class100 var2;
        if (this.field633) {
            var2 = var1.method764(-1);
        } else {
            var2 = var1.method764(this.field640);
        }
        return var2 == null ? null : var2;
    }
}
