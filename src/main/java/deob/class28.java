package deob;

@ObfuscatedName("an")
public class class28 implements class32 {

    @ObfuscatedName("an.g")
    public int field272;

    @ObfuscatedName("an.r")
    public int field268;

    @ObfuscatedName("an.e")
    public int field269;

    @ObfuscatedName("an.q")
    public int field270;

    @ObfuscatedName("an.c")
    public int field271;

    @ObfuscatedName("an.l")
    public int field273;

    @ObfuscatedName("an.g(Lk;B)V")
    public void method147(class21 arg0) {
        if (arg0.field199 > this.field271) {
            arg0.field199 = this.field271;
        }
        if (arg0.field200 < this.field271) {
            arg0.field200 = this.field271;
        }
        if (arg0.field195 > this.field273) {
            arg0.field195 = this.field273;
        }
        if (arg0.field204 < this.field273) {
            arg0.field204 = this.field273;
        }
    }

    @ObfuscatedName("an.r(IIIB)Z")
    public boolean method148(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field272 && arg0 < this.field272 + this.field268) {
            return arg1 >> 6 == this.field269 && arg2 >> 6 == this.field270;
        } else {
            return false;
        }
    }

    @ObfuscatedName("an.e(IIB)Z")
    public boolean method149(int arg0, int arg1) {
        return arg0 >> 6 == this.field271 && arg1 >> 6 == this.field273;
    }

    @ObfuscatedName("an.q(IIII)[I")
    public int[] method150(int arg0, int arg1, int arg2) {
        return this.method148(arg0, arg1, arg2) ? new int[] { this.field271 * 64 - this.field269 * 64 + arg1, this.field273 * 64 - this.field270 * 64 + arg2 } : null;
    }

    @ObfuscatedName("an.c(IIB)Lhz;")
    public class229 method153(int arg0, int arg1) {
        if (this.method149(arg0, arg1)) {
            int var3 = this.field269 * 64 - this.field271 * 64 + arg0;
            int var4 = this.field270 * 64 - this.field273 * 64 + arg1;
            return new class229(this.field272, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.i(Lgl;I)V")
    public void method151(class185 arg0) {
        this.field272 = arg0.method3679();
        this.field268 = arg0.method3679();
        this.field269 = arg0.method3467();
        this.field270 = arg0.method3467();
        this.field271 = arg0.method3467();
        this.field273 = arg0.method3467();
        this.method474();
    }

    @ObfuscatedName("an.p(I)V")
    public void method474() {
    }
}
