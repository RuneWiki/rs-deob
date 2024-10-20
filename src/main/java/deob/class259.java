package deob;

@ObfuscatedName("im")
public class class259 implements class262 {

    @ObfuscatedName("im.f")
    public int field3000;

    @ObfuscatedName("im.w")
    public int field3002;

    @ObfuscatedName("im.v")
    public int field3001;

    @ObfuscatedName("im.s")
    public int field3004;

    @ObfuscatedName("im.z")
    public int field3003;

    @ObfuscatedName("im.j")
    public int field2999;

    @ObfuscatedName("im.f(Lii;I)V")
    public void method4545(class242 arg0) {
        if (arg0.field2858 > this.field3003) {
            arg0.field2858 = this.field3003;
        }
        if (arg0.field2853 < this.field3003) {
            arg0.field2853 = this.field3003;
        }
        if (arg0.field2854 > this.field2999) {
            arg0.field2854 = this.field2999;
        }
        if (arg0.field2855 < this.field2999) {
            arg0.field2855 = this.field2999;
        }
    }

    @ObfuscatedName("im.w(IIII)Z")
    public boolean method4549(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field3000 && arg0 < this.field3002 + this.field3000) {
            return arg1 >> 6 == this.field3001 && arg2 >> 6 == this.field3004;
        } else {
            return false;
        }
    }

    @ObfuscatedName("im.v(III)Z")
    public boolean method4558(int arg0, int arg1) {
        return arg0 >> 6 == this.field3003 && arg1 >> 6 == this.field2999;
    }

    @ObfuscatedName("im.s(IIII)[I")
    public int[] method4541(int arg0, int arg1, int arg2) {
        return this.method4549(arg0, arg1, arg2) ? new int[] { this.field3003 * 64 - this.field3001 * 64 + arg1, this.field2999 * 64 - this.field3004 * 64 + arg2 } : null;
    }

    @ObfuscatedName("im.z(III)Lko;")
    public class301 method4542(int arg0, int arg1) {
        if (this.method4558(arg0, arg1)) {
            int var3 = this.field3001 * 64 - this.field3003 * 64 + arg0;
            int var4 = this.field3004 * 64 - this.field2999 * 64 + arg1;
            return new class301(this.field3000, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("im.j(Lrd;I)V")
    public void method4543(class474 arg0) {
        this.field3000 = arg0.method7964();
        this.field3002 = arg0.method7964();
        this.field3001 = arg0.method8032();
        this.field3004 = arg0.method8032();
        this.field3003 = arg0.method8032();
        this.field2999 = arg0.method8032();
        this.method4918();
    }

    @ObfuscatedName("im.i(B)V")
    public void method4918() {
    }
}
