package deob;

@ObfuscatedName("ar")
public class class40 implements class44 {

    @ObfuscatedName("ar.d")
    public int field528;

    @ObfuscatedName("ar.z")
    public int field529;

    @ObfuscatedName("ar.n")
    public int field525;

    @ObfuscatedName("ar.r")
    public int field523;

    @ObfuscatedName("ar.e")
    public int field527;

    @ObfuscatedName("ar.y")
    public int field530;

    @ObfuscatedName("ar.d(Lal;B)V")
    public void method185(class33 arg0) {
        if (arg0.field460 > this.field527) {
            arg0.field460 = this.field527;
        }
        if (arg0.field461 < this.field527) {
            arg0.field461 = this.field527;
        }
        if (arg0.field454 > this.field530) {
            arg0.field454 = this.field530;
        }
        if (arg0.field463 < this.field530) {
            arg0.field463 = this.field530;
        }
    }

    @ObfuscatedName("ar.z(IIII)Z")
    public boolean method186(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field528 && arg0 < this.field529 + this.field528) {
            return arg1 >> 6 == this.field525 && arg2 >> 6 == this.field523;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ar.n(IIB)Z")
    public boolean method187(int arg0, int arg1) {
        return arg0 >> 6 == this.field527 && arg1 >> 6 == this.field530;
    }

    @ObfuscatedName("ar.r(IIII)[I")
    public int[] method207(int arg0, int arg1, int arg2) {
        return this.method186(arg0, arg1, arg2) ? new int[] { this.field527 * 64 - this.field525 * 64 + arg1, this.field530 * 64 - this.field523 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ar.e(III)Lic;")
    public class239 method191(int arg0, int arg1) {
        if (this.method187(arg0, arg1)) {
            int var3 = this.field525 * 64 - this.field527 * 64 + arg0;
            int var4 = this.field523 * 64 - this.field530 * 64 + arg1;
            return new class239(this.field528, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ar.y(Lgy;I)V")
    public void method190(class195 arg0) {
        this.field528 = arg0.method3330();
        this.field529 = arg0.method3330();
        this.field525 = arg0.method3269();
        this.field523 = arg0.method3269();
        this.field527 = arg0.method3269();
        this.field530 = arg0.method3269();
        this.method485();
    }

    @ObfuscatedName("ar.k(B)V")
    public void method485() {
    }
}
