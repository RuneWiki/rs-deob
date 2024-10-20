package deob;

@ObfuscatedName("ah")
public class class34 implements class47 {

    @ObfuscatedName("ah.f")
    public int field230;

    @ObfuscatedName("ah.b")
    public int field218;

    @ObfuscatedName("ah.l")
    public int field219;

    @ObfuscatedName("ah.m")
    public int field220;

    @ObfuscatedName("ah.z")
    public int field221;

    @ObfuscatedName("ah.q")
    public int field222;

    @ObfuscatedName("ah.k")
    public int field223;

    @ObfuscatedName("ah.c")
    public int field224;

    @ObfuscatedName("ah.u")
    public int field225;

    @ObfuscatedName("ah.t")
    public int field227;

    @ObfuscatedName("ah.f(Lak;I)V")
    public void method268(class36 arg0) {
        if (arg0.field244 > this.field223) {
            arg0.field244 = this.field223;
        }
        if (arg0.field238 < this.field225) {
            arg0.field238 = this.field225;
        }
        if (arg0.field239 > this.field224) {
            arg0.field239 = this.field224;
        }
        if (arg0.field240 < this.field227) {
            arg0.field240 = this.field227;
        }
    }

    @ObfuscatedName("ah.b(IIIB)Z")
    public boolean method269(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field230 && arg0 < this.field230 + this.field218) {
            return arg1 >> 6 >= this.field219 && arg1 >> 6 <= this.field221 && arg2 >> 6 >= this.field220 && arg2 >> 6 <= this.field222;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ah.l(IIB)Z")
    public boolean method284(int arg0, int arg1) {
        return arg0 >> 6 >= this.field223 && arg0 >> 6 <= this.field225 && arg1 >> 6 >= this.field224 && arg1 >> 6 <= this.field227;
    }

    @ObfuscatedName("ah.m(IIIB)[I")
    public int[] method282(int arg0, int arg1, int arg2) {
        return this.method269(arg0, arg1, arg2) ? new int[] { this.field223 * 64 - this.field219 * 64 + arg1, this.field224 * 64 - this.field220 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ah.z(IIB)Lhw;")
    public class223 method271(int arg0, int arg1) {
        if (this.method284(arg0, arg1)) {
            int var3 = this.field219 * 64 - this.field223 * 64 + arg0;
            int var4 = this.field220 * 64 - this.field224 * 64 + arg1;
            return new class223(this.field230, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ah.q(Lkb;I)V")
    public void method288(class311 arg0) {
        this.field230 = arg0.method5276();
        this.field218 = arg0.method5276();
        this.field219 = arg0.method5163();
        this.field220 = arg0.method5163();
        this.field221 = arg0.method5163();
        this.field222 = arg0.method5163();
        this.field223 = arg0.method5163();
        this.field224 = arg0.method5163();
        this.field225 = arg0.method5163();
        this.field227 = arg0.method5163();
        this.method346();
    }

    @ObfuscatedName("ah.k(I)V")
    public void method346() {
    }
}
