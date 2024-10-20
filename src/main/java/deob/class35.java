package deob;

@ObfuscatedName("ap")
public abstract class class35 {

    @ObfuscatedName("ap.j")
    public final class214 field290;

    @ObfuscatedName("ap.v")
    public final class214 field289;

    @ObfuscatedName("ap.d")
    public int field291;

    @ObfuscatedName("ap.z")
    public int field292;

    public class35(class214 arg0, class214 arg1) {
        this.field289 = arg0;
        this.field290 = arg1;
    }

    @ObfuscatedName("ap.a(IIB)Z")
    public boolean method486(int arg0, int arg1) {
        if (this.method484(arg0, arg1)) {
            return true;
        } else {
            return this.method499(arg0, arg1);
        }
    }

    @ObfuscatedName("ap.b(I)Z")
    public boolean method483() {
        return this.method166() >= 0;
    }

    @ObfuscatedName("ap.ag(III)Z")
    public boolean method484(int arg0, int arg1) {
        if (!this.method483()) {
            return false;
        }
        class242 var3 = class242.method481(this.method166());
        int var4 = this.method174();
        int var5 = this.method164();
        switch(var3.field3202.field3430) {
            case 0:
                if (arg0 >= this.field291 && arg0 < this.field291 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field291 - var4 / 2 && arg0 <= var4 / 2 + this.field291) {
                    break;
                }
                return false;
            case 2:
                if (arg0 <= this.field291 - var4 || arg0 > this.field291) {
                    return false;
                }
        }
        switch(var3.field3203.field3174) {
            case 0:
                if (arg1 >= this.field292 && arg1 < this.field292 + var5) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field292 - var5 || arg1 > this.field292) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field292 - var5 / 2 || arg1 > var5 / 2 + this.field292) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ap.at(IIS)Z")
    public boolean method499(int arg0, int arg1) {
        class29 var3 = this.method162();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field291 - var3.field230 / 2 && arg0 <= var3.field230 / 2 + this.field291) {
            return arg1 >= this.field292 && arg1 <= this.field292 + var3.field231;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ap.c(I)I")
    public abstract int method166();

    @ObfuscatedName("ap.x(I)Lao;")
    public abstract class29 method162();

    @ObfuscatedName("ap.t(I)I")
    public abstract int method174();

    @ObfuscatedName("ap.g(I)I")
    public abstract int method164();
}
