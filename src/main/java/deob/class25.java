package deob;

@ObfuscatedName("w")
public class class25 implements class38 {

    @ObfuscatedName("w.n")
    public int field196;

    @ObfuscatedName("w.h")
    public int field186;

    @ObfuscatedName("w.l")
    public int field194;

    @ObfuscatedName("w.g")
    public int field187;

    @ObfuscatedName("w.b")
    public int field199;

    @ObfuscatedName("w.a")
    public int field190;

    @ObfuscatedName("w.c")
    public int field191;

    @ObfuscatedName("w.z")
    public int field192;

    @ObfuscatedName("w.j")
    public int field193;

    @ObfuscatedName("w.d")
    public int field188;

    @ObfuscatedName("w.n(Laa;I)V")
    public void method220(class27 arg0) {
        if (arg0.field211 > this.field191) {
            arg0.field211 = this.field191;
        }
        if (arg0.field212 < this.field193) {
            arg0.field212 = this.field193;
        }
        if (arg0.field213 > this.field192) {
            arg0.field213 = this.field192;
        }
        if (arg0.field214 < this.field188) {
            arg0.field214 = this.field188;
        }
    }

    @ObfuscatedName("w.h(IIIB)Z")
    public boolean method204(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field196 && arg0 < this.field196 + this.field186) {
            return arg1 >> 6 >= this.field194 && arg1 >> 6 <= this.field199 && arg2 >> 6 >= this.field187 && arg2 >> 6 <= this.field190;
        } else {
            return false;
        }
    }

    @ObfuscatedName("w.l(III)Z")
    public boolean method205(int arg0, int arg1) {
        return arg0 >> 6 >= this.field191 && arg0 >> 6 <= this.field193 && arg1 >> 6 >= this.field192 && arg1 >> 6 <= this.field188;
    }

    @ObfuscatedName("w.g(IIII)[I")
    public int[] method206(int arg0, int arg1, int arg2) {
        return this.method204(arg0, arg1, arg2) ? new int[] { this.field191 * 64 - this.field194 * 64 + arg1, this.field192 * 64 - this.field187 * 64 + arg2 } : null;
    }

    @ObfuscatedName("w.b(IIB)Lho;")
    public class234 method203(int arg0, int arg1) {
        if (this.method205(arg0, arg1)) {
            int var3 = this.field194 * 64 - this.field191 * 64 + arg0;
            int var4 = this.field187 * 64 - this.field192 * 64 + arg1;
            return new class234(this.field196, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("w.a(Lgc;B)V")
    public void method208(class190 arg0) {
        this.field196 = arg0.method3511();
        this.field186 = arg0.method3511();
        this.field194 = arg0.method3513();
        this.field187 = arg0.method3513();
        this.field199 = arg0.method3513();
        this.field190 = arg0.method3513();
        this.field191 = arg0.method3513();
        this.field192 = arg0.method3513();
        this.field193 = arg0.method3513();
        this.field188 = arg0.method3513();
        this.method278();
    }

    @ObfuscatedName("w.c(I)V")
    public void method278() {
    }
}
