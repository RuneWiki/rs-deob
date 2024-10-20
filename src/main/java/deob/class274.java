package deob;

@ObfuscatedName("kb")
public abstract class class274 {

    @ObfuscatedName("kb.ab")
    public final class321 field3039;

    @ObfuscatedName("kb.ak")
    public final class321 field3040;

    @ObfuscatedName("kb.ae")
    public int field3041;

    @ObfuscatedName("kb.af")
    public int field3042;

    public class274(class321 arg0, class321 arg1) {
        this.field3040 = arg0;
        this.field3039 = arg1;
    }

    @ObfuscatedName("kb.ar(IIB)Z")
    public boolean method5030(int arg0, int arg1) {
        if (this.method5028(arg0, arg1)) {
            return true;
        } else {
            return this.method5018(arg0, arg1);
        }
    }

    @ObfuscatedName("kb.ah(B)Z")
    public boolean method5017() {
        return this.method4663() >= 0;
    }

    @ObfuscatedName("kb.az(III)Z")
    public boolean method5028(int arg0, int arg1) {
        if (!this.method5017()) {
            return false;
        }
        class187 var3 = class187.method2956(this.method4663());
        int var4 = this.method4665();
        int var5 = this.method4657();
        switch(var3.field1926.field1986) {
            case 0:
                if (arg0 > this.field3041 - var4 && arg0 <= this.field3041) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field3041 && arg0 < this.field3041 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field3041 - var4 / 2 || arg0 > var4 / 2 + this.field3041) {
                    return false;
                }
        }
        switch(var3.field1927.field2048) {
            case 0:
                if (arg1 >= this.field3042 - var5 / 2 && arg1 <= var5 / 2 + this.field3042) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field3042 || arg1 >= this.field3042 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field3042 - var5 || arg1 > this.field3042) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("kb.au(IIB)Z")
    public boolean method5018(int arg0, int arg1) {
        class269 var3 = this.method4655();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field3041 - var3.field3014 / 2 && arg0 <= var3.field3014 / 2 + this.field3041) {
            return arg1 >= this.field3042 && arg1 <= this.field3042 + var3.field3011;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kb.an(I)I")
    public abstract int method4663();

    @ObfuscatedName("kb.ax(B)I")
    public abstract int method4657();

    @ObfuscatedName("kb.as(B)I")
    public abstract int method4665();

    @ObfuscatedName("kb.av(I)Lks;")
    public abstract class269 method4655();
}
