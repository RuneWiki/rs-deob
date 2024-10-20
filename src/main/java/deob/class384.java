package deob;

@ObfuscatedName("oa")
public class class384 {

    @ObfuscatedName("oa.af")
    public class380 field4458;

    @ObfuscatedName("oa.an")
    public int field4455 = 0;

    @ObfuscatedName("oa.aw")
    public int field4456 = 0;

    public class384(class380 arg0, int arg1, int arg2) {
        this.field4458 = arg0;
        this.field4455 = arg1;
        this.field4456 = arg2;
    }

    @ObfuscatedName("oa.af(I)Ljava/lang/String;")
    public String method6872() {
        if (this.method6863()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6864());
        for (int var2 = this.field4455; var2 < this.field4456; var2++) {
            class382 var3 = this.field4458.method6618(var2);
            var1.append(var3.field4429);
        }
        return var1.toString();
    }

    @ObfuscatedName("oa.an(II)Z")
    public boolean method6866(int arg0) {
        return this.field4458.method6649() == 2 || this.field4458.method6649() == 1 && (!this.field4458.field4416 || this.field4456 - 1 != arg0);
    }

    @ObfuscatedName("oa.aw(I)Z")
    public boolean method6863() {
        return this.field4456 == this.field4455;
    }

    @ObfuscatedName("oa.ac(B)I")
    public int method6864() {
        return this.field4456 - this.field4455;
    }

    @ObfuscatedName("oa.au(Lom;I)Z")
    public boolean method6871(class382 arg0) {
        if (this.field4458.field4420 == 2) {
            return true;
        } else if (this.field4458.field4420 == 0) {
            return false;
        } else {
            return this.field4458.method6648() != arg0;
        }
    }

    @ObfuscatedName("oa.ab(I)I")
    public int method6874() {
        if (this.method6863()) {
            return 0;
        }
        class382 var1 = this.field4458.method6618(this.field4456 - 1);
        if (var1.field4429 == '\n') {
            return 0;
        } else if (this.method6871(var1)) {
            return this.field4458.field4410.field4434[42];
        } else {
            int var2 = this.field4458.field4410.field4434[var1.field4429];
            if (var2 == 0) {
                return var1.field4429 == '\t' ? this.field4458.field4410.field4434[32] * 3 : this.field4458.field4410.field4434[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("oa.aq(B)Lrg;")
    public class462 method6862() {
        if (this.method6863()) {
            return new class462(0, 0);
        } else {
            class382 var1 = this.field4458.method6618(this.field4456 - 1);
            return new class462(var1.field4428 + this.method6874(), var1.field4431);
        }
    }

    @ObfuscatedName("oa.al(II)Lom;")
    public class382 method6865(int arg0) {
        return arg0 >= 0 && arg0 < this.method6864() ? this.field4458.method6618(this.field4455 + arg0) : null;
    }
}
