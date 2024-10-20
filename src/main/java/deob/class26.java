package deob;

@ObfuscatedName("m")
public final class class26 extends class78 {

    @ObfuscatedName("m.e")
    public int field637;

    @ObfuscatedName("m.o")
    public int field629;

    @ObfuscatedName("m.y")
    public class38 field635;

    @ObfuscatedName("m.b")
    public int field631;

    @ObfuscatedName("m.w")
    public int field632;

    @ObfuscatedName("m.r")
    public int field630;

    @ObfuscatedName("m.l")
    public int field633;

    @ObfuscatedName("m.s")
    public int field636 = 0;

    @ObfuscatedName("m.f")
    public int field642 = 0;

    @ObfuscatedName("m.x")
    public boolean field634 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field637 = arg0;
        this.field631 = arg1;
        this.field632 = arg2;
        this.field630 = arg3;
        this.field633 = arg4;
        this.field629 = arg5 + arg6;
        int var8 = class39.method147(this.field637).field940;
        if (var8 == -1) {
            this.field634 = true;
        } else {
            this.field634 = false;
            this.field635 = class38.method131(var8);
        }
    }

    @ObfuscatedName("m.e(IB)V")
    public final void method523(int arg0) {
        if (this.field634) {
            return;
        }
        this.field642 += arg0;
        while (this.field642 > this.field635.field917[this.field636]) {
            this.field642 -= this.field635.field917[this.field636];
            this.field636++;
            if (this.field636 >= this.field635.field923.length) {
                this.field634 = true;
                break;
            }
        }
    }

    @ObfuscatedName("m.o(B)Lcd;")
    public final class98 method21() {
        class39 var1 = class39.method147(this.field637);
        class98 var2;
        if (this.field634) {
            var2 = var1.method740(-1);
        } else {
            var2 = var1.method740(this.field636);
        }
        return var2 == null ? null : var2;
    }
}
