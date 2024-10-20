package deob;

@ObfuscatedName("ad")
public class class29 {

    @ObfuscatedName("ad.w")
    public final int field252;

    @ObfuscatedName("ad.m")
    public final class227 field248;

    @ObfuscatedName("ad.q")
    public final class227 field254;

    @ObfuscatedName("ad.b")
    public final int field250;

    @ObfuscatedName("ad.f")
    public final int field251;

    @ObfuscatedName("ad.n")
    public final class23 field256;

    @ObfuscatedName("ad.h")
    public int field253;

    @ObfuscatedName("ad.x")
    public int field249;

    public class29(int arg0, class227 arg1, class227 arg2, class23 arg3) {
        this.field252 = arg0;
        this.field254 = arg1;
        this.field248 = arg2;
        this.field256 = arg3;
        class256 var5 = Statics.field3275[this.field252];
        class319 var6 = var5.method4442(false);
        if (var6 == null) {
            this.field250 = 0;
            this.field251 = 0;
        } else {
            this.field250 = var6.field3795;
            this.field251 = var6.field3802;
        }
    }

    @ObfuscatedName("ad.w(III)Z")
    public boolean method459(int arg0, int arg1) {
        if (this.method469(arg0, arg1)) {
            return true;
        } else {
            return this.method468(arg0, arg1);
        }
    }

    @ObfuscatedName("ad.m(III)Z")
    public boolean method469(int arg0, int arg1) {
        class256 var3 = Statics.field3275[this.field252];
        switch(var3.field3274.field3495) {
            case 0:
                if (arg0 < this.field253 - this.field250 / 2 || arg0 > this.field250 / 2 + this.field253) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field253 || arg0 >= this.field253 + this.field250) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field253 - this.field250 || arg0 > this.field253) {
                    return false;
                }
        }
        switch(var3.field3268.field3245) {
            case 0:
                if (arg1 >= this.field249 && arg1 < this.field251 + this.field249) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field249 - this.field251 / 2 || arg1 > this.field251 / 2 + this.field249) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field249 - this.field251 || arg1 > this.field249) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ad.q(III)Z")
    public boolean method468(int arg0, int arg1) {
        if (this.field256 == null) {
            return false;
        } else if (arg0 >= this.field253 - this.field256.field193 / 2 && arg0 <= this.field256.field193 / 2 + this.field253) {
            return arg1 >= this.field249 && arg1 <= this.field256.field194 + this.field249;
        } else {
            return false;
        }
    }
}
