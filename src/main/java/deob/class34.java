package deob;

@ObfuscatedName("ax")
public class class34 implements class38 {

    @ObfuscatedName("ax.q")
    public int field294;

    @ObfuscatedName("ax.w")
    public int field287;

    @ObfuscatedName("ax.e")
    public int field295;

    @ObfuscatedName("ax.p")
    public int field289;

    @ObfuscatedName("ax.k")
    public int field288;

    @ObfuscatedName("ax.l")
    public int field291;

    @ObfuscatedName("ax.q(Lal;B)V")
    public void method198(class27 arg0) {
        if (arg0.field218 > this.field288) {
            arg0.field218 = this.field288;
        }
        if (arg0.field224 < this.field288) {
            arg0.field224 = this.field288;
        }
        if (arg0.field221 > this.field291) {
            arg0.field221 = this.field291;
        }
        if (arg0.field223 < this.field291) {
            arg0.field223 = this.field291;
        }
    }

    @ObfuscatedName("ax.w(IIII)Z")
    public boolean method199(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field294 && arg0 < this.field294 + this.field287) {
            return arg1 >> 6 == this.field295 && arg2 >> 6 == this.field289;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ax.e(IIB)Z")
    public boolean method213(int arg0, int arg1) {
        return arg0 >> 6 == this.field288 && arg1 >> 6 == this.field291;
    }

    @ObfuscatedName("ax.p(IIIB)[I")
    public int[] method201(int arg0, int arg1, int arg2) {
        return this.method199(arg0, arg1, arg2) ? new int[] { this.field288 * 64 - this.field295 * 64 + arg1, this.field291 * 64 - this.field289 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ax.k(IIB)Lhv;")
    public class214 method215(int arg0, int arg1) {
        if (this.method213(arg0, arg1)) {
            int var3 = this.field295 * 64 - this.field288 * 64 + arg0;
            int var4 = this.field289 * 64 - this.field291 * 64 + arg1;
            return new class214(this.field294, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ax.l(Lkf;I)V")
    public void method203(class301 arg0) {
        this.field294 = arg0.method5077();
        this.field287 = arg0.method5077();
        this.field295 = arg0.method5069();
        this.field289 = arg0.method5069();
        this.field288 = arg0.method5069();
        this.field291 = arg0.method5069();
        this.method494();
    }

    @ObfuscatedName("ax.b(I)V")
    public void method494() {
    }
}
