package deob;

@ObfuscatedName("af")
public class class29 {

    @ObfuscatedName("af.f")
    public final int field282;

    @ObfuscatedName("af.l")
    public final class229 field283;

    @ObfuscatedName("af.w")
    public final class229 field272;

    @ObfuscatedName("af.s")
    public final int field276;

    @ObfuscatedName("af.e")
    public final int field270;

    @ObfuscatedName("af.a")
    public final class23 field275;

    @ObfuscatedName("af.c")
    public int field274;

    @ObfuscatedName("af.p")
    public int field277;

    public class29(int arg0, class229 arg1, class229 arg2, class23 arg3) {
        this.field282 = arg0;
        this.field272 = arg1;
        this.field283 = arg2;
        this.field275 = arg3;
        class258 var5 = class258.method3139(this.field282);
        class324 var6 = var5.method4489(false);
        if (var6 == null) {
            this.field276 = 0;
            this.field270 = 0;
        } else {
            this.field276 = var6.field3872;
            this.field270 = var6.field3871;
        }
    }

    @ObfuscatedName("af.f(III)Z")
    public boolean method450(int arg0, int arg1) {
        if (this.method453(arg0, arg1)) {
            return true;
        } else {
            return this.method452(arg0, arg1);
        }
    }

    @ObfuscatedName("af.l(III)Z")
    public boolean method453(int arg0, int arg1) {
        class258 var3 = class258.method3139(this.field282);
        switch(var3.field3311.field3557) {
            case 0:
                if (arg0 < this.field274 - this.field276 / 2 || arg0 > this.field276 / 2 + this.field274) {
                    return false;
                }
                break;
            case 1:
                if (arg0 <= this.field274 - this.field276 || arg0 > this.field274) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field274 || arg0 >= this.field276 + this.field274) {
                    return false;
                }
        }
        switch(var3.field3305.field3288) {
            case 0:
                if (arg1 >= this.field277 && arg1 < this.field277 + this.field270) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field277 - this.field270 || arg1 > this.field277) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field277 - this.field270 / 2 || arg1 > this.field270 / 2 + this.field277) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("af.w(III)Z")
    public boolean method452(int arg0, int arg1) {
        if (this.field275 == null) {
            return false;
        } else if (arg0 >= this.field274 - this.field275.field208 / 2 && arg0 <= this.field275.field208 / 2 + this.field274) {
            return arg1 >= this.field277 && arg1 <= this.field275.field210 + this.field277;
        } else {
            return false;
        }
    }
}
