package deob;

@ObfuscatedName("am")
public final class class30 extends class86 {

    @ObfuscatedName("am.j")
    public int field677;

    @ObfuscatedName("am.h")
    public int field670;

    @ObfuscatedName("am.m")
    public int field683;

    @ObfuscatedName("am.z")
    public int field674;

    @ObfuscatedName("am.x")
    public int field673;

    @ObfuscatedName("am.e")
    public int field672;

    @ObfuscatedName("am.i")
    public class43 field669;

    @ObfuscatedName("am.c")
    public int field676 = 0;

    @ObfuscatedName("am.n")
    public int field678 = 0;

    @ObfuscatedName("am.l")
    public boolean field675 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field677 = arg0;
        this.field683 = arg1;
        this.field672 = arg2;
        this.field673 = arg3;
        this.field674 = arg4;
        this.field670 = arg5 + arg6;
        int var8 = class44.method236(this.field677).field994;
        if (var8 == -1) {
            this.field675 = true;
        } else {
            this.field675 = false;
            this.field669 = class43.method2947(var8);
        }
    }

    @ObfuscatedName("am.j(IB)V")
    public final void method646(int arg0) {
        if (this.field675) {
            return;
        }
        this.field678 += arg0;
        while (this.field678 > this.field669.field975[this.field676]) {
            this.field678 -= this.field669.field975[this.field676];
            this.field676++;
            if (this.field676 >= this.field669.field973.length) {
                this.field675 = true;
                break;
            }
        }
    }

    @ObfuscatedName("am.m(I)Ldf;")
    public final class106 method12() {
        class44 var1 = class44.method236(this.field677);
        class106 var2;
        if (this.field675) {
            var2 = var1.method875(-1);
        } else {
            var2 = var1.method875(this.field676);
        }
        return var2 == null ? null : var2;
    }
}
