package deob;

@ObfuscatedName("aa")
public class class39 implements class43 {

    @ObfuscatedName("aa.p")
    public int field532;

    @ObfuscatedName("aa.m")
    public int field535;

    @ObfuscatedName("aa.e")
    public int field537;

    @ObfuscatedName("aa.t")
    public int field531;

    @ObfuscatedName("aa.w")
    public int field530;

    @ObfuscatedName("aa.z")
    public int field533;

    @ObfuscatedName("aa.p(Lal;I)V")
    public void method213(class33 arg0) {
        if (arg0.field460 > this.field530) {
            arg0.field460 = this.field530;
        }
        if (arg0.field466 < this.field530) {
            arg0.field466 = this.field530;
        }
        if (arg0.field467 > this.field533) {
            arg0.field467 = this.field533;
        }
        if (arg0.field459 < this.field533) {
            arg0.field459 = this.field533;
        }
    }

    @ObfuscatedName("aa.m(IIII)Z")
    public boolean method197(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field532 && arg0 < this.field535 + this.field532) {
            return arg1 >> 6 == this.field537 && arg2 >> 6 == this.field531;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aa.e(IIB)Z")
    public boolean method198(int arg0, int arg1) {
        return arg0 >> 6 == this.field530 && arg1 >> 6 == this.field533;
    }

    @ObfuscatedName("aa.t(IIII)[I")
    public int[] method208(int arg0, int arg1, int arg2) {
        return this.method197(arg0, arg1, arg2) ? new int[] { this.field530 * 64 - this.field537 * 64 + arg1, this.field533 * 64 - this.field531 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aa.w(III)Lhg;")
    public class213 method200(int arg0, int arg1) {
        if (this.method198(arg0, arg1)) {
            int var3 = this.field537 * 64 - this.field530 * 64 + arg0;
            int var4 = this.field531 * 64 - this.field533 * 64 + arg1;
            return new class213(this.field532, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aa.z(Lfr;I)V")
    public void method201(class174 arg0) {
        this.field532 = arg0.method2810();
        this.field535 = arg0.method2810();
        this.field537 = arg0.method2824();
        this.field531 = arg0.method2824();
        this.field530 = arg0.method2824();
        this.field533 = arg0.method2824();
        this.method467();
    }

    @ObfuscatedName("aa.j(I)V")
    public void method467() {
    }
}
