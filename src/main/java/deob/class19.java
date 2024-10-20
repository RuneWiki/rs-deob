package deob;

@ObfuscatedName("y")
public class class19 implements class32 {

    @ObfuscatedName("y.v")
    public int field160;

    @ObfuscatedName("y.s")
    public int field158;

    @ObfuscatedName("y.o")
    public int field161;

    @ObfuscatedName("y.k")
    public int field153;

    @ObfuscatedName("y.u")
    public int field156;

    @ObfuscatedName("y.i")
    public int field157;

    @ObfuscatedName("y.t")
    public int field154;

    @ObfuscatedName("y.p")
    public int field159;

    @ObfuscatedName("y.l")
    public int field155;

    @ObfuscatedName("y.b")
    public int field152;

    @ObfuscatedName("y.v(Lh;I)V")
    public void method147(class21 arg0) {
        if (arg0.field173 > this.field154) {
            arg0.field173 = this.field154;
        }
        if (arg0.field178 < this.field155) {
            arg0.field178 = this.field155;
        }
        if (arg0.field181 > this.field159) {
            arg0.field181 = this.field159;
        }
        if (arg0.field182 < this.field152) {
            arg0.field182 = this.field152;
        }
    }

    @ObfuscatedName("y.s(IIII)Z")
    public boolean method167(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field160 && arg0 < this.field160 + this.field158) {
            return arg1 >> 6 >= this.field161 && arg1 >> 6 <= this.field156 && arg2 >> 6 >= this.field153 && arg2 >> 6 <= this.field157;
        } else {
            return false;
        }
    }

    @ObfuscatedName("y.o(III)Z")
    public boolean method149(int arg0, int arg1) {
        return arg0 >> 6 >= this.field154 && arg0 >> 6 <= this.field155 && arg1 >> 6 >= this.field159 && arg1 >> 6 <= this.field152;
    }

    @ObfuscatedName("y.k(IIIB)[I")
    public int[] method150(int arg0, int arg1, int arg2) {
        return this.method167(arg0, arg1, arg2) ? new int[] { this.field154 * 64 - this.field161 * 64 + arg1, this.field159 * 64 - this.field153 * 64 + arg2 } : null;
    }

    @ObfuscatedName("y.u(IIB)Lhv;")
    public class229 method151(int arg0, int arg1) {
        if (this.method149(arg0, arg1)) {
            int var3 = this.field161 * 64 - this.field154 * 64 + arg0;
            int var4 = this.field153 * 64 - this.field159 * 64 + arg1;
            return new class229(this.field160, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("y.i(Lgx;I)V")
    public void method152(class185 arg0) {
        this.field160 = arg0.method3274();
        this.field158 = arg0.method3274();
        this.field161 = arg0.method3276();
        this.field153 = arg0.method3276();
        this.field156 = arg0.method3276();
        this.field157 = arg0.method3276();
        this.field154 = arg0.method3276();
        this.field159 = arg0.method3276();
        this.field155 = arg0.method3276();
        this.field152 = arg0.method3276();
        this.method215();
    }

    @ObfuscatedName("y.t(I)V")
    public void method215() {
    }
}
