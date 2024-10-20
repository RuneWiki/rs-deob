package deob;

@ObfuscatedName("ib")
public abstract class class244 {

    @ObfuscatedName("ib.s")
    public final class291 field2888;

    @ObfuscatedName("ib.q")
    public final class291 field2893;

    @ObfuscatedName("ib.m")
    public int field2889;

    @ObfuscatedName("ib.x")
    public int field2890;

    public class244(class291 arg0, class291 arg1) {
        this.field2893 = arg0;
        this.field2888 = arg1;
    }

    @ObfuscatedName("ib.u(IIB)Z")
    public boolean method4671(int arg0, int arg1) {
        if (this.method4674(arg0, arg1)) {
            return true;
        } else {
            return this.method4679(arg0, arg1);
        }
    }

    @ObfuscatedName("ib.d(B)Z")
    public boolean method4673() {
        return this.method4295() >= 0;
    }

    @ObfuscatedName("ib.b(III)Z")
    public boolean method4674(int arg0, int arg1) {
        if (!this.method4673()) {
            return false;
        }
        class172 var3 = class172.method2879(this.method4295());
        int var4 = this.method4296();
        int var5 = this.method4299();
        switch(var3.field1865.field1925) {
            case 0:
                if (arg0 >= this.field2889 && arg0 < this.field2889 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field2889 - var4 && arg0 <= this.field2889) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field2889 - var4 / 2 || arg0 > var4 / 2 + this.field2889) {
                    return false;
                }
        }
        switch(var3.field1866.field1978) {
            case 0:
                if (arg1 >= this.field2890 - var5 / 2 && arg1 <= var5 / 2 + this.field2890) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field2890 - var5 || arg1 > this.field2890) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field2890 || arg1 >= this.field2890 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ib.a(III)Z")
    public boolean method4679(int arg0, int arg1) {
        class239 var3 = this.method4298();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2889 - var3.field2862 / 2 && arg0 <= var3.field2862 / 2 + this.field2889) {
            return arg1 >= this.field2890 && arg1 <= this.field2890 + var3.field2859;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ib.p(I)I")
    public abstract int method4295();

    @ObfuscatedName("ib.f(B)Lik;")
    public abstract class239 method4298();

    @ObfuscatedName("ib.k(I)I")
    public abstract int method4299();

    @ObfuscatedName("ib.n(I)I")
    public abstract int method4296();
}
