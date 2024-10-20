package deob;

@ObfuscatedName("as")
public class class43 implements class47 {

    @ObfuscatedName("as.z")
    public int field306;

    @ObfuscatedName("as.k")
    public int field302;

    @ObfuscatedName("as.s")
    public int field303;

    @ObfuscatedName("as.t")
    public int field304;

    @ObfuscatedName("as.i")
    public int field308;

    @ObfuscatedName("as.o")
    public int field305;

    @ObfuscatedName("as.z(Lar;B)V")
    public void method265(class36 arg0) {
        if (arg0.field242 > this.field308) {
            arg0.field242 = this.field308;
        }
        if (arg0.field243 < this.field308) {
            arg0.field243 = this.field308;
        }
        if (arg0.field247 > this.field305) {
            arg0.field247 = this.field305;
        }
        if (arg0.field241 < this.field305) {
            arg0.field241 = this.field305;
        }
    }

    @ObfuscatedName("as.k(IIII)Z")
    public boolean method280(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field306 && arg0 < this.field306 + this.field302) {
            return arg1 >> 6 == this.field303 && arg2 >> 6 == this.field304;
        } else {
            return false;
        }
    }

    @ObfuscatedName("as.s(III)Z")
    public boolean method279(int arg0, int arg1) {
        return arg0 >> 6 == this.field308 && arg1 >> 6 == this.field305;
    }

    @ObfuscatedName("as.t(IIII)[I")
    public int[] method267(int arg0, int arg1, int arg2) {
        return this.method280(arg0, arg1, arg2) ? new int[] { this.field308 * 64 - this.field303 * 64 + arg1, this.field305 * 64 - this.field304 * 64 + arg2 } : null;
    }

    @ObfuscatedName("as.i(III)Lhg;")
    public class223 method284(int arg0, int arg1) {
        if (this.method279(arg0, arg1)) {
            int var3 = this.field303 * 64 - this.field308 * 64 + arg0;
            int var4 = this.field304 * 64 - this.field305 * 64 + arg1;
            return new class223(this.field306, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("as.o(Lkf;I)V")
    public void method269(class310 arg0) {
        this.field306 = arg0.method5193();
        this.field302 = arg0.method5193();
        this.field303 = arg0.method5195();
        this.field304 = arg0.method5195();
        this.field308 = arg0.method5195();
        this.field305 = arg0.method5195();
        this.method553();
    }

    @ObfuscatedName("as.x(I)V")
    public void method553() {
    }
}
