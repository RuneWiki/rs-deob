package deob;

@ObfuscatedName("l")
public class class25 implements class38 {

    @ObfuscatedName("l.z")
    public int field198;

    @ObfuscatedName("l.n")
    public int field187;

    @ObfuscatedName("l.v")
    public int field188;

    @ObfuscatedName("l.u")
    public int field190;

    @ObfuscatedName("l.r")
    public int field186;

    @ObfuscatedName("l.p")
    public int field191;

    @ObfuscatedName("l.q")
    public int field192;

    @ObfuscatedName("l.m")
    public int field193;

    @ObfuscatedName("l.y")
    public int field194;

    @ObfuscatedName("l.i")
    public int field197;

    @ObfuscatedName("l.z(Lac;I)V")
    public void method210(class27 arg0) {
        if (arg0.field209 > this.field192) {
            arg0.field209 = this.field192;
        }
        if (arg0.field213 < this.field194) {
            arg0.field213 = this.field194;
        }
        if (arg0.field214 > this.field193) {
            arg0.field214 = this.field193;
        }
        if (arg0.field206 < this.field197) {
            arg0.field206 = this.field197;
        }
    }

    @ObfuscatedName("l.n(IIII)Z")
    public boolean method211(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field198 && arg0 < this.field198 + this.field187) {
            return arg1 >> 6 >= this.field188 && arg1 >> 6 <= this.field186 && arg2 >> 6 >= this.field190 && arg2 >> 6 <= this.field191;
        } else {
            return false;
        }
    }

    @ObfuscatedName("l.v(III)Z")
    public boolean method212(int arg0, int arg1) {
        return arg0 >> 6 >= this.field192 && arg0 >> 6 <= this.field194 && arg1 >> 6 >= this.field193 && arg1 >> 6 <= this.field197;
    }

    @ObfuscatedName("l.u(IIII)[I")
    public int[] method223(int arg0, int arg1, int arg2) {
        return this.method211(arg0, arg1, arg2) ? new int[] { this.field192 * 64 - this.field188 * 64 + arg1, this.field193 * 64 - this.field190 * 64 + arg2 } : null;
    }

    @ObfuscatedName("l.r(III)Lhb;")
    public class214 method214(int arg0, int arg1) {
        if (this.method212(arg0, arg1)) {
            int var3 = this.field188 * 64 - this.field192 * 64 + arg0;
            int var4 = this.field190 * 64 - this.field193 * 64 + arg1;
            return new class214(this.field198, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("l.p(Lkl;B)V")
    public void method215(class300 arg0) {
        this.field198 = arg0.method4990();
        this.field187 = arg0.method4990();
        this.field188 = arg0.method4992();
        this.field190 = arg0.method4992();
        this.field186 = arg0.method4992();
        this.field191 = arg0.method4992();
        this.field192 = arg0.method4992();
        this.field193 = arg0.method4992();
        this.field194 = arg0.method4992();
        this.field197 = arg0.method4992();
        this.method276();
    }

    @ObfuscatedName("l.q(B)V")
    public void method276() {
    }
}
