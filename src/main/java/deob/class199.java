package deob;

@ObfuscatedName("gm")
public abstract class class199 {

    @ObfuscatedName("gm.z")
    public final class258 field2194;

    @ObfuscatedName("gm.a")
    public final class258 field2195;

    @ObfuscatedName("gm.u")
    public int field2199;

    @ObfuscatedName("gm.e")
    public int field2197;

    public class199(class258 arg0, class258 arg1) {
        this.field2195 = arg0;
        this.field2194 = arg1;
    }

    @ObfuscatedName("gm.h(III)Z")
    public boolean method3527(int arg0, int arg1) {
        if (this.method3529(arg0, arg1)) {
            return true;
        } else {
            return this.method3538(arg0, arg1);
        }
    }

    @ObfuscatedName("gm.d(I)Z")
    public boolean method3528() {
        return this.method3144() >= 0;
    }

    @ObfuscatedName("gm.q(III)Z")
    public boolean method3529(int arg0, int arg1) {
        if (!this.method3528()) {
            return false;
        }
        class154 var3 = class154.method1007(this.method3144());
        int var4 = this.method3146();
        int var5 = this.method3155();
        switch(var3.field1635.field1701) {
            case 0:
                if (arg0 > this.field2199 - var4 && arg0 <= this.field2199) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field2199 - var4 / 2 && arg0 <= var4 / 2 + this.field2199) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field2199 || arg0 >= this.field2199 + var4) {
                    return false;
                }
        }
        switch(var3.field1627.field1746) {
            case 0:
                if (arg1 >= this.field2197 - var5 / 2 && arg1 <= var5 / 2 + this.field2197) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2197 || arg1 >= this.field2197 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field2197 - var5 || arg1 > this.field2197) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("gm.j(III)Z")
    public boolean method3538(int arg0, int arg1) {
        class194 var3 = this.method3145();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2199 - var3.field2165 / 2 && arg0 <= var3.field2165 / 2 + this.field2199) {
            return arg1 >= this.field2197 && arg1 <= this.field2197 + var3.field2166;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gm.c(B)I")
    public abstract int method3144();

    @ObfuscatedName("gm.m(S)Lgz;")
    public abstract class194 method3145();

    @ObfuscatedName("gm.k(B)I")
    public abstract int method3146();

    @ObfuscatedName("gm.o(I)I")
    public abstract int method3155();
}
