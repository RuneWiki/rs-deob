package deob;

@ObfuscatedName("am")
public class class40 {

    @ObfuscatedName("am.n")
    public final int field539;

    @ObfuscatedName("am.p")
    public final class213 field528;

    @ObfuscatedName("am.i")
    public final class213 field530;

    @ObfuscatedName("am.j")
    public final int field531;

    @ObfuscatedName("am.f")
    public final int field538;

    @ObfuscatedName("am.m")
    public final class34 field533;

    @ObfuscatedName("am.c")
    public int field534;

    @ObfuscatedName("am.z")
    public int field532;

    public class40(int arg0, class213 arg1, class213 arg2, class34 arg3) {
        this.field539 = arg0;
        this.field530 = arg1;
        this.field528 = arg2;
        this.field533 = arg3;
        class243 var5 = Statics.field1301[this.field539];
        class286 var6 = var5.method4015(false);
        if (var6 == null) {
            this.field531 = 0;
            this.field538 = 0;
        } else {
            this.field531 = var6.field3779;
            this.field538 = var6.field3785;
        }
    }

    @ObfuscatedName("am.n(III)Z")
    public boolean method489(int arg0, int arg1) {
        if (this.method479(arg0, arg1)) {
            return true;
        } else {
            return this.method480(arg0, arg1);
        }
    }

    @ObfuscatedName("am.p(IIB)Z")
    public boolean method479(int arg0, int arg1) {
        class243 var3 = Statics.field1301[this.field539];
        switch(var3.field3310.field3555) {
            case 0:
                if (arg0 < this.field534 || arg0 >= this.field534 + this.field531) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field534 - this.field531 / 2 || arg0 > this.field531 / 2 + this.field534) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field534 - this.field531 || arg0 > this.field534) {
                    return false;
                }
        }
        switch(var3.field3311.field3274) {
            case 0:
                if (arg1 >= this.field532 && arg1 < this.field538 + this.field532) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field532 - this.field538 / 2 || arg1 > this.field538 / 2 + this.field532) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field532 - this.field538 || arg1 > this.field532) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("am.i(III)Z")
    public boolean method480(int arg0, int arg1) {
        if (this.field533 == null) {
            return false;
        } else if (arg0 >= this.field534 - this.field533.field473 / 2 && arg0 <= this.field533.field473 / 2 + this.field534) {
            return arg1 >= this.field532 && arg1 <= this.field533.field474 + this.field532;
        } else {
            return false;
        }
    }
}
