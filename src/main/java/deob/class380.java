package deob;

@ObfuscatedName("on")
public class class380 {

    @ObfuscatedName("on.aj")
    public class376 field4408;

    @ObfuscatedName("on.al")
    public int field4405 = 0;

    @ObfuscatedName("on.ac")
    public int field4407 = 0;

    public class380(class376 arg0, int arg1, int arg2) {
        this.field4408 = arg0;
        this.field4405 = arg1;
        this.field4407 = arg2;
    }

    @ObfuscatedName("on.aj(I)Ljava/lang/String;")
    public String method6643() {
        if (this.method6645()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6646());
        for (int var2 = this.field4405; var2 < this.field4407; var2++) {
            class378 var3 = this.field4408.method6525(var2);
            var1.append(var3.field4381);
        }
        return var1.toString();
    }

    @ObfuscatedName("on.al(II)Z")
    public boolean method6644(int arg0) {
        return this.field4408.method6513() == 2 || this.field4408.method6513() == 1 && (!this.field4408.field4372 || this.field4407 - 1 != arg0);
    }

    @ObfuscatedName("on.ac(I)Z")
    public boolean method6645() {
        return this.field4407 == this.field4405;
    }

    @ObfuscatedName("on.ab(B)I")
    public int method6646() {
        return this.field4407 - this.field4405;
    }

    @ObfuscatedName("on.an(Lod;I)Z")
    public boolean method6647(class378 arg0) {
        if (this.field4408.field4376 == 2) {
            return true;
        } else if (this.field4408.field4376 == 0) {
            return false;
        } else {
            return this.field4408.method6402() != arg0;
        }
    }

    @ObfuscatedName("on.ao(I)I")
    public int method6661() {
        if (this.method6645()) {
            return 0;
        }
        class378 var1 = this.field4408.method6525(this.field4407 - 1);
        if (var1.field4381 == '\n') {
            return 0;
        } else if (this.method6647(var1)) {
            return this.field4408.field4373.field4384[42];
        } else {
            int var2 = this.field4408.field4373.field4384[var1.field4381];
            if (var2 == 0) {
                return var1.field4381 == '\t' ? this.field4408.field4373.field4384[32] * 3 : this.field4408.field4373.field4384[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("on.av(B)Lrv;")
    public class452 method6667() {
        if (this.method6645()) {
            return new class452(0, 0);
        } else {
            class378 var1 = this.field4408.method6525(this.field4407 - 1);
            return new class452(var1.field4380 + this.method6661(), var1.field4379);
        }
    }

    @ObfuscatedName("on.aq(IB)Lod;")
    public class378 method6650(int arg0) {
        return arg0 >= 0 && arg0 < this.method6646() ? this.field4408.method6525(this.field4405 + arg0) : null;
    }
}
