package deob;

@ObfuscatedName("kv")
public abstract class class276 {

    @ObfuscatedName("kv.ag")
    public final class324 field3043;

    @ObfuscatedName("kv.az")
    public final class324 field3040;

    @ObfuscatedName("kv.av")
    public int field3041;

    @ObfuscatedName("kv.ap")
    public int field3039;

    public class276(class324 arg0, class324 arg1) {
        this.field3040 = arg0;
        this.field3043 = arg1;
    }

    @ObfuscatedName("kv.ao(III)Z")
    public boolean method5043(int arg0, int arg1) {
        if (this.method5046(arg0, arg1)) {
            return true;
        } else {
            return this.method5044(arg0, arg1);
        }
    }

    @ObfuscatedName("kv.ac(I)Z")
    public boolean method5045() {
        return this.method4675() >= 0;
    }

    @ObfuscatedName("kv.ak(III)Z")
    public boolean method5046(int arg0, int arg1) {
        if (!this.method5045()) {
            return false;
        }
        class188 var3 = class188.method3780(this.method4675());
        int var4 = this.method4677();
        int var5 = this.method4678();
        switch(var3.field1929.field1987) {
            case 0:
                if (arg0 >= this.field3041 - var4 / 2 && arg0 <= var4 / 2 + this.field3041) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field3041 - var4 && arg0 <= this.field3041) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field3041 || arg0 >= this.field3041 + var4) {
                    return false;
                }
        }
        switch(var3.field1927.field2044) {
            case 0:
                if (arg1 > this.field3039 - var5 && arg1 <= this.field3039) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field3039 || arg1 >= this.field3039 + var5) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field3039 - var5 / 2 || arg1 > var5 / 2 + this.field3039) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("kv.an(IIB)Z")
    public boolean method5044(int arg0, int arg1) {
        class271 var3 = this.method4680();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field3041 - var3.field3011 / 2 && arg0 <= var3.field3011 / 2 + this.field3041) {
            return arg1 >= this.field3039 && arg1 <= this.field3039 + var3.field3010;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kv.ar(S)Lka;")
    public abstract class271 method4680();

    @ObfuscatedName("kv.am(B)I")
    public abstract int method4677();

    @ObfuscatedName("kv.as(I)I")
    public abstract int method4678();

    @ObfuscatedName("kv.ay(I)I")
    public abstract int method4675();
}
