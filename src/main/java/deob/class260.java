package deob;

@ObfuscatedName("io")
public abstract class class260 {

    @ObfuscatedName("io.i")
    public final class301 field3009;

    @ObfuscatedName("io.n")
    public final class301 field3008;

    @ObfuscatedName("io.l")
    public int field3007;

    @ObfuscatedName("io.k")
    public int field3010;

    public class260(class301 arg0, class301 arg1) {
        this.field3008 = arg0;
        this.field3009 = arg1;
    }

    @ObfuscatedName("io.b(III)Z")
    public boolean method4924(int arg0, int arg1) {
        if (this.method4927(arg0, arg1)) {
            return true;
        } else {
            return this.method4925(arg0, arg1);
        }
    }

    @ObfuscatedName("io.m(B)Z")
    public boolean method4926() {
        return this.method4535() >= 0;
    }

    @ObfuscatedName("io.t(III)Z")
    public boolean method4927(int arg0, int arg1) {
        if (!this.method4926()) {
            return false;
        }
        class183 var3 = class183.method18(this.method4535());
        int var4 = this.method4527();
        int var5 = this.method4530();
        switch(var3.field1952.field2014) {
            case 0:
                if (arg0 > this.field3007 - var4 && arg0 <= this.field3007) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field3007 && arg0 < this.field3007 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field3007 - var4 / 2 || arg0 > var4 / 2 + this.field3007) {
                    return false;
                }
        }
        switch(var3.field1953.field2074) {
            case 0:
                if (arg1 >= this.field3010 && arg1 < this.field3010 + var5) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field3010 - var5 || arg1 > this.field3010) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field3010 - var5 / 2 || arg1 > var5 / 2 + this.field3010) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("io.h(IIB)Z")
    public boolean method4925(int arg0, int arg1) {
        class255 var3 = this.method4528();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field3007 - var3.field2982 / 2 && arg0 <= var3.field2982 / 2 + this.field3007) {
            return arg1 >= this.field3010 && arg1 <= this.field3010 + var3.field2980;
        } else {
            return false;
        }
    }

    @ObfuscatedName("io.s(B)I")
    public abstract int method4527();

    @ObfuscatedName("io.z(I)I")
    public abstract int method4530();

    @ObfuscatedName("io.v(I)Lil;")
    public abstract class255 method4528();

    @ObfuscatedName("io.w(I)I")
    public abstract int method4535();
}
