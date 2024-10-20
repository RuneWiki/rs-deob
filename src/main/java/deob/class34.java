package deob;

@ObfuscatedName("au")
public class class34 implements class47 {

    @ObfuscatedName("au.z")
    public int field220;

    @ObfuscatedName("au.k")
    public int field218;

    @ObfuscatedName("au.s")
    public int field219;

    @ObfuscatedName("au.t")
    public int field228;

    @ObfuscatedName("au.i")
    public int field221;

    @ObfuscatedName("au.o")
    public int field222;

    @ObfuscatedName("au.x")
    public int field225;

    @ObfuscatedName("au.w")
    public int field224;

    @ObfuscatedName("au.g")
    public int field229;

    @ObfuscatedName("au.m")
    public int field226;

    @ObfuscatedName("au.z(Lar;B)V")
    public void method265(class36 arg0) {
        if (arg0.field242 > this.field225) {
            arg0.field242 = this.field225;
        }
        if (arg0.field243 < this.field229) {
            arg0.field243 = this.field229;
        }
        if (arg0.field247 > this.field224) {
            arg0.field247 = this.field224;
        }
        if (arg0.field241 < this.field226) {
            arg0.field241 = this.field226;
        }
    }

    @ObfuscatedName("au.k(IIII)Z")
    public boolean method280(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field220 && arg0 < this.field220 + this.field218) {
            return arg1 >> 6 >= this.field219 && arg1 >> 6 <= this.field221 && arg2 >> 6 >= this.field228 && arg2 >> 6 <= this.field222;
        } else {
            return false;
        }
    }

    @ObfuscatedName("au.s(III)Z")
    public boolean method279(int arg0, int arg1) {
        return arg0 >> 6 >= this.field225 && arg0 >> 6 <= this.field229 && arg1 >> 6 >= this.field224 && arg1 >> 6 <= this.field226;
    }

    @ObfuscatedName("au.t(IIII)[I")
    public int[] method267(int arg0, int arg1, int arg2) {
        return this.method280(arg0, arg1, arg2) ? new int[] { this.field225 * 64 - this.field219 * 64 + arg1, this.field224 * 64 - this.field228 * 64 + arg2 } : null;
    }

    @ObfuscatedName("au.i(III)Lhg;")
    public class223 method284(int arg0, int arg1) {
        if (this.method279(arg0, arg1)) {
            int var3 = this.field219 * 64 - this.field225 * 64 + arg0;
            int var4 = this.field228 * 64 - this.field224 * 64 + arg1;
            return new class223(this.field220, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("au.o(Lkf;I)V")
    public void method269(class310 arg0) {
        this.field220 = arg0.method5193();
        this.field218 = arg0.method5193();
        this.field219 = arg0.method5195();
        this.field228 = arg0.method5195();
        this.field221 = arg0.method5195();
        this.field222 = arg0.method5195();
        this.field225 = arg0.method5195();
        this.field224 = arg0.method5195();
        this.field229 = arg0.method5195();
        this.field226 = arg0.method5195();
        this.method327();
    }

    @ObfuscatedName("au.x(I)V")
    public void method327() {
    }
}
