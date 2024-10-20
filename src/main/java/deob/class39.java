package deob;

@ObfuscatedName("am")
public class class39 implements class43 {

    @ObfuscatedName("am.m")
    public int field495;

    @ObfuscatedName("am.p")
    public int field494;

    @ObfuscatedName("am.i")
    public int field493;

    @ObfuscatedName("am.j")
    public int field492;

    @ObfuscatedName("am.v")
    public int field496;

    @ObfuscatedName("am.x")
    public int field497;

    @ObfuscatedName("am.m(Lap;I)V")
    public void method194(class33 arg0) {
        if (arg0.field431 > this.field496) {
            arg0.field431 = this.field496;
        }
        if (arg0.field433 < this.field496) {
            arg0.field433 = this.field496;
        }
        if (arg0.field439 > this.field497) {
            arg0.field439 = this.field497;
        }
        if (arg0.field440 < this.field497) {
            arg0.field440 = this.field497;
        }
    }

    @ObfuscatedName("am.p(IIII)Z")
    public boolean method193(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field495 && arg0 < this.field495 + this.field494) {
            return arg1 >> 6 == this.field493 && arg2 >> 6 == this.field492;
        } else {
            return false;
        }
    }

    @ObfuscatedName("am.i(IIB)Z")
    public boolean method196(int arg0, int arg1) {
        return arg0 >> 6 == this.field496 && arg1 >> 6 == this.field497;
    }

    @ObfuscatedName("am.j(IIII)[I")
    public int[] method197(int arg0, int arg1, int arg2) {
        return this.method193(arg0, arg1, arg2) ? new int[] { this.field496 * 64 - this.field493 * 64 + arg1, this.field497 * 64 - this.field492 * 64 + arg2 } : null;
    }

    @ObfuscatedName("am.v(IIB)Lhq;")
    public class220 method198(int arg0, int arg1) {
        if (this.method196(arg0, arg1)) {
            int var3 = this.field493 * 64 - this.field496 * 64 + arg0;
            int var4 = this.field492 * 64 - this.field497 * 64 + arg1;
            return new class220(this.field495, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("am.x(Lfv;S)V")
    public void method199(class181 arg0) {
        this.field495 = arg0.method3012();
        this.field494 = arg0.method3012();
        this.field493 = arg0.method3009();
        this.field492 = arg0.method3009();
        this.field496 = arg0.method3009();
        this.field497 = arg0.method3009();
        this.method514();
    }

    @ObfuscatedName("am.e(I)V")
    public void method514() {
    }
}
