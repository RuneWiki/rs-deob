package deob;

@ObfuscatedName("aw")
public class class41 {

    @ObfuscatedName("aw.c")
    public final int field511;

    @ObfuscatedName("aw.i")
    public final class239 field513;

    @ObfuscatedName("aw.o")
    public final class239 field507;

    @ObfuscatedName("aw.j")
    public final int field508;

    @ObfuscatedName("aw.k")
    public final int field505;

    @ObfuscatedName("aw.x")
    public final class35 field510;

    @ObfuscatedName("aw.z")
    public int field506;

    @ObfuscatedName("aw.p")
    public int field512;

    public class41(int arg0, class239 arg1, class239 arg2, class35 arg3) {
        this.field511 = arg0;
        this.field507 = arg1;
        this.field513 = arg2;
        this.field510 = arg3;
        class270 var5 = Statics.field3472[this.field511];
        class332 var6 = var5.method4380(false);
        if (var6 == null) {
            this.field508 = 0;
            this.field505 = 0;
        } else {
            this.field508 = var6.field3979;
            this.field505 = var6.field3980;
        }
    }

    @ObfuscatedName("aw.c(III)Z")
    public boolean method504(int arg0, int arg1) {
        if (this.method503(arg0, arg1)) {
            return true;
        } else {
            return this.method514(arg0, arg1);
        }
    }

    @ObfuscatedName("aw.i(III)Z")
    public boolean method503(int arg0, int arg1) {
        class270 var3 = Statics.field3472[this.field511];
        switch(var3.field3467.field3690) {
            case 0:
                if (arg0 < this.field506 || arg0 >= this.field508 + this.field506) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field506 - this.field508 / 2 || arg0 > this.field508 / 2 + this.field506) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field506 - this.field508 || arg0 > this.field506) {
                    return false;
                }
        }
        switch(var3.field3468.field3434) {
            case 0:
                if (arg1 >= this.field512 - this.field505 / 2 && arg1 <= this.field505 / 2 + this.field512) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field512 || arg1 >= this.field512 + this.field505) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field512 - this.field505 || arg1 > this.field512) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("aw.o(III)Z")
    public boolean method514(int arg0, int arg1) {
        if (this.field510 == null) {
            return false;
        } else if (arg0 >= this.field506 - this.field510.field447 / 2 && arg0 <= this.field510.field447 / 2 + this.field506) {
            return arg1 >= this.field512 && arg1 <= this.field510.field453 + this.field512;
        } else {
            return false;
        }
    }
}
