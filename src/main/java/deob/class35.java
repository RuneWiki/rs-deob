package deob;

@ObfuscatedName("as")
public abstract class class35 {

    @ObfuscatedName("as.t")
    public final class214 field289;

    @ObfuscatedName("as.q")
    public final class214 field285;

    @ObfuscatedName("as.x")
    public int field287;

    @ObfuscatedName("as.d")
    public int field288;

    public class35(class214 arg0, class214 arg1) {
        this.field285 = arg0;
        this.field289 = arg1;
    }

    @ObfuscatedName("as.g(III)Z")
    public boolean method491(int arg0, int arg1) {
        if (this.method489(arg0, arg1)) {
            return true;
        } else {
            return this.method493(arg0, arg1);
        }
    }

    @ObfuscatedName("as.e(S)Z")
    public boolean method492() {
        return this.method169() >= 0;
    }

    @ObfuscatedName("as.z(IIS)Z")
    public boolean method489(int arg0, int arg1) {
        if (!this.method492()) {
            return false;
        }
        class242 var3 = class242.method156(this.method169());
        int var4 = this.method172();
        int var5 = this.method174();
        switch(var3.field3210.field3438) {
            case 0:
                if (arg0 >= this.field287 && arg0 < this.field287 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field287 - var4 / 2 && arg0 <= var4 / 2 + this.field287) {
                    break;
                }
                return false;
            case 2:
                if (arg0 <= this.field287 - var4 || arg0 > this.field287) {
                    return false;
                }
        }
        switch(var3.field3206.field3179) {
            case 0:
                if (arg1 >= this.field288 - var5 / 2 && arg1 <= var5 / 2 + this.field288) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field288 - var5 || arg1 > this.field288) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field288 || arg1 >= this.field288 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("as.w(IIB)Z")
    public boolean method493(int arg0, int arg1) {
        class29 var3 = this.method170();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field287 - var3.field228 / 2 && arg0 <= var3.field228 / 2 + this.field287) {
            return arg1 >= this.field288 && arg1 <= this.field288 + var3.field229;
        } else {
            return false;
        }
    }

    @ObfuscatedName("as.j(B)Lai;")
    public abstract class29 method170();

    @ObfuscatedName("as.s(B)I")
    public abstract int method169();

    @ObfuscatedName("as.k(B)I")
    public abstract int method174();

    @ObfuscatedName("as.i(I)I")
    public abstract int method172();
}
