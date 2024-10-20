package deob;

@ObfuscatedName("az")
public abstract class class44 {

    @ObfuscatedName("az.x")
    public final class223 field314;

    @ObfuscatedName("az.w")
    public final class223 field313;

    @ObfuscatedName("az.g")
    public int field312;

    @ObfuscatedName("az.m")
    public int field315;

    public class44(class223 arg0, class223 arg1) {
        this.field313 = arg0;
        this.field314 = arg1;
    }

    @ObfuscatedName("az.q(III)Z")
    public boolean method564(int arg0, int arg1) {
        if (this.method563(arg0, arg1)) {
            return true;
        } else {
            return this.method565(arg0, arg1);
        }
    }

    @ObfuscatedName("az.c(I)Z")
    public boolean method561() {
        return this.method250() >= 0;
    }

    @ObfuscatedName("az.j(IIB)Z")
    public boolean method563(int arg0, int arg1) {
        if (!this.method561()) {
            return false;
        }
        class252 var3 = Statics.method285(this.method250());
        int var4 = this.method251();
        int var5 = this.method252();
        switch(var3.field3255.field3483) {
            case 0:
                if (arg0 >= this.field312 - var4 / 2 && arg0 <= var4 / 2 + this.field312) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field312 - var4 && arg0 <= this.field312) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field312 || arg0 >= this.field312 + var4) {
                    return false;
                }
        }
        switch(var3.field3253.field3225) {
            case 0:
                if (arg1 >= this.field315 - var5 / 2 && arg1 <= var5 / 2 + this.field315) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field315 - var5 || arg1 > this.field315) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field315 || arg1 >= this.field315 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("az.r(III)Z")
    public boolean method565(int arg0, int arg1) {
        class38 var3 = this.method261();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field312 - var3.field261 / 2 && arg0 <= var3.field261 / 2 + this.field312) {
            return arg1 >= this.field315 && arg1 <= this.field315 + var3.field260;
        } else {
            return false;
        }
    }

    @ObfuscatedName("az.z(I)I")
    public abstract int method250();

    @ObfuscatedName("az.t(I)I")
    public abstract int method252();

    @ObfuscatedName("az.s(I)I")
    public abstract int method251();

    @ObfuscatedName("az.k(I)Laq;")
    public abstract class38 method261();
}
