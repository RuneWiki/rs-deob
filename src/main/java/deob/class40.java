package deob;

@ObfuscatedName("ad")
public class class40 {

    @ObfuscatedName("ad.a")
    public final int field524;

    @ObfuscatedName("ad.j")
    public final class213 field517;

    @ObfuscatedName("ad.n")
    public final class213 field523;

    @ObfuscatedName("ad.r")
    public final int field519;

    @ObfuscatedName("ad.v")
    public final int field520;

    @ObfuscatedName("ad.e")
    public final class34 field521;

    @ObfuscatedName("ad.l")
    public int field522;

    @ObfuscatedName("ad.s")
    public int field516;

    public class40(int arg0, class213 arg1, class213 arg2, class34 arg3) {
        this.field524 = arg0;
        this.field523 = arg1;
        this.field517 = arg2;
        this.field521 = arg3;
        class243 var5 = Statics.field663[this.field524];
        class286 var6 = var5.method3920(false);
        if (var6 == null) {
            this.field519 = 0;
            this.field520 = 0;
        } else {
            this.field519 = var6.field3782;
            this.field520 = var6.field3783;
        }
    }

    @ObfuscatedName("ad.a(IIB)Z")
    public boolean method483(int arg0, int arg1) {
        if (this.method475(arg0, arg1)) {
            return true;
        } else {
            return this.method476(arg0, arg1);
        }
    }

    @ObfuscatedName("ad.j(IIB)Z")
    public boolean method475(int arg0, int arg1) {
        class243 var3 = Statics.field663[this.field524];
        switch(var3.field3304.field3552) {
            case 0:
                if (arg0 <= this.field522 - this.field519 || arg0 > this.field522) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field522 - this.field519 / 2 || arg0 > this.field519 / 2 + this.field522) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field522 || arg0 >= this.field522 + this.field519) {
                    return false;
                }
        }
        switch(var3.field3305.field3277) {
            case 0:
                if (arg1 >= this.field516 && arg1 < this.field520 + this.field516) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field516 - this.field520 / 2 || arg1 > this.field520 / 2 + this.field516) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field516 - this.field520 || arg1 > this.field516) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ad.n(III)Z")
    public boolean method476(int arg0, int arg1) {
        if (this.field521 == null) {
            return false;
        } else if (arg0 >= this.field522 - this.field521.field456 / 2 && arg0 <= this.field521.field456 / 2 + this.field522) {
            return arg1 >= this.field516 && arg1 <= this.field521.field457 + this.field516;
        } else {
            return false;
        }
    }
}
