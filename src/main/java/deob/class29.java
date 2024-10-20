package deob;

@ObfuscatedName("ak")
public class class29 {

    @ObfuscatedName("ak.c")
    public final int field263;

    @ObfuscatedName("ak.q")
    public final class229 field260;

    @ObfuscatedName("ak.m")
    public final class229 field261;

    @ObfuscatedName("ak.j")
    public final int field262;

    @ObfuscatedName("ak.g")
    public final int field266;

    @ObfuscatedName("ak.i")
    public final class23 field264;

    @ObfuscatedName("ak.h")
    public int field265;

    @ObfuscatedName("ak.l")
    public int field267;

    public class29(int arg0, class229 arg1, class229 arg2, class23 arg3) {
        this.field263 = arg0;
        this.field261 = arg1;
        this.field260 = arg2;
        this.field264 = arg3;
        class258 var5 = class258.method2830(this.field263);
        class324 var6 = var5.method4432(false);
        if (var6 == null) {
            this.field262 = 0;
            this.field266 = 0;
        } else {
            this.field262 = var6.field3852;
            this.field266 = var6.field3862;
        }
    }

    @ObfuscatedName("ak.c(IIS)Z")
    public boolean method471(int arg0, int arg1) {
        if (this.method472(arg0, arg1)) {
            return true;
        } else {
            return this.method476(arg0, arg1);
        }
    }

    @ObfuscatedName("ak.q(IIB)Z")
    public boolean method472(int arg0, int arg1) {
        class258 var3 = class258.method2830(this.field263);
        switch(var3.field3270.field3529) {
            case 0:
                if (arg0 < this.field265 - this.field262 / 2 || arg0 > this.field262 / 2 + this.field265) {
                    return false;
                }
                break;
            case 1:
                if (arg0 <= this.field265 - this.field262 || arg0 > this.field265) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field265 || arg0 >= this.field265 + this.field262) {
                    return false;
                }
        }
        switch(var3.field3287.field3259) {
            case 0:
                if (arg1 >= this.field267 - this.field266 / 2 && arg1 <= this.field266 / 2 + this.field267) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field267 || arg1 >= this.field267 + this.field266) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field267 - this.field266 || arg1 > this.field267) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ak.m(III)Z")
    public boolean method476(int arg0, int arg1) {
        if (this.field264 == null) {
            return false;
        } else if (arg0 >= this.field265 - this.field264.field203 / 2 && arg0 <= this.field264.field203 / 2 + this.field265) {
            return arg1 >= this.field267 && arg1 <= this.field264.field204 + this.field267;
        } else {
            return false;
        }
    }
}
