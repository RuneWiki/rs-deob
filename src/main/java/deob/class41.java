package deob;

@ObfuscatedName("ao")
public class class41 {

    @ObfuscatedName("ao.o")
    public final int field524;

    @ObfuscatedName("ao.k")
    public final class239 field533;

    @ObfuscatedName("ao.t")
    public final class239 field525;

    @ObfuscatedName("ao.d")
    public final int field526;

    @ObfuscatedName("ao.h")
    public final int field527;

    @ObfuscatedName("ao.m")
    public final class35 field528;

    @ObfuscatedName("ao.z")
    public int field530;

    @ObfuscatedName("ao.i")
    public int field523;

    public class41(int arg0, class239 arg1, class239 arg2, class35 arg3) {
        this.field524 = arg0;
        this.field525 = arg1;
        this.field533 = arg2;
        this.field528 = arg3;
        class270 var5 = Statics.field3455[this.field524];
        class332 var6 = var5.method4385(false);
        if (var6 == null) {
            this.field526 = 0;
            this.field527 = 0;
        } else {
            this.field526 = var6.field3983;
            this.field527 = var6.field3988;
        }
    }

    @ObfuscatedName("ao.o(III)Z")
    public boolean method520(int arg0, int arg1) {
        if (this.method517(arg0, arg1)) {
            return true;
        } else {
            return this.method518(arg0, arg1);
        }
    }

    @ObfuscatedName("ao.k(III)Z")
    public boolean method517(int arg0, int arg1) {
        class270 var3 = Statics.field3455[this.field524];
        switch(var3.field3470.field3701) {
            case 0:
                if (arg0 < this.field530 - this.field526 / 2 || arg0 > this.field526 / 2 + this.field530) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field530 || arg0 >= this.field530 + this.field526) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field530 - this.field526 || arg0 > this.field530) {
                    return false;
                }
        }
        switch(var3.field3454.field3442) {
            case 0:
                if (arg1 > this.field523 - this.field527 && arg1 <= this.field523) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field523 - this.field527 / 2 || arg1 > this.field527 / 2 + this.field523) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field523 || arg1 >= this.field527 + this.field523) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ao.t(III)Z")
    public boolean method518(int arg0, int arg1) {
        if (this.field528 == null) {
            return false;
        } else if (arg0 >= this.field530 - this.field528.field471 / 2 && arg0 <= this.field528.field471 / 2 + this.field530) {
            return arg1 >= this.field523 && arg1 <= this.field528.field470 + this.field523;
        } else {
            return false;
        }
    }
}
