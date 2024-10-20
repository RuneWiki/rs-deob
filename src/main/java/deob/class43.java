package deob;

@ObfuscatedName("aa")
public class class43 implements class38 {

    @ObfuscatedName("aa.q")
    public int field369;

    @ObfuscatedName("aa.w")
    public int field364;

    @ObfuscatedName("aa.e")
    public int field365;

    @ObfuscatedName("aa.p")
    public int field366;

    @ObfuscatedName("aa.k")
    public int field367;

    @ObfuscatedName("aa.l")
    public int field376;

    @ObfuscatedName("aa.b")
    public int field377;

    @ObfuscatedName("aa.i")
    public int field370;

    @ObfuscatedName("aa.c")
    public int field371;

    @ObfuscatedName("aa.f")
    public int field372;

    @ObfuscatedName("aa.q(Lal;B)V")
    public void method198(class27 arg0) {
        if (arg0.field218 > this.field367) {
            arg0.field218 = this.field367;
        }
        if (arg0.field224 < this.field367) {
            arg0.field224 = this.field367;
        }
        if (arg0.field221 > this.field376) {
            arg0.field221 = this.field376;
        }
        if (arg0.field223 < this.field376) {
            arg0.field223 = this.field376;
        }
    }

    @ObfuscatedName("aa.w(IIII)Z")
    public boolean method199(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field369 && arg0 < this.field369 + this.field364) {
            return arg1 >= (this.field377 << 3) + (this.field365 << 6) && arg1 <= (this.field377 << 3) + (this.field365 << 6) + 7 && arg2 >= (this.field370 << 3) + (this.field366 << 6) && arg2 <= (this.field370 << 3) + (this.field366 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aa.e(IIB)Z")
    public boolean method213(int arg0, int arg1) {
        return arg0 >= (this.field371 << 3) + (this.field367 << 6) && arg0 <= (this.field371 << 3) + (this.field367 << 6) + 7 && arg1 >= (this.field376 << 6) + (this.field372 << 3) && arg1 <= (this.field376 << 6) + (this.field372 << 3) + 7;
    }

    @ObfuscatedName("aa.p(IIIB)[I")
    public int[] method201(int arg0, int arg1, int arg2) {
        return this.method199(arg0, arg1, arg2) ? new int[] { this.field371 * 8 - this.field377 * 8 + this.field367 * 64 - this.field365 * 64 + arg1, this.field372 * 8 - this.field370 * 8 + this.field376 * 64 - this.field366 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aa.k(IIB)Lhv;")
    public class214 method215(int arg0, int arg1) {
        if (this.method213(arg0, arg1)) {
            int var3 = this.field377 * 8 - this.field371 * 8 + this.field365 * 64 - this.field367 * 64 + arg0;
            int var4 = this.field370 * 8 - this.field372 * 8 + this.field366 * 64 - this.field376 * 64 + arg1;
            return new class214(this.field369, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aa.l(Lkf;I)V")
    public void method203(class301 arg0) {
        this.field369 = arg0.method5077();
        this.field364 = arg0.method5077();
        this.field365 = arg0.method5069();
        this.field377 = arg0.method5077();
        this.field366 = arg0.method5069();
        this.field370 = arg0.method5077();
        this.field367 = arg0.method5069();
        this.field371 = arg0.method5077();
        this.field376 = arg0.method5069();
        this.field372 = arg0.method5077();
        this.method621();
    }

    @ObfuscatedName("aa.b(I)V")
    public void method621() {
    }
}
