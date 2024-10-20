package deob;

@ObfuscatedName("ay")
public class class49 implements class43 {

    @ObfuscatedName("ay.a")
    public int field602;

    @ObfuscatedName("ay.j")
    public int field596;

    @ObfuscatedName("ay.n")
    public int field597;

    @ObfuscatedName("ay.r")
    public int field600;

    @ObfuscatedName("ay.v")
    public int field599;

    @ObfuscatedName("ay.e")
    public int field605;

    @ObfuscatedName("ay.l")
    public int field601;

    @ObfuscatedName("ay.s")
    public int field610;

    @ObfuscatedName("ay.w")
    public int field603;

    @ObfuscatedName("ay.p")
    public int field604;

    @ObfuscatedName("ay.a(Lam;I)V")
    public void method170(class33 arg0) {
        if (arg0.field448 > this.field599) {
            arg0.field448 = this.field599;
        }
        if (arg0.field449 < this.field599) {
            arg0.field449 = this.field599;
        }
        if (arg0.field442 > this.field605) {
            arg0.field442 = this.field605;
        }
        if (arg0.field451 < this.field605) {
            arg0.field451 = this.field605;
        }
    }

    @ObfuscatedName("ay.j(IIII)Z")
    public boolean method187(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field602 && arg0 < this.field602 + this.field596) {
            return arg1 >= (this.field601 << 3) + (this.field597 << 6) && arg1 <= (this.field601 << 3) + (this.field597 << 6) + 7 && arg2 >= (this.field610 << 3) + (this.field600 << 6) && arg2 <= (this.field610 << 3) + (this.field600 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.n(III)Z")
    public boolean method197(int arg0, int arg1) {
        return arg0 >= (this.field603 << 3) + (this.field599 << 6) && arg0 <= (this.field603 << 3) + (this.field599 << 6) + 7 && arg1 >= (this.field605 << 6) + (this.field604 << 3) && arg1 <= (this.field605 << 6) + (this.field604 << 3) + 7;
    }

    @ObfuscatedName("ay.r(IIIB)[I")
    public int[] method173(int arg0, int arg1, int arg2) {
        return this.method187(arg0, arg1, arg2) ? new int[] { this.field603 * 8 - this.field601 * 8 + this.field599 * 64 - this.field597 * 64 + arg1, this.field604 * 8 - this.field610 * 8 + this.field605 * 64 - this.field600 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ay.v(III)Lhd;")
    public class213 method174(int arg0, int arg1) {
        if (this.method197(arg0, arg1)) {
            int var3 = this.field601 * 8 - this.field603 * 8 + this.field597 * 64 - this.field599 * 64 + arg0;
            int var4 = this.field610 * 8 - this.field604 * 8 + this.field600 * 64 - this.field605 * 64 + arg1;
            return new class213(this.field602, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ay.e(Lfe;I)V")
    public void method182(class174 arg0) {
        this.field602 = arg0.method2871();
        this.field596 = arg0.method2871();
        this.field597 = arg0.method2873();
        this.field601 = arg0.method2871();
        this.field600 = arg0.method2873();
        this.field610 = arg0.method2871();
        this.field599 = arg0.method2873();
        this.field603 = arg0.method2871();
        this.field605 = arg0.method2873();
        this.field604 = arg0.method2871();
        this.method629();
    }

    @ObfuscatedName("ay.l(I)V")
    public void method629() {
    }
}
