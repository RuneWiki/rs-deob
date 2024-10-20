package deob;

@ObfuscatedName("ag")
public final class class28 extends class80 {

    @ObfuscatedName("ag.n")
    public int field670;

    @ObfuscatedName("ag.o")
    public int field667;

    @ObfuscatedName("ag.a")
    public int field669;

    @ObfuscatedName("ag.w")
    public int field673;

    @ObfuscatedName("ag.m")
    public int field671;

    @ObfuscatedName("ag.h")
    public int field672;

    @ObfuscatedName("ag.i")
    public class40 field678;

    @ObfuscatedName("ag.r")
    public int field674 = 0;

    @ObfuscatedName("ag.l")
    public int field675 = 0;

    @ObfuscatedName("ag.f")
    public boolean field676 = false;

    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field670 = arg0;
        this.field669 = arg1;
        this.field673 = arg2;
        this.field671 = arg3;
        this.field672 = arg4;
        this.field667 = arg5 + arg6;
        int var8 = class41.method493(this.field670).field974;
        if (var8 == -1) {
            this.field676 = true;
        } else {
            this.field676 = false;
            this.field678 = Statics.method860(var8);
        }
    }

    @ObfuscatedName("ag.n(IB)V")
    public final void method580(int arg0) {
        if (this.field676) {
            return;
        }
        this.field675 += arg0;
        while (this.field675 > this.field678.field971[this.field674]) {
            this.field675 -= this.field678.field971[this.field674];
            this.field674++;
            if (this.field674 >= this.field678.field957.length) {
                this.field676 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ag.o(I)Lcp;")
    public final class100 method13() {
        class41 var1 = class41.method493(this.field670);
        class100 var2;
        if (this.field676) {
            var2 = var1.method793(-1);
        } else {
            var2 = var1.method793(this.field674);
        }
        return var2 == null ? null : var2;
    }
}
