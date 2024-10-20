package deob;

@ObfuscatedName("av")
public class class43 implements class47 {

    @ObfuscatedName("av.m")
    public int field316;

    @ObfuscatedName("av.o")
    public int field310;

    @ObfuscatedName("av.q")
    public int field309;

    @ObfuscatedName("av.j")
    public int field311;

    @ObfuscatedName("av.p")
    public int field313;

    @ObfuscatedName("av.g")
    public int field314;

    @ObfuscatedName("av.m(Lad;I)V")
    public void method244(class36 arg0) {
        if (arg0.field247 > this.field313) {
            arg0.field247 = this.field313;
        }
        if (arg0.field248 < this.field313) {
            arg0.field248 = this.field313;
        }
        if (arg0.field249 > this.field314) {
            arg0.field249 = this.field314;
        }
        if (arg0.field241 < this.field314) {
            arg0.field241 = this.field314;
        }
    }

    @ObfuscatedName("av.o(IIIB)Z")
    public boolean method245(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field316 && arg0 < this.field316 + this.field310) {
            return arg1 >> 6 == this.field309 && arg2 >> 6 == this.field311;
        } else {
            return false;
        }
    }

    @ObfuscatedName("av.q(IIB)Z")
    public boolean method246(int arg0, int arg1) {
        return arg0 >> 6 == this.field313 && arg1 >> 6 == this.field314;
    }

    @ObfuscatedName("av.j(IIII)[I")
    public int[] method247(int arg0, int arg1, int arg2) {
        return this.method245(arg0, arg1, arg2) ? new int[] { this.field313 * 64 - this.field309 * 64 + arg1, this.field314 * 64 - this.field311 * 64 + arg2 } : null;
    }

    @ObfuscatedName("av.p(III)Lhg;")
    public class223 method248(int arg0, int arg1) {
        if (this.method246(arg0, arg1)) {
            int var3 = this.field309 * 64 - this.field313 * 64 + arg0;
            int var4 = this.field311 * 64 - this.field314 * 64 + arg1;
            return new class223(this.field316, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("av.g(Lkn;B)V")
    public void method249(class310 arg0) {
        this.field316 = arg0.method5227();
        this.field310 = arg0.method5227();
        this.field309 = arg0.method5283();
        this.field311 = arg0.method5283();
        this.field313 = arg0.method5283();
        this.field314 = arg0.method5283();
        this.method549();
    }

    @ObfuscatedName("av.n(B)V")
    public void method549() {
    }
}
