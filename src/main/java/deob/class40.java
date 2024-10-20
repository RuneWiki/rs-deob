package deob;

@ObfuscatedName("ap")
public class class40 {

    @ObfuscatedName("ap.d")
    public final int field514;

    @ObfuscatedName("ap.x")
    public final class220 field507;

    @ObfuscatedName("ap.k")
    public final class220 field508;

    @ObfuscatedName("ap.z")
    public final int field506;

    @ObfuscatedName("ap.v")
    public final int field509;

    @ObfuscatedName("ap.m")
    public final class34 field511;

    @ObfuscatedName("ap.b")
    public int field510;

    @ObfuscatedName("ap.t")
    public int field513;

    public class40(int arg0, class220 arg1, class220 arg2, class34 arg3) {
        this.field514 = arg0;
        this.field508 = arg1;
        this.field507 = arg2;
        this.field511 = arg3;
        class250 var5 = Statics.field3365[this.field514];
        class295 var6 = var5.method4118(false);
        if (var6 == null) {
            this.field506 = 0;
            this.field509 = 0;
        } else {
            this.field506 = var6.field3835;
            this.field509 = var6.field3836;
        }
    }

    @ObfuscatedName("ap.d(IIB)Z")
    public boolean method500(int arg0, int arg1) {
        if (this.method488(arg0, arg1)) {
            return true;
        } else {
            return this.method489(arg0, arg1);
        }
    }

    @ObfuscatedName("ap.x(IIB)Z")
    public boolean method488(int arg0, int arg1) {
        class250 var3 = Statics.field3365[this.field514];
        switch(var3.field3381.field3610) {
            case 0:
                if (arg0 < this.field510 - this.field506 / 2 || arg0 > this.field506 / 2 + this.field510) {
                    return false;
                }
                break;
            case 1:
                if (arg0 <= this.field510 - this.field506 || arg0 > this.field510) {
                    return false;
                }
                break;
            case 2:
                if (arg0 < this.field510 || arg0 >= this.field510 + this.field506) {
                    return false;
                }
        }
        switch(var3.field3380.field3346) {
            case 0:
                if (arg1 > this.field513 - this.field509 && arg1 <= this.field513) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field513 - this.field509 / 2 || arg1 > this.field509 / 2 + this.field513) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field513 || arg1 >= this.field513 + this.field509) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ap.k(III)Z")
    public boolean method489(int arg0, int arg1) {
        if (this.field511 == null) {
            return false;
        } else if (arg0 >= this.field510 - this.field511.field442 / 2 && arg0 <= this.field511.field442 / 2 + this.field510) {
            return arg1 >= this.field513 && arg1 <= this.field511.field446 + this.field513;
        } else {
            return false;
        }
    }
}
