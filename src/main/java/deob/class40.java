package deob;

@ObfuscatedName("ab")
public class class40 {

    @ObfuscatedName("ab.w")
    public final int field557;

    @ObfuscatedName("ab.s")
    public final class213 field549;

    @ObfuscatedName("ab.q")
    public final class213 field560;

    @ObfuscatedName("ab.o")
    public final int field548;

    @ObfuscatedName("ab.g")
    public final int field551;

    @ObfuscatedName("ab.v")
    public final class34 field552;

    @ObfuscatedName("ab.p")
    public int field553;

    @ObfuscatedName("ab.e")
    public int field550;

    public class40(int arg0, class213 arg1, class213 arg2, class34 arg3) {
        this.field557 = arg0;
        this.field560 = arg1;
        this.field549 = arg2;
        this.field552 = arg3;
        class243 var5 = Statics.field3286[this.field557];
        class287 var6 = var5.method4038(false);
        if (var6 == null) {
            this.field548 = 0;
            this.field551 = 0;
        } else {
            this.field548 = var6.field3795;
            this.field551 = var6.field3796;
        }
    }

    @ObfuscatedName("ab.w(IIB)Z")
    public boolean method472(int arg0, int arg1) {
        if (this.method474(arg0, arg1)) {
            return true;
        } else {
            return this.method486(arg0, arg1);
        }
    }

    @ObfuscatedName("ab.s(III)Z")
    public boolean method474(int arg0, int arg1) {
        class243 var3 = Statics.field3286[this.field557];
        switch(var3.field3295.field3548) {
            case 0:
                if (arg0 <= this.field553 - this.field548 || arg0 > this.field553) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field553 || arg0 >= this.field553 + this.field548) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field553 - this.field548 / 2 || arg0 > this.field548 / 2 + this.field553) {
                    return false;
                }
        }
        switch(var3.field3302.field3267) {
            case 0:
                if (arg1 > this.field550 - this.field551 && arg1 <= this.field550) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field550 || arg1 >= this.field551 + this.field550) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field550 - this.field551 / 2 || arg1 > this.field551 / 2 + this.field550) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ab.q(III)Z")
    public boolean method486(int arg0, int arg1) {
        if (this.field552 == null) {
            return false;
        } else if (arg0 >= this.field553 - this.field552.field480 / 2 && arg0 <= this.field552.field480 / 2 + this.field553) {
            return arg1 >= this.field550 && arg1 <= this.field552.field479 + this.field550;
        } else {
            return false;
        }
    }
}
