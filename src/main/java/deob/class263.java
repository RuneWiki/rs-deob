package deob;

@ObfuscatedName("ku")
public abstract class class263 {

    @ObfuscatedName("ku.av")
    public final class304 field3013;

    @ObfuscatedName("ku.aq")
    public final class304 field3008;

    @ObfuscatedName("ku.ap")
    public int field3009;

    @ObfuscatedName("ku.ar")
    public int field3010;

    public class263(class304 arg0, class304 arg1) {
        this.field3008 = arg0;
        this.field3013 = arg1;
    }

    @ObfuscatedName("ku.au(III)Z")
    public boolean method4808(int arg0, int arg1) {
        if (this.method4805(arg0, arg1)) {
            return true;
        } else {
            return this.method4803(arg0, arg1);
        }
    }

    @ObfuscatedName("ku.ag(S)Z")
    public boolean method4804() {
        return this.method4426() >= 0;
    }

    @ObfuscatedName("ku.at(III)Z")
    public boolean method4805(int arg0, int arg1) {
        if (!this.method4804()) {
            return false;
        }
        class185 var3 = class185.method2778(this.method4426());
        int var4 = this.method4428();
        int var5 = this.method4429();
        switch(var3.field1912.field1981) {
            case 0:
                if (arg0 > this.field3009 - var4 && arg0 <= this.field3009) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field3009 && arg0 < this.field3009 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field3009 - var4 / 2 || arg0 > var4 / 2 + this.field3009) {
                    return false;
                }
        }
        switch(var3.field1911.field2040) {
            case 0:
                if (arg1 >= this.field3010 && arg1 < this.field3010 + var5) {
                    break;
                }
                return false;
            case 1:
                if (arg1 <= this.field3010 - var5 || arg1 > this.field3010) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field3010 - var5 / 2 || arg1 > var5 / 2 + this.field3010) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("ku.af(IIB)Z")
    public boolean method4803(int arg0, int arg1) {
        class258 var3 = this.method4427();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field3009 - var3.field2974 / 2 && arg0 <= var3.field2974 / 2 + this.field3009) {
            return arg1 >= this.field3010 && arg1 <= this.field3010 + var3.field2978;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ku.ac(I)Ljb;")
    public abstract class258 method4427();

    @ObfuscatedName("ku.ab(I)I")
    public abstract int method4428();

    @ObfuscatedName("ku.an(B)I")
    public abstract int method4429();

    @ObfuscatedName("ku.al(B)I")
    public abstract int method4426();
}
