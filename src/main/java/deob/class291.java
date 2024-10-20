package deob;

@ObfuscatedName("lh")
public abstract class class291 {

    @ObfuscatedName("lh.ab")
    public final class339 field3149;

    @ObfuscatedName("lh.aw")
    public final class339 field3154;

    @ObfuscatedName("lh.ad")
    public int field3150;

    @ObfuscatedName("lh.al")
    public int field3151;

    public class291(class339 arg0, class339 arg1) {
        this.field3154 = arg0;
        this.field3149 = arg1;
    }

    @ObfuscatedName("lh.aj(IIB)Z")
    public boolean method5219(int arg0, int arg1) {
        if (this.method5221(arg0, arg1)) {
            return true;
        } else {
            return this.method5224(arg0, arg1);
        }
    }

    @ObfuscatedName("lh.au(B)Z")
    public boolean method5220() {
        return this.method4842() >= 0;
    }

    @ObfuscatedName("lh.ay(III)Z")
    public boolean method5221(int arg0, int arg1) {
        if (!this.method5220()) {
            return false;
        }
        class197 var3 = class197.method5698(this.method4842());
        int var4 = this.method4843();
        int var5 = this.method4847();
        switch(var3.field2021.field2089) {
            case 0:
                if (arg0 >= this.field3150 && arg0 < this.field3150 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field3150 - var4 && arg0 <= this.field3150) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field3150 - var4 / 2 || arg0 > var4 / 2 + this.field3150) {
                    return false;
                }
        }
        switch(var3.field2022.field2154) {
            case 0:
                if (arg1 > this.field3151 - var5 && arg1 <= this.field3151) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field3151 || arg1 >= this.field3151 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field3151 - var5 / 2 || arg1 > var5 / 2 + this.field3151) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("lh.ap(III)Z")
    public boolean method5224(int arg0, int arg1) {
        class286 var3 = this.method4839();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field3150 - var3.field3123 / 2 && arg0 <= var3.field3123 / 2 + this.field3150) {
            return arg1 >= this.field3151 && arg1 <= this.field3151 + var3.field3124;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lh.ah(I)I")
    public abstract int method4842();

    @ObfuscatedName("lh.at(I)I")
    public abstract int method4843();

    @ObfuscatedName("lh.an(I)I")
    public abstract int method4847();

    @ObfuscatedName("lh.af(I)Lkz;")
    public abstract class286 method4839();
}
