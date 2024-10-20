package deob;

@ObfuscatedName("jq")
public abstract class class258 {

    @ObfuscatedName("jq.ag")
    public final class337 field2664;

    @ObfuscatedName("jq.ao")
    public final class337 field2668;

    @ObfuscatedName("jq.ae")
    public int field2663;

    @ObfuscatedName("jq.aa")
    public int field2665;

    public class258(class337 arg0, class337 arg1) {
        this.field2668 = arg0;
        this.field2664 = arg1;
    }

    @ObfuscatedName("jq.ak(III)Z")
    public boolean method4591(int arg0, int arg1) {
        if (this.method4597(arg0, arg1)) {
            return true;
        } else {
            return this.method4593(arg0, arg1);
        }
    }

    @ObfuscatedName("jq.ay(I)Z")
    public boolean method4592() {
        return this.method4226() >= 0;
    }

    @ObfuscatedName("jq.as(III)Z")
    public boolean method4597(int arg0, int arg1) {
        if (!this.method4592()) {
            return false;
        }
        class178 var3 = class178.method7281(this.method4226());
        int var4 = this.method4237();
        int var5 = this.method4224();
        switch(var3.field1858.field1934) {
            case 0:
                if (arg0 > this.field2663 - var4 && arg0 <= this.field2663) {
                    break;
                }
                return false;
            case 1:
                if (arg0 >= this.field2663 && arg0 < this.field2663 + var4) {
                    break;
                }
                return false;
            case 2:
                if (arg0 < this.field2663 - var4 / 2 || arg0 > var4 / 2 + this.field2663) {
                    return false;
                }
        }
        switch(var3.field1859.field2004) {
            case 0:
                if (arg1 > this.field2665 - var5 && arg1 <= this.field2665) {
                    break;
                }
                return false;
            case 1:
                if (arg1 < this.field2665 - var5 / 2 || arg1 > var5 / 2 + this.field2665) {
                    return false;
                }
                break;
            case 2:
                if (arg1 < this.field2665 || arg1 >= this.field2665 + var5) {
                    return false;
                }
        }
        return true;
    }

    @ObfuscatedName("jq.ab(III)Z")
    public boolean method4593(int arg0, int arg1) {
        class253 var3 = this.method4227();
        if (var3 == null) {
            return false;
        } else if (arg0 >= this.field2663 - var3.field2640 / 2 && arg0 <= var3.field2640 / 2 + this.field2663) {
            return arg1 >= this.field2665 && arg1 <= this.field2665 + var3.field2639;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jq.ap(I)I")
    public abstract int method4226();

    @ObfuscatedName("jq.aj(B)I")
    public abstract int method4237();

    @ObfuscatedName("jq.aq(I)I")
    public abstract int method4224();

    @ObfuscatedName("jq.af(I)Ljz;")
    public abstract class253 method4227();
}
