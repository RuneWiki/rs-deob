package deob;

@ObfuscatedName("ao")
public class class29 {

    @ObfuscatedName("ao.v")
    public final int field251;

    @ObfuscatedName("ao.s")
    public final class229 field247;

    @ObfuscatedName("ao.o")
    public final class229 field246;

    @ObfuscatedName("ao.k")
    public final int field250;

    @ObfuscatedName("ao.u")
    public final int field248;

    @ObfuscatedName("ao.i")
    public final class23 field249;

    @ObfuscatedName("ao.t")
    public int field252;

    @ObfuscatedName("ao.p")
    public int field253;

    public class29(int arg0, class229 arg1, class229 arg2, class23 arg3) {
        this.field251 = arg0;
        this.field246 = arg1;
        this.field247 = arg2;
        this.field249 = arg3;
        class258 var5 = Statics.field2412[this.field251];
        class322 var6 = var5.method4480(false);
        if (var6 == null) {
            this.field250 = 0;
            this.field248 = 0;
        } else {
            this.field250 = var6.field3823;
            this.field248 = var6.field3825;
        }
    }

    @ObfuscatedName("ao.v(III)Z")
    public boolean method482(int arg0, int arg1) {
        if (this.method478(arg0, arg1)) {
            return true;
        } else {
            return this.method479(arg0, arg1);
        }
    }

    @ObfuscatedName("ao.s(IIB)Z")
    public boolean method478(int arg0, int arg1) {
        class258 var3 = Statics.field2412[this.field251];
        switch(var3.field3279.field3510) {
            case 0:
                if (arg0 <= this.field252 - this.field250 || arg0 > this.field252) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field252 || arg0 >= this.field252 + this.field250) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field252 - this.field250 / 2 || arg0 > this.field250 / 2 + this.field252) {
                    return false;
                }
        }
        switch(var3.field3280.field3250) {
            case 0:
                if (arg1 >= this.field253 && arg1 < this.field253 + this.field248) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field253 - this.field248 || arg1 > this.field253) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field253 - this.field248 / 2 || arg1 > this.field248 / 2 + this.field253) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ao.o(III)Z")
    public boolean method479(int arg0, int arg1) {
        if (this.field249 == null) {
            return false;
        } else if (arg0 >= this.field252 - this.field249.field199 / 2 && arg0 <= this.field249.field199 / 2 + this.field252) {
            return arg1 >= this.field253 && arg1 <= this.field249.field198 + this.field253;
        } else {
            return false;
        }
    }
}
