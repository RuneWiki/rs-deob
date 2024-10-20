package deob;

@ObfuscatedName("am")
public final class class28 extends class80 {

    @ObfuscatedName("am.p")
    public int field667;

    @ObfuscatedName("am.k")
    public int field675;

    @ObfuscatedName("am.e")
    public int field678;

    @ObfuscatedName("am.f")
    public int field666;

    @ObfuscatedName("am.w")
    public int field670;

    @ObfuscatedName("am.t")
    public int field671;

    @ObfuscatedName("am.s")
    public class40 field672;

    @ObfuscatedName("am.c")
    public int field673 = 0;

    @ObfuscatedName("am.d")
    public int field674 = 0;

    @ObfuscatedName("am.v")
    public boolean field668 = false;

    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field667 = arg0;
        this.field678 = arg1;
        this.field666 = arg2;
        this.field670 = arg3;
        this.field671 = arg4;
        this.field675 = arg5 + arg6;
        int var8 = class41.method2637(this.field667).field969;
        if (var8 == -1) {
            this.field668 = true;
        } else {
            this.field668 = false;
            this.field672 = class40.method678(var8);
        }
    }

    @ObfuscatedName("am.p(II)V")
    public final void method586(int arg0) {
        if (this.field668) {
            return;
        }
        this.field674 += arg0;
        while (this.field674 > this.field672.field947[this.field673]) {
            this.field674 -= this.field672.field947[this.field673];
            this.field673++;
            if (this.field673 >= this.field672.field945.length) {
                this.field668 = true;
                break;
            }
        }
    }

    @ObfuscatedName("am.k(I)Lcm;")
    public final class100 method23() {
        class41 var1 = class41.method2637(this.field667);
        class100 var2;
        if (this.field668) {
            var2 = var1.method780(-1);
        } else {
            var2 = var1.method780(this.field673);
        }
        return var2 == null ? null : var2;
    }
}
