package deob;

@ObfuscatedName("ad")
public class class40 {

    @ObfuscatedName("ad.e")
    public final int field535;

    @ObfuscatedName("ad.n")
    public final class214 field531;

    @ObfuscatedName("ad.g")
    public final class214 field529;

    @ObfuscatedName("ad.y")
    public final int field530;

    @ObfuscatedName("ad.w")
    public final int field527;

    @ObfuscatedName("ad.k")
    public final class34 field532;

    @ObfuscatedName("ad.v")
    public int field533;

    @ObfuscatedName("ad.z")
    public int field534;

    public class40(int arg0, class214 arg1, class214 arg2, class34 arg3) {
        this.field535 = arg0;
        this.field529 = arg1;
        this.field531 = arg2;
        this.field532 = arg3;
        class244 var5 = Statics.field3277[this.field535];
        class287 var6 = var5.method3981(false);
        if (var6 == null) {
            this.field530 = 0;
            this.field527 = 0;
        } else {
            this.field530 = var6.field3765;
            this.field527 = var6.field3770;
        }
    }

    @ObfuscatedName("ad.e(III)Z")
    public boolean method478(int arg0, int arg1) {
        if (this.method479(arg0, arg1)) {
            return true;
        } else {
            return this.method477(arg0, arg1);
        }
    }

    @ObfuscatedName("ad.n(III)Z")
    public boolean method479(int arg0, int arg1) {
        class244 var3 = Statics.field3277[this.field535];
        switch(var3.field3292.field3539) {
            case 0:
                if (arg0 < this.field533 || arg0 >= this.field533 + this.field530) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field533 - this.field530 / 2 || arg0 > this.field530 / 2 + this.field533) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field533 - this.field530 || arg0 > this.field533) {
                    return false;
                }
        }
        switch(var3.field3294.field3258) {
            case 0:
                if (arg1 >= this.field534 && arg1 < this.field534 + this.field527) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field534 - this.field527 || arg1 > this.field534) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field534 - this.field527 / 2 || arg1 > this.field527 / 2 + this.field534) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ad.g(III)Z")
    public boolean method477(int arg0, int arg1) {
        if (this.field532 == null) {
            return false;
        } else if (arg0 >= this.field533 - this.field532.field471 / 2 && arg0 <= this.field532.field471 / 2 + this.field533) {
            return arg1 >= this.field534 && arg1 <= this.field532.field479 + this.field534;
        } else {
            return false;
        }
    }
}
