package deob;

@ObfuscatedName("al")
public class class39 implements class43 {

    @ObfuscatedName("al.a")
    public int field496;

    @ObfuscatedName("al.w")
    public int field486;

    @ObfuscatedName("al.e")
    public int field488;

    @ObfuscatedName("al.k")
    public int field490;

    @ObfuscatedName("al.u")
    public int field495;

    @ObfuscatedName("al.z")
    public int field491;

    @ObfuscatedName("al.a(Lax;I)V")
    public void method174(class33 arg0) {
        if (arg0.field425 > this.field495) {
            arg0.field425 = this.field495;
        }
        if (arg0.field418 < this.field495) {
            arg0.field418 = this.field495;
        }
        if (arg0.field426 > this.field491) {
            arg0.field426 = this.field491;
        }
        if (arg0.field432 < this.field491) {
            arg0.field432 = this.field491;
        }
    }

    @ObfuscatedName("al.w(IIII)Z")
    public boolean method175(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field496 && arg0 < this.field496 + this.field486) {
            return arg1 >> 6 == this.field488 && arg2 >> 6 == this.field490;
        } else {
            return false;
        }
    }

    @ObfuscatedName("al.e(III)Z")
    public boolean method176(int arg0, int arg1) {
        return arg0 >> 6 == this.field495 && arg1 >> 6 == this.field491;
    }

    @ObfuscatedName("al.k(IIII)[I")
    public int[] method177(int arg0, int arg1, int arg2) {
        return this.method175(arg0, arg1, arg2) ? new int[] { this.field495 * 64 - this.field488 * 64 + arg1, this.field491 * 64 - this.field490 * 64 + arg2 } : null;
    }

    @ObfuscatedName("al.u(III)Lhc;")
    public class224 method178(int arg0, int arg1) {
        if (this.method176(arg0, arg1)) {
            int var3 = this.field488 * 64 - this.field495 * 64 + arg0;
            int var4 = this.field490 * 64 - this.field491 * 64 + arg1;
            return new class224(this.field496, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("al.z(Lgh;I)V")
    public void method194(class185 arg0) {
        this.field496 = arg0.method2962();
        this.field486 = arg0.method2962();
        this.field488 = arg0.method3194();
        this.field490 = arg0.method3194();
        this.field495 = arg0.method3194();
        this.field491 = arg0.method3194();
        this.method474();
    }

    @ObfuscatedName("al.t(I)V")
    public void method474() {
    }
}
