package deob;

@ObfuscatedName("ay")
public class class40 {

    @ObfuscatedName("ay.p")
    public final int field542;

    @ObfuscatedName("ay.m")
    public final class213 field539;

    @ObfuscatedName("ay.e")
    public final class213 field546;

    @ObfuscatedName("ay.t")
    public final int field541;

    @ObfuscatedName("ay.w")
    public final int field538;

    @ObfuscatedName("ay.z")
    public final class34 field543;

    @ObfuscatedName("ay.j")
    public int field540;

    @ObfuscatedName("ay.i")
    public int field545;

    public class40(int arg0, class213 arg1, class213 arg2, class34 arg3) {
        this.field542 = arg0;
        this.field546 = arg1;
        this.field539 = arg2;
        this.field543 = arg3;
        class243 var5 = Statics.field3305[this.field542];
        class286 var6 = var5.method3886(false);
        if (var6 == null) {
            this.field541 = 0;
            this.field538 = 0;
        } else {
            this.field541 = var6.field3781;
            this.field538 = var6.field3782;
        }
    }

    @ObfuscatedName("ay.p(IIB)Z")
    public boolean method475(int arg0, int arg1) {
        if (this.method472(arg0, arg1)) {
            return true;
        } else {
            return this.method483(arg0, arg1);
        }
    }

    @ObfuscatedName("ay.m(III)Z")
    public boolean method472(int arg0, int arg1) {
        class243 var3 = Statics.field3305[this.field542];
        switch(var3.field3315.field3552) {
            case 0:
                if (arg0 < this.field540 - this.field541 / 2 || arg0 > this.field541 / 2 + this.field540) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field540 || arg0 >= this.field541 + this.field540) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field540 - this.field541 || arg0 > this.field540) {
                    return false;
                }
        }
        switch(var3.field3311.field3283) {
            case 0:
                if (arg1 >= this.field545 - this.field538 / 2 && arg1 <= this.field538 / 2 + this.field545) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field545 || arg1 >= this.field545 + this.field538) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field545 - this.field538 || arg1 > this.field545) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ay.e(IIB)Z")
    public boolean method483(int arg0, int arg1) {
        if (this.field543 == null) {
            return false;
        } else if (arg0 >= this.field540 - this.field543.field475 / 2 && arg0 <= this.field543.field475 / 2 + this.field540) {
            return arg1 >= this.field545 && arg1 <= this.field543.field476 + this.field545;
        } else {
            return false;
        }
    }
}
