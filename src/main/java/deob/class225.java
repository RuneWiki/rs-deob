package deob;

@ObfuscatedName("hf")
public class class225 implements class246 {

    @ObfuscatedName("hf.c")
    public int field2721;

    @ObfuscatedName("hf.p")
    public int field2719;

    @ObfuscatedName("hf.f")
    public int field2720;

    @ObfuscatedName("hf.n")
    public int field2722;

    @ObfuscatedName("hf.k")
    public int field2728;

    @ObfuscatedName("hf.w")
    public int field2723;

    @ObfuscatedName("hf.s")
    public int field2718;

    @ObfuscatedName("hf.q")
    public int field2725;

    @ObfuscatedName("hf.m")
    public int field2726;

    @ObfuscatedName("hf.x")
    public int field2727;

    @ObfuscatedName("hf.c(Lht;I)V")
    public void method4310(class226 arg0) {
        if (arg0.field2737 > this.field2718) {
            arg0.field2737 = this.field2718;
        }
        if (arg0.field2745 < this.field2726) {
            arg0.field2745 = this.field2726;
        }
        if (arg0.field2739 > this.field2725) {
            arg0.field2739 = this.field2725;
        }
        if (arg0.field2731 < this.field2727) {
            arg0.field2731 = this.field2727;
        }
    }

    @ObfuscatedName("hf.p(IIIB)Z")
    public boolean method4311(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2721 && arg0 < this.field2721 + this.field2719) {
            return arg1 >> 6 >= this.field2720 && arg1 >> 6 <= this.field2728 && arg2 >> 6 >= this.field2722 && arg2 >> 6 <= this.field2723;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hf.f(III)Z")
    public boolean method4312(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2718 && arg0 >> 6 <= this.field2726 && arg1 >> 6 >= this.field2725 && arg1 >> 6 <= this.field2727;
    }

    @ObfuscatedName("hf.n(IIIB)[I")
    public int[] method4313(int arg0, int arg1, int arg2) {
        return this.method4311(arg0, arg1, arg2) ? new int[] { this.field2718 * 64 - this.field2720 * 64 + arg1, this.field2725 * 64 - this.field2722 * 64 + arg2 } : null;
    }

    @ObfuscatedName("hf.k(III)Lkz;")
    public class291 method4331(int arg0, int arg1) {
        if (this.method4312(arg0, arg1)) {
            int var3 = this.field2720 * 64 - this.field2718 * 64 + arg0;
            int var4 = this.field2722 * 64 - this.field2725 * 64 + arg1;
            return new class291(this.field2721, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("hf.w(Lqq;I)V")
    public void method4317(class445 arg0) {
        this.field2721 = arg0.method7196();
        this.field2719 = arg0.method7196();
        this.field2720 = arg0.method7198();
        this.field2722 = arg0.method7198();
        this.field2728 = arg0.method7198();
        this.field2723 = arg0.method7198();
        this.field2718 = arg0.method7198();
        this.field2725 = arg0.method7198();
        this.field2726 = arg0.method7198();
        this.field2727 = arg0.method7198();
        this.method4316();
    }

    @ObfuscatedName("hf.s(I)V")
    public void method4316() {
    }
}
