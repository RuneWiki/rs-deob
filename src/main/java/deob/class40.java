package deob;

@ObfuscatedName("as")
public class class40 {

    @ObfuscatedName("as.w")
    public final int field549;

    @ObfuscatedName("as.o")
    public final class216 field541;

    @ObfuscatedName("as.x")
    public final class216 field542;

    @ObfuscatedName("as.k")
    public final int field544;

    @ObfuscatedName("as.f")
    public final int field543;

    @ObfuscatedName("as.i")
    public final class34 field546;

    @ObfuscatedName("as.j")
    public int field547;

    @ObfuscatedName("as.m")
    public int field548;

    public class40(int arg0, class216 arg1, class216 arg2, class34 arg3) {
        this.field549 = arg0;
        this.field542 = arg1;
        this.field541 = arg2;
        this.field546 = arg3;
        class246 var5 = Statics.field3301[this.field549];
        class289 var6 = var5.method3896(false);
        if (var6 == null) {
            this.field544 = 0;
            this.field543 = 0;
        } else {
            this.field544 = var6.field3797;
            this.field543 = var6.field3790;
        }
    }

    @ObfuscatedName("as.w(III)Z")
    public boolean method484(int arg0, int arg1) {
        if (this.method485(arg0, arg1)) {
            return true;
        } else {
            return this.method487(arg0, arg1);
        }
    }

    @ObfuscatedName("as.o(III)Z")
    public boolean method485(int arg0, int arg1) {
        class246 var3 = Statics.field3301[this.field549];
        switch(var3.field3300.field3559) {
            case 0:
                if (arg0 < this.field547 - this.field544 / 2 || arg0 > this.field544 / 2 + this.field547) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field547 || arg0 >= this.field547 + this.field544) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field547 - this.field544 || arg0 > this.field547) {
                    return false;
                }
        }
        switch(var3.field3310.field3271) {
            case 0:
                if (arg1 >= this.field548 && arg1 < this.field548 + this.field543) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field548 - this.field543 || arg1 > this.field548) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field548 - this.field543 / 2 || arg1 > this.field543 / 2 + this.field548) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("as.x(III)Z")
    public boolean method487(int arg0, int arg1) {
        if (this.field546 == null) {
            return false;
        } else if (arg0 >= this.field547 - this.field546.field486 / 2 && arg0 <= this.field546.field486 / 2 + this.field547) {
            return arg1 >= this.field548 && arg1 <= this.field546.field479 + this.field548;
        } else {
            return false;
        }
    }
}
