package deob;

@ObfuscatedName("il")
public abstract class class243 {

    @ObfuscatedName("il.i")
    public final class290 field2864;

    @ObfuscatedName("il.k")
    public final class290 field2863;

    @ObfuscatedName("il.o")
    public int field2865;

    @ObfuscatedName("il.n")
    public int field2866;

    public class243(class290 arg0, class290 arg1) {
        this.field2863 = arg0;
        this.field2864 = arg1;
    }

    @ObfuscatedName("il.t(III)Z")
    public boolean method4492(int arg0, int arg1) {
        if (this.method4494(arg0, arg1)) {
            return true;
        } else {
            return this.method4495(arg0, arg1);
        }
    }

    @ObfuscatedName("il.j(I)Z")
    public boolean method4493() {
        return this.method4097() >= 0;
    }

    @ObfuscatedName("il.g(IIB)Z")
    public boolean method4494(int arg0, int arg1) {
        if (!this.method4493()) {
            return false;
        }
        class171 var3 = class171.method3061(this.method4097());
        int var4 = this.method4114();
        int var5 = this.method4102();
        switch(var3.field1815.field1897) {
            case 0:
                if (arg0 >= this.field2865 - var4 / 2 && arg0 <= var4 / 2 + this.field2865) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field2865 - var4 && arg0 <= this.field2865) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field2865 || arg0 >= this.field2865 + var4) {
                    return false;
                }
        }
        switch(var3.field1831.field1952) {
            case 0:
                if (arg1 >= this.field2866 - var5 / 2 && arg1 <= var5 / 2 + this.field2866) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2866 || arg1 >= this.field2866 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field2866 - var5 || arg1 > this.field2866) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("il.ar(III)Z")
    public boolean method4495(int arg0, int arg1) {
        class238 var3 = this.method4100();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2865 - var3.field2834 / 2 && arg0 <= var3.field2834 / 2 + this.field2865) {
            return arg1 >= this.field2866 && arg1 <= this.field2866 + var3.field2837;
        } else {
            return false;
        }
    }

    @ObfuscatedName("il.w(B)Liw;")
    public abstract class238 method4100();

    @ObfuscatedName("il.v(I)I")
    public abstract int method4114();

    @ObfuscatedName("il.c(I)I")
    public abstract int method4102();

    @ObfuscatedName("il.h(B)I")
    public abstract int method4097();
}
