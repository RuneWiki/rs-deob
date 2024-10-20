package deob;

@ObfuscatedName("ka")
public class class311 {

    @ObfuscatedName("ka.w")
    public int field3753;

    @ObfuscatedName("ka.m")
    public int field3750;

    @ObfuscatedName("ka.q")
    public int field3751;

    @ObfuscatedName("ka.b")
    public int field3752;

    public class311(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class311(int arg0, int arg1, int arg2, int arg3) {
        this.method5295(arg0, arg1);
        this.method5294(arg2, arg3);
    }

    @ObfuscatedName("ka.w(IIB)V")
    public void method5295(int arg0, int arg1) {
        this.field3753 = arg0;
        this.field3750 = arg1;
    }

    @ObfuscatedName("ka.m(III)V")
    public void method5294(int arg0, int arg1) {
        this.field3751 = arg0;
        this.field3752 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("ka.q(Lka;Lka;B)V")
    public void method5307(class311 arg0, class311 arg1) {
        this.method5301(arg0, arg1);
        this.method5292(arg0, arg1);
    }

    @ObfuscatedName("ka.x(Lka;Lka;I)V")
    public void method5301(class311 arg0, class311 arg1) {
        arg1.field3753 = this.field3753;
        arg1.field3751 = this.field3751;
        if (this.field3753 < arg0.field3753) {
            arg1.field3751 -= arg0.field3753 - this.field3753;
            arg1.field3753 = arg0.field3753;
        }
        if (arg1.method5303() > arg0.method5303()) {
            arg1.field3751 -= arg1.method5303() - arg0.method5303();
        }
        if (arg1.field3751 < 0) {
            arg1.field3751 = 0;
        }
    }

    @ObfuscatedName("ka.j(Lka;Lka;B)V")
    public void method5292(class311 arg0, class311 arg1) {
        arg1.field3750 = this.field3750;
        arg1.field3752 = this.field3752;
        if (this.field3750 < arg0.field3750) {
            arg1.field3752 -= arg0.field3750 - this.field3750;
            arg1.field3750 = arg0.field3750;
        }
        if (arg1.method5288() > arg0.method5288()) {
            arg1.field3752 -= arg1.method5288() - arg0.method5288();
        }
        if (arg1.field3752 < 0) {
            arg1.field3752 = 0;
        }
    }

    @ObfuscatedName("ka.a(I)I")
    public int method5303() {
        return this.field3753 + this.field3751;
    }

    @ObfuscatedName("ka.l(I)I")
    public int method5288() {
        return this.field3752 + this.field3750;
    }
}
