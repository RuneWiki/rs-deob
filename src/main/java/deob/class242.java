package deob;

@ObfuscatedName("ix")
public class class242 implements class245 {

    @ObfuscatedName("ix.s")
    public int field2859;

    @ObfuscatedName("ix.h")
    public int field2861;

    @ObfuscatedName("ix.w")
    public int field2856;

    @ObfuscatedName("ix.v")
    public int field2857;

    @ObfuscatedName("ix.c")
    public int field2860;

    @ObfuscatedName("ix.q")
    public int field2858;

    @ObfuscatedName("ix.s(Lht;I)V")
    public void method4122(class225 arg0) {
        if (arg0.field2722 > this.field2860) {
            arg0.field2722 = this.field2860;
        }
        if (arg0.field2718 < this.field2860) {
            arg0.field2718 = this.field2860;
        }
        if (arg0.field2720 > this.field2858) {
            arg0.field2720 = this.field2858;
        }
        if (arg0.field2719 < this.field2858) {
            arg0.field2719 = this.field2858;
        }
    }

    @ObfuscatedName("ix.h(IIIS)Z")
    public boolean method4123(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2859 && arg0 < this.field2861 + this.field2859) {
            return arg1 >> 6 == this.field2856 && arg2 >> 6 == this.field2857;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ix.w(III)Z")
    public boolean method4124(int arg0, int arg1) {
        return arg0 >> 6 == this.field2860 && arg1 >> 6 == this.field2858;
    }

    @ObfuscatedName("ix.v(IIII)[I")
    public int[] method4125(int arg0, int arg1, int arg2) {
        return this.method4123(arg0, arg1, arg2) ? new int[] { this.field2860 * 64 - this.field2856 * 64 + arg1, this.field2858 * 64 - this.field2857 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ix.c(III)Lku;")
    public class290 method4126(int arg0, int arg1) {
        if (this.method4124(arg0, arg1)) {
            int var3 = this.field2856 * 64 - this.field2860 * 64 + arg0;
            int var4 = this.field2857 * 64 - this.field2858 * 64 + arg1;
            return new class290(this.field2859, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ix.q(Lqr;B)V")
    public void method4136(class444 arg0) {
        this.field2859 = arg0.method6929();
        this.field2861 = arg0.method6929();
        this.field2856 = arg0.method7120();
        this.field2857 = arg0.method7120();
        this.field2860 = arg0.method7120();
        this.field2858 = arg0.method7120();
        this.method4485();
    }

    @ObfuscatedName("ix.i(B)V")
    public void method4485() {
    }
}
