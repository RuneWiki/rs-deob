package deob;

@ObfuscatedName("az")
public class class40 {

    @ObfuscatedName("az.j")
    public final int field545;

    @ObfuscatedName("az.h")
    public final class214 field543;

    @ObfuscatedName("az.f")
    public final class214 field538;

    @ObfuscatedName("az.p")
    public final int field540;

    @ObfuscatedName("az.x")
    public final int field541;

    @ObfuscatedName("az.g")
    public final class34 field542;

    @ObfuscatedName("az.c")
    public int field537;

    @ObfuscatedName("az.l")
    public int field544;

    public class40(int arg0, class214 arg1, class214 arg2, class34 arg3) {
        this.field545 = arg0;
        this.field538 = arg1;
        this.field543 = arg2;
        this.field542 = arg3;
        class244 var5 = Statics.field3285[this.field545];
        class287 var6 = var5.method3953(false);
        if (var6 == null) {
            this.field540 = 0;
            this.field541 = 0;
        } else {
            this.field540 = var6.field3769;
            this.field541 = var6.field3773;
        }
    }

    @ObfuscatedName("az.j(IIB)Z")
    public boolean method503(int arg0, int arg1) {
        if (this.method495(arg0, arg1)) {
            return true;
        } else {
            return this.method496(arg0, arg1);
        }
    }

    @ObfuscatedName("az.h(III)Z")
    public boolean method495(int arg0, int arg1) {
        class244 var3 = Statics.field3285[this.field545];
        switch(var3.field3294.field3533) {
            case 0:
                if (arg0 < this.field537 || arg0 >= this.field540 + this.field537) {
                    return false;
                }
                break;
            case 1:
                if (arg0 <= this.field537 - this.field540 || arg0 > this.field537) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field537 - this.field540 / 2 || arg0 > this.field540 / 2 + this.field537) {
                    return false;
                }
        }
        switch(var3.field3292.field3261) {
            case 0:
                if (arg1 >= this.field544 - this.field541 / 2 && arg1 <= this.field541 / 2 + this.field544) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field544 - this.field541 || arg1 > this.field544) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field544 || arg1 >= this.field544 + this.field541) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("az.f(III)Z")
    public boolean method496(int arg0, int arg1) {
        if (this.field542 == null) {
            return false;
        } else if (arg0 >= this.field537 - this.field542.field478 / 2 && arg0 <= this.field542.field478 / 2 + this.field537) {
            return arg1 >= this.field544 && arg1 <= this.field542.field480 + this.field544;
        } else {
            return false;
        }
    }
}
