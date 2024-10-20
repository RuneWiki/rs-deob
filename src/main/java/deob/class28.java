package deob;

@ObfuscatedName("av")
public final class class28 extends class80 {

    @ObfuscatedName("av.o")
    public int field657;

    @ObfuscatedName("av.l")
    public int field651;

    @ObfuscatedName("av.g")
    public int field652;

    @ObfuscatedName("av.u")
    public int field653;

    @ObfuscatedName("av.q")
    public int field650;

    @ObfuscatedName("av.r")
    public int field654;

    @ObfuscatedName("av.v")
    public class40 field660;

    @ObfuscatedName("av.y")
    public int field655 = 0;

    @ObfuscatedName("av.k")
    public int field658 = 0;

    @ObfuscatedName("av.c")
    public boolean field659 = false;

    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field657 = arg0;
        this.field652 = arg1;
        this.field653 = arg2;
        this.field650 = arg3;
        this.field654 = arg4;
        this.field651 = arg5 + arg6;
        int var8 = class41.method2537(this.field657).field954;
        if (var8 == -1) {
            this.field659 = true;
        } else {
            this.field659 = false;
            this.field660 = class40.method567(var8);
        }
    }

    @ObfuscatedName("av.o(IB)V")
    public final void method581(int arg0) {
        if (this.field659) {
            return;
        }
        this.field658 += arg0;
        while (this.field658 > this.field660.field929[this.field655]) {
            this.field658 -= this.field660.field929[this.field655];
            this.field655++;
            if (this.field655 >= this.field660.field927.length) {
                this.field659 = true;
                break;
            }
        }
    }

    @ObfuscatedName("av.l(B)Lcq;")
    public final class100 method14() {
        class41 var1 = class41.method2537(this.field657);
        class100 var2;
        if (this.field659) {
            var2 = var1.method819(-1);
        } else {
            var2 = var1.method819(this.field655);
        }
        return var2 == null ? null : var2;
    }
}
