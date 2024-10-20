package deob;

@ObfuscatedName("ao")
public abstract class class35 {

    @ObfuscatedName("ao.e")
    public final class214 field277;

    @ObfuscatedName("ao.x")
    public final class214 field278;

    @ObfuscatedName("ao.a")
    public int field279;

    @ObfuscatedName("ao.d")
    public int field282;

    public class35(class214 arg0, class214 arg1) {
        this.field278 = arg0;
        this.field277 = arg1;
    }

    @ObfuscatedName("ao.h(III)Z")
    public boolean method502(int arg0, int arg1) {
        if (this.method507(arg0, arg1)) {
            return true;
        } else {
            return this.method505(arg0, arg1);
        }
    }

    @ObfuscatedName("ao.m(B)Z")
    public boolean method503() {
        return this.method183() >= 0;
    }

    @ObfuscatedName("ao.aa(III)Z")
    public boolean method507(int arg0, int arg1) {
        if (!this.method503()) {
            return false;
        }
        class242 var3 = class242.method103(this.method183());
        int var4 = this.method170();
        int var5 = this.method171();
        switch(var3.field3190.field3427) {
            case 0:
                if (arg0 > this.field279 - var4 && arg0 <= this.field279) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field279 && arg0 < this.field279 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field279 - var4 / 2 || arg0 > var4 / 2 + this.field279) {
                    return false;
                }
        }
        switch(var3.field3200.field3173) {
            case 0:
                if (arg1 > this.field282 - var5 && arg1 <= this.field282) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field282 - var5 / 2 || arg1 > var5 / 2 + this.field282) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field282 || arg1 >= this.field282 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ao.av(III)Z")
    public boolean method505(int arg0, int arg1) {
        class29 var3 = this.method169();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field279 - var3.field230 / 2 && arg0 <= var3.field230 / 2 + this.field279) {
            return arg1 >= this.field282 && arg1 <= this.field282 + var3.field226;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ao.f(B)I")
    public abstract int method183();

    @ObfuscatedName("ao.w(I)I")
    public abstract int method171();

    @ObfuscatedName("ao.y(I)I")
    public abstract int method170();

    @ObfuscatedName("ao.i(I)Law;")
    public abstract class29 method169();
}
