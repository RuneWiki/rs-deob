package deob;

@ObfuscatedName("x")
public final class class26 extends class78 {

    @ObfuscatedName("x.j")
    public int field640;

    @ObfuscatedName("x.z")
    public int field634;

    @ObfuscatedName("x.y")
    public class38 field635;

    @ObfuscatedName("x.h")
    public int field630;

    @ObfuscatedName("x.r")
    public int field636;

    @ObfuscatedName("x.e")
    public int field632;

    @ObfuscatedName("x.k")
    public int field633;

    @ObfuscatedName("x.b")
    public int field639 = 0;

    @ObfuscatedName("x.n")
    public int field637 = 0;

    @ObfuscatedName("x.a")
    public boolean field638 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field640 = arg0;
        this.field636 = arg1;
        this.field632 = arg2;
        this.field633 = arg3;
        this.field634 = arg4;
        this.field630 = arg5 + arg6;
        int var8 = class39.method3319(this.field640).field929;
        if (var8 == -1) {
            this.field638 = true;
        } else {
            this.field638 = false;
            this.field635 = class38.method38(var8);
        }
    }

    @ObfuscatedName("x.j(IB)V")
    public final void method492(int arg0) {
        if (this.field638) {
            return;
        }
        this.field637 += arg0;
        while (this.field637 > this.field635.field907[this.field639]) {
            this.field637 -= this.field635.field907[this.field639];
            this.field639++;
            if (this.field639 >= this.field635.field908.length) {
                this.field638 = true;
                break;
            }
        }
    }

    @ObfuscatedName("x.z(I)Lcl;")
    public final class98 method15() {
        class39 var1 = class39.method3319(this.field640);
        class98 var2;
        if (this.field638) {
            var2 = var1.method714(-1);
        } else {
            var2 = var1.method714(this.field639);
        }
        return var2 == null ? null : var2;
    }
}
