package deob;

@ObfuscatedName("at")
public final class class27 extends class79 {

    @ObfuscatedName("at.c")
    public int field638;

    @ObfuscatedName("at.j")
    public int field627;

    @ObfuscatedName("at.y")
    public class39 field626;

    @ObfuscatedName("at.r")
    public int field628;

    @ObfuscatedName("at.f")
    public int field629;

    @ObfuscatedName("at.l")
    public int field630;

    @ObfuscatedName("at.b")
    public int field631;

    @ObfuscatedName("at.k")
    public int field633 = 0;

    @ObfuscatedName("at.g")
    public int field634 = 0;

    @ObfuscatedName("at.v")
    public boolean field632 = false;

    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field638 = arg0;
        this.field628 = arg1;
        this.field629 = arg2;
        this.field630 = arg3;
        this.field631 = arg4;
        this.field627 = arg5 + arg6;
        int var8 = class40.method903(this.field638).field930;
        if (var8 == -1) {
            this.field632 = true;
        } else {
            this.field632 = false;
            this.field626 = class39.method109(var8);
        }
    }

    @ObfuscatedName("at.c(II)V")
    public final void method523(int arg0) {
        if (this.field632) {
            return;
        }
        this.field634 += arg0;
        while (this.field634 > this.field626.field906[this.field633]) {
            this.field634 -= this.field626.field906[this.field633];
            this.field633++;
            if (this.field633 >= this.field626.field913.length) {
                this.field632 = true;
                break;
            }
        }
    }

    @ObfuscatedName("at.j(B)Lcl;")
    public final class99 method20() {
        class40 var1 = class40.method903(this.field638);
        class99 var2;
        if (this.field632) {
            var2 = var1.method735(-1);
        } else {
            var2 = var1.method735(this.field633);
        }
        return var2 == null ? null : var2;
    }
}
