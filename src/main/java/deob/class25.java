package deob;

@ObfuscatedName("s")
public class class25 implements class38 {

    @ObfuscatedName("s.q")
    public int field198;

    @ObfuscatedName("s.w")
    public int field197;

    @ObfuscatedName("s.e")
    public int field201;

    @ObfuscatedName("s.p")
    public int field200;

    @ObfuscatedName("s.k")
    public int field208;

    @ObfuscatedName("s.l")
    public int field202;

    @ObfuscatedName("s.b")
    public int field203;

    @ObfuscatedName("s.i")
    public int field204;

    @ObfuscatedName("s.c")
    public int field205;

    @ObfuscatedName("s.f")
    public int field206;

    @ObfuscatedName("s.q(Lal;B)V")
    public void method198(class27 arg0) {
        if (arg0.field218 > this.field203) {
            arg0.field218 = this.field203;
        }
        if (arg0.field224 < this.field205) {
            arg0.field224 = this.field205;
        }
        if (arg0.field221 > this.field204) {
            arg0.field221 = this.field204;
        }
        if (arg0.field223 < this.field206) {
            arg0.field223 = this.field206;
        }
    }

    @ObfuscatedName("s.w(IIII)Z")
    public boolean method199(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field198 && arg0 < this.field198 + this.field197) {
            return arg1 >> 6 >= this.field201 && arg1 >> 6 <= this.field208 && arg2 >> 6 >= this.field200 && arg2 >> 6 <= this.field202;
        } else {
            return false;
        }
    }

    @ObfuscatedName("s.e(IIB)Z")
    public boolean method213(int arg0, int arg1) {
        return arg0 >> 6 >= this.field203 && arg0 >> 6 <= this.field205 && arg1 >> 6 >= this.field204 && arg1 >> 6 <= this.field206;
    }

    @ObfuscatedName("s.p(IIIB)[I")
    public int[] method201(int arg0, int arg1, int arg2) {
        return this.method199(arg0, arg1, arg2) ? new int[] { this.field203 * 64 - this.field201 * 64 + arg1, this.field204 * 64 - this.field200 * 64 + arg2 } : null;
    }

    @ObfuscatedName("s.k(IIB)Lhv;")
    public class214 method215(int arg0, int arg1) {
        if (this.method213(arg0, arg1)) {
            int var3 = this.field201 * 64 - this.field203 * 64 + arg0;
            int var4 = this.field200 * 64 - this.field204 * 64 + arg1;
            return new class214(this.field198, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("s.l(Lkf;I)V")
    public void method203(class301 arg0) {
        this.field198 = arg0.method5077();
        this.field197 = arg0.method5077();
        this.field201 = arg0.method5069();
        this.field200 = arg0.method5069();
        this.field208 = arg0.method5069();
        this.field202 = arg0.method5069();
        this.field203 = arg0.method5069();
        this.field204 = arg0.method5069();
        this.field205 = arg0.method5069();
        this.field206 = arg0.method5069();
        this.method264();
    }

    @ObfuscatedName("s.b(B)V")
    public void method264() {
    }
}
