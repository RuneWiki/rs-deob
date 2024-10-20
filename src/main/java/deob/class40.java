package deob;

@ObfuscatedName("ay")
public class class40 {

    @ObfuscatedName("ay.a")
    public final int field500;

    @ObfuscatedName("ay.w")
    public final class224 field499;

    @ObfuscatedName("ay.e")
    public final class224 field505;

    @ObfuscatedName("ay.k")
    public final int field501;

    @ObfuscatedName("ay.u")
    public final int field502;

    @ObfuscatedName("ay.z")
    public final class34 field503;

    @ObfuscatedName("ay.t")
    public int field504;

    @ObfuscatedName("ay.f")
    public int field498;

    public class40(int arg0, class224 arg1, class224 arg2, class34 arg3) {
        this.field500 = arg0;
        this.field505 = arg1;
        this.field499 = arg2;
        this.field503 = arg3;
        class254 var5 = Statics.field3379[this.field500];
        class299 var6 = var5.method4077(false);
        if (var6 == null) {
            this.field501 = 0;
            this.field502 = 0;
        } else {
            this.field501 = var6.field3853;
            this.field502 = var6.field3855;
        }
    }

    @ObfuscatedName("ay.a(III)Z")
    public boolean method481(int arg0, int arg1) {
        if (this.method484(arg0, arg1)) {
            return true;
        } else {
            return this.method483(arg0, arg1);
        }
    }

    @ObfuscatedName("ay.w(III)Z")
    public boolean method484(int arg0, int arg1) {
        class254 var3 = Statics.field3379[this.field500];
        switch(var3.field3395.field3617) {
            case 0:
                if (arg0 <= this.field504 - this.field501 || arg0 > this.field504) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field504 || arg0 >= this.field504 + this.field501) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field504 - this.field501 / 2 || arg0 > this.field501 / 2 + this.field504) {
                    return false;
                }
        }
        switch(var3.field3389.field3366) {
            case 0:
                if (arg1 >= this.field498 && arg1 < this.field502 + this.field498) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field498 - this.field502 || arg1 > this.field498) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field498 - this.field502 / 2 || arg1 > this.field502 / 2 + this.field498) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ay.e(III)Z")
    public boolean method483(int arg0, int arg1) {
        if (this.field503 == null) {
            return false;
        } else if (arg0 >= this.field504 - this.field503.field437 / 2 && arg0 <= this.field503.field437 / 2 + this.field504) {
            return arg1 >= this.field498 && arg1 <= this.field503.field435 + this.field498;
        } else {
            return false;
        }
    }
}
