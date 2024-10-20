package deob;

@ObfuscatedName("c")
public final class class26 extends class78 {

    @ObfuscatedName("c.g")
    public int field633;

    @ObfuscatedName("c.i")
    public int field628;

    @ObfuscatedName("c.k")
    public int field629;

    @ObfuscatedName("c.e")
    public int field627;

    @ObfuscatedName("c.w")
    public int field631;

    @ObfuscatedName("c.m")
    public int field632;

    @ObfuscatedName("c.u")
    public class38 field634;

    @ObfuscatedName("c.j")
    public int field639 = 0;

    @ObfuscatedName("c.o")
    public int field630 = 0;

    @ObfuscatedName("c.h")
    public boolean field636 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field633 = arg0;
        this.field629 = arg1;
        this.field627 = arg2;
        this.field631 = arg3;
        this.field632 = arg4;
        this.field628 = arg5 + arg6;
        int var8 = class39.method685(this.field633).field939;
        if (var8 == -1) {
            this.field636 = true;
        } else {
            this.field636 = false;
            this.field634 = class38.method552(var8);
        }
    }

    @ObfuscatedName("c.g(II)V")
    public final void method515(int arg0) {
        if (this.field636) {
            return;
        }
        this.field630 += arg0;
        while (this.field630 > this.field634.field910[this.field639]) {
            this.field630 -= this.field634.field910[this.field639];
            this.field639++;
            if (this.field639 >= this.field634.field921.length) {
                this.field636 = true;
                break;
            }
        }
    }

    @ObfuscatedName("c.i(I)Lce;")
    public final class98 method14() {
        class39 var1 = class39.method685(this.field633);
        class98 var2;
        if (this.field636) {
            var2 = var1.method718(-1);
        } else {
            var2 = var1.method718(this.field639);
        }
        return var2 == null ? null : var2;
    }
}
