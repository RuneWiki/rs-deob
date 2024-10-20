package deob;

@ObfuscatedName("aj")
public class class40 {

    @ObfuscatedName("aj.n")
    public final int field513;

    @ObfuscatedName("aj.v")
    public final class224 field515;

    @ObfuscatedName("aj.y")
    public final class224 field510;

    @ObfuscatedName("aj.r")
    public final int field508;

    @ObfuscatedName("aj.h")
    public final int field512;

    @ObfuscatedName("aj.d")
    public final class34 field514;

    @ObfuscatedName("aj.s")
    public int field509;

    @ObfuscatedName("aj.b")
    public int field511;

    public class40(int arg0, class224 arg1, class224 arg2, class34 arg3) {
        this.field513 = arg0;
        this.field510 = arg1;
        this.field515 = arg2;
        this.field514 = arg3;
        class254 var5 = Statics.field3384[this.field513];
        class299 var6 = var5.method4092(false);
        if (var6 == null) {
            this.field508 = 0;
            this.field512 = 0;
        } else {
            this.field508 = var6.field3861;
            this.field512 = var6.field3858;
        }
    }

    @ObfuscatedName("aj.n(III)Z")
    public boolean method479(int arg0, int arg1) {
        if (this.method475(arg0, arg1)) {
            return true;
        } else {
            return this.method476(arg0, arg1);
        }
    }

    @ObfuscatedName("aj.v(III)Z")
    public boolean method475(int arg0, int arg1) {
        class254 var3 = Statics.field3384[this.field513];
        switch(var3.field3398.field3628) {
            case 0:
                if (arg0 < this.field509 - this.field508 / 2 || arg0 > this.field508 / 2 + this.field509) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field509 || arg0 >= this.field509 + this.field508) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field509 - this.field508 || arg0 > this.field509) {
                    return false;
                }
        }
        switch(var3.field3381.field3369) {
            case 0:
                if (arg1 >= this.field511 && arg1 < this.field512 + this.field511) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field511 - this.field512 || arg1 > this.field511) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field511 - this.field512 / 2 || arg1 > this.field512 / 2 + this.field511) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("aj.y(IIB)Z")
    public boolean method476(int arg0, int arg1) {
        if (this.field514 == null) {
            return false;
        } else if (arg0 >= this.field509 - this.field514.field448 / 2 && arg0 <= this.field514.field448 / 2 + this.field509) {
            return arg1 >= this.field511 && arg1 <= this.field514.field451 + this.field511;
        } else {
            return false;
        }
    }
}
