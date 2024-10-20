package deob;

@ObfuscatedName("gq")
public abstract class class184 {

    @ObfuscatedName("gq.r")
    public final class243 field2131;

    @ObfuscatedName("gq.b")
    public final class243 field2129;

    @ObfuscatedName("gq.d")
    public int field2130;

    @ObfuscatedName("gq.s")
    public int field2128;

    public class184(class243 arg0, class243 arg1) {
        this.field2129 = arg0;
        this.field2131 = arg1;
    }

    @ObfuscatedName("gq.e(IIS)Z")
    public boolean method3349(int arg0, int arg1) {
        if (this.method3341(arg0, arg1)) {
            return true;
        } else {
            return this.method3342(arg0, arg1);
        }
    }

    @ObfuscatedName("gq.g(I)Z")
    public boolean method3340() {
        return this.method2989() >= 0;
    }

    @ObfuscatedName("gq.a(III)Z")
    public boolean method3341(int arg0, int arg1) {
        if (!this.method3340()) {
            return false;
        }
        class139 var3 = class139.method52(this.method2989());
        int var4 = this.method2992();
        int var5 = this.method2982();
        switch(var3.field1570.field1626) {
            case 0:
                if (arg0 >= this.field2130 - var4 / 2 && arg0 <= var4 / 2 + this.field2130) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field2130 - var4 && arg0 <= this.field2130) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field2130 || arg0 >= this.field2130 + var4) {
                    return false;
                }
        }
        switch(var3.field1556.field1674) {
            case 0:
                if (arg1 > this.field2128 - var5 && arg1 <= this.field2128) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2128 - var5 / 2 || arg1 > var5 / 2 + this.field2128) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field2128 || arg1 >= this.field2128 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("gq.k(III)Z")
    public boolean method3342(int arg0, int arg1) {
        class179 var3 = this.method2993();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2130 - var3.field2093 / 2 && arg0 <= var3.field2093 / 2 + this.field2130) {
            return arg1 >= this.field2128 && arg1 <= this.field2128 + var3.field2094;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gq.n(I)I")
    public abstract int method2989();

    @ObfuscatedName("gq.f(I)Lfv;")
    public abstract class179 method2993();

    @ObfuscatedName("gq.y(I)I")
    public abstract int method2992();

    @ObfuscatedName("gq.p(B)I")
    public abstract int method2982();
}
