package deob;

@ObfuscatedName("ak")
public class class34 implements class47 {

    @ObfuscatedName("ak.n")
    public int field225;

    @ObfuscatedName("ak.v")
    public int field230;

    @ObfuscatedName("ak.d")
    public int field224;

    @ObfuscatedName("ak.c")
    public int field226;

    @ObfuscatedName("ak.y")
    public int field234;

    @ObfuscatedName("ak.h")
    public int field227;

    @ObfuscatedName("ak.z")
    public int field228;

    @ObfuscatedName("ak.e")
    public int field229;

    @ObfuscatedName("ak.q")
    public int field223;

    @ObfuscatedName("ak.l")
    public int field231;

    @ObfuscatedName("ak.n(Lar;B)V")
    public void method280(class36 arg0) {
        if (arg0.field246 > this.field228) {
            arg0.field246 = this.field228;
        }
        if (arg0.field247 < this.field223) {
            arg0.field247 = this.field223;
        }
        if (arg0.field248 > this.field229) {
            arg0.field248 = this.field229;
        }
        if (arg0.field251 < this.field231) {
            arg0.field251 = this.field231;
        }
    }

    @ObfuscatedName("ak.v(IIIB)Z")
    public boolean method269(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field225 && arg0 < this.field230 + this.field225) {
            return arg1 >> 6 >= this.field224 && arg1 >> 6 <= this.field234 && arg2 >> 6 >= this.field226 && arg2 >> 6 <= this.field227;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ak.d(IIB)Z")
    public boolean method267(int arg0, int arg1) {
        return arg0 >> 6 >= this.field228 && arg0 >> 6 <= this.field223 && arg1 >> 6 >= this.field229 && arg1 >> 6 <= this.field231;
    }

    @ObfuscatedName("ak.c(IIIB)[I")
    public int[] method271(int arg0, int arg1, int arg2) {
        return this.method269(arg0, arg1, arg2) ? new int[] { this.field228 * 64 - this.field224 * 64 + arg1, this.field229 * 64 - this.field226 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ak.y(III)Lhd;")
    public class223 method266(int arg0, int arg1) {
        if (this.method267(arg0, arg1)) {
            int var3 = this.field224 * 64 - this.field228 * 64 + arg0;
            int var4 = this.field226 * 64 - this.field229 * 64 + arg1;
            return new class223(this.field225, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ak.h(Lkx;I)V")
    public void method270(class311 arg0) {
        this.field225 = arg0.method5310();
        this.field230 = arg0.method5310();
        this.field224 = arg0.method5247();
        this.field226 = arg0.method5247();
        this.field234 = arg0.method5247();
        this.field227 = arg0.method5247();
        this.field228 = arg0.method5247();
        this.field229 = arg0.method5247();
        this.field223 = arg0.method5247();
        this.field231 = arg0.method5247();
        this.method336();
    }

    @ObfuscatedName("ak.z(S)V")
    public void method336() {
    }
}
