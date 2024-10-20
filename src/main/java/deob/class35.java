package deob;

@ObfuscatedName("ak")
public abstract class class35 {

    @ObfuscatedName("ak.c")
    public final class234 field289;

    @ObfuscatedName("ak.z")
    public final class234 field288;

    @ObfuscatedName("ak.j")
    public int field290;

    @ObfuscatedName("ak.d")
    public int field291;

    public class35(class234 arg0, class234 arg1) {
        this.field288 = arg0;
        this.field289 = arg1;
    }

    @ObfuscatedName("ak.u(III)Z")
    public boolean method502(int arg0, int arg1) {
        if (this.method505(arg0, arg1)) {
            return true;
        } else {
            return this.method504(arg0, arg1);
        }
    }

    @ObfuscatedName("ak.aa(I)Z")
    public boolean method508() {
        return this.method185() >= 0;
    }

    @ObfuscatedName("ak.ai(III)Z")
    public boolean method505(int arg0, int arg1) {
        if (!this.method508()) {
            return false;
        }
        class262 var3 = class262.method106(this.method185());
        int var4 = this.method187();
        int var5 = this.method193();
        switch(var3.field3325.field3547) {
            case 0:
                if (arg0 > this.field290 - var4 && arg0 <= this.field290) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field290 && arg0 < this.field290 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field290 - var4 / 2 || arg0 > var4 / 2 + this.field290) {
                    return false;
                }
        }
        switch(var3.field3323.field3293) {
            case 0:
                if (arg1 > this.field291 - var5 && arg1 <= this.field291) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field291 || arg1 >= this.field291 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field291 - var5 / 2 || arg1 > var5 / 2 + this.field291) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ak.ag(IIB)Z")
    public boolean method504(int arg0, int arg1) {
        class29 var3 = this.method200();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field290 - var3.field224 / 2 && arg0 <= var3.field224 / 2 + this.field290) {
            return arg1 >= this.field291 && arg1 <= this.field291 + var3.field225;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ak.n(I)I")
    public abstract int method185();

    @ObfuscatedName("ak.h(B)Lag;")
    public abstract class29 method200();

    @ObfuscatedName("ak.g(B)I")
    public abstract int method193();

    @ObfuscatedName("ak.l(I)I")
    public abstract int method187();
}
