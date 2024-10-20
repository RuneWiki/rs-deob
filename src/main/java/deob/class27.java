package deob;

@ObfuscatedName("an")
public final class class27 extends class79 {

    @ObfuscatedName("an.a")
    public int field639;

    @ObfuscatedName("an.v")
    public int field628;

    @ObfuscatedName("an.i")
    public int field629;

    @ObfuscatedName("an.b")
    public int field632;

    @ObfuscatedName("an.l")
    public int field631;

    @ObfuscatedName("an.m")
    public int field627;

    @ObfuscatedName("an.w")
    public class39 field640;

    @ObfuscatedName("an.e")
    public int field634 = 0;

    @ObfuscatedName("an.n")
    public int field641 = 0;

    @ObfuscatedName("an.s")
    public boolean field636 = false;

    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field639 = arg0;
        this.field629 = arg1;
        this.field632 = arg2;
        this.field631 = arg3;
        this.field627 = arg4;
        this.field628 = arg5 + arg6;
        int var8 = class40.method1765(this.field639).field935;
        if (var8 == -1) {
            this.field636 = true;
        } else {
            this.field636 = false;
            this.field640 = Statics.method97(var8);
        }
    }

    @ObfuscatedName("an.a(II)V")
    public final void method555(int arg0) {
        if (this.field636) {
            return;
        }
        this.field641 += arg0;
        while (this.field641 > this.field640.field912[this.field634]) {
            this.field641 -= this.field640.field912[this.field634];
            this.field634++;
            if (this.field634 >= this.field640.field911.length) {
                this.field636 = true;
                break;
            }
        }
    }

    @ObfuscatedName("an.v(I)Lcl;")
    public final class99 method24() {
        class40 var1 = class40.method1765(this.field639);
        class99 var2;
        if (this.field636) {
            var2 = var1.method768(-1);
        } else {
            var2 = var1.method768(this.field634);
        }
        return var2 == null ? null : var2;
    }
}
