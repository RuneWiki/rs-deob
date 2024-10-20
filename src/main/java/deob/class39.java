package deob;

@ObfuscatedName("aw")
public class class39 implements class43 {

    @ObfuscatedName("aw.d")
    public int field492;

    @ObfuscatedName("aw.x")
    public int field503;

    @ObfuscatedName("aw.k")
    public int field494;

    @ObfuscatedName("aw.z")
    public int field500;

    @ObfuscatedName("aw.v")
    public int field496;

    @ObfuscatedName("aw.m")
    public int field497;

    @ObfuscatedName("aw.d(Lal;I)V")
    public void method193(class33 arg0) {
        if (arg0.field428 > this.field496) {
            arg0.field428 = this.field496;
        }
        if (arg0.field432 < this.field496) {
            arg0.field432 = this.field496;
        }
        if (arg0.field429 > this.field497) {
            arg0.field429 = this.field497;
        }
        if (arg0.field437 < this.field497) {
            arg0.field437 = this.field497;
        }
    }

    @ObfuscatedName("aw.x(IIII)Z")
    public boolean method184(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field492 && arg0 < this.field503 + this.field492) {
            return arg1 >> 6 == this.field494 && arg2 >> 6 == this.field500;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aw.k(IIB)Z")
    public boolean method192(int arg0, int arg1) {
        return arg0 >> 6 == this.field496 && arg1 >> 6 == this.field497;
    }

    @ObfuscatedName("aw.z(IIII)[I")
    public int[] method186(int arg0, int arg1, int arg2) {
        return this.method184(arg0, arg1, arg2) ? new int[] { this.field496 * 64 - this.field494 * 64 + arg1, this.field497 * 64 - this.field500 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aw.v(IIB)Lhp;")
    public class220 method187(int arg0, int arg1) {
        if (this.method192(arg0, arg1)) {
            int var3 = this.field494 * 64 - this.field496 * 64 + arg0;
            int var4 = this.field500 * 64 - this.field497 * 64 + arg1;
            return new class220(this.field492, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aw.m(Lfr;I)V")
    public void method188(class181 arg0) {
        this.field492 = arg0.method3204();
        this.field503 = arg0.method3204();
        this.field494 = arg0.method3179();
        this.field500 = arg0.method3179();
        this.field496 = arg0.method3179();
        this.field497 = arg0.method3179();
        this.method479();
    }

    @ObfuscatedName("aw.b(B)V")
    public void method479() {
    }
}
