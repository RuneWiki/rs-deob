package deob;

@ObfuscatedName("as")
public class class31 implements class44 {

    @ObfuscatedName("as.d")
    public int field438;

    @ObfuscatedName("as.z")
    public int field435;

    @ObfuscatedName("as.n")
    public int field436;

    @ObfuscatedName("as.r")
    public int field440;

    @ObfuscatedName("as.e")
    public int field437;

    @ObfuscatedName("as.y")
    public int field439;

    @ObfuscatedName("as.k")
    public int field434;

    @ObfuscatedName("as.s")
    public int field443;

    @ObfuscatedName("as.p")
    public int field441;

    @ObfuscatedName("as.x")
    public int field442;

    @ObfuscatedName("as.d(Lal;B)V")
    public void method185(class33 arg0) {
        if (arg0.field460 > this.field434) {
            arg0.field460 = this.field434;
        }
        if (arg0.field461 < this.field441) {
            arg0.field461 = this.field441;
        }
        if (arg0.field454 > this.field443) {
            arg0.field454 = this.field443;
        }
        if (arg0.field463 < this.field442) {
            arg0.field463 = this.field442;
        }
    }

    @ObfuscatedName("as.z(IIII)Z")
    public boolean method186(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field438 && arg0 < this.field438 + this.field435) {
            return arg1 >> 6 >= this.field436 && arg1 >> 6 <= this.field437 && arg2 >> 6 >= this.field440 && arg2 >> 6 <= this.field439;
        } else {
            return false;
        }
    }

    @ObfuscatedName("as.n(IIB)Z")
    public boolean method187(int arg0, int arg1) {
        return arg0 >> 6 >= this.field434 && arg0 >> 6 <= this.field441 && arg1 >> 6 >= this.field443 && arg1 >> 6 <= this.field442;
    }

    @ObfuscatedName("as.r(IIII)[I")
    public int[] method207(int arg0, int arg1, int arg2) {
        return this.method186(arg0, arg1, arg2) ? new int[] { this.field434 * 64 - this.field436 * 64 + arg1, this.field443 * 64 - this.field440 * 64 + arg2 } : null;
    }

    @ObfuscatedName("as.e(III)Lic;")
    public class239 method191(int arg0, int arg1) {
        if (this.method187(arg0, arg1)) {
            int var3 = this.field436 * 64 - this.field434 * 64 + arg0;
            int var4 = this.field440 * 64 - this.field443 * 64 + arg1;
            return new class239(this.field438, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("as.y(Lgy;I)V")
    public void method190(class195 arg0) {
        this.field438 = arg0.method3330();
        this.field435 = arg0.method3330();
        this.field436 = arg0.method3269();
        this.field440 = arg0.method3269();
        this.field437 = arg0.method3269();
        this.field439 = arg0.method3269();
        this.field434 = arg0.method3269();
        this.field443 = arg0.method3269();
        this.field441 = arg0.method3269();
        this.field442 = arg0.method3269();
        this.method243();
    }

    @ObfuscatedName("as.k(I)V")
    public void method243() {
    }
}
