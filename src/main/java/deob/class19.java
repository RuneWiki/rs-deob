package deob;

@ObfuscatedName("x")
public class class19 implements class32 {

    @ObfuscatedName("x.y")
    public int field162;

    @ObfuscatedName("x.c")
    public int field171;

    @ObfuscatedName("x.n")
    public int field160;

    @ObfuscatedName("x.u")
    public int field161;

    @ObfuscatedName("x.i")
    public int field158;

    @ObfuscatedName("x.r")
    public int field163;

    @ObfuscatedName("x.j")
    public int field167;

    @ObfuscatedName("x.p")
    public int field165;

    @ObfuscatedName("x.e")
    public int field166;

    @ObfuscatedName("x.s")
    public int field168;

    @ObfuscatedName("x.y(Lw;S)V")
    public void method119(class21 arg0) {
        if (arg0.field185 > this.field167) {
            arg0.field185 = this.field167;
        }
        if (arg0.field195 < this.field166) {
            arg0.field195 = this.field166;
        }
        if (arg0.field187 > this.field165) {
            arg0.field187 = this.field165;
        }
        if (arg0.field188 < this.field168) {
            arg0.field188 = this.field168;
        }
    }

    @ObfuscatedName("x.c(IIIS)Z")
    public boolean method129(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field162 && arg0 < this.field171 + this.field162) {
            return arg1 >> 6 >= this.field160 && arg1 >> 6 <= this.field158 && arg2 >> 6 >= this.field161 && arg2 >> 6 <= this.field163;
        } else {
            return false;
        }
    }

    @ObfuscatedName("x.n(III)Z")
    public boolean method121(int arg0, int arg1) {
        return arg0 >> 6 >= this.field167 && arg0 >> 6 <= this.field166 && arg1 >> 6 >= this.field165 && arg1 >> 6 <= this.field168;
    }

    @ObfuscatedName("x.u(IIIB)[I")
    public int[] method118(int arg0, int arg1, int arg2) {
        return this.method129(arg0, arg1, arg2) ? new int[] { this.field167 * 64 - this.field160 * 64 + arg1, this.field165 * 64 - this.field161 * 64 + arg2 } : null;
    }

    @ObfuscatedName("x.i(III)Lhm;")
    public class229 method123(int arg0, int arg1) {
        if (this.method121(arg0, arg1)) {
            int var3 = this.field160 * 64 - this.field167 * 64 + arg0;
            int var4 = this.field161 * 64 - this.field165 * 64 + arg1;
            return new class229(this.field162, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("x.p(Lge;I)V")
    public void method122(class185 arg0) {
        this.field162 = arg0.method3299();
        this.field171 = arg0.method3299();
        this.field160 = arg0.method3280();
        this.field161 = arg0.method3280();
        this.field158 = arg0.method3280();
        this.field163 = arg0.method3280();
        this.field167 = arg0.method3280();
        this.field165 = arg0.method3280();
        this.field166 = arg0.method3280();
        this.field168 = arg0.method3280();
        this.method180();
    }

    @ObfuscatedName("x.e(I)V")
    public void method180() {
    }
}
