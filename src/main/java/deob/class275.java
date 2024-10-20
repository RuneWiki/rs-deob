package deob;

@ObfuscatedName("kp")
public abstract class class275 {

    @ObfuscatedName("kp.az")
    public final class323 field3058;

    @ObfuscatedName("kp.ap")
    public final class323 field3059;

    @ObfuscatedName("kp.aa")
    public int field3060;

    @ObfuscatedName("kp.af")
    public int field3061;

    public class275(class323 arg0, class323 arg1) {
        this.field3059 = arg0;
        this.field3058 = arg1;
    }

    @ObfuscatedName("kp.bh(III)Z")
    public boolean method5073(int arg0, int arg1) {
        if (this.method5075(arg0, arg1)) {
            return true;
        } else {
            return this.method5078(arg0, arg1);
        }
    }

    @ObfuscatedName("kp.bj(I)Z")
    public boolean method5074() {
        return this.method4685() >= 0;
    }

    @ObfuscatedName("kp.bk(III)Z")
    public boolean method5075(int arg0, int arg1) {
        if (!this.method5074()) {
            return false;
        }
        class188 var3 = class188.method2945(this.method4685());
        int var4 = this.method4687();
        int var5 = this.method4698();
        switch(var3.field1966.field2020) {
            case 0:
                if (arg0 > this.field3060 - var4 && arg0 <= this.field3060) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field3060 && arg0 < this.field3060 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field3060 - var4 / 2 || arg0 > var4 / 2 + this.field3060) {
                    return false;
                }
        }
        switch(var3.field1960.field2079) {
            case 0:
                if (arg1 >= this.field3061 - var5 / 2 && arg1 <= var5 / 2 + this.field3061) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field3061 - var5 || arg1 > this.field3061) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field3061 || arg1 >= this.field3061 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("kp.bv(III)Z")
    public boolean method5078(int arg0, int arg1) {
        class270 var3 = this.method4686();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field3060 - var3.field3035 / 2 && arg0 <= var3.field3035 / 2 + this.field3060) {
            return arg1 >= this.field3061 && arg1 <= this.field3061 + var3.field3033;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kp.ae(I)I")
    public abstract int method4685();

    @ObfuscatedName("kp.ac(I)I")
    public abstract int method4698();

    @ObfuscatedName("kp.ao(I)Lkq;")
    public abstract class270 method4686();

    @ObfuscatedName("kp.at(I)I")
    public abstract int method4687();
}
