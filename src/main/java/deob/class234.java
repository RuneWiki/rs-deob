package deob;

@ObfuscatedName("hq")
public class class234 implements class255 {

    @ObfuscatedName("hq.a")
    public int field2774;

    @ObfuscatedName("hq.f")
    public int field2769;

    @ObfuscatedName("hq.c")
    public int field2770;

    @ObfuscatedName("hq.x")
    public int field2779;

    @ObfuscatedName("hq.h")
    public int field2772;

    @ObfuscatedName("hq.j")
    public int field2768;

    @ObfuscatedName("hq.y")
    public int field2771;

    @ObfuscatedName("hq.d")
    public int field2775;

    @ObfuscatedName("hq.n")
    public int field2776;

    @ObfuscatedName("hq.r")
    public int field2777;

    @ObfuscatedName("hq.a(Lit;S)V")
    public void method4373(class235 arg0) {
        if (arg0.field2787 > this.field2771) {
            arg0.field2787 = this.field2771;
        }
        if (arg0.field2781 < this.field2776) {
            arg0.field2781 = this.field2776;
        }
        if (arg0.field2788 > this.field2775) {
            arg0.field2788 = this.field2775;
        }
        if (arg0.field2790 < this.field2777) {
            arg0.field2790 = this.field2777;
        }
    }

    @ObfuscatedName("hq.f(IIIB)Z")
    public boolean method4371(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2774 && arg0 < this.field2774 + this.field2769) {
            return arg1 >> 6 >= this.field2770 && arg1 >> 6 <= this.field2772 && arg2 >> 6 >= this.field2779 && arg2 >> 6 <= this.field2768;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hq.c(III)Z")
    public boolean method4367(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2771 && arg0 >> 6 <= this.field2776 && arg1 >> 6 >= this.field2775 && arg1 >> 6 <= this.field2777;
    }

    @ObfuscatedName("hq.x(IIII)[I")
    public int[] method4352(int arg0, int arg1, int arg2) {
        return this.method4371(arg0, arg1, arg2) ? new int[] { this.field2771 * 64 - this.field2770 * 64 + arg1, this.field2775 * 64 - this.field2779 * 64 + arg2 } : null;
    }

    @ObfuscatedName("hq.h(IIB)Lki;")
    public class294 method4353(int arg0, int arg1) {
        if (this.method4367(arg0, arg1)) {
            int var3 = this.field2770 * 64 - this.field2771 * 64 + arg0;
            int var4 = this.field2779 * 64 - this.field2775 * 64 + arg1;
            return new class294(this.field2774, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hq.j(Lqr;I)V")
    public void method4354(class464 arg0) {
        this.field2774 = arg0.method7735();
        this.field2769 = arg0.method7735();
        this.field2770 = arg0.method7716();
        this.field2779 = arg0.method7716();
        this.field2772 = arg0.method7716();
        this.field2768 = arg0.method7716();
        this.field2771 = arg0.method7716();
        this.field2775 = arg0.method7716();
        this.field2776 = arg0.method7716();
        this.field2777 = arg0.method7716();
        this.method4355();
    }

    @ObfuscatedName("hq.y(I)V")
    public void method4355() {
    }
}
