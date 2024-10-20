package deob;

@ObfuscatedName("an")
public class class31 implements class43 {

    @ObfuscatedName("an.s")
    public int field419;

    @ObfuscatedName("an.g")
    public int field417;

    @ObfuscatedName("an.m")
    public int field409;

    @ObfuscatedName("an.h")
    public int field411;

    @ObfuscatedName("an.i")
    public int field412;

    @ObfuscatedName("an.w")
    public int field413;

    @ObfuscatedName("an.t")
    public int field410;

    @ObfuscatedName("an.d")
    public int field415;

    @ObfuscatedName("an.z")
    public int field416;

    @ObfuscatedName("an.k")
    public int field408;

    @ObfuscatedName("an.s(Las;I)V")
    public void method181(class33 arg0) {
        if (arg0.field433 > this.field410) {
            arg0.field433 = this.field410;
        }
        if (arg0.field434 < this.field416) {
            arg0.field434 = this.field416;
        }
        if (arg0.field427 > this.field415) {
            arg0.field427 = this.field415;
        }
        if (arg0.field436 < this.field408) {
            arg0.field436 = this.field408;
        }
    }

    @ObfuscatedName("an.g(IIIB)Z")
    public boolean method182(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field419 && arg0 < this.field419 + this.field417) {
            return arg1 >> 6 >= this.field409 && arg1 >> 6 <= this.field412 && arg2 >> 6 >= this.field411 && arg2 >> 6 <= this.field413;
        } else {
            return false;
        }
    }

    @ObfuscatedName("an.m(III)Z")
    public boolean method183(int arg0, int arg1) {
        return arg0 >> 6 >= this.field410 && arg0 >> 6 <= this.field416 && arg1 >> 6 >= this.field415 && arg1 >> 6 <= this.field408;
    }

    @ObfuscatedName("an.h(IIII)[I")
    public int[] method187(int arg0, int arg1, int arg2) {
        return this.method182(arg0, arg1, arg2) ? new int[] { this.field410 * 64 - this.field409 * 64 + arg1, this.field415 * 64 - this.field411 * 64 + arg2 } : null;
    }

    @ObfuscatedName("an.i(IIB)Lhv;")
    public class224 method185(int arg0, int arg1) {
        if (this.method183(arg0, arg1)) {
            int var3 = this.field409 * 64 - this.field410 * 64 + arg0;
            int var4 = this.field411 * 64 - this.field415 * 64 + arg1;
            return new class224(this.field419, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.w(Lgy;I)V")
    public void method186(class185 arg0) {
        this.field419 = arg0.method3239();
        this.field417 = arg0.method3239();
        this.field409 = arg0.method3241();
        this.field411 = arg0.method3241();
        this.field412 = arg0.method3241();
        this.field413 = arg0.method3241();
        this.field410 = arg0.method3241();
        this.field415 = arg0.method3241();
        this.field416 = arg0.method3241();
        this.field408 = arg0.method3241();
        this.method238();
    }

    @ObfuscatedName("an.t(I)V")
    public void method238() {
    }
}
