package deob;

@ObfuscatedName("ib")
public class class242 implements class255 {

    @ObfuscatedName("ib.a")
    public int field2859;

    @ObfuscatedName("ib.f")
    public int field2855;

    @ObfuscatedName("ib.c")
    public int field2856;

    @ObfuscatedName("ib.x")
    public int field2858;

    @ObfuscatedName("ib.h")
    public int field2865;

    @ObfuscatedName("ib.j")
    public int field2867;

    @ObfuscatedName("ib.y")
    public int field2857;

    @ObfuscatedName("ib.d")
    public int field2861;

    @ObfuscatedName("ib.n")
    public int field2862;

    @ObfuscatedName("ib.r")
    public int field2863;

    @ObfuscatedName("ib.l")
    public int field2854;

    @ObfuscatedName("ib.s")
    public int field2860;

    @ObfuscatedName("ib.p")
    public int field2866;

    @ObfuscatedName("ib.b")
    public int field2864;

    @ObfuscatedName("ib.a(Lit;S)V")
    public void method4373(class235 arg0) {
        if (arg0.field2787 > this.field2865) {
            arg0.field2787 = this.field2865;
        }
        if (arg0.field2781 < this.field2865) {
            arg0.field2781 = this.field2865;
        }
        if (arg0.field2788 > this.field2867) {
            arg0.field2788 = this.field2867;
        }
        if (arg0.field2790 < this.field2867) {
            arg0.field2790 = this.field2867;
        }
    }

    @ObfuscatedName("ib.f(IIIB)Z")
    public boolean method4371(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2859 && arg0 < this.field2859 + this.field2855) {
            return arg1 >= (this.field2857 << 3) + (this.field2856 << 6) && arg1 <= (this.field2862 << 3) + (this.field2856 << 6) + 7 && arg2 >= (this.field2861 << 3) + (this.field2858 << 6) && arg2 <= (this.field2863 << 3) + (this.field2858 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ib.c(III)Z")
    public boolean method4367(int arg0, int arg1) {
        return arg0 >= (this.field2865 << 6) + (this.field2854 << 3) && arg0 <= (this.field2866 << 3) + (this.field2865 << 6) + 7 && arg1 >= (this.field2867 << 6) + (this.field2860 << 3) && arg1 <= (this.field2867 << 6) + (this.field2864 << 3) + 7;
    }

    @ObfuscatedName("ib.x(IIII)[I")
    public int[] method4352(int arg0, int arg1, int arg2) {
        return this.method4371(arg0, arg1, arg2) ? new int[] { this.field2854 * 8 - this.field2857 * 8 + this.field2865 * 64 - this.field2856 * 64 + arg1, this.field2860 * 8 - this.field2861 * 8 + this.field2867 * 64 - this.field2858 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ib.h(IIB)Lki;")
    public class294 method4353(int arg0, int arg1) {
        if (this.method4367(arg0, arg1)) {
            int var3 = this.field2857 * 8 - this.field2854 * 8 + this.field2856 * 64 - this.field2865 * 64 + arg0;
            int var4 = this.field2861 * 8 - this.field2860 * 8 + this.field2858 * 64 - this.field2867 * 64 + arg1;
            return new class294(this.field2859, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ib.j(Lqr;I)V")
    public void method4354(class464 arg0) {
        this.field2859 = arg0.method7735();
        this.field2855 = arg0.method7735();
        this.field2856 = arg0.method7716();
        this.field2857 = arg0.method7735();
        this.field2862 = arg0.method7735();
        this.field2858 = arg0.method7716();
        this.field2861 = arg0.method7735();
        this.field2863 = arg0.method7735();
        this.field2865 = arg0.method7716();
        this.field2854 = arg0.method7735();
        this.field2866 = arg0.method7735();
        this.field2867 = arg0.method7716();
        this.field2860 = arg0.method7735();
        this.field2864 = arg0.method7735();
        this.method4665();
    }

    @ObfuscatedName("ib.y(I)V")
    public void method4665() {
    }
}
