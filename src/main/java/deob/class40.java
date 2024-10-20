package deob;

@ObfuscatedName("ad")
public class class40 {

    @ObfuscatedName("ad.b")
    public final int field489;

    @ObfuscatedName("ad.q")
    public final class233 field491;

    @ObfuscatedName("ad.o")
    public final class233 field492;

    @ObfuscatedName("ad.p")
    public final int field497;

    @ObfuscatedName("ad.a")
    public final int field493;

    @ObfuscatedName("ad.h")
    public final class34 field494;

    @ObfuscatedName("ad.l")
    public int field495;

    @ObfuscatedName("ad.y")
    public int field496;

    public class40(int arg0, class233 arg1, class233 arg2, class34 arg3) {
        this.field489 = arg0;
        this.field492 = arg1;
        this.field491 = arg2;
        this.field494 = arg3;
        class263 var5 = Statics.field4025[this.field489];
        class323 var6 = var5.method4342(false);
        if (var6 == null) {
            this.field497 = 0;
            this.field493 = 0;
        } else {
            this.field497 = var6.field3901;
            this.field493 = var6.field3911;
        }
    }

    @ObfuscatedName("ad.b(III)Z")
    public boolean method501(int arg0, int arg1) {
        if (this.method492(arg0, arg1)) {
            return true;
        } else {
            return this.method491(arg0, arg1);
        }
    }

    @ObfuscatedName("ad.q(III)Z")
    public boolean method492(int arg0, int arg1) {
        class263 var3 = Statics.field4025[this.field489];
        switch(var3.field3391.field3624) {
            case 0:
                if (arg0 <= this.field495 - this.field497 || arg0 > this.field495) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field495 - this.field497 / 2 || arg0 > this.field497 / 2 + this.field495) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field495 || arg0 >= this.field497 + this.field495) {
                    return false;
                }
        }
        switch(var3.field3408.field3379) {
            case 0:
                if (arg1 > this.field496 - this.field493 && arg1 <= this.field496) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field496 || arg1 >= this.field496 + this.field493) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field496 - this.field493 / 2 || arg1 > this.field493 / 2 + this.field496) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ad.o(III)Z")
    public boolean method491(int arg0, int arg1) {
        if (this.field494 == null) {
            return false;
        } else if (arg0 >= this.field495 - this.field494.field437 / 2 && arg0 <= this.field494.field437 / 2 + this.field495) {
            return arg1 >= this.field496 && arg1 <= this.field494.field433 + this.field496;
        } else {
            return false;
        }
    }
}
