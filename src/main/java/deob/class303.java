package deob;

@ObfuscatedName("lx")
public abstract class class303 {

    @ObfuscatedName("lx.as")
    public final class351 field3260;

    @ObfuscatedName("lx.ae")
    public final class351 field3259;

    @ObfuscatedName("lx.am")
    public int field3261;

    @ObfuscatedName("lx.at")
    public int field3262;

    public class303(class351 arg0, class351 arg1) {
        this.field3259 = arg0;
        this.field3260 = arg1;
    }

    @ObfuscatedName("lx.ar(IIB)Z")
    public boolean method5825(int arg0, int arg1) {
        if (this.method5826(arg0, arg1)) {
            return true;
        } else {
            return this.method5834(arg0, arg1);
        }
    }

    @ObfuscatedName("lx.ab(B)Z")
    public boolean method5824() {
        return this.method5469() >= 0;
    }

    @ObfuscatedName("lx.az(III)Z")
    public boolean method5826(int arg0, int arg1) {
        if (!this.method5824()) {
            return false;
        }
        class184 var3 = class184.method174(this.method5469());
        int var4 = this.method5463();
        int var5 = this.method5464();
        switch(var3.field1932.field1988) {
            case 0:
                if (arg0 >= this.field3261 && arg0 < this.field3261 + var4) {
                    break;
                }
                return false;
            case 1:
                if (arg0 > this.field3261 - var4 && arg0 <= this.field3261) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field3261 - var4 / 2 || arg0 > var4 / 2 + this.field3261) {
                    return false;
                }
        }
        switch(var3.field1927.field2058) {
            case 0:
                if (arg1 > this.field3262 - var5 && arg1 <= this.field3262) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field3262 - var5 / 2 || arg1 > var5 / 2 + this.field3262) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field3262 || arg1 >= this.field3262 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("lx.ag(IIB)Z")
    public boolean method5834(int arg0, int arg1) {
        class298 var3 = this.method5473();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field3261 - var3.field3235 / 2 && arg0 <= var3.field3235 / 2 + this.field3261) {
            return arg1 >= this.field3262 && arg1 <= this.field3262 + var3.field3237;
        } else {
            return false;
        }
    }

    @ObfuscatedName("lx.aw(I)I")
    public abstract int method5469();

    @ObfuscatedName("lx.ak(S)Llp;")
    public abstract class298 method5473();

    @ObfuscatedName("lx.ai(I)I")
    public abstract int method5464();

    @ObfuscatedName("lx.aj(I)I")
    public abstract int method5463();
}
