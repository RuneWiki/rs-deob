package deob;

@ObfuscatedName("av")
public class class49 implements class43 {

    @ObfuscatedName("av.d")
    public int field588;

    @ObfuscatedName("av.x")
    public int field580;

    @ObfuscatedName("av.k")
    public int field581;

    @ObfuscatedName("av.z")
    public int field582;

    @ObfuscatedName("av.v")
    public int field579;

    @ObfuscatedName("av.m")
    public int field584;

    @ObfuscatedName("av.b")
    public int field591;

    @ObfuscatedName("av.t")
    public int field583;

    @ObfuscatedName("av.p")
    public int field587;

    @ObfuscatedName("av.r")
    public int field586;

    @ObfuscatedName("av.d(Lal;I)V")
    public void method193(class33 arg0) {
        if (arg0.field428 > this.field579) {
            arg0.field428 = this.field579;
        }
        if (arg0.field432 < this.field579) {
            arg0.field432 = this.field579;
        }
        if (arg0.field429 > this.field584) {
            arg0.field429 = this.field584;
        }
        if (arg0.field437 < this.field584) {
            arg0.field437 = this.field584;
        }
    }

    @ObfuscatedName("av.x(IIII)Z")
    public boolean method184(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field588 && arg0 < this.field588 + this.field580) {
            return arg1 >= (this.field591 << 3) + (this.field581 << 6) && arg1 <= (this.field591 << 3) + (this.field581 << 6) + 7 && arg2 >= (this.field583 << 3) + (this.field582 << 6) && arg2 <= (this.field583 << 3) + (this.field582 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("av.k(IIB)Z")
    public boolean method192(int arg0, int arg1) {
        return arg0 >= (this.field587 << 3) + (this.field579 << 6) && arg0 <= (this.field587 << 3) + (this.field579 << 6) + 7 && arg1 >= (this.field586 << 3) + (this.field584 << 6) && arg1 <= (this.field586 << 3) + (this.field584 << 6) + 7;
    }

    @ObfuscatedName("av.z(IIII)[I")
    public int[] method186(int arg0, int arg1, int arg2) {
        return this.method184(arg0, arg1, arg2) ? new int[] { this.field587 * 8 - this.field591 * 8 + this.field579 * 64 - this.field581 * 64 + arg1, this.field586 * 8 - this.field583 * 8 + this.field584 * 64 - this.field582 * 64 + arg2 } : null;
    }

    @ObfuscatedName("av.v(IIB)Lhp;")
    public class220 method187(int arg0, int arg1) {
        if (this.method192(arg0, arg1)) {
            int var3 = this.field591 * 8 - this.field587 * 8 + this.field581 * 64 - this.field579 * 64 + arg0;
            int var4 = this.field583 * 8 - this.field586 * 8 + this.field582 * 64 - this.field584 * 64 + arg1;
            return new class220(this.field588, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("av.m(Lfr;I)V")
    public void method188(class181 arg0) {
        this.field588 = arg0.method3204();
        this.field580 = arg0.method3204();
        this.field581 = arg0.method3179();
        this.field591 = arg0.method3204();
        this.field582 = arg0.method3179();
        this.field583 = arg0.method3204();
        this.field579 = arg0.method3179();
        this.field587 = arg0.method3204();
        this.field584 = arg0.method3179();
        this.field586 = arg0.method3204();
        this.method642();
    }

    @ObfuscatedName("av.b(I)V")
    public void method642() {
    }
}
