package deob;

@ObfuscatedName("as")
public class class28 implements class32 {

    @ObfuscatedName("as.f")
    public int field235;

    @ObfuscatedName("as.h")
    public int field232;

    @ObfuscatedName("as.e")
    public int field233;

    @ObfuscatedName("as.b")
    public int field234;

    @ObfuscatedName("as.l")
    public int field237;

    @ObfuscatedName("as.w")
    public int field236;

    @ObfuscatedName("as.f(Lp;B)V")
    public void method162(class21 arg0) {
        if (arg0.field171 > this.field237) {
            arg0.field171 = this.field237;
        }
        if (arg0.field172 < this.field237) {
            arg0.field172 = this.field237;
        }
        if (arg0.field170 > this.field236) {
            arg0.field170 = this.field236;
        }
        if (arg0.field174 < this.field236) {
            arg0.field174 = this.field236;
        }
    }

    @ObfuscatedName("as.h(IIIB)Z")
    public boolean method151(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field235 && arg0 < this.field235 + this.field232) {
            return arg1 >> 6 == this.field233 && arg2 >> 6 == this.field234;
        } else {
            return false;
        }
    }

    @ObfuscatedName("as.e(IIB)Z")
    public boolean method152(int arg0, int arg1) {
        return arg0 >> 6 == this.field237 && arg1 >> 6 == this.field236;
    }

    @ObfuscatedName("as.b(IIII)[I")
    public int[] method150(int arg0, int arg1, int arg2) {
        return this.method151(arg0, arg1, arg2) ? new int[] { this.field237 * 64 - this.field233 * 64 + arg1, this.field236 * 64 - this.field234 * 64 + arg2 } : null;
    }

    @ObfuscatedName("as.l(IIB)Lhc;")
    public class229 method177(int arg0, int arg1) {
        if (this.method152(arg0, arg1)) {
            int var3 = this.field233 * 64 - this.field237 * 64 + arg0;
            int var4 = this.field234 * 64 - this.field236 * 64 + arg1;
            return new class229(this.field235, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("as.w(Lgx;I)V")
    public void method155(class185 arg0) {
        this.field235 = arg0.method3323();
        this.field232 = arg0.method3323();
        this.field233 = arg0.method3325();
        this.field234 = arg0.method3325();
        this.field237 = arg0.method3325();
        this.field236 = arg0.method3325();
        this.method454();
    }

    @ObfuscatedName("as.d(B)V")
    public void method454() {
    }
}
