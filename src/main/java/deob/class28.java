package deob;

@ObfuscatedName("aq")
public final class class28 extends class80 {

    @ObfuscatedName("aq.n")
    public int field681;

    @ObfuscatedName("aq.g")
    public int field675;

    @ObfuscatedName("aq.a")
    public int field685;

    @ObfuscatedName("aq.m")
    public int field686;

    @ObfuscatedName("aq.s")
    public int field678;

    @ObfuscatedName("aq.j")
    public int field679;

    @ObfuscatedName("aq.f")
    public class40 field680;

    @ObfuscatedName("aq.b")
    public int field674 = 0;

    @ObfuscatedName("aq.t")
    public int field682 = 0;

    @ObfuscatedName("aq.i")
    public boolean field683 = false;

    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field681 = arg0;
        this.field685 = arg1;
        this.field686 = arg2;
        this.field678 = arg3;
        this.field679 = arg4;
        this.field675 = arg5 + arg6;
        int var8 = class41.method24(this.field681).field982;
        if (var8 == -1) {
            this.field683 = true;
        } else {
            this.field683 = false;
            this.field680 = class40.method2146(var8);
        }
    }

    @ObfuscatedName("aq.n(II)V")
    public final void method564(int arg0) {
        if (this.field683) {
            return;
        }
        this.field682 += arg0;
        while (this.field682 > this.field680.field961[this.field674]) {
            this.field682 -= this.field680.field961[this.field674];
            this.field674++;
            if (this.field674 >= this.field680.field955.length) {
                this.field683 = true;
                break;
            }
        }
    }

    @ObfuscatedName("aq.g(S)Lcs;")
    public final class100 method17() {
        class41 var1 = class41.method24(this.field681);
        class100 var2;
        if (this.field683) {
            var2 = var1.method782(-1);
        } else {
            var2 = var1.method782(this.field674);
        }
        return var2 == null ? null : var2;
    }
}
