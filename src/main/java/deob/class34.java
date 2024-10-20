package deob;

@ObfuscatedName("am")
public class class34 implements class47 {

    @ObfuscatedName("am.m")
    public int field221;

    @ObfuscatedName("am.o")
    public int field223;

    @ObfuscatedName("am.q")
    public int field218;

    @ObfuscatedName("am.j")
    public int field217;

    @ObfuscatedName("am.p")
    public int field220;

    @ObfuscatedName("am.g")
    public int field219;

    @ObfuscatedName("am.n")
    public int field222;

    @ObfuscatedName("am.u")
    public int field216;

    @ObfuscatedName("am.a")
    public int field224;

    @ObfuscatedName("am.z")
    public int field225;

    @ObfuscatedName("am.m(Lad;I)V")
    public void method244(class36 arg0) {
        if (arg0.field247 > this.field222) {
            arg0.field247 = this.field222;
        }
        if (arg0.field248 < this.field224) {
            arg0.field248 = this.field224;
        }
        if (arg0.field249 > this.field216) {
            arg0.field249 = this.field216;
        }
        if (arg0.field241 < this.field225) {
            arg0.field241 = this.field225;
        }
    }

    @ObfuscatedName("am.o(IIIB)Z")
    public boolean method245(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field221 && arg0 < this.field223 + this.field221) {
            return arg1 >> 6 >= this.field218 && arg1 >> 6 <= this.field220 && arg2 >> 6 >= this.field217 && arg2 >> 6 <= this.field219;
        } else {
            return false;
        }
    }

    @ObfuscatedName("am.q(IIB)Z")
    public boolean method246(int arg0, int arg1) {
        return arg0 >> 6 >= this.field222 && arg0 >> 6 <= this.field224 && arg1 >> 6 >= this.field216 && arg1 >> 6 <= this.field225;
    }

    @ObfuscatedName("am.j(IIII)[I")
    public int[] method247(int arg0, int arg1, int arg2) {
        return this.method245(arg0, arg1, arg2) ? new int[] { this.field222 * 64 - this.field218 * 64 + arg1, this.field216 * 64 - this.field217 * 64 + arg2 } : null;
    }

    @ObfuscatedName("am.p(III)Lhg;")
    public class223 method248(int arg0, int arg1) {
        if (this.method246(arg0, arg1)) {
            int var3 = this.field218 * 64 - this.field222 * 64 + arg0;
            int var4 = this.field217 * 64 - this.field216 * 64 + arg1;
            return new class223(this.field221, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("am.g(Lkn;B)V")
    public void method249(class310 arg0) {
        this.field221 = arg0.method5227();
        this.field223 = arg0.method5227();
        this.field218 = arg0.method5283();
        this.field217 = arg0.method5283();
        this.field220 = arg0.method5283();
        this.field219 = arg0.method5283();
        this.field222 = arg0.method5283();
        this.field216 = arg0.method5283();
        this.field224 = arg0.method5283();
        this.field225 = arg0.method5283();
        this.method318();
    }

    @ObfuscatedName("am.n(S)V")
    public void method318() {
    }
}
