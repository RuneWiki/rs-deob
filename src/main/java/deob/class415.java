package deob;

@ObfuscatedName("po")
public class class415 {

    @ObfuscatedName("po.am")
    public class411 field4576;

    @ObfuscatedName("po.ap")
    public int field4573 = 0;

    @ObfuscatedName("po.af")
    public int field4578 = 0;

    public class415(class411 arg0, int arg1, int arg2) {
        this.field4576 = arg0;
        this.field4573 = arg1;
        this.field4578 = arg2;
    }

    @ObfuscatedName("po.am(I)Ljava/lang/String;")
    public String method7222() {
        if (this.method7221()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7234());
        for (int var2 = this.field4573; var2 < this.field4578; var2++) {
            class413 var3 = this.field4576.method6950(var2);
            var1.append(var3.field4546);
        }
        return var1.toString();
    }

    @ObfuscatedName("po.ap(IB)Z")
    public boolean method7220(int arg0) {
        return this.field4576.method7046() == 2 || this.field4576.method7046() == 1 && (!this.field4576.field4539 || this.field4578 - 1 != arg0);
    }

    @ObfuscatedName("po.af(B)Z")
    public boolean method7221() {
        return this.field4578 == this.field4573;
    }

    @ObfuscatedName("po.aj(B)I")
    public int method7234() {
        return this.field4578 - this.field4573;
    }

    @ObfuscatedName("po.aq(Lpc;I)Z")
    public boolean method7223(class413 arg0) {
        if (this.field4576.field4529 == 2) {
            return true;
        } else if (this.field4576.field4529 == 0) {
            return false;
        } else {
            return this.field4576.method6951() != arg0;
        }
    }

    @ObfuscatedName("po.ar(I)I")
    public int method7224() {
        if (this.method7221()) {
            return 0;
        }
        class413 var1 = this.field4576.method6950(this.field4578 - 1);
        if (var1.field4546 == '\n') {
            return 0;
        } else if (this.method7223(var1)) {
            return this.field4576.field4530.field4566[42];
        } else {
            int var2 = this.field4576.field4530.field4566[var1.field4546];
            if (var2 == 0) {
                return var1.field4546 == '\t' ? this.field4576.field4530.field4566[32] * 3 : this.field4576.field4530.field4566[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("po.ag(I)Ltg;")
    public class502 method7225() {
        if (this.method7221()) {
            return new class502(0, 0);
        } else {
            class413 var1 = this.field4576.method6950(this.field4578 - 1);
            return new class502(var1.field4545 + this.method7224(), var1.field4547);
        }
    }

    @ObfuscatedName("po.ao(II)Lpc;")
    public class413 method7241(int arg0) {
        return arg0 >= 0 && arg0 < this.method7234() ? this.field4576.method6950(this.field4573 + arg0) : null;
    }
}
