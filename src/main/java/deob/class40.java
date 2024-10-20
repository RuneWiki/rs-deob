package deob;

@ObfuscatedName("ab")
public class class40 implements class44 {

    @ObfuscatedName("ab.g")
    public int field513;

    @ObfuscatedName("ab.e")
    public int field512;

    @ObfuscatedName("ab.b")
    public int field514;

    @ObfuscatedName("ab.z")
    public int field516;

    @ObfuscatedName("ab.n")
    public int field515;

    @ObfuscatedName("ab.l")
    public int field517;

    @ObfuscatedName("ab.g(Las;I)V")
    public void method183(class33 arg0) {
        if (arg0.field450 > this.field515) {
            arg0.field450 = this.field515;
        }
        if (arg0.field449 < this.field515) {
            arg0.field449 = this.field515;
        }
        if (arg0.field443 > this.field517) {
            arg0.field443 = this.field517;
        }
        if (arg0.field451 < this.field517) {
            arg0.field451 = this.field517;
        }
    }

    @ObfuscatedName("ab.e(IIII)Z")
    public boolean method185(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field513 && arg0 < this.field513 + this.field512) {
            return arg1 >> 6 == this.field514 && arg2 >> 6 == this.field516;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ab.b(III)Z")
    public boolean method204(int arg0, int arg1) {
        return arg0 >> 6 == this.field515 && arg1 >> 6 == this.field517;
    }

    @ObfuscatedName("ab.z(IIIB)[I")
    public int[] method186(int arg0, int arg1, int arg2) {
        return this.method185(arg0, arg1, arg2) ? new int[] { this.field515 * 64 - this.field514 * 64 + arg1, this.field517 * 64 - this.field516 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ab.n(IIB)Lio;")
    public class239 method182(int arg0, int arg1) {
        if (this.method204(arg0, arg1)) {
            int var3 = this.field514 * 64 - this.field515 * 64 + arg0;
            int var4 = this.field516 * 64 - this.field517 * 64 + arg1;
            return new class239(this.field513, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ab.l(Lgg;B)V")
    public void method188(class195 arg0) {
        this.field513 = arg0.method3332();
        this.field512 = arg0.method3332();
        this.field514 = arg0.method3310();
        this.field516 = arg0.method3310();
        this.field515 = arg0.method3310();
        this.field517 = arg0.method3310();
        this.method521();
    }

    @ObfuscatedName("ab.s(I)V")
    public void method521() {
    }
}
