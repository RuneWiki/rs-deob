package deob;

@ObfuscatedName("iw")
public abstract class class244 {

    @ObfuscatedName("iw.p")
    public final class290 field2900;

    @ObfuscatedName("iw.s")
    public final class290 field2901;

    @ObfuscatedName("iw.r")
    public int field2902;

    @ObfuscatedName("iw.v")
    public int field2903;

    public class244(class290 arg0, class290 arg1) {
        this.field2901 = arg0;
        this.field2900 = arg1;
    }

    @ObfuscatedName("iw.b(III)Z")
    public boolean method4458(int arg0, int arg1) {
        if (this.method4457(arg0, arg1)) {
            return true;
        } else {
            return this.method4460(arg0, arg1);
        }
    }

    @ObfuscatedName("iw.t(I)Z")
    public boolean method4464() {
        return this.method4095() >= 0;
    }

    @ObfuscatedName("iw.g(IIB)Z")
    public boolean method4457(int arg0, int arg1) {
        if (!this.method4464()) {
            return false;
        }
        class172 var3 = class172.method2598(this.method4095());
        int var4 = this.method4106();
        int var5 = this.method4105();
        switch(var3.field1883.field1940) {
            case 0:
                if (arg0 >= this.field2902 - var4 / 2 && arg0 <= var4 / 2 + this.field2902) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field2902 && arg0 < this.field2902 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 <= this.field2902 - var4 || arg0 > this.field2902) {
                    return false;
                }
        }
        switch(var3.field1884.field1996) {
            case 0:
                if (arg1 > this.field2903 - var5 && arg1 <= this.field2903) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2903 - var5 / 2 || arg1 > var5 / 2 + this.field2903) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field2903 || arg1 >= this.field2903 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("iw.x(IIB)Z")
    public boolean method4460(int arg0, int arg1) {
        class239 var3 = this.method4098();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2902 - var3.field2868 / 2 && arg0 <= var3.field2868 / 2 + this.field2902) {
            return arg1 >= this.field2903 && arg1 <= this.field2903 + var3.field2869;
        } else {
            return false;
        }
    }

    @ObfuscatedName("iw.q(B)I")
    public abstract int method4095();

    @ObfuscatedName("iw.l(I)Lip;")
    public abstract class239 method4098();

    @ObfuscatedName("iw.a(I)I")
    public abstract int method4105();

    @ObfuscatedName("iw.k(B)I")
    public abstract int method4106();
}
