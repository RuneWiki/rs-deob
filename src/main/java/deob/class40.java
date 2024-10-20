package deob;

@ObfuscatedName("ay")
public class class40 {

    @ObfuscatedName("ay.m")
    public final int field509;

    @ObfuscatedName("ay.p")
    public final class220 field500;

    @ObfuscatedName("ay.i")
    public final class220 field499;

    @ObfuscatedName("ay.j")
    public final int field501;

    @ObfuscatedName("ay.v")
    public final int field503;

    @ObfuscatedName("ay.x")
    public final class34 field504;

    @ObfuscatedName("ay.e")
    public int field505;

    @ObfuscatedName("ay.l")
    public int field506;

    public class40(int arg0, class220 arg1, class220 arg2, class34 arg3) {
        this.field509 = arg0;
        this.field499 = arg1;
        this.field500 = arg2;
        this.field504 = arg3;
        class250 var5 = Statics.field3359[this.field509];
        class295 var6 = var5.method4119(false);
        if (var6 == null) {
            this.field501 = 0;
            this.field503 = 0;
        } else {
            this.field501 = var6.field3840;
            this.field503 = var6.field3839;
        }
    }

    @ObfuscatedName("ay.m(III)Z")
    public boolean method516(int arg0, int arg1) {
        if (this.method525(arg0, arg1)) {
            return true;
        } else {
            return this.method518(arg0, arg1);
        }
    }

    @ObfuscatedName("ay.p(IIB)Z")
    public boolean method525(int arg0, int arg1) {
        class250 var3 = Statics.field3359[this.field509];
        switch(var3.field3349.field3599) {
            case 0:
                if (arg0 <= this.field505 - this.field501 || arg0 > this.field505) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field505 || arg0 >= this.field505 + this.field501) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field505 - this.field501 / 2 || arg0 > this.field501 / 2 + this.field505) {
                    return false;
                }
        }
        switch(var3.field3350.field3339) {
            case 0:
                if (arg1 > this.field506 - this.field503 && arg1 <= this.field506) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field506 || arg1 >= this.field506 + this.field503) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field506 - this.field503 / 2 || arg1 > this.field503 / 2 + this.field506) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ay.i(III)Z")
    public boolean method518(int arg0, int arg1) {
        if (this.field504 == null) {
            return false;
        } else if (arg0 >= this.field505 - this.field504.field449 / 2 && arg0 <= this.field504.field449 / 2 + this.field505) {
            return arg1 >= this.field506 && arg1 <= this.field504.field446 + this.field506;
        } else {
            return false;
        }
    }
}
