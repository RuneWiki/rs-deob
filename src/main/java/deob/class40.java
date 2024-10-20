package deob;

@ObfuscatedName("ax")
public class class40 {

    @ObfuscatedName("ax.s")
    public final int field534;

    @ObfuscatedName("ax.c")
    public final class216 field524;

    @ObfuscatedName("ax.f")
    public final class216 field525;

    @ObfuscatedName("ax.m")
    public final int field526;

    @ObfuscatedName("ax.h")
    public final int field527;

    @ObfuscatedName("ax.t")
    public final class34 field528;

    @ObfuscatedName("ax.p")
    public int field523;

    @ObfuscatedName("ax.d")
    public int field530;

    public class40(int arg0, class216 arg1, class216 arg2, class34 arg3) {
        this.field534 = arg0;
        this.field525 = arg1;
        this.field524 = arg2;
        this.field528 = arg3;
        class246 var5 = Statics.field3305[this.field534];
        class289 var6 = var5.method4007(false);
        if (var6 == null) {
            this.field526 = 0;
            this.field527 = 0;
        } else {
            this.field526 = var6.field3791;
            this.field527 = var6.field3792;
        }
    }

    @ObfuscatedName("ax.s(IIB)Z")
    public boolean method480(int arg0, int arg1) {
        if (this.method481(arg0, arg1)) {
            return true;
        } else {
            return this.method488(arg0, arg1);
        }
    }

    @ObfuscatedName("ax.c(III)Z")
    public boolean method481(int arg0, int arg1) {
        class246 var3 = Statics.field3305[this.field534];
        switch(var3.field3304.field3558) {
            case 0:
                if (arg0 <= this.field523 - this.field526 || arg0 > this.field523) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field523 || arg0 >= this.field526 + this.field523) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field523 - this.field526 / 2 || arg0 > this.field526 / 2 + this.field523) {
                    return false;
                }
        }
        switch(var3.field3306.field3292) {
            case 0:
                if (arg1 >= this.field530 - this.field527 / 2 && arg1 <= this.field527 / 2 + this.field530) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field530 || arg1 >= this.field530 + this.field527) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field530 - this.field527 || arg1 > this.field530) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ax.f(IIB)Z")
    public boolean method488(int arg0, int arg1) {
        if (this.field528 == null) {
            return false;
        } else if (arg0 >= this.field523 - this.field528.field474 / 2 && arg0 <= this.field528.field474 / 2 + this.field523) {
            return arg1 >= this.field530 && arg1 <= this.field528.field472 + this.field530;
        } else {
            return false;
        }
    }
}
