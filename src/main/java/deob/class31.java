package deob;

@ObfuscatedName("ao")
public class class31 implements class43 {

    @ObfuscatedName("ao.e")
    public int field443;

    @ObfuscatedName("ao.n")
    public int field431;

    @ObfuscatedName("ao.g")
    public int field432;

    @ObfuscatedName("ao.y")
    public int field433;

    @ObfuscatedName("ao.w")
    public int field434;

    @ObfuscatedName("ao.k")
    public int field430;

    @ObfuscatedName("ao.v")
    public int field440;

    @ObfuscatedName("ao.z")
    public int field437;

    @ObfuscatedName("ao.r")
    public int field438;

    @ObfuscatedName("ao.u")
    public int field439;

    @ObfuscatedName("ao.e(Lae;B)V")
    public void method181(class33 arg0) {
        if (arg0.field458 > this.field440) {
            arg0.field458 = this.field440;
        }
        if (arg0.field461 < this.field438) {
            arg0.field461 = this.field438;
        }
        if (arg0.field454 > this.field437) {
            arg0.field454 = this.field437;
        }
        if (arg0.field463 < this.field439) {
            arg0.field463 = this.field439;
        }
    }

    @ObfuscatedName("ao.n(IIII)Z")
    public boolean method209(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field443 && arg0 < this.field443 + this.field431) {
            return arg1 >> 6 >= this.field432 && arg1 >> 6 <= this.field434 && arg2 >> 6 >= this.field433 && arg2 >> 6 <= this.field430;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ao.g(III)Z")
    public boolean method183(int arg0, int arg1) {
        return arg0 >> 6 >= this.field440 && arg0 >> 6 <= this.field438 && arg1 >> 6 >= this.field437 && arg1 >> 6 <= this.field439;
    }

    @ObfuscatedName("ao.y(IIII)[I")
    public int[] method184(int arg0, int arg1, int arg2) {
        return this.method209(arg0, arg1, arg2) ? new int[] { this.field440 * 64 - this.field432 * 64 + arg1, this.field437 * 64 - this.field433 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ao.w(III)Lhq;")
    public class214 method198(int arg0, int arg1) {
        if (this.method183(arg0, arg1)) {
            int var3 = this.field432 * 64 - this.field440 * 64 + arg0;
            int var4 = this.field433 * 64 - this.field437 * 64 + arg1;
            return new class214(this.field443, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ao.k(Lfh;B)V")
    public void method186(class175 arg0) {
        this.field443 = arg0.method2928();
        this.field431 = arg0.method2928();
        this.field432 = arg0.method3091();
        this.field433 = arg0.method3091();
        this.field434 = arg0.method3091();
        this.field430 = arg0.method3091();
        this.field440 = arg0.method3091();
        this.field437 = arg0.method3091();
        this.field438 = arg0.method3091();
        this.field439 = arg0.method3091();
        this.method242();
    }

    @ObfuscatedName("ao.v(I)V")
    public void method242() {
    }
}
