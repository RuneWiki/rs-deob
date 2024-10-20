package deob;

@ObfuscatedName("ac")
public final class class30 extends class86 {

    @ObfuscatedName("ac.f")
    public int field697;

    @ObfuscatedName("ac.u")
    public int field694;

    @ObfuscatedName("ac.x")
    public int field693;

    @ObfuscatedName("ac.b")
    public int field695;

    @ObfuscatedName("ac.l")
    public int field696;

    @ObfuscatedName("ac.d")
    public int field698;

    @ObfuscatedName("ac.n")
    public class43 field699;

    @ObfuscatedName("ac.m")
    public int field700 = 0;

    @ObfuscatedName("ac.g")
    public int field701 = 0;

    @ObfuscatedName("ac.s")
    public boolean field702 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field697 = arg0;
        this.field695 = arg1;
        this.field696 = arg2;
        this.field693 = arg3;
        this.field698 = arg4;
        this.field694 = arg5 + arg6;
        int var8 = class44.method13(this.field697).field1021;
        if (var8 == -1) {
            this.field702 = true;
        } else {
            this.field702 = false;
            this.field699 = class43.method745(var8);
        }
    }

    @ObfuscatedName("ac.f(IB)V")
    public final void method689(int arg0) {
        if (this.field702) {
            return;
        }
        this.field701 += arg0;
        while (this.field701 > this.field699.field1005[this.field700]) {
            this.field701 -= this.field699.field1005[this.field700];
            this.field700++;
            if (this.field700 >= this.field699.field1000.length) {
                this.field702 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ac.x(S)Ldr;")
    public final class106 method29() {
        class44 var1 = class44.method13(this.field697);
        class106 var2;
        if (this.field702) {
            var2 = var1.method925(-1);
        } else {
            var2 = var1.method925(this.field700);
        }
        return var2 == null ? null : var2;
    }
}
