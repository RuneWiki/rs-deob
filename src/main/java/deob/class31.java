package deob;

@ObfuscatedName("aq")
public class class31 implements class43 {

    @ObfuscatedName("aq.d")
    public int field407;

    @ObfuscatedName("aq.x")
    public int field418;

    @ObfuscatedName("aq.k")
    public int field406;

    @ObfuscatedName("aq.z")
    public int field408;

    @ObfuscatedName("aq.v")
    public int field412;

    @ObfuscatedName("aq.m")
    public int field410;

    @ObfuscatedName("aq.b")
    public int field411;

    @ObfuscatedName("aq.t")
    public int field417;

    @ObfuscatedName("aq.p")
    public int field413;

    @ObfuscatedName("aq.r")
    public int field414;

    @ObfuscatedName("aq.d(Lal;I)V")
    public void method193(class33 arg0) {
        if (arg0.field428 > this.field411) {
            arg0.field428 = this.field411;
        }
        if (arg0.field432 < this.field413) {
            arg0.field432 = this.field413;
        }
        if (arg0.field429 > this.field417) {
            arg0.field429 = this.field417;
        }
        if (arg0.field437 < this.field414) {
            arg0.field437 = this.field414;
        }
    }

    @ObfuscatedName("aq.x(IIII)Z")
    public boolean method184(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field407 && arg0 < this.field418 + this.field407) {
            return arg1 >> 6 >= this.field406 && arg1 >> 6 <= this.field412 && arg2 >> 6 >= this.field408 && arg2 >> 6 <= this.field410;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aq.k(IIB)Z")
    public boolean method192(int arg0, int arg1) {
        return arg0 >> 6 >= this.field411 && arg0 >> 6 <= this.field413 && arg1 >> 6 >= this.field417 && arg1 >> 6 <= this.field414;
    }

    @ObfuscatedName("aq.z(IIII)[I")
    public int[] method186(int arg0, int arg1, int arg2) {
        return this.method184(arg0, arg1, arg2) ? new int[] { this.field411 * 64 - this.field406 * 64 + arg1, this.field417 * 64 - this.field408 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aq.v(IIB)Lhp;")
    public class220 method187(int arg0, int arg1) {
        if (this.method192(arg0, arg1)) {
            int var3 = this.field406 * 64 - this.field411 * 64 + arg0;
            int var4 = this.field408 * 64 - this.field417 * 64 + arg1;
            return new class220(this.field407, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aq.m(Lfr;I)V")
    public void method188(class181 arg0) {
        this.field407 = arg0.method3204();
        this.field418 = arg0.method3204();
        this.field406 = arg0.method3179();
        this.field408 = arg0.method3179();
        this.field412 = arg0.method3179();
        this.field410 = arg0.method3179();
        this.field411 = arg0.method3179();
        this.field417 = arg0.method3179();
        this.field413 = arg0.method3179();
        this.field414 = arg0.method3179();
        this.method234();
    }

    @ObfuscatedName("aq.b(B)V")
    public void method234() {
    }
}
