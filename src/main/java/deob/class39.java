package deob;

@ObfuscatedName("aw")
public class class39 implements class43 {

    @ObfuscatedName("aw.c")
    public int field521;

    @ObfuscatedName("aw.o")
    public int field515;

    @ObfuscatedName("aw.i")
    public int field516;

    @ObfuscatedName("aw.u")
    public int field517;

    @ObfuscatedName("aw.g")
    public int field520;

    @ObfuscatedName("aw.m")
    public int field519;

    @ObfuscatedName("aw.c(Lab;S)V")
    public void method172(class33 arg0) {
        if (arg0.field444 > this.field520) {
            arg0.field444 = this.field520;
        }
        if (arg0.field445 < this.field520) {
            arg0.field445 = this.field520;
        }
        if (arg0.field443 > this.field519) {
            arg0.field443 = this.field519;
        }
        if (arg0.field436 < this.field519) {
            arg0.field436 = this.field519;
        }
    }

    @ObfuscatedName("aw.o(IIII)Z")
    public boolean method173(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field521 && arg0 < this.field521 + this.field515) {
            return arg1 >> 6 == this.field516 && arg2 >> 6 == this.field517;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aw.i(IIS)Z")
    public boolean method174(int arg0, int arg1) {
        return arg0 >> 6 == this.field520 && arg1 >> 6 == this.field519;
    }

    @ObfuscatedName("aw.u(IIII)[I")
    public int[] method175(int arg0, int arg1, int arg2) {
        return this.method173(arg0, arg1, arg2) ? new int[] { this.field520 * 64 - this.field516 * 64 + arg1, this.field519 * 64 - this.field517 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aw.g(III)Lhs;")
    public class213 method179(int arg0, int arg1) {
        if (this.method174(arg0, arg1)) {
            int var3 = this.field516 * 64 - this.field520 * 64 + arg0;
            int var4 = this.field517 * 64 - this.field519 * 64 + arg1;
            return new class213(this.field521, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aw.m(Lfp;B)V")
    public void method177(class174 arg0) {
        this.field521 = arg0.method2843();
        this.field515 = arg0.method2843();
        this.field516 = arg0.method2861();
        this.field517 = arg0.method2861();
        this.field520 = arg0.method2861();
        this.field519 = arg0.method2861();
        this.method465();
    }

    @ObfuscatedName("aw.s(I)V")
    public void method465() {
    }
}
