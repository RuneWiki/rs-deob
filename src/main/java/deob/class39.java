package deob;

@ObfuscatedName("ae")
public class class39 implements class43 {

    @ObfuscatedName("ae.w")
    public int field537;

    @ObfuscatedName("ae.s")
    public int field538;

    @ObfuscatedName("ae.q")
    public int field544;

    @ObfuscatedName("ae.o")
    public int field540;

    @ObfuscatedName("ae.g")
    public int field541;

    @ObfuscatedName("ae.v")
    public int field539;

    @ObfuscatedName("ae.w(Lat;I)V")
    public void method180(class33 arg0) {
        if (arg0.field465 > this.field541) {
            arg0.field465 = this.field541;
        }
        if (arg0.field469 < this.field541) {
            arg0.field469 = this.field541;
        }
        if (arg0.field470 > this.field539) {
            arg0.field470 = this.field539;
        }
        if (arg0.field462 < this.field539) {
            arg0.field462 = this.field539;
        }
    }

    @ObfuscatedName("ae.s(IIII)Z")
    public boolean method181(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field537 && arg0 < this.field538 + this.field537) {
            return arg1 >> 6 == this.field544 && arg2 >> 6 == this.field540;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ae.q(III)Z")
    public boolean method182(int arg0, int arg1) {
        return arg0 >> 6 == this.field541 && arg1 >> 6 == this.field539;
    }

    @ObfuscatedName("ae.o(IIII)[I")
    public int[] method179(int arg0, int arg1, int arg2) {
        return this.method181(arg0, arg1, arg2) ? new int[] { this.field541 * 64 - this.field544 * 64 + arg1, this.field539 * 64 - this.field540 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ae.g(III)Lhg;")
    public class213 method190(int arg0, int arg1) {
        if (this.method182(arg0, arg1)) {
            int var3 = this.field544 * 64 - this.field541 * 64 + arg0;
            int var4 = this.field540 * 64 - this.field539 * 64 + arg1;
            return new class213(this.field537, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ae.v(Lfz;B)V")
    public void method185(class174 arg0) {
        this.field537 = arg0.method2971();
        this.field538 = arg0.method2971();
        this.field544 = arg0.method3178();
        this.field540 = arg0.method3178();
        this.field541 = arg0.method3178();
        this.field539 = arg0.method3178();
        this.method462();
    }

    @ObfuscatedName("ae.p(B)V")
    public void method462() {
    }
}
