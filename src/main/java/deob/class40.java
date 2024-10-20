package deob;

@ObfuscatedName("ao")
public class class40 {

    @ObfuscatedName("ao.e")
    public final int field535;

    @ObfuscatedName("ao.o")
    public final class213 field532;

    @ObfuscatedName("ao.m")
    public final class213 field542;

    @ObfuscatedName("ao.g")
    public final int field533;

    @ObfuscatedName("ao.d")
    public final int field534;

    @ObfuscatedName("ao.b")
    public final class34 field538;

    @ObfuscatedName("ao.k")
    public int field536;

    @ObfuscatedName("ao.f")
    public int field537;

    public class40(int arg0, class213 arg1, class213 arg2, class34 arg3) {
        this.field535 = arg0;
        this.field542 = arg1;
        this.field532 = arg2;
        this.field538 = arg3;
        class243 var5 = Statics.field477[this.field535];
        class286 var6 = var5.method3920(false);
        if (var6 == null) {
            this.field533 = 0;
            this.field534 = 0;
        } else {
            this.field533 = var6.field3774;
            this.field534 = var6.field3775;
        }
    }

    @ObfuscatedName("ao.e(III)Z")
    public boolean method479(int arg0, int arg1) {
        if (this.method480(arg0, arg1)) {
            return true;
        } else {
            return this.method481(arg0, arg1);
        }
    }

    @ObfuscatedName("ao.o(IIB)Z")
    public boolean method480(int arg0, int arg1) {
        class243 var3 = Statics.field477[this.field535];
        switch(var3.field3267.field3521) {
            case 0:
                if (arg0 <= this.field536 - this.field533 || arg0 > this.field536) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field536 || arg0 >= this.field536 + this.field533) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field536 - this.field533 / 2 || arg0 > this.field533 / 2 + this.field536) {
                    return false;
                }
        }
        switch(var3.field3281.field3249) {
            case 0:
                if (arg1 > this.field537 - this.field534 && arg1 <= this.field537) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field537 || arg1 >= this.field537 + this.field534) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field537 - this.field534 / 2 || arg1 > this.field534 / 2 + this.field537) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ao.m(III)Z")
    public boolean method481(int arg0, int arg1) {
        if (this.field538 == null) {
            return false;
        } else if (arg0 >= this.field536 - this.field538.field467 / 2 && arg0 <= this.field538.field467 / 2 + this.field536) {
            return arg1 >= this.field537 && arg1 <= this.field538.field468 + this.field537;
        } else {
            return false;
        }
    }
}
