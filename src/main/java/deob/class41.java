package deob;

@ObfuscatedName("al")
public class class41 {

    @ObfuscatedName("al.t")
    public final int field515;

    @ObfuscatedName("al.q")
    public final class239 field511;

    @ObfuscatedName("al.i")
    public final class239 field512;

    @ObfuscatedName("al.a")
    public final int field513;

    @ObfuscatedName("al.l")
    public final int field514;

    @ObfuscatedName("al.b")
    public final class35 field517;

    @ObfuscatedName("al.e")
    public int field516;

    @ObfuscatedName("al.x")
    public int field520;

    public class41(int arg0, class239 arg1, class239 arg2, class35 arg3) {
        this.field515 = arg0;
        this.field512 = arg1;
        this.field511 = arg2;
        this.field517 = arg3;
        class270 var5 = Statics.field3455[this.field515];
        class332 var6 = var5.method4384(false);
        if (var6 == null) {
            this.field513 = 0;
            this.field514 = 0;
        } else {
            this.field513 = var6.field3984;
            this.field514 = var6.field3985;
        }
    }

    @ObfuscatedName("al.t(III)Z")
    public boolean method522(int arg0, int arg1) {
        if (this.method517(arg0, arg1)) {
            return true;
        } else {
            return this.method518(arg0, arg1);
        }
    }

    @ObfuscatedName("al.q(III)Z")
    public boolean method517(int arg0, int arg1) {
        class270 var3 = Statics.field3455[this.field515];
        switch(var3.field3464.field3704) {
            case 0:
                if (arg0 < this.field516 - this.field513 / 2 || arg0 > this.field513 / 2 + this.field516) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field516 || arg0 >= this.field516 + this.field513) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field516 - this.field513 || arg0 > this.field516) {
                    return false;
                }
        }
        switch(var3.field3465.field3441) {
            case 0:
                if (arg1 >= this.field520 - this.field514 / 2 && arg1 <= this.field514 / 2 + this.field520) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field520 - this.field514 || arg1 > this.field520) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field520 || arg1 >= this.field520 + this.field514) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("al.i(III)Z")
    public boolean method518(int arg0, int arg1) {
        if (this.field517 == null) {
            return false;
        } else if (arg0 >= this.field516 - this.field517.field442 / 2 && arg0 <= this.field517.field442 / 2 + this.field516) {
            return arg1 >= this.field520 && arg1 <= this.field517.field443 + this.field520;
        } else {
            return false;
        }
    }
}
