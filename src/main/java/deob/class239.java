package deob;

@ObfuscatedName("im")
public class class239 implements class255 {

    @ObfuscatedName("im.a")
    public int field2838;

    @ObfuscatedName("im.f")
    public int field2832;

    @ObfuscatedName("im.c")
    public int field2833;

    @ObfuscatedName("im.x")
    public int field2834;

    @ObfuscatedName("im.h")
    public int field2835;

    @ObfuscatedName("im.j")
    public int field2840;

    @ObfuscatedName("im.y")
    public int field2837;

    @ObfuscatedName("im.d")
    public int field2831;

    @ObfuscatedName("im.n")
    public int field2839;

    @ObfuscatedName("im.r")
    public int field2836;

    @ObfuscatedName("im.a(Lit;S)V")
    public void method4373(class235 arg0) {
        if (arg0.field2787 > this.field2835) {
            arg0.field2787 = this.field2835;
        }
        if (arg0.field2781 < this.field2835) {
            arg0.field2781 = this.field2835;
        }
        if (arg0.field2788 > this.field2840) {
            arg0.field2788 = this.field2840;
        }
        if (arg0.field2790 < this.field2840) {
            arg0.field2790 = this.field2840;
        }
    }

    @ObfuscatedName("im.f(IIIB)Z")
    public boolean method4371(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2838 && arg0 < this.field2838 + this.field2832) {
            return arg1 >= (this.field2837 << 3) + (this.field2833 << 6) && arg1 <= (this.field2837 << 3) + (this.field2833 << 6) + 7 && arg2 >= (this.field2834 << 6) + (this.field2831 << 3) && arg2 <= (this.field2834 << 6) + (this.field2831 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("im.c(III)Z")
    public boolean method4367(int arg0, int arg1) {
        return arg0 >= (this.field2839 << 3) + (this.field2835 << 6) && arg0 <= (this.field2839 << 3) + (this.field2835 << 6) + 7 && arg1 >= (this.field2840 << 6) + (this.field2836 << 3) && arg1 <= (this.field2840 << 6) + (this.field2836 << 3) + 7;
    }

    @ObfuscatedName("im.x(IIII)[I")
    public int[] method4352(int arg0, int arg1, int arg2) {
        return this.method4371(arg0, arg1, arg2) ? new int[] { this.field2839 * 8 - this.field2837 * 8 + this.field2835 * 64 - this.field2833 * 64 + arg1, this.field2836 * 8 - this.field2831 * 8 + this.field2840 * 64 - this.field2834 * 64 + arg2 } : null;
    }

    @ObfuscatedName("im.h(IIB)Lki;")
    public class294 method4353(int arg0, int arg1) {
        if (this.method4367(arg0, arg1)) {
            int var3 = this.field2837 * 8 - this.field2839 * 8 + this.field2833 * 64 - this.field2835 * 64 + arg0;
            int var4 = this.field2831 * 8 - this.field2836 * 8 + this.field2834 * 64 - this.field2840 * 64 + arg1;
            return new class294(this.field2838, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("im.j(Lqr;I)V")
    public void method4354(class464 arg0) {
        this.field2838 = arg0.method7735();
        this.field2832 = arg0.method7735();
        this.field2833 = arg0.method7716();
        this.field2837 = arg0.method7735();
        this.field2834 = arg0.method7716();
        this.field2831 = arg0.method7735();
        this.field2835 = arg0.method7716();
        this.field2839 = arg0.method7735();
        this.field2840 = arg0.method7716();
        this.field2836 = arg0.method7735();
        this.method4654();
    }

    @ObfuscatedName("im.y(I)V")
    public void method4654() {
    }
}
