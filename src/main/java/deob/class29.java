package deob;

@ObfuscatedName("al")
public class class29 {

    @ObfuscatedName("al.f")
    public final int field241;

    @ObfuscatedName("al.h")
    public final class229 field250;

    @ObfuscatedName("al.e")
    public final class229 field242;

    @ObfuscatedName("al.b")
    public final int field245;

    @ObfuscatedName("al.l")
    public final int field244;

    @ObfuscatedName("al.w")
    public final class23 field249;

    @ObfuscatedName("al.d")
    public int field246;

    @ObfuscatedName("al.n")
    public int field247;

    public class29(int arg0, class229 arg1, class229 arg2, class23 arg3) {
        this.field241 = arg0;
        this.field242 = arg1;
        this.field250 = arg2;
        this.field249 = arg3;
        class258 var5 = class258.method3226(this.field241);
        class324 var6 = var5.method4452(false);
        if (var6 == null) {
            this.field245 = 0;
            this.field244 = 0;
        } else {
            this.field245 = var6.field3870;
            this.field244 = var6.field3878;
        }
    }

    @ObfuscatedName("al.f(IIB)Z")
    public boolean method461(int arg0, int arg1) {
        if (this.method463(arg0, arg1)) {
            return true;
        } else {
            return this.method468(arg0, arg1);
        }
    }

    @ObfuscatedName("al.h(IIB)Z")
    public boolean method463(int arg0, int arg1) {
        class258 var3 = class258.method3226(this.field241);
        switch(var3.field3290.field3539) {
            case 0:
                if (arg0 < this.field246 || arg0 >= this.field246 + this.field245) {
                    return false;
                }
                break;
            case 1:
                if (arg0 < this.field246 - this.field245 / 2 || arg0 > this.field245 / 2 + this.field246) {
                    return false;
                }
                break;
            case 2:
                if (arg0 <= this.field246 - this.field245 || arg0 > this.field246) {
                    return false;
                }
        }
        switch(var3.field3298.field3272) {
            case 0:
                if (arg1 >= this.field247 && arg1 < this.field247 + this.field244) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field247 - this.field244 || arg1 > this.field247) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field247 - this.field244 / 2 || arg1 > this.field244 / 2 + this.field247) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("al.e(III)Z")
    public boolean method468(int arg0, int arg1) {
        if (this.field249 == null) {
            return false;
        } else if (arg0 >= this.field246 - this.field249.field187 / 2 && arg0 <= this.field249.field187 / 2 + this.field246) {
            return arg1 >= this.field247 && arg1 <= this.field249.field190 + this.field247;
        } else {
            return false;
        }
    }
}
