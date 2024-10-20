package deob;

@ObfuscatedName("ac")
public class class40 {

    @ObfuscatedName("ac.i")
    public final int field549;

    @ObfuscatedName("ac.w")
    public final class213 field551;

    @ObfuscatedName("ac.a")
    public final class213 field548;

    @ObfuscatedName("ac.t")
    public final int field552;

    @ObfuscatedName("ac.s")
    public final int field555;

    @ObfuscatedName("ac.r")
    public final class34 field554;

    @ObfuscatedName("ac.v")
    public int field550;

    @ObfuscatedName("ac.y")
    public int field561;

    public class40(int arg0, class213 arg1, class213 arg2, class34 arg3) {
        this.field549 = arg0;
        this.field548 = arg1;
        this.field551 = arg2;
        this.field554 = arg3;
        class243 var5 = Statics.field3304[this.field549];
        class286 var6 = var5.method3932(false);
        if (var6 == null) {
            this.field552 = 0;
            this.field555 = 0;
        } else {
            this.field552 = var6.field3786;
            this.field555 = var6.field3788;
        }
    }

    @ObfuscatedName("ac.i(IIB)Z")
    public boolean method490(int arg0, int arg1) {
        if (this.method488(arg0, arg1)) {
            return true;
        } else {
            return this.method489(arg0, arg1);
        }
    }

    @ObfuscatedName("ac.w(III)Z")
    public boolean method488(int arg0, int arg1) {
        class243 var3 = Statics.field3304[this.field549];
        switch(var3.field3312.field3551) {
            case 0:
                if (arg0 < this.field550 || arg0 >= this.field552 + this.field550) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field550 - this.field552 / 2 || arg0 > this.field552 / 2 + this.field550) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field550 - this.field552 || arg0 > this.field550) {
                    return false;
                }
        }
        switch(var3.field3310.field3283) {
            case 0:
                if (arg1 >= this.field561 - this.field555 / 2 && arg1 <= this.field555 / 2 + this.field561) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field561 - this.field555 || arg1 > this.field561) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field561 || arg1 >= this.field561 + this.field555) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ac.a(IIB)Z")
    public boolean method489(int arg0, int arg1) {
        if (this.field554 == null) {
            return false;
        } else if (arg0 >= this.field550 - this.field554.field476 / 2 && arg0 <= this.field554.field476 / 2 + this.field550) {
            return arg1 >= this.field561 && arg1 <= this.field554.field478 + this.field561;
        } else {
            return false;
        }
    }
}
