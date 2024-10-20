package deob;

@ObfuscatedName("av")
public class class31 implements class43 {

    @ObfuscatedName("av.c")
    public int field423;

    @ObfuscatedName("av.o")
    public int field417;

    @ObfuscatedName("av.i")
    public int field415;

    @ObfuscatedName("av.u")
    public int field425;

    @ObfuscatedName("av.g")
    public int field413;

    @ObfuscatedName("av.m")
    public int field419;

    @ObfuscatedName("av.s")
    public int field416;

    @ObfuscatedName("av.x")
    public int field420;

    @ObfuscatedName("av.p")
    public int field421;

    @ObfuscatedName("av.k")
    public int field422;

    @ObfuscatedName("av.c(Lab;S)V")
    public void method172(class33 arg0) {
        if (arg0.field444 > this.field416) {
            arg0.field444 = this.field416;
        }
        if (arg0.field445 < this.field421) {
            arg0.field445 = this.field421;
        }
        if (arg0.field443 > this.field420) {
            arg0.field443 = this.field420;
        }
        if (arg0.field436 < this.field422) {
            arg0.field436 = this.field422;
        }
    }

    @ObfuscatedName("av.o(IIII)Z")
    public boolean method173(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field423 && arg0 < this.field423 + this.field417) {
            return arg1 >> 6 >= this.field415 && arg1 >> 6 <= this.field413 && arg2 >> 6 >= this.field425 && arg2 >> 6 <= this.field419;
        } else {
            return false;
        }
    }

    @ObfuscatedName("av.i(IIS)Z")
    public boolean method174(int arg0, int arg1) {
        return arg0 >> 6 >= this.field416 && arg0 >> 6 <= this.field421 && arg1 >> 6 >= this.field420 && arg1 >> 6 <= this.field422;
    }

    @ObfuscatedName("av.u(IIII)[I")
    public int[] method175(int arg0, int arg1, int arg2) {
        return this.method173(arg0, arg1, arg2) ? new int[] { this.field416 * 64 - this.field415 * 64 + arg1, this.field420 * 64 - this.field425 * 64 + arg2 } : null;
    }

    @ObfuscatedName("av.g(III)Lhs;")
    public class213 method179(int arg0, int arg1) {
        if (this.method174(arg0, arg1)) {
            int var3 = this.field415 * 64 - this.field416 * 64 + arg0;
            int var4 = this.field425 * 64 - this.field420 * 64 + arg1;
            return new class213(this.field423, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("av.m(Lfp;B)V")
    public void method177(class174 arg0) {
        this.field423 = arg0.method2843();
        this.field417 = arg0.method2843();
        this.field415 = arg0.method2861();
        this.field425 = arg0.method2861();
        this.field413 = arg0.method2861();
        this.field419 = arg0.method2861();
        this.field416 = arg0.method2861();
        this.field420 = arg0.method2861();
        this.field421 = arg0.method2861();
        this.field422 = arg0.method2861();
        this.method234();
    }

    @ObfuscatedName("av.s(B)V")
    public void method234() {
    }
}
