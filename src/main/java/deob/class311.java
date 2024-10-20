package deob;

@ObfuscatedName("kg")
public class class311 {

    @ObfuscatedName("kg.z")
    public int field3747;

    @ObfuscatedName("kg.w")
    public int field3744;

    @ObfuscatedName("kg.s")
    public int field3748;

    @ObfuscatedName("kg.l")
    public int field3746;

    public class311(int arg0, int arg1) {
        this(0, 0, arg0, arg1);
    }

    public class311(int arg0, int arg1, int arg2, int arg3) {
        this.method5247(arg0, arg1);
        this.method5248(arg2, arg3);
    }

    @ObfuscatedName("kg.z(III)V")
    public void method5247(int arg0, int arg1) {
        this.field3747 = arg0;
        this.field3744 = arg1;
    }

    @ObfuscatedName("kg.w(III)V")
    public void method5248(int arg0, int arg1) {
        this.field3748 = arg0;
        this.field3746 = arg1;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName("kg.s(Lkg;Lkg;I)V")
    public void method5249(class311 arg0, class311 arg1) {
        this.method5250(arg0, arg1);
        this.method5251(arg0, arg1);
    }

    @ObfuscatedName("kg.l(Lkg;Lkg;B)V")
    public void method5250(class311 arg0, class311 arg1) {
        arg1.field3747 = this.field3747;
        arg1.field3748 = this.field3748;
        if (this.field3747 < arg0.field3747) {
            arg1.field3748 -= arg0.field3747 - this.field3747;
            arg1.field3747 = arg0.field3747;
        }
        if (arg1.method5252() > arg0.method5252()) {
            arg1.field3748 -= arg1.method5252() - arg0.method5252();
        }
        if (arg1.field3748 < 0) {
            arg1.field3748 = 0;
        }
    }

    @ObfuscatedName("kg.u(Lkg;Lkg;I)V")
    public void method5251(class311 arg0, class311 arg1) {
        arg1.field3744 = this.field3744;
        arg1.field3746 = this.field3746;
        if (this.field3744 < arg0.field3744) {
            arg1.field3746 -= arg0.field3744 - this.field3744;
            arg1.field3744 = arg0.field3744;
        }
        if (arg1.method5253() > arg0.method5253()) {
            arg1.field3746 -= arg1.method5253() - arg0.method5253();
        }
        if (arg1.field3746 < 0) {
            arg1.field3746 = 0;
        }
    }

    @ObfuscatedName("kg.q(B)I")
    public int method5252() {
        return this.field3748 + this.field3747;
    }

    @ObfuscatedName("kg.i(I)I")
    public int method5253() {
        return this.field3746 + this.field3744;
    }
}
