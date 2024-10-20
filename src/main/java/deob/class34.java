package deob;

@ObfuscatedName("an")
public class class34 implements class38 {

    @ObfuscatedName("an.n")
    public int field278;

    @ObfuscatedName("an.h")
    public int field280;

    @ObfuscatedName("an.l")
    public int field279;

    @ObfuscatedName("an.g")
    public int field281;

    @ObfuscatedName("an.b")
    public int field282;

    @ObfuscatedName("an.a")
    public int field283;

    @ObfuscatedName("an.n(Laa;I)V")
    public void method220(class27 arg0) {
        if (arg0.field211 > this.field282) {
            arg0.field211 = this.field282;
        }
        if (arg0.field212 < this.field282) {
            arg0.field212 = this.field282;
        }
        if (arg0.field213 > this.field283) {
            arg0.field213 = this.field283;
        }
        if (arg0.field214 < this.field283) {
            arg0.field214 = this.field283;
        }
    }

    @ObfuscatedName("an.h(IIIB)Z")
    public boolean method204(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field278 && arg0 < this.field280 + this.field278) {
            return arg1 >> 6 == this.field279 && arg2 >> 6 == this.field281;
        } else {
            return false;
        }
    }

    @ObfuscatedName("an.l(III)Z")
    public boolean method205(int arg0, int arg1) {
        return arg0 >> 6 == this.field282 && arg1 >> 6 == this.field283;
    }

    @ObfuscatedName("an.g(IIII)[I")
    public int[] method206(int arg0, int arg1, int arg2) {
        return this.method204(arg0, arg1, arg2) ? new int[] { this.field282 * 64 - this.field279 * 64 + arg1, this.field283 * 64 - this.field281 * 64 + arg2 } : null;
    }

    @ObfuscatedName("an.b(IIB)Lho;")
    public class234 method203(int arg0, int arg1) {
        if (this.method205(arg0, arg1)) {
            int var3 = this.field279 * 64 - this.field282 * 64 + arg0;
            int var4 = this.field281 * 64 - this.field283 * 64 + arg1;
            return new class234(this.field278, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.a(Lgc;B)V")
    public void method208(class190 arg0) {
        this.field278 = arg0.method3511();
        this.field280 = arg0.method3511();
        this.field279 = arg0.method3513();
        this.field281 = arg0.method3513();
        this.field282 = arg0.method3513();
        this.field283 = arg0.method3513();
        this.method497();
    }

    @ObfuscatedName("an.c(I)V")
    public void method497() {
    }
}
