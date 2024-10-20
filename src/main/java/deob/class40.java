package deob;

@ObfuscatedName("ad")
public class class40 {

    @ObfuscatedName("ad.c")
    public final int field532;

    @ObfuscatedName("ad.o")
    public final class213 field538;

    @ObfuscatedName("ad.i")
    public final class213 field533;

    @ObfuscatedName("ad.u")
    public final int field529;

    @ObfuscatedName("ad.g")
    public final int field530;

    @ObfuscatedName("ad.m")
    public final class34 field534;

    @ObfuscatedName("ad.s")
    public int field527;

    @ObfuscatedName("ad.x")
    public int field536;

    public class40(int arg0, class213 arg1, class213 arg2, class34 arg3) {
        this.field532 = arg0;
        this.field533 = arg1;
        this.field538 = arg2;
        this.field534 = arg3;
        class243 var5 = Statics.field3266[this.field532];
        class286 var6 = var5.method3875(false);
        if (var6 == null) {
            this.field529 = 0;
            this.field530 = 0;
        } else {
            this.field529 = var6.field3778;
            this.field530 = var6.field3768;
        }
    }

    @ObfuscatedName("ad.c(III)Z")
    public boolean method470(int arg0, int arg1) {
        if (this.method469(arg0, arg1)) {
            return true;
        } else {
            return this.method471(arg0, arg1);
        }
    }

    @ObfuscatedName("ad.o(III)Z")
    public boolean method469(int arg0, int arg1) {
        class243 var3 = Statics.field3266[this.field532];
        switch(var3.field3281.field3525) {
            case 0:
                if (arg0 < this.field527 || arg0 >= this.field529 + this.field527) {
                    return false;
                }
                break;
            case 1:
                if (arg0 <= this.field527 - this.field529 || arg0 > this.field527) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field527 - this.field529 / 2 || arg0 > this.field529 / 2 + this.field527) {
                    return false;
                }
        }
        switch(var3.field3277.field3248) {
            case 0:
                if (arg1 > this.field536 - this.field530 && arg1 <= this.field536) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field536 || arg1 >= this.field536 + this.field530) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field536 - this.field530 / 2 || arg1 > this.field530 / 2 + this.field536) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ad.i(III)Z")
    public boolean method471(int arg0, int arg1) {
        if (this.field534 == null) {
            return false;
        } else if (arg0 >= this.field527 - this.field534.field453 / 2 && arg0 <= this.field534.field453 / 2 + this.field527) {
            return arg1 >= this.field536 && arg1 <= this.field534.field454 + this.field536;
        } else {
            return false;
        }
    }
}
