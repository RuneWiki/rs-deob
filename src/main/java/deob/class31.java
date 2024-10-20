package deob;

@ObfuscatedName("aq")
public class class31 implements class43 {

    @ObfuscatedName("aq.i")
    public int field435;

    @ObfuscatedName("aq.h")
    public int field425;

    @ObfuscatedName("aq.u")
    public int field426;

    @ObfuscatedName("aq.q")
    public int field427;

    @ObfuscatedName("aq.g")
    public int field428;

    @ObfuscatedName("aq.v")
    public int field432;

    @ObfuscatedName("aq.t")
    public int field430;

    @ObfuscatedName("aq.p")
    public int field429;

    @ObfuscatedName("aq.l")
    public int field434;

    @ObfuscatedName("aq.a")
    public int field436;

    @ObfuscatedName("aq.i(Laj;I)V")
    public void method196(class33 arg0) {
        if (arg0.field454 > this.field430) {
            arg0.field454 = this.field430;
        }
        if (arg0.field455 < this.field434) {
            arg0.field455 = this.field434;
        }
        if (arg0.field464 > this.field429) {
            arg0.field464 = this.field429;
        }
        if (arg0.field457 < this.field436) {
            arg0.field457 = this.field436;
        }
    }

    @ObfuscatedName("aq.h(IIIB)Z")
    public boolean method174(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field435 && arg0 < this.field435 + this.field425) {
            return arg1 >> 6 >= this.field426 && arg1 >> 6 <= this.field428 && arg2 >> 6 >= this.field427 && arg2 >> 6 <= this.field432;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aq.u(III)Z")
    public boolean method175(int arg0, int arg1) {
        return arg0 >> 6 >= this.field430 && arg0 >> 6 <= this.field434 && arg1 >> 6 >= this.field429 && arg1 >> 6 <= this.field436;
    }

    @ObfuscatedName("aq.q(IIII)[I")
    public int[] method176(int arg0, int arg1, int arg2) {
        return this.method174(arg0, arg1, arg2) ? new int[] { this.field430 * 64 - this.field426 * 64 + arg1, this.field429 * 64 - this.field427 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aq.g(III)Lho;")
    public class213 method191(int arg0, int arg1) {
        if (this.method175(arg0, arg1)) {
            int var3 = this.field426 * 64 - this.field430 * 64 + arg0;
            int var4 = this.field427 * 64 - this.field429 * 64 + arg1;
            return new class213(this.field435, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aq.v(Lfv;I)V")
    public void method195(class174 arg0) {
        this.field435 = arg0.method2930();
        this.field425 = arg0.method2930();
        this.field426 = arg0.method2932();
        this.field427 = arg0.method2932();
        this.field428 = arg0.method2932();
        this.field432 = arg0.method2932();
        this.field430 = arg0.method2932();
        this.field429 = arg0.method2932();
        this.field434 = arg0.method2932();
        this.field436 = arg0.method2932();
        this.method231();
    }

    @ObfuscatedName("aq.t(I)V")
    public void method231() {
    }
}
