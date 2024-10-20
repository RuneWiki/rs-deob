package deob;

@ObfuscatedName("ar")
public class class40 {

    @ObfuscatedName("ar.d")
    public final int field553;

    @ObfuscatedName("ar.k")
    public final class213 field548;

    @ObfuscatedName("ar.e")
    public final class213 field549;

    @ObfuscatedName("ar.p")
    public final int field550;

    @ObfuscatedName("ar.q")
    public final int field551;

    @ObfuscatedName("ar.s")
    public final class34 field557;

    @ObfuscatedName("ar.r")
    public int field556;

    @ObfuscatedName("ar.g")
    public int field554;

    public class40(int arg0, class213 arg1, class213 arg2, class34 arg3) {
        this.field553 = arg0;
        this.field549 = arg1;
        this.field548 = arg2;
        this.field557 = arg3;
        class243 var5 = Statics.field25[this.field553];
        class287 var6 = var5.method4037(false);
        if (var6 == null) {
            this.field550 = 0;
            this.field551 = 0;
        } else {
            this.field550 = var6.field3798;
            this.field551 = var6.field3801;
        }
    }

    @ObfuscatedName("ar.d(III)Z")
    public boolean method475(int arg0, int arg1) {
        if (this.method476(arg0, arg1)) {
            return true;
        } else {
            return this.method474(arg0, arg1);
        }
    }

    @ObfuscatedName("ar.k(IIB)Z")
    public boolean method476(int arg0, int arg1) {
        class243 var3 = Statics.field25[this.field553];
        switch(var3.field3290.field3548) {
            case 0:
                if (arg0 <= this.field556 - this.field550 || arg0 > this.field556) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field556 - this.field550 / 2 || arg0 > this.field550 / 2 + this.field556) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field556 || arg0 >= this.field556 + this.field550) {
                    return false;
                }
        }
        switch(var3.field3306.field3276) {
            case 0:
                if (arg1 >= this.field554 - this.field551 / 2 && arg1 <= this.field551 / 2 + this.field554) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field554 - this.field551 || arg1 > this.field554) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field554 || arg1 >= this.field554 + this.field551) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ar.e(IIB)Z")
    public boolean method474(int arg0, int arg1) {
        if (this.field557 == null) {
            return false;
        } else if (arg0 >= this.field556 - this.field557.field488 / 2 && arg0 <= this.field557.field488 / 2 + this.field556) {
            return arg1 >= this.field554 && arg1 <= this.field557.field485 + this.field554;
        } else {
            return false;
        }
    }
}
