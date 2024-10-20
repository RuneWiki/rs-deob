package deob;

@ObfuscatedName("as")
public class class40 {

    @ObfuscatedName("as.i")
    public final int field537;

    @ObfuscatedName("as.c")
    public final class213 field526;

    @ObfuscatedName("as.e")
    public final class213 field527;

    @ObfuscatedName("as.v")
    public final int field528;

    @ObfuscatedName("as.b")
    public final int field529;

    @ObfuscatedName("as.y")
    public final class34 field530;

    @ObfuscatedName("as.h")
    public int field531;

    @ObfuscatedName("as.x")
    public int field532;

    public class40(int arg0, class213 arg1, class213 arg2, class34 arg3) {
        this.field537 = arg0;
        this.field527 = arg1;
        this.field526 = arg2;
        this.field530 = arg3;
        class243 var5 = Statics.field2840[this.field537];
        class286 var6 = var5.method3962(false);
        if (var6 == null) {
            this.field528 = 0;
            this.field529 = 0;
        } else {
            this.field528 = var6.field3786;
            this.field529 = var6.field3789;
        }
    }

    @ObfuscatedName("as.i(III)Z")
    public boolean method463(int arg0, int arg1) {
        if (this.method462(arg0, arg1)) {
            return true;
        } else {
            return this.method464(arg0, arg1);
        }
    }

    @ObfuscatedName("as.c(III)Z")
    public boolean method462(int arg0, int arg1) {
        class243 var3 = Statics.field2840[this.field537];
        switch(var3.field3300.field3542) {
            case 0:
                if (arg0 < this.field531 - this.field528 / 2 || arg0 > this.field528 / 2 + this.field531) {
                    return false;
                }
                break;
            case 1:
                if (arg0 <= this.field531 - this.field528 || arg0 > this.field531) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field531 || arg0 >= this.field531 + this.field528) {
                    return false;
                }
        }
        switch(var3.field3307.field3275) {
            case 0:
                if (arg1 > this.field532 - this.field529 && arg1 <= this.field532) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field532 || arg1 >= this.field532 + this.field529) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field532 - this.field529 / 2 || arg1 > this.field529 / 2 + this.field532) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("as.e(III)Z")
    public boolean method464(int arg0, int arg1) {
        if (this.field530 == null) {
            return false;
        } else if (arg0 >= this.field531 - this.field530.field470 / 2 && arg0 <= this.field530.field470 / 2 + this.field531) {
            return arg1 >= this.field532 && arg1 <= this.field530.field469 + this.field532;
        } else {
            return false;
        }
    }
}
