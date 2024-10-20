package deob;

@ObfuscatedName("at")
public class class40 {

    @ObfuscatedName("at.i")
    public final int field527;

    @ObfuscatedName("at.h")
    public final class213 field528;

    @ObfuscatedName("at.u")
    public final class213 field524;

    @ObfuscatedName("at.q")
    public final int field530;

    @ObfuscatedName("at.g")
    public final int field526;

    @ObfuscatedName("at.v")
    public final class34 field523;

    @ObfuscatedName("at.t")
    public int field522;

    @ObfuscatedName("at.p")
    public int field529;

    public class40(int arg0, class213 arg1, class213 arg2, class34 arg3) {
        this.field527 = arg0;
        this.field524 = arg1;
        this.field528 = arg2;
        this.field523 = arg3;
        class243 var5 = Statics.field3277[this.field527];
        class286 var6 = var5.method4014(false);
        if (var6 == null) {
            this.field530 = 0;
            this.field526 = 0;
        } else {
            this.field530 = var6.field3777;
            this.field526 = var6.field3774;
        }
    }

    @ObfuscatedName("at.i(III)Z")
    public boolean method499(int arg0, int arg1) {
        if (this.method492(arg0, arg1)) {
            return true;
        } else {
            return this.method500(arg0, arg1);
        }
    }

    @ObfuscatedName("at.h(IIB)Z")
    public boolean method492(int arg0, int arg1) {
        class243 var3 = Statics.field3277[this.field527];
        switch(var3.field3293.field3540) {
            case 0:
                if (arg0 < this.field522 || arg0 >= this.field530 + this.field522) {
                    return false;
                }
                break;
            case 1:
                if (arg0 <= this.field522 - this.field530 || arg0 > this.field522) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field522 - this.field530 / 2 || arg0 > this.field530 / 2 + this.field522) {
                    return false;
                }
        }
        switch(var3.field3288.field3264) {
            case 0:
                if (arg1 > this.field529 - this.field526 && arg1 <= this.field529) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field529 - this.field526 / 2 || arg1 > this.field526 / 2 + this.field529) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field529 || arg1 >= this.field529 + this.field526) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("at.u(IIB)Z")
    public boolean method500(int arg0, int arg1) {
        if (this.field523 == null) {
            return false;
        } else if (arg0 >= this.field522 - this.field523.field466 / 2 && arg0 <= this.field523.field466 / 2 + this.field522) {
            return arg1 >= this.field529 && arg1 <= this.field523.field465 + this.field529;
        } else {
            return false;
        }
    }
}
