package deob;

@ObfuscatedName("aa")
public abstract class class35 {

    @ObfuscatedName("aa.h")
    public final class214 field294;

    @ObfuscatedName("aa.y")
    public final class214 field298;

    @ObfuscatedName("aa.w")
    public int field295;

    @ObfuscatedName("aa.i")
    public int field296;

    public class35(class214 arg0, class214 arg1) {
        this.field298 = arg0;
        this.field294 = arg1;
    }

    @ObfuscatedName("aa.c(IIB)Z")
    public boolean method522(int arg0, int arg1) {
        if (this.method524(arg0, arg1)) {
            return true;
        } else {
            return this.method527(arg0, arg1);
        }
    }

    @ObfuscatedName("aa.s(I)Z")
    public boolean method523() {
        return this.method191() >= 0;
    }

    @ObfuscatedName("aa.t(IIB)Z")
    public boolean method524(int arg0, int arg1) {
        if (!this.method523()) {
            return false;
        }
        class242 var3 = class242.method2014(this.method191());
        int var4 = this.method196();
        int var5 = this.method194();
        switch(var3.field3234.field3464) {
            case 0:
                if (arg0 >= this.field295 && arg0 < this.field295 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field295 - var4 && arg0 <= this.field295) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field295 - var4 / 2 || arg0 > var4 / 2 + this.field295) {
                    return false;
                }
        }
        switch(var3.field3225.field3205) {
            case 0:
                if (arg1 >= this.field296 && arg1 < this.field296 + var5) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field296 - var5 / 2 || arg1 > var5 / 2 + this.field296) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field296 - var5 || arg1 > this.field296) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("aa.m(III)Z")
    public boolean method527(int arg0, int arg1) {
        class29 var3 = this.method192();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field295 - var3.field230 / 2 && arg0 <= var3.field230 / 2 + this.field295) {
            return arg1 >= this.field296 && arg1 <= this.field296 + var3.field229;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aa.u(I)I")
    public abstract int method191();

    @ObfuscatedName("aa.f(I)Lam;")
    public abstract class29 method192();

    @ObfuscatedName("aa.b(I)I")
    public abstract int method196();

    @ObfuscatedName("aa.g(B)I")
    public abstract int method194();
}
