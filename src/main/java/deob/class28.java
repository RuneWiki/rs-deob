package deob;

@ObfuscatedName("at")
public class class28 implements class32 {

    @ObfuscatedName("at.w")
    public int field240;

    @ObfuscatedName("at.m")
    public int field241;

    @ObfuscatedName("at.q")
    public int field242;

    @ObfuscatedName("at.b")
    public int field245;

    @ObfuscatedName("at.f")
    public int field244;

    @ObfuscatedName("at.n")
    public int field243;

    @ObfuscatedName("at.w(Li;I)V")
    public void method128(class21 arg0) {
        if (arg0.field177 > this.field244) {
            arg0.field177 = this.field244;
        }
        if (arg0.field178 < this.field244) {
            arg0.field178 = this.field244;
        }
        if (arg0.field179 > this.field243) {
            arg0.field179 = this.field243;
        }
        if (arg0.field180 < this.field243) {
            arg0.field180 = this.field243;
        }
    }

    @ObfuscatedName("at.m(IIII)Z")
    public boolean method127(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field240 && arg0 < this.field241 + this.field240) {
            return arg1 >> 6 == this.field242 && arg2 >> 6 == this.field245;
        } else {
            return false;
        }
    }

    @ObfuscatedName("at.q(III)Z")
    public boolean method130(int arg0, int arg1) {
        return arg0 >> 6 == this.field244 && arg1 >> 6 == this.field243;
    }

    @ObfuscatedName("at.x(IIII)[I")
    public int[] method131(int arg0, int arg1, int arg2) {
        return this.method127(arg0, arg1, arg2) ? new int[] { this.field244 * 64 - this.field242 * 64 + arg1, this.field243 * 64 - this.field245 * 64 + arg2 } : null;
    }

    @ObfuscatedName("at.j(III)Lhh;")
    public class227 method133(int arg0, int arg1) {
        if (this.method130(arg0, arg1)) {
            int var3 = this.field242 * 64 - this.field244 * 64 + arg0;
            int var4 = this.field245 * 64 - this.field243 * 64 + arg1;
            return new class227(this.field240, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("at.a(Lgy;S)V")
    public void method129(class183 arg0) {
        this.field240 = arg0.method3436();
        this.field241 = arg0.method3436();
        this.field242 = arg0.method3268();
        this.field245 = arg0.method3268();
        this.field244 = arg0.method3268();
        this.field243 = arg0.method3268();
        this.method450();
    }

    @ObfuscatedName("at.l(S)V")
    public void method450() {
    }
}
