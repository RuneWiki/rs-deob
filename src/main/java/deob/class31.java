package deob;

@ObfuscatedName("ag")
public class class31 implements class44 {

    @ObfuscatedName("ag.g")
    public int field432;

    @ObfuscatedName("ag.e")
    public int field423;

    @ObfuscatedName("ag.b")
    public int field425;

    @ObfuscatedName("ag.z")
    public int field426;

    @ObfuscatedName("ag.n")
    public int field427;

    @ObfuscatedName("ag.l")
    public int field428;

    @ObfuscatedName("ag.s")
    public int field424;

    @ObfuscatedName("ag.y")
    public int field430;

    @ObfuscatedName("ag.c")
    public int field431;

    @ObfuscatedName("ag.h")
    public int field429;

    @ObfuscatedName("ag.g(Las;I)V")
    public void method183(class33 arg0) {
        if (arg0.field450 > this.field424) {
            arg0.field450 = this.field424;
        }
        if (arg0.field449 < this.field431) {
            arg0.field449 = this.field431;
        }
        if (arg0.field443 > this.field430) {
            arg0.field443 = this.field430;
        }
        if (arg0.field451 < this.field429) {
            arg0.field451 = this.field429;
        }
    }

    @ObfuscatedName("ag.e(IIII)Z")
    public boolean method185(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field432 && arg0 < this.field432 + this.field423) {
            return arg1 >> 6 >= this.field425 && arg1 >> 6 <= this.field427 && arg2 >> 6 >= this.field426 && arg2 >> 6 <= this.field428;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.b(III)Z")
    public boolean method204(int arg0, int arg1) {
        return arg0 >> 6 >= this.field424 && arg0 >> 6 <= this.field431 && arg1 >> 6 >= this.field430 && arg1 >> 6 <= this.field429;
    }

    @ObfuscatedName("ag.z(IIIB)[I")
    public int[] method186(int arg0, int arg1, int arg2) {
        return this.method185(arg0, arg1, arg2) ? new int[] { this.field424 * 64 - this.field425 * 64 + arg1, this.field430 * 64 - this.field426 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ag.n(IIB)Lio;")
    public class239 method182(int arg0, int arg1) {
        if (this.method204(arg0, arg1)) {
            int var3 = this.field425 * 64 - this.field424 * 64 + arg0;
            int var4 = this.field426 * 64 - this.field430 * 64 + arg1;
            return new class239(this.field432, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ag.l(Lgg;B)V")
    public void method188(class195 arg0) {
        this.field432 = arg0.method3332();
        this.field423 = arg0.method3332();
        this.field425 = arg0.method3310();
        this.field426 = arg0.method3310();
        this.field427 = arg0.method3310();
        this.field428 = arg0.method3310();
        this.field424 = arg0.method3310();
        this.field430 = arg0.method3310();
        this.field431 = arg0.method3310();
        this.field429 = arg0.method3310();
        this.method234();
    }

    @ObfuscatedName("ag.s(I)V")
    public void method234() {
    }
}
