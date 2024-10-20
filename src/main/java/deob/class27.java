package deob;

@ObfuscatedName("ae")
public final class class27 extends class79 {

    @ObfuscatedName("ae.x")
    public int field628;

    @ObfuscatedName("ae.v")
    public int field638;

    @ObfuscatedName("ae.m")
    public int field624;

    @ObfuscatedName("ae.e")
    public int field626;

    @ObfuscatedName("ae.h")
    public int field627;

    @ObfuscatedName("ae.p")
    public int field629;

    @ObfuscatedName("ae.j")
    public class39 field630;

    @ObfuscatedName("ae.i")
    public int field631 = 0;

    @ObfuscatedName("ae.u")
    public int field625 = 0;

    @ObfuscatedName("ae.l")
    public boolean field633 = false;

    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field638 = arg0;
        this.field626 = arg1;
        this.field627 = arg2;
        this.field628 = arg3;
        this.field629 = arg4;
        this.field624 = arg5 + arg6;
        int var8 = class40.method517(this.field638).field940;
        if (var8 == -1) {
            this.field633 = true;
        } else {
            this.field633 = false;
            this.field630 = class39.method633(var8);
        }
    }

    @ObfuscatedName("ae.x(II)V")
    public final void method543(int arg0) {
        if (this.field633) {
            return;
        }
        this.field625 += arg0;
        while (this.field625 > this.field630.field919[this.field631]) {
            this.field625 -= this.field630.field919[this.field631];
            this.field631++;
            if (this.field631 >= this.field630.field913.length) {
                this.field633 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ae.v(B)Lck;")
    public final class99 method18() {
        class40 var1 = class40.method517(this.field638);
        class99 var2;
        if (this.field633) {
            var2 = var1.method771(-1);
        } else {
            var2 = var1.method771(this.field631);
        }
        return var2 == null ? null : var2;
    }
}
