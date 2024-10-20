package deob;

@ObfuscatedName("ab")
public class class28 implements class32 {

    @ObfuscatedName("ab.v")
    public int field245;

    @ObfuscatedName("ab.s")
    public int field237;

    @ObfuscatedName("ab.o")
    public int field239;

    @ObfuscatedName("ab.k")
    public int field240;

    @ObfuscatedName("ab.u")
    public int field241;

    @ObfuscatedName("ab.i")
    public int field242;

    @ObfuscatedName("ab.v(Lh;I)V")
    public void method147(class21 arg0) {
        if (arg0.field173 > this.field241) {
            arg0.field173 = this.field241;
        }
        if (arg0.field178 < this.field241) {
            arg0.field178 = this.field241;
        }
        if (arg0.field181 > this.field242) {
            arg0.field181 = this.field242;
        }
        if (arg0.field182 < this.field242) {
            arg0.field182 = this.field242;
        }
    }

    @ObfuscatedName("ab.s(IIII)Z")
    public boolean method167(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field245 && arg0 < this.field245 + this.field237) {
            return arg1 >> 6 == this.field239 && arg2 >> 6 == this.field240;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ab.o(III)Z")
    public boolean method149(int arg0, int arg1) {
        return arg0 >> 6 == this.field241 && arg1 >> 6 == this.field242;
    }

    @ObfuscatedName("ab.k(IIIB)[I")
    public int[] method150(int arg0, int arg1, int arg2) {
        return this.method167(arg0, arg1, arg2) ? new int[] { this.field241 * 64 - this.field239 * 64 + arg1, this.field242 * 64 - this.field240 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ab.u(IIB)Lhv;")
    public class229 method151(int arg0, int arg1) {
        if (this.method149(arg0, arg1)) {
            int var3 = this.field239 * 64 - this.field241 * 64 + arg0;
            int var4 = this.field240 * 64 - this.field242 * 64 + arg1;
            return new class229(this.field245, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ab.i(Lgx;I)V")
    public void method152(class185 arg0) {
        this.field245 = arg0.method3274();
        this.field237 = arg0.method3274();
        this.field239 = arg0.method3276();
        this.field240 = arg0.method3276();
        this.field241 = arg0.method3276();
        this.field242 = arg0.method3276();
        this.method469();
    }

    @ObfuscatedName("ab.t(B)V")
    public void method469() {
    }
}
