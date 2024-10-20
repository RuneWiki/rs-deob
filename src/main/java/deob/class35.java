package deob;

@ObfuscatedName("am")
public abstract class class35 {

    @ObfuscatedName("am.c")
    public final class214 field283;

    @ObfuscatedName("am.o")
    public final class214 field282;

    @ObfuscatedName("am.i")
    public int field284;

    @ObfuscatedName("am.d")
    public int field285;

    public class35(class214 arg0, class214 arg1) {
        this.field282 = arg0;
        this.field283 = arg1;
    }

    @ObfuscatedName("am.e(III)Z")
    public boolean method548(int arg0, int arg1) {
        if (this.method552(arg0, arg1)) {
            return true;
        } else {
            return this.method559(arg0, arg1);
        }
    }

    @ObfuscatedName("am.s(I)Z")
    public boolean method550() {
        return this.method210() >= 0;
    }

    @ObfuscatedName("am.b(III)Z")
    public boolean method552(int arg0, int arg1) {
        if (!this.method550()) {
            return false;
        }
        class242 var3 = class242.method1149(this.method210());
        int var4 = this.method208();
        int var5 = this.method206();
        switch(var3.field3198.field3449) {
            case 0:
                if (arg0 > this.field284 - var4 && arg0 <= this.field284) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field284 - var4 / 2 && arg0 <= var4 / 2 + this.field284) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field284 || arg0 >= this.field284 + var4) {
                    return false;
                }
        }
        switch(var3.field3213.field3186) {
            case 0:
                if (arg1 > this.field285 - var5 && arg1 <= this.field285) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field285 - var5 / 2 || arg1 > var5 / 2 + this.field285) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field285 || arg1 >= this.field285 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("am.w(III)Z")
    public boolean method559(int arg0, int arg1) {
        class29 var3 = this.method207();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field284 - var3.field227 / 2 && arg0 <= var3.field227 / 2 + this.field284) {
            return arg1 >= this.field285 && arg1 <= this.field285 + var3.field228;
        } else {
            return false;
        }
    }

    @ObfuscatedName("am.q(B)I")
    public abstract int method206();

    @ObfuscatedName("am.n(I)I")
    public abstract int method208();

    @ObfuscatedName("am.a(I)I")
    public abstract int method210();

    @ObfuscatedName("am.t(I)Lar;")
    public abstract class29 method207();
}
