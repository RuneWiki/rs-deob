package deob;

@ObfuscatedName("az")
public class class40 {

    @ObfuscatedName("az.d")
    public final int field506;

    @ObfuscatedName("az.q")
    public final class213 field505;

    @ObfuscatedName("az.x")
    public final class213 field501;

    @ObfuscatedName("az.y")
    public final int field502;

    @ObfuscatedName("az.e")
    public final int field503;

    @ObfuscatedName("az.f")
    public final class34 field508;

    @ObfuscatedName("az.v")
    public int field499;

    @ObfuscatedName("az.t")
    public int field500;

    public class40(int arg0, class213 arg1, class213 arg2, class34 arg3) {
        this.field506 = arg0;
        this.field501 = arg1;
        this.field505 = arg2;
        this.field508 = arg3;
        class243 var5 = Statics.field3287[this.field506];
        class286 var6 = var5.method3896(false);
        if (var6 == null) {
            this.field502 = 0;
            this.field503 = 0;
        } else {
            this.field502 = var6.field3766;
            this.field503 = var6.field3768;
        }
    }

    @ObfuscatedName("az.d(III)Z")
    public boolean method482(int arg0, int arg1) {
        if (this.method484(arg0, arg1)) {
            return true;
        } else {
            return this.method485(arg0, arg1);
        }
    }

    @ObfuscatedName("az.q(IIB)Z")
    public boolean method484(int arg0, int arg1) {
        class243 var3 = Statics.field3287[this.field506];
        switch(var3.field3292.field3525) {
            case 0:
                if (arg0 < this.field499 || arg0 >= this.field502 + this.field499) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field499 - this.field502 / 2 || arg0 > this.field502 / 2 + this.field499) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field499 - this.field502 || arg0 > this.field499) {
                    return false;
                }
        }
        switch(var3.field3294.field3257) {
            case 0:
                if (arg1 >= this.field500 - this.field503 / 2 && arg1 <= this.field503 / 2 + this.field500) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field500 - this.field503 || arg1 > this.field500) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field500 || arg1 >= this.field503 + this.field500) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("az.x(IIB)Z")
    public boolean method485(int arg0, int arg1) {
        if (this.field508 == null) {
            return false;
        } else if (arg0 >= this.field499 - this.field508.field442 / 2 && arg0 <= this.field508.field442 / 2 + this.field499) {
            return arg1 >= this.field500 && arg1 <= this.field508.field443 + this.field500;
        } else {
            return false;
        }
    }
}
