package deob;

@ObfuscatedName("ax")
public class class29 {

    @ObfuscatedName("ax.g")
    public final int field286;

    @ObfuscatedName("ax.r")
    public final class229 field278;

    @ObfuscatedName("ax.e")
    public final class229 field280;

    @ObfuscatedName("ax.q")
    public final int field282;

    @ObfuscatedName("ax.c")
    public final int field281;

    @ObfuscatedName("ax.l")
    public final class23 field279;

    @ObfuscatedName("ax.b")
    public int field277;

    @ObfuscatedName("ax.w")
    public int field284;

    public class29(int arg0, class229 arg1, class229 arg2, class23 arg3) {
        this.field286 = arg0;
        this.field280 = arg1;
        this.field278 = arg2;
        this.field279 = arg3;
        class258 var5 = class258.method3265(this.field286);
        class324 var6 = var5.method4656(false);
        if (var6 == null) {
            this.field282 = 0;
            this.field281 = 0;
        } else {
            this.field282 = var6.field3880;
            this.field281 = var6.field3888;
        }
    }

    @ObfuscatedName("ax.g(III)Z")
    public boolean method484(int arg0, int arg1) {
        if (this.method479(arg0, arg1)) {
            return true;
        } else {
            return this.method481(arg0, arg1);
        }
    }

    @ObfuscatedName("ax.r(III)Z")
    public boolean method479(int arg0, int arg1) {
        class258 var3 = class258.method3265(this.field286);
        switch(var3.field3325.field3563) {
            case 0:
                if (arg0 <= this.field277 - this.field282 || arg0 > this.field277) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field277 - this.field282 / 2 || arg0 > this.field282 / 2 + this.field277) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field277 || arg0 >= this.field282 + this.field277) {
                    return false;
                }
        }
        switch(var3.field3329.field3293) {
            case 0:
                if (arg1 >= this.field284 && arg1 < this.field284 + this.field281) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field284 - this.field281 / 2 || arg1 > this.field281 / 2 + this.field284) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field284 - this.field281 || arg1 > this.field284) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ax.e(IIB)Z")
    public boolean method481(int arg0, int arg1) {
        if (this.field279 == null) {
            return false;
        } else if (arg0 >= this.field277 - this.field279.field215 / 2 && arg0 <= this.field279.field215 / 2 + this.field277) {
            return arg1 >= this.field284 && arg1 <= this.field279.field216 + this.field284;
        } else {
            return false;
        }
    }
}
