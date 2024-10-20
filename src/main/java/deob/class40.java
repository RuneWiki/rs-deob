package deob;

@ObfuscatedName("ay")
public class class40 {

    @ObfuscatedName("ay.i")
    public final int field544;

    @ObfuscatedName("ay.j")
    public final class214 field553;

    @ObfuscatedName("ay.a")
    public final class214 field543;

    @ObfuscatedName("ay.r")
    public final int field545;

    @ObfuscatedName("ay.o")
    public final int field546;

    @ObfuscatedName("ay.n")
    public final class34 field547;

    @ObfuscatedName("ay.q")
    public int field542;

    @ObfuscatedName("ay.b")
    public int field549;

    public class40(int arg0, class214 arg1, class214 arg2, class34 arg3) {
        this.field544 = arg0;
        this.field543 = arg1;
        this.field553 = arg2;
        this.field547 = arg3;
        class244 var5 = Statics.field3295[this.field544];
        class287 var6 = var5.method3980(false);
        if (var6 == null) {
            this.field545 = 0;
            this.field546 = 0;
        } else {
            this.field545 = var6.field3785;
            this.field546 = var6.field3790;
        }
    }

    @ObfuscatedName("ay.i(III)Z")
    public boolean method494(int arg0, int arg1) {
        if (this.method495(arg0, arg1)) {
            return true;
        } else {
            return this.method503(arg0, arg1);
        }
    }

    @ObfuscatedName("ay.j(IIB)Z")
    public boolean method495(int arg0, int arg1) {
        class244 var3 = Statics.field3295[this.field544];
        switch(var3.field3310.field3543) {
            case 0:
                if (arg0 < this.field542 || arg0 >= this.field545 + this.field542) {
                    return false;
                }
                break;
            case 1:
                if (arg0 <= this.field542 - this.field545 || arg0 > this.field542) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field542 - this.field545 / 2 || arg0 > this.field545 / 2 + this.field542) {
                    return false;
                }
        }
        switch(var3.field3313.field3277) {
            case 0:
                if (arg1 > this.field549 - this.field546 && arg1 <= this.field549) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field549 || arg1 >= this.field549 + this.field546) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field549 - this.field546 / 2 || arg1 > this.field546 / 2 + this.field549) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ay.a(III)Z")
    public boolean method503(int arg0, int arg1) {
        if (this.field547 == null) {
            return false;
        } else if (arg0 >= this.field542 - this.field547.field479 / 2 && arg0 <= this.field547.field479 / 2 + this.field542) {
            return arg1 >= this.field549 && arg1 <= this.field547.field477 + this.field549;
        } else {
            return false;
        }
    }
}
