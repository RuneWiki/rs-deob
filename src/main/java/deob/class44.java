package deob;

@ObfuscatedName("af")
public abstract class class44 {

    @ObfuscatedName("af.n")
    public final class223 field321;

    @ObfuscatedName("af.u")
    public final class223 field318;

    @ObfuscatedName("af.a")
    public int field319;

    @ObfuscatedName("af.z")
    public int field320;

    public class44(class223 arg0, class223 arg1) {
        this.field318 = arg0;
        this.field321 = arg1;
    }

    @ObfuscatedName("af.t(III)Z")
    public boolean method557(int arg0, int arg1) {
        if (this.method560(arg0, arg1)) {
            return true;
        } else {
            return this.method561(arg0, arg1);
        }
    }

    @ObfuscatedName("af.x(I)Z")
    public boolean method559() {
        return this.method224() >= 0;
    }

    @ObfuscatedName("af.ah(III)Z")
    public boolean method560(int arg0, int arg1) {
        if (!this.method559()) {
            return false;
        }
        class252 var3 = class252.method1412(this.method224());
        int var4 = this.method235();
        int var5 = this.method223();
        switch(var3.field3257.field3491) {
            case 0:
                if (arg0 >= this.field319 && arg0 < this.field319 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field319 - var4 / 2 && arg0 <= var4 / 2 + this.field319) {
                    break;
                }
                return false;
            case 2:
                if (arg0 <= this.field319 - var4 || arg0 > this.field319) {
                    return false;
                }
        }
        switch(var3.field3241.field3228) {
            case 0:
                if (arg1 >= this.field320 && arg1 < this.field320 + var5) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field320 - var5 / 2 || arg1 > var5 / 2 + this.field320) {
                    return false;
                }
                break;
            case 2:
                if (arg1 <= this.field320 - var5 || arg1 > this.field320) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("af.ai(IIB)Z")
    public boolean method561(int arg0, int arg1) {
        class38 var3 = this.method225();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field319 - var3.field267 / 2 && arg0 <= var3.field267 / 2 + this.field319) {
            return arg1 >= this.field320 && arg1 <= this.field320 + var3.field268;
        } else {
            return false;
        }
    }

    @ObfuscatedName("af.m(B)I")
    public abstract int method224();

    @ObfuscatedName("af.j(I)I")
    public abstract int method223();

    @ObfuscatedName("af.q(I)I")
    public abstract int method235();

    @ObfuscatedName("af.o(B)Lar;")
    public abstract class38 method225();
}
