package deob;

@ObfuscatedName("aj")
public abstract class class44 {

    @ObfuscatedName("aj.z")
    public final class223 field319;

    @ObfuscatedName("aj.e")
    public final class223 field320;

    @ObfuscatedName("aj.q")
    public int field318;

    @ObfuscatedName("aj.l")
    public int field321;

    public class44(class223 arg0, class223 arg1) {
        this.field320 = arg0;
        this.field319 = arg1;
    }

    @ObfuscatedName("aj.i(IIB)Z")
    public boolean method598(int arg0, int arg1) {
        if (this.method600(arg0, arg1)) {
            return true;
        } else {
            return this.method601(arg0, arg1);
        }
    }

    @ObfuscatedName("aj.x(B)Z")
    public boolean method611() {
        return this.method250() >= 0;
    }

    @ObfuscatedName("aj.g(IIB)Z")
    public boolean method600(int arg0, int arg1) {
        if (!this.method611()) {
            return false;
        }
        class253 var3 = class253.method4155(this.method250());
        int var4 = this.method258();
        int var5 = this.method253();
        switch(var3.field3264.field3492) {
            case 0:
                if (arg0 > this.field318 - var4 && arg0 <= this.field318) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field318 && arg0 < this.field318 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field318 - var4 / 2 || arg0 > var4 / 2 + this.field318) {
                    return false;
                }
        }
        switch(var3.field3265.field3234) {
            case 0:
                if (arg1 > this.field321 - var5 && arg1 <= this.field321) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field321 || arg1 >= this.field321 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field321 - var5 / 2 || arg1 > var5 / 2 + this.field321) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("aj.u(III)Z")
    public boolean method601(int arg0, int arg1) {
        class38 var3 = this.method251();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field318 - var3.field265 / 2 && arg0 <= var3.field265 / 2 + this.field318) {
            return arg1 >= this.field321 && arg1 <= this.field321 + var3.field264;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aj.d(I)I")
    public abstract int method258();

    @ObfuscatedName("aj.c(I)I")
    public abstract int method253();

    @ObfuscatedName("aj.v(S)Laa;")
    public abstract class38 method251();

    @ObfuscatedName("aj.n(B)I")
    public abstract int method250();
}
