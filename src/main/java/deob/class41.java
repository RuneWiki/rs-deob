package deob;

@ObfuscatedName("ao")
public class class41 {

    @ObfuscatedName("ao.d")
    public final int field536;

    @ObfuscatedName("ao.z")
    public final class239 field532;

    @ObfuscatedName("ao.n")
    public final class239 field533;

    @ObfuscatedName("ao.r")
    public final int field534;

    @ObfuscatedName("ao.e")
    public final int field535;

    @ObfuscatedName("ao.y")
    public final class35 field537;

    @ObfuscatedName("ao.k")
    public int field539;

    @ObfuscatedName("ao.s")
    public int field538;

    public class41(int arg0, class239 arg1, class239 arg2, class35 arg3) {
        this.field536 = arg0;
        this.field533 = arg1;
        this.field532 = arg2;
        this.field537 = arg3;
        class270 var5 = Statics.field3450[this.field536];
        class332 var6 = var5.method4492(false);
        if (var6 == null) {
            this.field534 = 0;
            this.field535 = 0;
        } else {
            this.field534 = var6.field3981;
            this.field535 = var6.field3988;
        }
    }

    @ObfuscatedName("ao.d(IIB)Z")
    public boolean method491(int arg0, int arg1) {
        if (this.method496(arg0, arg1)) {
            return true;
        } else {
            return this.method493(arg0, arg1);
        }
    }

    @ObfuscatedName("ao.z(III)Z")
    public boolean method496(int arg0, int arg1) {
        class270 var3 = Statics.field3450[this.field536];
        switch(var3.field3465.field3699) {
            case 0:
                if (arg0 < this.field539 || arg0 >= this.field539 + this.field534) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field539 - this.field534 / 2 || arg0 > this.field534 / 2 + this.field539) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field539 - this.field534 || arg0 > this.field539) {
                    return false;
                }
        }
        switch(var3.field3464.field3437) {
            case 0:
                if (arg1 >= this.field538 && arg1 < this.field538 + this.field535) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field538 - this.field535 / 2 || arg1 > this.field535 / 2 + this.field538) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field538 - this.field535 || arg1 > this.field538) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ao.n(III)Z")
    public boolean method493(int arg0, int arg1) {
        if (this.field537 == null) {
            return false;
        } else if (arg0 >= this.field539 - this.field537.field473 / 2 && arg0 <= this.field537.field473 / 2 + this.field539) {
            return arg1 >= this.field538 && arg1 <= this.field537.field474 + this.field538;
        } else {
            return false;
        }
    }
}
