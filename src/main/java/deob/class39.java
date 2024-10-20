package deob;

@ObfuscatedName("ab")
public class class39 implements class43 {

    @ObfuscatedName("ab.n")
    public int field496;

    @ObfuscatedName("ab.v")
    public int field495;

    @ObfuscatedName("ab.y")
    public int field504;

    @ObfuscatedName("ab.r")
    public int field498;

    @ObfuscatedName("ab.h")
    public int field499;

    @ObfuscatedName("ab.d")
    public int field500;

    @ObfuscatedName("ab.n(Laz;I)V")
    public void method170(class33 arg0) {
        if (arg0.field438 > this.field499) {
            arg0.field438 = this.field499;
        }
        if (arg0.field435 < this.field499) {
            arg0.field435 = this.field499;
        }
        if (arg0.field437 > this.field500) {
            arg0.field437 = this.field500;
        }
        if (arg0.field441 < this.field500) {
            arg0.field441 = this.field500;
        }
    }

    @ObfuscatedName("ab.v(IIIB)Z")
    public boolean method171(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field496 && arg0 < this.field496 + this.field495) {
            return arg1 >> 6 == this.field504 && arg2 >> 6 == this.field498;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ab.y(III)Z")
    public boolean method183(int arg0, int arg1) {
        return arg0 >> 6 == this.field499 && arg1 >> 6 == this.field500;
    }

    @ObfuscatedName("ab.r(IIII)[I")
    public int[] method194(int arg0, int arg1, int arg2) {
        return this.method171(arg0, arg1, arg2) ? new int[] { this.field499 * 64 - this.field504 * 64 + arg1, this.field500 * 64 - this.field498 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ab.h(III)Lht;")
    public class224 method174(int arg0, int arg1) {
        if (this.method183(arg0, arg1)) {
            int var3 = this.field504 * 64 - this.field499 * 64 + arg0;
            int var4 = this.field498 * 64 - this.field500 * 64 + arg1;
            return new class224(this.field496, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ab.d(Lgv;I)V")
    public void method175(class185 arg0) {
        this.field496 = arg0.method3021();
        this.field495 = arg0.method3021();
        this.field504 = arg0.method3015();
        this.field498 = arg0.method3015();
        this.field499 = arg0.method3015();
        this.field500 = arg0.method3015();
        this.method467();
    }

    @ObfuscatedName("ab.s(I)V")
    public void method467() {
    }
}
