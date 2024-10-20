package deob;

@ObfuscatedName("ic")
public class class252 implements class255 {

    @ObfuscatedName("ic.a")
    public int field2936;

    @ObfuscatedName("ic.f")
    public int field2935;

    @ObfuscatedName("ic.c")
    public int field2934;

    @ObfuscatedName("ic.x")
    public int field2937;

    @ObfuscatedName("ic.h")
    public int field2938;

    @ObfuscatedName("ic.j")
    public int field2939;

    @ObfuscatedName("ic.a(Lit;S)V")
    public void method4373(class235 arg0) {
        if (arg0.field2787 > this.field2938) {
            arg0.field2787 = this.field2938;
        }
        if (arg0.field2781 < this.field2938) {
            arg0.field2781 = this.field2938;
        }
        if (arg0.field2788 > this.field2939) {
            arg0.field2788 = this.field2939;
        }
        if (arg0.field2790 < this.field2939) {
            arg0.field2790 = this.field2939;
        }
    }

    @ObfuscatedName("ic.f(IIIB)Z")
    public boolean method4371(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2936 && arg0 < this.field2936 + this.field2935) {
            return arg1 >> 6 == this.field2934 && arg2 >> 6 == this.field2937;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ic.c(III)Z")
    public boolean method4367(int arg0, int arg1) {
        return arg0 >> 6 == this.field2938 && arg1 >> 6 == this.field2939;
    }

    @ObfuscatedName("ic.x(IIII)[I")
    public int[] method4352(int arg0, int arg1, int arg2) {
        return this.method4371(arg0, arg1, arg2) ? new int[] { this.field2938 * 64 - this.field2934 * 64 + arg1, this.field2939 * 64 - this.field2937 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ic.h(IIB)Lki;")
    public class294 method4353(int arg0, int arg1) {
        if (this.method4367(arg0, arg1)) {
            int var3 = this.field2934 * 64 - this.field2938 * 64 + arg0;
            int var4 = this.field2937 * 64 - this.field2939 * 64 + arg1;
            return new class294(this.field2936, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ic.j(Lqr;I)V")
    public void method4354(class464 arg0) {
        this.field2936 = arg0.method7735();
        this.field2935 = arg0.method7735();
        this.field2934 = arg0.method7716();
        this.field2937 = arg0.method7716();
        this.field2938 = arg0.method7716();
        this.field2939 = arg0.method7716();
        this.method4727();
    }

    @ObfuscatedName("ic.y(I)V")
    public void method4727() {
    }
}
