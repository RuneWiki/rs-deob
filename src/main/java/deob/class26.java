package deob;

@ObfuscatedName("x")
public final class class26 extends class78 {

    @ObfuscatedName("x.i")
    public int field626;

    @ObfuscatedName("x.c")
    public int field623;

    @ObfuscatedName("x.h")
    public int field625;

    @ObfuscatedName("x.v")
    public int field629;

    @ObfuscatedName("x.q")
    public int field624;

    @ObfuscatedName("x.s")
    public int field628;

    @ObfuscatedName("x.g")
    public class38 field633;

    @ObfuscatedName("x.u")
    public int field630 = 0;

    @ObfuscatedName("x.d")
    public int field634 = 0;

    @ObfuscatedName("x.y")
    public boolean field632 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field626 = arg0;
        this.field625 = arg1;
        this.field629 = arg2;
        this.field624 = arg3;
        this.field628 = arg4;
        this.field623 = arg5 + arg6;
        int var8 = class39.method3346(this.field626).field932;
        if (var8 == -1) {
            this.field632 = true;
        } else {
            this.field632 = false;
            this.field633 = class38.method3551(var8);
        }
    }

    @ObfuscatedName("x.i(II)V")
    public final void method518(int arg0) {
        if (this.field632) {
            return;
        }
        this.field634 += arg0;
        while (this.field634 > this.field633.field906[this.field630]) {
            this.field634 -= this.field633.field906[this.field630];
            this.field630++;
            if (this.field630 >= this.field633.field919.length) {
                this.field632 = true;
                break;
            }
        }
    }

    @ObfuscatedName("x.c(B)Lcc;")
    public final class98 method16() {
        class39 var1 = class39.method3346(this.field626);
        class98 var2;
        if (this.field632) {
            var2 = var1.method752(-1);
        } else {
            var2 = var1.method752(this.field630);
        }
        return var2 == null ? null : var2;
    }
}
