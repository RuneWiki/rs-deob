package deob;

@ObfuscatedName("it")
public class class235 implements class238 {

    @ObfuscatedName("it.c")
    public int field2752;

    @ObfuscatedName("it.b")
    public int field2750;

    @ObfuscatedName("it.p")
    public int field2751;

    @ObfuscatedName("it.m")
    public int field2757;

    @ObfuscatedName("it.t")
    public int field2753;

    @ObfuscatedName("it.s")
    public int field2754;

    @ObfuscatedName("it.c(Lhr;I)V")
    public void method4050(class218 arg0) {
        if (arg0.field2603 > this.field2753) {
            arg0.field2603 = this.field2753;
        }
        if (arg0.field2610 < this.field2753) {
            arg0.field2610 = this.field2753;
        }
        if (arg0.field2611 > this.field2754) {
            arg0.field2611 = this.field2754;
        }
        if (arg0.field2608 < this.field2754) {
            arg0.field2608 = this.field2754;
        }
    }

    @ObfuscatedName("it.b(IIIB)Z")
    public boolean method4051(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2752 && arg0 < this.field2752 + this.field2750) {
            return arg1 >> 6 == this.field2751 && arg2 >> 6 == this.field2757;
        } else {
            return false;
        }
    }

    @ObfuscatedName("it.p(III)Z")
    public boolean method4049(int arg0, int arg1) {
        return arg0 >> 6 == this.field2753 && arg1 >> 6 == this.field2754;
    }

    @ObfuscatedName("it.m(IIII)[I")
    public int[] method4053(int arg0, int arg1, int arg2) {
        return this.method4051(arg0, arg1, arg2) ? new int[] { this.field2753 * 64 - this.field2751 * 64 + arg1, this.field2754 * 64 - this.field2757 * 64 + arg2 } : null;
    }

    @ObfuscatedName("it.t(IIS)Lju;")
    public class277 method4056(int arg0, int arg1) {
        if (this.method4049(arg0, arg1)) {
            int var3 = this.field2751 * 64 - this.field2753 * 64 + arg0;
            int var4 = this.field2757 * 64 - this.field2754 * 64 + arg1;
            return new class277(this.field2752, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("it.s(Lpi;S)V")
    public void method4054(class419 arg0) {
        this.field2752 = arg0.method6781();
        this.field2750 = arg0.method6781();
        this.field2751 = arg0.method6672();
        this.field2757 = arg0.method6672();
        this.field2753 = arg0.method6672();
        this.field2754 = arg0.method6672();
        this.method4404();
    }

    @ObfuscatedName("it.j(I)V")
    public void method4404() {
    }
}
