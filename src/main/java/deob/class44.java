package deob;

@ObfuscatedName("am")
public abstract class class44 {

    @ObfuscatedName("am.k")
    public final class223 field317;

    @ObfuscatedName("am.c")
    public final class223 field311;

    @ObfuscatedName("am.u")
    public int field312;

    @ObfuscatedName("am.t")
    public int field310;

    public class44(class223 arg0, class223 arg1) {
        this.field311 = arg0;
        this.field317 = arg1;
    }

    @ObfuscatedName("am.s(IIB)Z")
    public boolean method602(int arg0, int arg1) {
        if (this.method604(arg0, arg1)) {
            return true;
        } else {
            return this.method601(arg0, arg1);
        }
    }

    @ObfuscatedName("am.j(I)Z")
    public boolean method603() {
        return this.method251() >= 0;
    }

    @ObfuscatedName("am.d(IIB)Z")
    public boolean method604(int arg0, int arg1) {
        if (!this.method603()) {
            return false;
        }
        class253 var3 = class253.method3431(this.method251());
        int var4 = this.method253();
        int var5 = this.method264();
        switch(var3.field3257.field3483) {
            case 0:
                if (arg0 >= this.field312 && arg0 < this.field312 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field312 - var4 && arg0 <= this.field312) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field312 - var4 / 2 || arg0 > var4 / 2 + this.field312) {
                    return false;
                }
        }
        switch(var3.field3258.field3226) {
            case 0:
                if (arg1 > this.field310 - var5 && arg1 <= this.field310) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field310 - var5 / 2 || arg1 > var5 / 2 + this.field310) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field310 || arg1 >= this.field310 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("am.a(III)Z")
    public boolean method601(int arg0, int arg1) {
        class38 var3 = this.method252();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field312 - var3.field260 / 2 && arg0 <= var3.field260 / 2 + this.field312) {
            return arg1 >= this.field310 && arg1 <= this.field310 + var3.field262;
        } else {
            return false;
        }
    }

    @ObfuscatedName("am.f(B)I")
    public abstract int method251();

    @ObfuscatedName("am.l(I)I")
    public abstract int method253();

    @ObfuscatedName("am.m(I)I")
    public abstract int method264();

    @ObfuscatedName("am.b(I)Lai;")
    public abstract class38 method252();
}
