package deob;

@ObfuscatedName("ad")
public final class class28 extends class80 {

    @ObfuscatedName("ad.q")
    public int field639;

    @ObfuscatedName("ad.s")
    public int field630;

    @ObfuscatedName("ad.h")
    public int field629;

    @ObfuscatedName("ad.e")
    public int field632;

    @ObfuscatedName("ad.n")
    public int field633;

    @ObfuscatedName("ad.t")
    public int field634;

    @ObfuscatedName("ad.l")
    public class40 field641;

    @ObfuscatedName("ad.m")
    public int field636 = 0;

    @ObfuscatedName("ad.o")
    public int field637 = 0;

    @ObfuscatedName("ad.k")
    public boolean field638 = false;

    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field639 = arg0;
        this.field629 = arg1;
        this.field632 = arg2;
        this.field633 = arg3;
        this.field634 = arg4;
        this.field630 = arg5 + arg6;
        int var8 = class41.method535(this.field639).field950;
        if (var8 == -1) {
            this.field638 = true;
        } else {
            this.field638 = false;
            this.field641 = class40.method575(var8);
        }
    }

    @ObfuscatedName("ad.q(II)V")
    public final void method540(int arg0) {
        if (this.field638) {
            return;
        }
        this.field637 += arg0;
        while (this.field637 > this.field641.field917[this.field636]) {
            this.field637 -= this.field641.field917[this.field636];
            this.field636++;
            if (this.field636 >= this.field641.field915.length) {
                this.field638 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ad.s(B)Lch;")
    public final class100 method14() {
        class41 var1 = class41.method535(this.field639);
        class100 var2;
        if (this.field638) {
            var2 = var1.method755(-1);
        } else {
            var2 = var1.method755(this.field636);
        }
        return var2 == null ? null : var2;
    }
}
