package deob;

@ObfuscatedName("an")
public class class49 implements class43 {

    @ObfuscatedName("an.n")
    public int field591;

    @ObfuscatedName("an.v")
    public int field587;

    @ObfuscatedName("an.y")
    public int field582;

    @ObfuscatedName("an.r")
    public int field583;

    @ObfuscatedName("an.h")
    public int field584;

    @ObfuscatedName("an.d")
    public int field585;

    @ObfuscatedName("an.s")
    public int field586;

    @ObfuscatedName("an.b")
    public int field588;

    @ObfuscatedName("an.e")
    public int field580;

    @ObfuscatedName("an.f")
    public int field589;

    @ObfuscatedName("an.n(Laz;I)V")
    public void method170(class33 arg0) {
        if (arg0.field438 > this.field584) {
            arg0.field438 = this.field584;
        }
        if (arg0.field435 < this.field584) {
            arg0.field435 = this.field584;
        }
        if (arg0.field437 > this.field585) {
            arg0.field437 = this.field585;
        }
        if (arg0.field441 < this.field585) {
            arg0.field441 = this.field585;
        }
    }

    @ObfuscatedName("an.v(IIIB)Z")
    public boolean method171(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field591 && arg0 < this.field591 + this.field587) {
            return arg1 >= (this.field586 << 3) + (this.field582 << 6) && arg1 <= (this.field586 << 3) + (this.field582 << 6) + 7 && arg2 >= (this.field588 << 3) + (this.field583 << 6) && arg2 <= (this.field588 << 3) + (this.field583 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("an.y(III)Z")
    public boolean method183(int arg0, int arg1) {
        return arg0 >= (this.field584 << 6) + (this.field580 << 3) && arg0 <= (this.field584 << 6) + (this.field580 << 3) + 7 && arg1 >= (this.field589 << 3) + (this.field585 << 6) && arg1 <= (this.field589 << 3) + (this.field585 << 6) + 7;
    }

    @ObfuscatedName("an.r(IIII)[I")
    public int[] method194(int arg0, int arg1, int arg2) {
        return this.method171(arg0, arg1, arg2) ? new int[] { this.field580 * 8 - this.field586 * 8 + this.field584 * 64 - this.field582 * 64 + arg1, this.field589 * 8 - this.field588 * 8 + this.field585 * 64 - this.field583 * 64 + arg2 } : null;
    }

    @ObfuscatedName("an.h(III)Lht;")
    public class224 method174(int arg0, int arg1) {
        if (this.method183(arg0, arg1)) {
            int var3 = this.field586 * 8 - this.field580 * 8 + this.field582 * 64 - this.field584 * 64 + arg0;
            int var4 = this.field588 * 8 - this.field589 * 8 + this.field583 * 64 - this.field585 * 64 + arg1;
            return new class224(this.field591, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.d(Lgv;I)V")
    public void method175(class185 arg0) {
        this.field591 = arg0.method3021();
        this.field587 = arg0.method3021();
        this.field582 = arg0.method3015();
        this.field586 = arg0.method3021();
        this.field583 = arg0.method3015();
        this.field588 = arg0.method3021();
        this.field584 = arg0.method3015();
        this.field580 = arg0.method3021();
        this.field585 = arg0.method3015();
        this.field589 = arg0.method3021();
        this.method619();
    }

    @ObfuscatedName("an.s(I)V")
    public void method619() {
    }
}
