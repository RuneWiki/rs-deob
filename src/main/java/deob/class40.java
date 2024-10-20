package deob;

@ObfuscatedName("ah")
public class class40 {

    @ObfuscatedName("ah.s")
    public final int field515;

    @ObfuscatedName("ah.g")
    public final class224 field510;

    @ObfuscatedName("ah.m")
    public final class224 field505;

    @ObfuscatedName("ah.h")
    public final int field504;

    @ObfuscatedName("ah.i")
    public final int field506;

    @ObfuscatedName("ah.w")
    public final class34 field512;

    @ObfuscatedName("ah.t")
    public int field507;

    @ObfuscatedName("ah.d")
    public int field508;

    public class40(int arg0, class224 arg1, class224 arg2, class34 arg3) {
        this.field515 = arg0;
        this.field505 = arg1;
        this.field510 = arg2;
        this.field512 = arg3;
        class254 var5 = Statics.field3378[this.field515];
        class310 var6 = var5.method4354(false);
        if (var6 == null) {
            this.field504 = 0;
            this.field506 = 0;
        } else {
            this.field504 = var6.field3900;
            this.field506 = var6.field3899;
        }
    }

    @ObfuscatedName("ah.s(III)Z")
    public boolean method470(int arg0, int arg1) {
        if (this.method471(arg0, arg1)) {
            return true;
        } else {
            return this.method472(arg0, arg1);
        }
    }

    @ObfuscatedName("ah.g(IIB)Z")
    public boolean method471(int arg0, int arg1) {
        class254 var3 = Statics.field3378[this.field515];
        switch(var3.field3385.field3622) {
            case 0:
                if (arg0 < this.field507 - this.field504 / 2 || arg0 > this.field504 / 2 + this.field507) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field507 || arg0 >= this.field507 + this.field504) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field507 - this.field504 || arg0 > this.field507) {
                    return false;
                }
        }
        switch(var3.field3376.field3363) {
            case 0:
                if (arg1 >= this.field508 - this.field506 / 2 && arg1 <= this.field506 / 2 + this.field508) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field508 - this.field506 || arg1 > this.field508) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field508 || arg1 >= this.field508 + this.field506) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ah.m(IIB)Z")
    public boolean method472(int arg0, int arg1) {
        if (this.field512 == null) {
            return false;
        } else if (arg0 >= this.field507 - this.field512.field443 / 2 && arg0 <= this.field512.field443 / 2 + this.field507) {
            return arg1 >= this.field508 && arg1 <= this.field512.field444 + this.field508;
        } else {
            return false;
        }
    }
}
