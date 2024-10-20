package deob;

@ObfuscatedName("ap")
public class class43 implements class47 {

    @ObfuscatedName("ap.n")
    public int field311;

    @ObfuscatedName("ap.v")
    public int field312;

    @ObfuscatedName("ap.d")
    public int field307;

    @ObfuscatedName("ap.c")
    public int field308;

    @ObfuscatedName("ap.y")
    public int field305;

    @ObfuscatedName("ap.h")
    public int field310;

    @ObfuscatedName("ap.n(Lar;B)V")
    public void method280(class36 arg0) {
        if (arg0.field246 > this.field305) {
            arg0.field246 = this.field305;
        }
        if (arg0.field247 < this.field305) {
            arg0.field247 = this.field305;
        }
        if (arg0.field248 > this.field310) {
            arg0.field248 = this.field310;
        }
        if (arg0.field251 < this.field310) {
            arg0.field251 = this.field310;
        }
    }

    @ObfuscatedName("ap.v(IIIB)Z")
    public boolean method269(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field311 && arg0 < this.field312 + this.field311) {
            return arg1 >> 6 == this.field307 && arg2 >> 6 == this.field308;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ap.d(IIB)Z")
    public boolean method267(int arg0, int arg1) {
        return arg0 >> 6 == this.field305 && arg1 >> 6 == this.field310;
    }

    @ObfuscatedName("ap.c(IIIB)[I")
    public int[] method271(int arg0, int arg1, int arg2) {
        return this.method269(arg0, arg1, arg2) ? new int[] { this.field305 * 64 - this.field307 * 64 + arg1, this.field310 * 64 - this.field308 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ap.y(III)Lhd;")
    public class223 method266(int arg0, int arg1) {
        if (this.method267(arg0, arg1)) {
            int var3 = this.field307 * 64 - this.field305 * 64 + arg0;
            int var4 = this.field308 * 64 - this.field310 * 64 + arg1;
            return new class223(this.field311, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ap.h(Lkx;I)V")
    public void method270(class311 arg0) {
        this.field311 = arg0.method5310();
        this.field312 = arg0.method5310();
        this.field307 = arg0.method5247();
        this.field308 = arg0.method5247();
        this.field305 = arg0.method5247();
        this.field310 = arg0.method5247();
        this.method595();
    }

    @ObfuscatedName("ap.z(B)V")
    public void method595() {
    }
}
