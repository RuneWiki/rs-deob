package deob;

@ObfuscatedName("ae")
public final class class30 extends class86 {

    @ObfuscatedName("ae.e")
    public int field670;

    @ObfuscatedName("ae.w")
    public int field671;

    @ObfuscatedName("ae.f")
    public int field679;

    @ObfuscatedName("ae.s")
    public int field681;

    @ObfuscatedName("ae.p")
    public int field674;

    @ObfuscatedName("ae.h")
    public int field675;

    @ObfuscatedName("ae.g")
    public class43 field676;

    @ObfuscatedName("ae.a")
    public int field677 = 0;

    @ObfuscatedName("ae.r")
    public int field678 = 0;

    @ObfuscatedName("ae.k")
    public boolean field673 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field670 = arg0;
        this.field679 = arg1;
        this.field681 = arg2;
        this.field674 = arg3;
        this.field675 = arg4;
        this.field671 = arg5 + arg6;
        int var8 = class44.method1763(this.field670).field989;
        if (var8 == -1) {
            this.field673 = true;
        } else {
            this.field673 = false;
            this.field676 = class43.method949(var8);
        }
    }

    @ObfuscatedName("ae.e(II)V")
    public final void method650(int arg0) {
        if (this.field673) {
            return;
        }
        this.field678 += arg0;
        while (this.field678 > this.field676.field969[this.field677]) {
            this.field678 -= this.field676.field969[this.field677];
            this.field677++;
            if (this.field677 >= this.field676.field976.length) {
                this.field673 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ae.f(B)Ldy;")
    public final class106 method25() {
        class44 var1 = class44.method1763(this.field670);
        class106 var2;
        if (this.field673) {
            var2 = var1.method889(-1);
        } else {
            var2 = var1.method889(this.field677);
        }
        return var2 == null ? null : var2;
    }
}
