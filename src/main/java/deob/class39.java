package deob;

@ObfuscatedName("an")
public class class39 implements class43 {

    @ObfuscatedName("an.p")
    public int field484;

    @ObfuscatedName("an.i")
    public int field490;

    @ObfuscatedName("an.w")
    public int field486;

    @ObfuscatedName("an.s")
    public int field487;

    @ObfuscatedName("an.j")
    public int field485;

    @ObfuscatedName("an.a")
    public int field489;

    @ObfuscatedName("an.p(Lae;I)V")
    public void method184(class33 arg0) {
        if (arg0.field427 > this.field485) {
            arg0.field427 = this.field485;
        }
        if (arg0.field434 < this.field485) {
            arg0.field434 = this.field485;
        }
        if (arg0.field429 > this.field489) {
            arg0.field429 = this.field489;
        }
        if (arg0.field423 < this.field489) {
            arg0.field423 = this.field489;
        }
    }

    @ObfuscatedName("an.i(IIII)Z")
    public boolean method185(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field484 && arg0 < this.field490 + this.field484) {
            return arg1 >> 6 == this.field486 && arg2 >> 6 == this.field487;
        } else {
            return false;
        }
    }

    @ObfuscatedName("an.w(III)Z")
    public boolean method186(int arg0, int arg1) {
        return arg0 >> 6 == this.field485 && arg1 >> 6 == this.field489;
    }

    @ObfuscatedName("an.s(IIII)[I")
    public int[] method187(int arg0, int arg1, int arg2) {
        return this.method185(arg0, arg1, arg2) ? new int[] { this.field485 * 64 - this.field486 * 64 + arg1, this.field489 * 64 - this.field487 * 64 + arg2 } : null;
    }

    @ObfuscatedName("an.j(III)Lhn;")
    public class224 method213(int arg0, int arg1) {
        if (this.method186(arg0, arg1)) {
            int var3 = this.field486 * 64 - this.field485 * 64 + arg0;
            int var4 = this.field487 * 64 - this.field489 * 64 + arg1;
            return new class224(this.field484, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("an.a(Lgj;B)V")
    public void method189(class185 arg0) {
        this.field484 = arg0.method3197();
        this.field490 = arg0.method3197();
        this.field486 = arg0.method3124();
        this.field487 = arg0.method3124();
        this.field485 = arg0.method3124();
        this.field489 = arg0.method3124();
        this.method480();
    }

    @ObfuscatedName("an.t(B)V")
    public void method480() {
    }
}
