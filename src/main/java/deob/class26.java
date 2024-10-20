package deob;

@ObfuscatedName("l")
public final class class26 extends class78 {

    @ObfuscatedName("l.n")
    public int field633;

    @ObfuscatedName("l.x")
    public int field623;

    @ObfuscatedName("l.k")
    public int field624;

    @ObfuscatedName("l.i")
    public int field634;

    @ObfuscatedName("l.d")
    public int field626;

    @ObfuscatedName("l.q")
    public int field628;

    @ObfuscatedName("l.m")
    public class38 field627;

    @ObfuscatedName("l.a")
    public int field630 = 0;

    @ObfuscatedName("l.w")
    public int field631 = 0;

    @ObfuscatedName("l.e")
    public boolean field632 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field633 = arg0;
        this.field634 = arg1;
        this.field626 = arg2;
        this.field623 = arg3;
        this.field628 = arg4;
        this.field624 = arg5 + arg6;
        int var8 = class39.method138(this.field633).field928;
        if (var8 == -1) {
            this.field632 = true;
        } else {
            this.field632 = false;
            this.field627 = class38.method658(var8);
        }
    }

    @ObfuscatedName("l.n(IB)V")
    public final void method547(int arg0) {
        if (this.field632) {
            return;
        }
        this.field631 += arg0;
        while (this.field631 > this.field627.field906[this.field630]) {
            this.field631 -= this.field627.field906[this.field630];
            this.field630++;
            if (this.field630 >= this.field627.field916.length) {
                this.field632 = true;
                break;
            }
        }
    }

    @ObfuscatedName("l.x(S)Lcy;")
    public final class98 method18() {
        class39 var1 = class39.method138(this.field633);
        class98 var2;
        if (this.field632) {
            var2 = var1.method751(-1);
        } else {
            var2 = var1.method751(this.field630);
        }
        return var2 == null ? null : var2;
    }
}
