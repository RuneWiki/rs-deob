package deob;

@ObfuscatedName("az")
public class class31 implements class43 {

    @ObfuscatedName("az.e")
    public int field438;

    @ObfuscatedName("az.o")
    public int field431;

    @ObfuscatedName("az.m")
    public int field432;

    @ObfuscatedName("az.g")
    public int field441;

    @ObfuscatedName("az.d")
    public int field434;

    @ObfuscatedName("az.b")
    public int field444;

    @ObfuscatedName("az.k")
    public int field436;

    @ObfuscatedName("az.f")
    public int field437;

    @ObfuscatedName("az.j")
    public int field433;

    @ObfuscatedName("az.q")
    public int field440;

    @ObfuscatedName("az.e(Lai;I)V")
    public void method175(class33 arg0) {
        if (arg0.field459 > this.field436) {
            arg0.field459 = this.field436;
        }
        if (arg0.field460 < this.field433) {
            arg0.field460 = this.field433;
        }
        if (arg0.field461 > this.field437) {
            arg0.field461 = this.field437;
        }
        if (arg0.field453 < this.field440) {
            arg0.field453 = this.field440;
        }
    }

    @ObfuscatedName("az.o(IIIB)Z")
    public boolean method168(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field438 && arg0 < this.field438 + this.field431) {
            return arg1 >> 6 >= this.field432 && arg1 >> 6 <= this.field434 && arg2 >> 6 >= this.field441 && arg2 >> 6 <= this.field444;
        } else {
            return false;
        }
    }

    @ObfuscatedName("az.m(IIS)Z")
    public boolean method186(int arg0, int arg1) {
        return arg0 >> 6 >= this.field436 && arg0 >> 6 <= this.field433 && arg1 >> 6 >= this.field437 && arg1 >> 6 <= this.field440;
    }

    @ObfuscatedName("az.g(IIII)[I")
    public int[] method163(int arg0, int arg1, int arg2) {
        return this.method168(arg0, arg1, arg2) ? new int[] { this.field436 * 64 - this.field432 * 64 + arg1, this.field437 * 64 - this.field441 * 64 + arg2 } : null;
    }

    @ObfuscatedName("az.d(III)Lhh;")
    public class213 method164(int arg0, int arg1) {
        if (this.method186(arg0, arg1)) {
            int var3 = this.field432 * 64 - this.field436 * 64 + arg0;
            int var4 = this.field441 * 64 - this.field437 * 64 + arg1;
            return new class213(this.field438, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("az.b(Lfw;I)V")
    public void method162(class174 arg0) {
        this.field438 = arg0.method2891();
        this.field431 = arg0.method2891();
        this.field432 = arg0.method2930();
        this.field441 = arg0.method2930();
        this.field434 = arg0.method2930();
        this.field444 = arg0.method2930();
        this.field436 = arg0.method2930();
        this.field437 = arg0.method2930();
        this.field433 = arg0.method2930();
        this.field440 = arg0.method2930();
        this.method220();
    }

    @ObfuscatedName("az.k(I)V")
    public void method220() {
    }
}
