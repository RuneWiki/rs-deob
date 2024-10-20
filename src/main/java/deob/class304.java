package deob;

@ObfuscatedName("ly")
public abstract class class304 {

    @ObfuscatedName("ly.af")
    public final class352 field3256;

    @ObfuscatedName("ly.at")
    public final class352 field3254;

    @ObfuscatedName("ly.au")
    public int field3255;

    @ObfuscatedName("ly.ar")
    public int field3257;

    public class304(class352 arg0, class352 arg1) {
        this.field3254 = arg0;
        this.field3256 = arg1;
    }

    @ObfuscatedName("ly.ay(III)Z")
    public boolean method5634(int arg0, int arg1) {
        if (this.method5622(arg0, arg1)) {
            return true;
        } else {
            return this.method5623(arg0, arg1);
        }
    }

    @ObfuscatedName("ly.aj(B)Z")
    public boolean method5621() {
        return this.method5246() >= 0;
    }

    @ObfuscatedName("ly.av(III)Z")
    public boolean method5622(int arg0, int arg1) {
        if (!this.method5621()) {
            return false;
        }
        class184 var3 = class184.method3200(this.method5246());
        int var4 = this.method5248();
        int var5 = this.method5249();
        switch(var3.field1916.field1987) {
            case 0:
                if (arg0 >= this.field3255 && arg0 < this.field3255 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field3255 - var4 && arg0 <= this.field3255) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field3255 - var4 / 2 || arg0 > var4 / 2 + this.field3255) {
                    return false;
                }
        }
        switch(var3.field1917.field2059) {
            case 0:
                if (arg1 >= this.field3257 - var5 / 2 && arg1 <= var5 / 2 + this.field3257) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field3257 - var5 || arg1 > this.field3257) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field3257 || arg1 >= this.field3257 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ly.aw(IIB)Z")
    public boolean method5623(int arg0, int arg1) {
        class299 var3 = this.method5247();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field3255 - var3.field3222 / 2 && arg0 <= var3.field3222 / 2 + this.field3255) {
            return arg1 >= this.field3257 && arg1 <= this.field3257 + var3.field3223;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ly.ag(B)Lls;")
    public abstract class299 method5247();

    @ObfuscatedName("ly.am(I)I")
    public abstract int method5248();

    @ObfuscatedName("ly.ax(I)I")
    public abstract int method5249();

    @ObfuscatedName("ly.ae(I)I")
    public abstract int method5246();
}
