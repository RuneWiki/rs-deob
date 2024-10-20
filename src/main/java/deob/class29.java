package deob;

@ObfuscatedName("ah")
public class class29 {

    @ObfuscatedName("ah.y")
    public final int field269;

    @ObfuscatedName("ah.c")
    public final class229 field267;

    @ObfuscatedName("ah.n")
    public final class229 field275;

    @ObfuscatedName("ah.u")
    public final int field268;

    @ObfuscatedName("ah.i")
    public final int field270;

    @ObfuscatedName("ah.r")
    public final class23 field271;

    @ObfuscatedName("ah.j")
    public int field272;

    @ObfuscatedName("ah.p")
    public int field273;

    public class29(int arg0, class229 arg1, class229 arg2, class23 arg3) {
        this.field269 = arg0;
        this.field275 = arg1;
        this.field267 = arg2;
        this.field271 = arg3;
        class258 var5 = class258.method4467(this.field269);
        class324 var6 = var5.method4464(false);
        if (var6 == null) {
            this.field268 = 0;
            this.field270 = 0;
        } else {
            this.field268 = var6.field3845;
            this.field270 = var6.field3847;
        }
    }

    @ObfuscatedName("ah.y(IIS)Z")
    public boolean method449(int arg0, int arg1) {
        if (this.method450(arg0, arg1)) {
            return true;
        } else {
            return this.method451(arg0, arg1);
        }
    }

    @ObfuscatedName("ah.c(IIS)Z")
    public boolean method450(int arg0, int arg1) {
        class258 var3 = class258.method4467(this.field269);
        switch(var3.field3302.field3531) {
            case 0:
                if (arg0 < this.field272 || arg0 >= this.field272 + this.field268) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field272 - this.field268 / 2 || arg0 > this.field268 / 2 + this.field272) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field272 - this.field268 || arg0 > this.field272) {
                    return false;
                }
        }
        switch(var3.field3306.field3271) {
            case 0:
                if (arg1 >= this.field273 - this.field270 / 2 && arg1 <= this.field270 / 2 + this.field273) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field273 || arg1 >= this.field273 + this.field270) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field273 - this.field270 || arg1 > this.field273) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ah.n(III)Z")
    public boolean method451(int arg0, int arg1) {
        if (this.field271 == null) {
            return false;
        } else if (arg0 >= this.field272 - this.field271.field205 / 2 && arg0 <= this.field271.field205 / 2 + this.field272) {
            return arg1 >= this.field273 && arg1 <= this.field271.field203 + this.field273;
        } else {
            return false;
        }
    }
}
