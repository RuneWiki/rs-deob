package deob;

@ObfuscatedName("la")
public abstract class class302 {

    @ObfuscatedName("la.am")
    public final class350 field3211;

    @ObfuscatedName("la.ac")
    public final class350 field3209;

    @ObfuscatedName("la.ae")
    public int field3207;

    @ObfuscatedName("la.ad")
    public int field3210;

    public class302(class350 arg0, class350 arg1) {
        this.field3209 = arg0;
        this.field3211 = arg1;
    }

    @ObfuscatedName("la.ah(IIB)Z")
    public boolean method5482(int arg0, int arg1) {
        if (this.method5485(arg0, arg1)) {
            return true;
        } else {
            return this.method5486(arg0, arg1);
        }
    }

    @ObfuscatedName("la.ag(I)Z")
    public boolean method5484() {
        return this.method5108() >= 0;
    }

    @ObfuscatedName("la.av(IIB)Z")
    public boolean method5485(int arg0, int arg1) {
        if (!this.method5484()) {
            return false;
        }
        class235 var3 = class235.method2700(this.method5108());
        int var4 = this.method5102();
        int var5 = this.method5103();
        switch(var3.field2483.field2553) {
            case 0:
                if (arg0 >= this.field3207 - var4 / 2 && arg0 <= var4 / 2 + this.field3207) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field3207 - var4 && arg0 <= this.field3207) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field3207 || arg0 >= this.field3207 + var4) {
                    return false;
                }
        }
        switch(var3.field2484.field2622) {
            case 0:
                if (arg1 >= this.field3210 && arg1 < this.field3210 + var5) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field3210 - var5 || arg1 > this.field3210) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field3210 - var5 / 2 || arg1 > var5 / 2 + this.field3210) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("la.ar(IIB)Z")
    public boolean method5486(int arg0, int arg1) {
        class297 var3 = this.method5101();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field3207 - var3.field3183 / 2 && arg0 <= var3.field3183 / 2 + this.field3207) {
            return arg1 >= this.field3210 && arg1 <= this.field3210 + var3.field3184;
        } else {
            return false;
        }
    }

    @ObfuscatedName("la.ay(B)I")
    public abstract int method5108();

    @ObfuscatedName("la.an(I)Llk;")
    public abstract class297 method5101();

    @ObfuscatedName("la.ax(S)I")
    public abstract int method5103();

    @ObfuscatedName("la.au(B)I")
    public abstract int method5102();
}
