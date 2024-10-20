package deob;

@ObfuscatedName("gh")
public abstract class class185 {

    @ObfuscatedName("gh.m")
    public final class244 field2122;

    @ObfuscatedName("gh.r")
    public final class244 field2125;

    @ObfuscatedName("gh.h")
    public int field2123;

    @ObfuscatedName("gh.d")
    public int field2124;

    public class185(class244 arg0, class244 arg1) {
        this.field2125 = arg0;
        this.field2122 = arg1;
    }

    @ObfuscatedName("gh.n(III)Z")
    public boolean method3347(int arg0, int arg1) {
        if (this.method3336(arg0, arg1)) {
            return true;
        } else {
            return this.method3337(arg0, arg1);
        }
    }

    @ObfuscatedName("gh.l(B)Z")
    public boolean method3335() {
        return this.method2967() >= 0;
    }

    @ObfuscatedName("gh.w(IIB)Z")
    public boolean method3336(int arg0, int arg1) {
        if (!this.method3335()) {
            return false;
        }
        class140 var3 = class140.method4496(this.method2967());
        int var4 = this.method2969();
        int var5 = this.method2972();
        switch(var3.field1576.field1635) {
            case 0:
                if (arg0 >= this.field2123 && arg0 < this.field2123 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field2123 - var4 && arg0 <= this.field2123) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field2123 - var4 / 2 || arg0 > var4 / 2 + this.field2123) {
                    return false;
                }
        }
        switch(var3.field1577.field1678) {
            case 0:
                if (arg1 >= this.field2124 - var5 / 2 && arg1 <= var5 / 2 + this.field2124) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2124 || arg1 >= this.field2124 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field2124 - var5 || arg1 > this.field2124) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("gh.a(III)Z")
    public boolean method3337(int arg0, int arg1) {
        class180 var3 = this.method2978();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2123 - var3.field2097 / 2 && arg0 <= var3.field2097 / 2 + this.field2123) {
            return arg1 >= this.field2124 && arg1 <= this.field2124 + var3.field2098;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gh.e(I)I")
    public abstract int method2967();

    @ObfuscatedName("gh.v(I)Lfd;")
    public abstract class180 method2978();

    @ObfuscatedName("gh.y(B)I")
    public abstract int method2969();

    @ObfuscatedName("gh.j(I)I")
    public abstract int method2972();
}
