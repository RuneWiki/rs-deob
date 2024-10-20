package deob;

@ObfuscatedName("ag")
public class class40 {

    @ObfuscatedName("ag.p")
    public final int field496;

    @ObfuscatedName("ag.i")
    public final class224 field497;

    @ObfuscatedName("ag.w")
    public final class224 field501;

    @ObfuscatedName("ag.s")
    public final int field494;

    @ObfuscatedName("ag.j")
    public final int field498;

    @ObfuscatedName("ag.a")
    public final class34 field499;

    @ObfuscatedName("ag.t")
    public int field500;

    @ObfuscatedName("ag.r")
    public int field495;

    public class40(int arg0, class224 arg1, class224 arg2, class34 arg3) {
        this.field496 = arg0;
        this.field501 = arg1;
        this.field497 = arg2;
        this.field499 = arg3;
        class254 var5 = Statics.field3354[this.field496];
        class310 var6 = var5.method4201(false);
        if (var6 == null) {
            this.field494 = 0;
            this.field498 = 0;
        } else {
            this.field494 = var6.field3885;
            this.field498 = var6.field3882;
        }
    }

    @ObfuscatedName("ag.p(III)Z")
    public boolean method485(int arg0, int arg1) {
        if (this.method486(arg0, arg1)) {
            return true;
        } else {
            return this.method487(arg0, arg1);
        }
    }

    @ObfuscatedName("ag.i(III)Z")
    public boolean method486(int arg0, int arg1) {
        class254 var3 = Statics.field3354[this.field496];
        switch(var3.field3357.field3602) {
            case 0:
                if (arg0 <= this.field500 - this.field494 || arg0 > this.field500) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field500 - this.field494 / 2 || arg0 > this.field494 / 2 + this.field500) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field500 || arg0 >= this.field500 + this.field494) {
                    return false;
                }
        }
        switch(var3.field3371.field3342) {
            case 0:
                if (arg1 > this.field495 - this.field498 && arg1 <= this.field495) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field495 - this.field498 / 2 || arg1 > this.field498 / 2 + this.field495) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field495 || arg1 >= this.field498 + this.field495) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ag.w(III)Z")
    public boolean method487(int arg0, int arg1) {
        if (this.field499 == null) {
            return false;
        } else if (arg0 >= this.field500 - this.field499.field436 / 2 && arg0 <= this.field499.field436 / 2 + this.field500) {
            return arg1 >= this.field495 && arg1 <= this.field499.field438 + this.field495;
        } else {
            return false;
        }
    }
}
