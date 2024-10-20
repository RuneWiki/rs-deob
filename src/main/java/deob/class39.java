package deob;

@ObfuscatedName("at")
public class class39 implements class43 {

    @ObfuscatedName("at.e")
    public int field521;

    @ObfuscatedName("at.o")
    public int field518;

    @ObfuscatedName("at.m")
    public int field519;

    @ObfuscatedName("at.g")
    public int field520;

    @ObfuscatedName("at.d")
    public int field523;

    @ObfuscatedName("at.b")
    public int field522;

    @ObfuscatedName("at.e(Lai;I)V")
    public void method175(class33 arg0) {
        if (arg0.field459 > this.field523) {
            arg0.field459 = this.field523;
        }
        if (arg0.field460 < this.field523) {
            arg0.field460 = this.field523;
        }
        if (arg0.field461 > this.field522) {
            arg0.field461 = this.field522;
        }
        if (arg0.field453 < this.field522) {
            arg0.field453 = this.field522;
        }
    }

    @ObfuscatedName("at.o(IIIB)Z")
    public boolean method168(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field521 && arg0 < this.field521 + this.field518) {
            return arg1 >> 6 == this.field519 && arg2 >> 6 == this.field520;
        } else {
            return false;
        }
    }

    @ObfuscatedName("at.m(IIS)Z")
    public boolean method186(int arg0, int arg1) {
        return arg0 >> 6 == this.field523 && arg1 >> 6 == this.field522;
    }

    @ObfuscatedName("at.g(IIII)[I")
    public int[] method163(int arg0, int arg1, int arg2) {
        return this.method168(arg0, arg1, arg2) ? new int[] { this.field523 * 64 - this.field519 * 64 + arg1, this.field522 * 64 - this.field520 * 64 + arg2 } : null;
    }

    @ObfuscatedName("at.d(III)Lhh;")
    public class213 method164(int arg0, int arg1) {
        if (this.method186(arg0, arg1)) {
            int var3 = this.field519 * 64 - this.field523 * 64 + arg0;
            int var4 = this.field520 * 64 - this.field522 * 64 + arg1;
            return new class213(this.field521, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("at.b(Lfw;I)V")
    public void method162(class174 arg0) {
        this.field521 = arg0.method2891();
        this.field518 = arg0.method2891();
        this.field519 = arg0.method2930();
        this.field520 = arg0.method2930();
        this.field523 = arg0.method2930();
        this.field522 = arg0.method2930();
        this.method471();
    }

    @ObfuscatedName("at.k(B)V")
    public void method471() {
    }
}
