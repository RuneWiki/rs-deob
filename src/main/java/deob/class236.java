package deob;

@ObfuscatedName("ij")
public abstract class class236 {

    @ObfuscatedName("ij.j")
    public final class277 field2760;

    @ObfuscatedName("ij.w")
    public final class277 field2759;

    @ObfuscatedName("ij.n")
    public int field2758;

    @ObfuscatedName("ij.r")
    public int field2761;

    public class236(class277 arg0, class277 arg1) {
        this.field2759 = arg0;
        this.field2760 = arg1;
    }

    @ObfuscatedName("ij.e(III)Z")
    public boolean method4417(int arg0, int arg1) {
        if (this.method4411(arg0, arg1)) {
            return true;
        } else {
            return this.method4409(arg0, arg1);
        }
    }

    @ObfuscatedName("ij.a(I)Z")
    public boolean method4410() {
        return this.method4040() >= 0;
    }

    @ObfuscatedName("ij.u(III)Z")
    public boolean method4411(int arg0, int arg1) {
        if (!this.method4410()) {
            return false;
        }
        class164 var3 = class164.method2044(this.method4040());
        int var4 = this.method4035();
        int var5 = this.method4036();
        switch(var3.field1768.field1831) {
            case 0:
                if (arg0 > this.field2758 - var4 && arg0 <= this.field2758) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field2758 && arg0 < this.field2758 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field2758 - var4 / 2 || arg0 > var4 / 2 + this.field2758) {
                    return false;
                }
        }
        switch(var3.field1769.field1873) {
            case 0:
                if (arg1 >= this.field2761 && arg1 < this.field2761 + var5) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2761 - var5 / 2 || arg1 > var5 / 2 + this.field2761) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field2761 - var5 || arg1 > this.field2761) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ij.k(III)Z")
    public boolean method4409(int arg0, int arg1) {
        class231 var3 = this.method4034();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2758 - var3.field2730 / 2 && arg0 <= var3.field2730 / 2 + this.field2758) {
            return arg1 >= this.field2761 && arg1 <= this.field2761 + var3.field2731;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ij.p(I)Lhm;")
    public abstract class231 method4034();

    @ObfuscatedName("ij.b(I)I")
    public abstract int method4040();

    @ObfuscatedName("ij.m(S)I")
    public abstract int method4035();

    @ObfuscatedName("ij.t(I)I")
    public abstract int method4036();
}
