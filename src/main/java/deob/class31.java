package deob;

@ObfuscatedName("as")
public class class31 implements class43 {

    @ObfuscatedName("as.m")
    public int field418;

    @ObfuscatedName("as.p")
    public int field413;

    @ObfuscatedName("as.i")
    public int field414;

    @ObfuscatedName("as.j")
    public int field415;

    @ObfuscatedName("as.v")
    public int field416;

    @ObfuscatedName("as.x")
    public int field412;

    @ObfuscatedName("as.e")
    public int field417;

    @ObfuscatedName("as.l")
    public int field419;

    @ObfuscatedName("as.b")
    public int field420;

    @ObfuscatedName("as.n")
    public int field421;

    @ObfuscatedName("as.m(Lap;I)V")
    public void method194(class33 arg0) {
        if (arg0.field431 > this.field417) {
            arg0.field431 = this.field417;
        }
        if (arg0.field433 < this.field420) {
            arg0.field433 = this.field420;
        }
        if (arg0.field439 > this.field419) {
            arg0.field439 = this.field419;
        }
        if (arg0.field440 < this.field421) {
            arg0.field440 = this.field421;
        }
    }

    @ObfuscatedName("as.p(IIII)Z")
    public boolean method193(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field418 && arg0 < this.field418 + this.field413) {
            return arg1 >> 6 >= this.field414 && arg1 >> 6 <= this.field416 && arg2 >> 6 >= this.field415 && arg2 >> 6 <= this.field412;
        } else {
            return false;
        }
    }

    @ObfuscatedName("as.i(IIB)Z")
    public boolean method196(int arg0, int arg1) {
        return arg0 >> 6 >= this.field417 && arg0 >> 6 <= this.field420 && arg1 >> 6 >= this.field419 && arg1 >> 6 <= this.field421;
    }

    @ObfuscatedName("as.j(IIII)[I")
    public int[] method197(int arg0, int arg1, int arg2) {
        return this.method193(arg0, arg1, arg2) ? new int[] { this.field417 * 64 - this.field414 * 64 + arg1, this.field419 * 64 - this.field415 * 64 + arg2 } : null;
    }

    @ObfuscatedName("as.v(IIB)Lhq;")
    public class220 method198(int arg0, int arg1) {
        if (this.method196(arg0, arg1)) {
            int var3 = this.field414 * 64 - this.field417 * 64 + arg0;
            int var4 = this.field415 * 64 - this.field419 * 64 + arg1;
            return new class220(this.field418, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("as.x(Lfv;S)V")
    public void method199(class181 arg0) {
        this.field418 = arg0.method3012();
        this.field413 = arg0.method3012();
        this.field414 = arg0.method3009();
        this.field415 = arg0.method3009();
        this.field416 = arg0.method3009();
        this.field412 = arg0.method3009();
        this.field417 = arg0.method3009();
        this.field419 = arg0.method3009();
        this.field420 = arg0.method3009();
        this.field421 = arg0.method3009();
        this.method258();
    }

    @ObfuscatedName("as.e(I)V")
    public void method258() {
    }
}
