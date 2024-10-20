package deob;

@ObfuscatedName("al")
public class class41 {

    @ObfuscatedName("al.g")
    public final int field530;

    @ObfuscatedName("al.e")
    public final class239 field523;

    @ObfuscatedName("al.b")
    public final class239 field529;

    @ObfuscatedName("al.z")
    public final int field525;

    @ObfuscatedName("al.n")
    public final int field522;

    @ObfuscatedName("al.l")
    public final class35 field527;

    @ObfuscatedName("al.s")
    public int field528;

    @ObfuscatedName("al.y")
    public int field524;

    public class41(int arg0, class239 arg1, class239 arg2, class35 arg3) {
        this.field530 = arg0;
        this.field529 = arg1;
        this.field523 = arg2;
        this.field527 = arg3;
        class270 var5 = Statics.field2517[this.field530];
        class332 var6 = var5.method4468(false);
        if (var6 == null) {
            this.field525 = 0;
            this.field522 = 0;
        } else {
            this.field525 = var6.field3991;
            this.field522 = var6.field3988;
        }
    }

    @ObfuscatedName("al.g(III)Z")
    public boolean method528(int arg0, int arg1) {
        if (this.method529(arg0, arg1)) {
            return true;
        } else {
            return this.method530(arg0, arg1);
        }
    }

    @ObfuscatedName("al.e(IIB)Z")
    public boolean method529(int arg0, int arg1) {
        class270 var3 = Statics.field2517[this.field530];
        switch(var3.field3461.field3704) {
            case 0:
                if (arg0 <= this.field528 - this.field525 || arg0 > this.field528) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field528 - this.field525 / 2 || arg0 > this.field525 / 2 + this.field528) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field528 || arg0 >= this.field528 + this.field525) {
                    return false;
                }
        }
        switch(var3.field3468.field3436) {
            case 0:
                if (arg1 >= this.field524 && arg1 < this.field524 + this.field522) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field524 - this.field522 || arg1 > this.field524) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field524 - this.field522 / 2 || arg1 > this.field522 / 2 + this.field524) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("al.b(III)Z")
    public boolean method530(int arg0, int arg1) {
        if (this.field527 == null) {
            return false;
        } else if (arg0 >= this.field528 - this.field527.field461 / 2 && arg0 <= this.field527.field461 / 2 + this.field528) {
            return arg1 >= this.field524 && arg1 <= this.field527.field463 + this.field524;
        } else {
            return false;
        }
    }
}
