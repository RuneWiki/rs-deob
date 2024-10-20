package deob;

@ObfuscatedName("ac")
public final class class27 extends class79 {

    @ObfuscatedName("ac.e")
    public int field636;

    @ObfuscatedName("ac.v")
    public int field628;

    @ObfuscatedName("ac.k")
    public int field629;

    @ObfuscatedName("ac.g")
    public int field630;

    @ObfuscatedName("ac.q")
    public int field631;

    @ObfuscatedName("ac.l")
    public int field635;

    @ObfuscatedName("ac.a")
    public class39 field633;

    @ObfuscatedName("ac.b")
    public int field634 = 0;

    @ObfuscatedName("ac.z")
    public int field632 = 0;

    @ObfuscatedName("ac.w")
    public boolean field627 = false;

    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field636 = arg0;
        this.field629 = arg1;
        this.field630 = arg2;
        this.field631 = arg3;
        this.field635 = arg4;
        this.field628 = arg5 + arg6;
        int var8 = class40.method2885(this.field636).field940;
        if (var8 == -1) {
            this.field627 = true;
        } else {
            this.field627 = false;
            this.field633 = class39.method2315(var8);
        }
    }

    @ObfuscatedName("ac.e(II)V")
    public final void method501(int arg0) {
        if (this.field627) {
            return;
        }
        this.field632 += arg0;
        while (this.field632 > this.field633.field917[this.field634]) {
            this.field632 -= this.field633.field917[this.field634];
            this.field634++;
            if (this.field634 >= this.field633.field925.length) {
                this.field627 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ac.v(B)Lcu;")
    public final class99 method14() {
        class40 var1 = class40.method2885(this.field636);
        class99 var2;
        if (this.field627) {
            var2 = var1.method740(-1);
        } else {
            var2 = var1.method740(this.field634);
        }
        return var2 == null ? null : var2;
    }
}
