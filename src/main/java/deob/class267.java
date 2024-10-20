package deob;

@ObfuscatedName("kg")
public abstract class class267 {

    @ObfuscatedName("kg.aq")
    public final class308 field3050;

    @ObfuscatedName("kg.al")
    public final class308 field3053;

    @ObfuscatedName("kg.at")
    public int field3051;

    @ObfuscatedName("kg.aa")
    public int field3052;

    public class267(class308 arg0, class308 arg1) {
        this.field3053 = arg0;
        this.field3050 = arg1;
    }

    @ObfuscatedName("kg.am(IIB)Z")
    public boolean method5009(int arg0, int arg1) {
        if (this.method5011(arg0, arg1)) {
            return true;
        } else {
            return this.method5008(arg0, arg1);
        }
    }

    @ObfuscatedName("kg.as(I)Z")
    public boolean method5010() {
        return this.method4662() >= 0;
    }

    @ObfuscatedName("kg.aj(III)Z")
    public boolean method5011(int arg0, int arg1) {
        if (!this.method5010()) {
            return false;
        }
        class183 var3 = class183.method6285(this.method4662());
        int var4 = this.method4654();
        int var5 = this.method4650();
        switch(var3.field1933.field1994) {
            case 0:
                if (arg0 > this.field3051 - var4 && arg0 <= this.field3051) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field3051 && arg0 < this.field3051 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field3051 - var4 / 2 || arg0 > var4 / 2 + this.field3051) {
                    return false;
                }
        }
        switch(var3.field1927.field2056) {
            case 0:
                if (arg1 >= this.field3052 && arg1 < this.field3052 + var5) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field3052 - var5 / 2 || arg1 > var5 / 2 + this.field3052) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field3052 - var5 || arg1 > this.field3052) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("kg.ak(III)Z")
    public boolean method5008(int arg0, int arg1) {
        class262 var3 = this.method4651();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field3051 - var3.field3024 / 2 && arg0 <= var3.field3024 / 2 + this.field3051) {
            return arg1 >= this.field3052 && arg1 <= this.field3052 + var3.field3023;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kg.aw(I)Lku;")
    public abstract class262 method4651();

    @ObfuscatedName("kg.ac(I)I")
    public abstract int method4654();

    @ObfuscatedName("kg.an(I)I")
    public abstract int method4662();

    @ObfuscatedName("kg.au(I)I")
    public abstract int method4650();
}
