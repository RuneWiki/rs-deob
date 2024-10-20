package deob;

@ObfuscatedName("ay")
public class class39 implements class43 {

    @ObfuscatedName("ay.s")
    public int field516;

    @ObfuscatedName("ay.c")
    public int field514;

    @ObfuscatedName("ay.f")
    public int field515;

    @ObfuscatedName("ay.m")
    public int field521;

    @ObfuscatedName("ay.h")
    public int field517;

    @ObfuscatedName("ay.t")
    public int field513;

    @ObfuscatedName("ay.s(Laq;I)V")
    public void method184(class33 arg0) {
        if (arg0.field467 > this.field517) {
            arg0.field467 = this.field517;
        }
        if (arg0.field463 < this.field517) {
            arg0.field463 = this.field517;
        }
        if (arg0.field464 > this.field513) {
            arg0.field464 = this.field513;
        }
        if (arg0.field465 < this.field513) {
            arg0.field465 = this.field513;
        }
    }

    @ObfuscatedName("ay.c(IIII)Z")
    public boolean method185(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field516 && arg0 < this.field516 + this.field514) {
            return arg1 >> 6 == this.field515 && arg2 >> 6 == this.field521;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.f(III)Z")
    public boolean method208(int arg0, int arg1) {
        return arg0 >> 6 == this.field517 && arg1 >> 6 == this.field513;
    }

    @ObfuscatedName("ay.m(IIII)[I")
    public int[] method213(int arg0, int arg1, int arg2) {
        return this.method185(arg0, arg1, arg2) ? new int[] { this.field517 * 64 - this.field515 * 64 + arg1, this.field513 * 64 - this.field521 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ay.h(IIB)Lhp;")
    public class216 method188(int arg0, int arg1) {
        if (this.method208(arg0, arg1)) {
            int var3 = this.field515 * 64 - this.field517 * 64 + arg0;
            int var4 = this.field521 * 64 - this.field513 * 64 + arg1;
            return new class216(this.field516, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ay.t(Lfs;I)V")
    public void method189(class177 arg0) {
        this.field516 = arg0.method2965();
        this.field514 = arg0.method2965();
        this.field515 = arg0.method2967();
        this.field521 = arg0.method2967();
        this.field517 = arg0.method2967();
        this.field513 = arg0.method2967();
        this.method473();
    }

    @ObfuscatedName("ay.p(I)V")
    public void method473() {
    }
}
