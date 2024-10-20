package deob;

@ObfuscatedName("ab")
public class class29 {

    @ObfuscatedName("ab.z")
    public final int field241;

    @ObfuscatedName("ab.w")
    public final class227 field237;

    @ObfuscatedName("ab.s")
    public final class227 field244;

    @ObfuscatedName("ab.l")
    public final int field243;

    @ObfuscatedName("ab.u")
    public final int field240;

    @ObfuscatedName("ab.q")
    public final class23 field247;

    @ObfuscatedName("ab.k")
    public int field236;

    @ObfuscatedName("ab.i")
    public int field246;

    public class29(int arg0, class227 arg1, class227 arg2, class23 arg3) {
        this.field241 = arg0;
        this.field244 = arg1;
        this.field237 = arg2;
        this.field247 = arg3;
        class256 var5 = Statics.field3247[this.field241];
        class319 var6 = var5.method4424(false);
        if (var6 == null) {
            this.field243 = 0;
            this.field240 = 0;
        } else {
            this.field243 = var6.field3788;
            this.field240 = var6.field3789;
        }
    }

    @ObfuscatedName("ab.z(III)Z")
    public boolean method425(int arg0, int arg1) {
        if (this.method426(arg0, arg1)) {
            return true;
        } else {
            return this.method427(arg0, arg1);
        }
    }

    @ObfuscatedName("ab.w(III)Z")
    public boolean method426(int arg0, int arg1) {
        class256 var3 = Statics.field3247[this.field241];
        switch(var3.field3253.field3483) {
            case 0:
                if (arg0 < this.field236 - this.field243 / 2 || arg0 > this.field243 / 2 + this.field236) {
                    return false;
                }
                break;
            case 1:
                if (arg0 <= this.field236 - this.field243 || arg0 > this.field236) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field236 || arg0 >= this.field243 + this.field236) {
                    return false;
                }
        }
        switch(var3.field3254.field3224) {
            case 0:
                if (arg1 >= this.field246 && arg1 < this.field246 + this.field240) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field246 - this.field240 / 2 || arg1 > this.field240 / 2 + this.field246) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field246 - this.field240 || arg1 > this.field246) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ab.s(IIB)Z")
    public boolean method427(int arg0, int arg1) {
        if (this.field247 == null) {
            return false;
        } else if (arg0 >= this.field236 - this.field247.field185 / 2 && arg0 <= this.field247.field185 / 2 + this.field236) {
            return arg1 >= this.field246 && arg1 <= this.field247.field183 + this.field246;
        } else {
            return false;
        }
    }
}
