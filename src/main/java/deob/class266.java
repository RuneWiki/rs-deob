package deob;

@ObfuscatedName("kh")
public abstract class class266 {

    @ObfuscatedName("kh.aj")
    public final class348 field2732;

    @ObfuscatedName("kh.av")
    public final class348 field2733;

    @ObfuscatedName("kh.ab")
    public int field2734;

    @ObfuscatedName("kh.ai")
    public int field2735;

    public class266(class348 arg0, class348 arg1) {
        this.field2733 = arg0;
        this.field2732 = arg1;
    }

    @ObfuscatedName("kh.at(IIB)Z")
    public boolean method4594(int arg0, int arg1) {
        if (this.method4596(arg0, arg1)) {
            return true;
        } else {
            return this.method4597(arg0, arg1);
        }
    }

    @ObfuscatedName("kh.af(I)Z")
    public boolean method4599() {
        return this.method4215() >= 0;
    }

    @ObfuscatedName("kh.am(IIB)Z")
    public boolean method4596(int arg0, int arg1) {
        if (!this.method4599()) {
            return false;
        }
        class182 var3 = class182.method3196(this.method4215());
        int var4 = this.method4217();
        int var5 = this.method4230();
        switch(var3.field1906.field1972) {
            case 0:
                if (arg0 >= this.field2734 - var4 / 2 && arg0 <= var4 / 2 + this.field2734) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field2734 && arg0 < this.field2734 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 <= this.field2734 - var4 || arg0 > this.field2734) {
                    return false;
                }
        }
        switch(var3.field1907.field2042) {
            case 0:
                if (arg1 > this.field2735 - var5 && arg1 <= this.field2735) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2735 || arg1 >= this.field2735 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field2735 - var5 / 2 || arg1 > var5 / 2 + this.field2735) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("kh.ar(III)Z")
    public boolean method4597(int arg0, int arg1) {
        class261 var3 = this.method4216();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2734 - var3.field2702 / 2 && arg0 <= var3.field2702 / 2 + this.field2734) {
            return arg1 >= this.field2735 && arg1 <= this.field2735 + var3.field2701;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kh.ad(B)I")
    public abstract int method4215();

    @ObfuscatedName("kh.ag(I)Lkm;")
    public abstract class261 method4216();

    @ObfuscatedName("kh.ak(I)I")
    public abstract int method4217();

    @ObfuscatedName("kh.ap(I)I")
    public abstract int method4230();
}
