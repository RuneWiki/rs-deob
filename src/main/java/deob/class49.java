package deob;

@ObfuscatedName("ay")
public class class49 implements class43 {

    @ObfuscatedName("ay.s")
    public int field590;

    @ObfuscatedName("ay.g")
    public int field583;

    @ObfuscatedName("ay.m")
    public int field578;

    @ObfuscatedName("ay.h")
    public int field581;

    @ObfuscatedName("ay.i")
    public int field582;

    @ObfuscatedName("ay.w")
    public int field584;

    @ObfuscatedName("ay.t")
    public int field579;

    @ObfuscatedName("ay.d")
    public int field585;

    @ObfuscatedName("ay.z")
    public int field586;

    @ObfuscatedName("ay.k")
    public int field587;

    @ObfuscatedName("ay.s(Las;I)V")
    public void method181(class33 arg0) {
        if (arg0.field433 > this.field582) {
            arg0.field433 = this.field582;
        }
        if (arg0.field434 < this.field582) {
            arg0.field434 = this.field582;
        }
        if (arg0.field427 > this.field584) {
            arg0.field427 = this.field584;
        }
        if (arg0.field436 < this.field584) {
            arg0.field436 = this.field584;
        }
    }

    @ObfuscatedName("ay.g(IIIB)Z")
    public boolean method182(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field590 && arg0 < this.field590 + this.field583) {
            return arg1 >= (this.field579 << 3) + (this.field578 << 6) && arg1 <= (this.field579 << 3) + (this.field578 << 6) + 7 && arg2 >= (this.field585 << 3) + (this.field581 << 6) && arg2 <= (this.field585 << 3) + (this.field581 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.m(III)Z")
    public boolean method183(int arg0, int arg1) {
        return arg0 >= (this.field586 << 3) + (this.field582 << 6) && arg0 <= (this.field586 << 3) + (this.field582 << 6) + 7 && arg1 >= (this.field587 << 3) + (this.field584 << 6) && arg1 <= (this.field587 << 3) + (this.field584 << 6) + 7;
    }

    @ObfuscatedName("ay.h(IIII)[I")
    public int[] method187(int arg0, int arg1, int arg2) {
        return this.method182(arg0, arg1, arg2) ? new int[] { this.field586 * 8 - this.field579 * 8 + this.field582 * 64 - this.field578 * 64 + arg1, this.field587 * 8 - this.field585 * 8 + this.field584 * 64 - this.field581 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ay.i(IIB)Lhv;")
    public class224 method185(int arg0, int arg1) {
        if (this.method183(arg0, arg1)) {
            int var3 = this.field579 * 8 - this.field586 * 8 + this.field578 * 64 - this.field582 * 64 + arg0;
            int var4 = this.field585 * 8 - this.field587 * 8 + this.field581 * 64 - this.field584 * 64 + arg1;
            return new class224(this.field590, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ay.w(Lgy;I)V")
    public void method186(class185 arg0) {
        this.field590 = arg0.method3239();
        this.field583 = arg0.method3239();
        this.field578 = arg0.method3241();
        this.field579 = arg0.method3239();
        this.field581 = arg0.method3241();
        this.field585 = arg0.method3239();
        this.field582 = arg0.method3241();
        this.field586 = arg0.method3239();
        this.field584 = arg0.method3241();
        this.field587 = arg0.method3239();
        this.method612();
    }

    @ObfuscatedName("ay.t(I)V")
    public void method612() {
    }
}
