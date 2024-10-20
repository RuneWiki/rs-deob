package deob;

@ObfuscatedName("hb")
public class class229 implements class245 {

    @ObfuscatedName("hb.s")
    public int field2771;

    @ObfuscatedName("hb.h")
    public int field2762;

    @ObfuscatedName("hb.w")
    public int field2763;

    @ObfuscatedName("hb.v")
    public int field2764;

    @ObfuscatedName("hb.c")
    public int field2765;

    @ObfuscatedName("hb.q")
    public int field2768;

    @ObfuscatedName("hb.i")
    public int field2767;

    @ObfuscatedName("hb.k")
    public int field2769;

    @ObfuscatedName("hb.o")
    public int field2761;

    @ObfuscatedName("hb.n")
    public int field2770;

    @ObfuscatedName("hb.s(Lht;I)V")
    public void method4122(class225 arg0) {
        if (arg0.field2722 > this.field2765) {
            arg0.field2722 = this.field2765;
        }
        if (arg0.field2718 < this.field2765) {
            arg0.field2718 = this.field2765;
        }
        if (arg0.field2720 > this.field2768) {
            arg0.field2720 = this.field2768;
        }
        if (arg0.field2719 < this.field2768) {
            arg0.field2719 = this.field2768;
        }
    }

    @ObfuscatedName("hb.h(IIIS)Z")
    public boolean method4123(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2771 && arg0 < this.field2771 + this.field2762) {
            return arg1 >= (this.field2767 << 3) + (this.field2763 << 6) && arg1 <= (this.field2767 << 3) + (this.field2763 << 6) + 7 && arg2 >= (this.field2769 << 3) + (this.field2764 << 6) && arg2 <= (this.field2769 << 3) + (this.field2764 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hb.w(III)Z")
    public boolean method4124(int arg0, int arg1) {
        return arg0 >= (this.field2765 << 6) + (this.field2761 << 3) && arg0 <= (this.field2765 << 6) + (this.field2761 << 3) + 7 && arg1 >= (this.field2770 << 3) + (this.field2768 << 6) && arg1 <= (this.field2770 << 3) + (this.field2768 << 6) + 7;
    }

    @ObfuscatedName("hb.v(IIII)[I")
    public int[] method4125(int arg0, int arg1, int arg2) {
        return this.method4123(arg0, arg1, arg2) ? new int[] { this.field2761 * 8 - this.field2767 * 8 + this.field2765 * 64 - this.field2763 * 64 + arg1, this.field2770 * 8 - this.field2769 * 8 + this.field2768 * 64 - this.field2764 * 64 + arg2 } : null;
    }

    @ObfuscatedName("hb.c(III)Lku;")
    public class290 method4126(int arg0, int arg1) {
        if (this.method4124(arg0, arg1)) {
            int var3 = this.field2767 * 8 - this.field2761 * 8 + this.field2763 * 64 - this.field2765 * 64 + arg0;
            int var4 = this.field2769 * 8 - this.field2770 * 8 + this.field2764 * 64 - this.field2768 * 64 + arg1;
            return new class290(this.field2771, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hb.q(Lqr;B)V")
    public void method4136(class444 arg0) {
        this.field2771 = arg0.method6929();
        this.field2762 = arg0.method6929();
        this.field2763 = arg0.method7120();
        this.field2767 = arg0.method6929();
        this.field2764 = arg0.method7120();
        this.field2769 = arg0.method6929();
        this.field2765 = arg0.method7120();
        this.field2761 = arg0.method6929();
        this.field2768 = arg0.method7120();
        this.field2770 = arg0.method6929();
        this.method4417();
    }

    @ObfuscatedName("hb.i(I)V")
    public void method4417() {
    }
}
