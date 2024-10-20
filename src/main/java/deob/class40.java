package deob;

@ObfuscatedName("aw")
public class class40 {

    @ObfuscatedName("aw.b")
    public final int field499;

    @ObfuscatedName("aw.s")
    public final class220 field493;

    @ObfuscatedName("aw.r")
    public final class220 field492;

    @ObfuscatedName("aw.g")
    public final int field490;

    @ObfuscatedName("aw.x")
    public final int field494;

    @ObfuscatedName("aw.f")
    public final class34 field495;

    @ObfuscatedName("aw.u")
    public int field496;

    @ObfuscatedName("aw.t")
    public int field491;

    public class40(int arg0, class220 arg1, class220 arg2, class34 arg3) {
        this.field499 = arg0;
        this.field492 = arg1;
        this.field493 = arg2;
        this.field495 = arg3;
        class250 var5 = Statics.field3346[this.field499];
        class295 var6 = var5.method3972(false);
        if (var6 == null) {
            this.field490 = 0;
            this.field494 = 0;
        } else {
            this.field490 = var6.field3845;
            this.field494 = var6.field3836;
        }
    }

    @ObfuscatedName("aw.b(IIB)Z")
    public boolean method463(int arg0, int arg1) {
        if (this.method464(arg0, arg1)) {
            return true;
        } else {
            return this.method465(arg0, arg1);
        }
    }

    @ObfuscatedName("aw.s(III)Z")
    public boolean method464(int arg0, int arg1) {
        class250 var3 = Statics.field3346[this.field499];
        switch(var3.field3362.field3598) {
            case 0:
                if (arg0 <= this.field496 - this.field490 || arg0 > this.field496) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field496 - this.field490 / 2 || arg0 > this.field490 / 2 + this.field496) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field496 || arg0 >= this.field496 + this.field490) {
                    return false;
                }
        }
        switch(var3.field3345.field3328) {
            case 0:
                if (arg1 >= this.field491 - this.field494 / 2 && arg1 <= this.field494 / 2 + this.field491) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field491 || arg1 >= this.field494 + this.field491) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field491 - this.field494 || arg1 > this.field491) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("aw.r(III)Z")
    public boolean method465(int arg0, int arg1) {
        if (this.field495 == null) {
            return false;
        } else if (arg0 >= this.field496 - this.field495.field433 / 2 && arg0 <= this.field495.field433 / 2 + this.field496) {
            return arg1 >= this.field491 && arg1 <= this.field495.field438 + this.field491;
        } else {
            return false;
        }
    }
}
