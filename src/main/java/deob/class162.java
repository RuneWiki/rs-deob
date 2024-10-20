package deob;

@ObfuscatedName("fg")
public abstract class class162 {

    @ObfuscatedName("fg.k")
    public final class221 field1759;

    @ObfuscatedName("fg.g")
    public final class221 field1758;

    @ObfuscatedName("fg.h")
    public int field1760;

    @ObfuscatedName("fg.n")
    public int field1761;

    public class162(class221 arg0, class221 arg1) {
        this.field1758 = arg0;
        this.field1759 = arg1;
    }

    @ObfuscatedName("fg.x(IIB)Z")
    public boolean method2756(int arg0, int arg1) {
        if (this.method2767(arg0, arg1)) {
            return true;
        } else {
            return this.method2758(arg0, arg1);
        }
    }

    @ObfuscatedName("fg.z(I)Z")
    public boolean method2761() {
        return this.method2372() >= 0;
    }

    @ObfuscatedName("fg.i(IIB)Z")
    public boolean method2767(int arg0, int arg1) {
        if (!this.method2761()) {
            return false;
        }
        class280 var3 = class280.method4995(this.method2372());
        int var4 = this.method2370();
        int var5 = this.method2375();
        switch(var3.field3410.field3471) {
            case 0:
                if (arg0 > this.field1760 - var4 && arg0 <= this.field1760) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field1760 - var4 / 2 && arg0 <= var4 / 2 + this.field1760) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field1760 || arg0 >= this.field1760 + var4) {
                    return false;
                }
        }
        switch(var3.field3422.field3516) {
            case 0:
                if (arg1 >= this.field1761 - var5 / 2 && arg1 <= var5 / 2 + this.field1761) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field1761 - var5 || arg1 > this.field1761) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field1761 || arg1 >= this.field1761 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("fg.a(III)Z")
    public boolean method2758(int arg0, int arg1) {
        class157 var3 = this.method2366();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field1760 - var3.field1728 / 2 && arg0 <= var3.field1728 / 2 + this.field1760) {
            return arg1 >= this.field1761 && arg1 <= this.field1761 + var3.field1729;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fg.u(I)Lfi;")
    public abstract class157 method2366();

    @ObfuscatedName("fg.p(I)I")
    public abstract int method2370();

    @ObfuscatedName("fg.b(I)I")
    public abstract int method2375();

    @ObfuscatedName("fg.o(B)I")
    public abstract int method2372();
}
