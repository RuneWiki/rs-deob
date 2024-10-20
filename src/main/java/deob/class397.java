package deob;

@ObfuscatedName("pw")
public class class397 {

    @ObfuscatedName("pw.at")
    public class393 field4468;

    @ObfuscatedName("pw.an")
    public int field4471 = 0;

    @ObfuscatedName("pw.av")
    public int field4470 = 0;

    public class397(class393 arg0, int arg1, int arg2) {
        this.field4468 = arg0;
        this.field4471 = arg1;
        this.field4470 = arg2;
    }

    @ObfuscatedName("pw.at(B)Ljava/lang/String;")
    public String method6874() {
        if (this.method6876()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6894());
        for (int var2 = this.field4471; var2 < this.field4470; var2++) {
            class395 var3 = this.field4468.method6618(var2);
            var1.append(var3.field4439);
        }
        return var1.toString();
    }

    @ObfuscatedName("pw.an(II)Z")
    public boolean method6887(int arg0) {
        return this.field4468.method6734() == 2 || this.field4468.method6734() == 1 && (!this.field4468.field4429 || this.field4470 - 1 != arg0);
    }

    @ObfuscatedName("pw.av(B)Z")
    public boolean method6876() {
        return this.field4471 == this.field4470;
    }

    @ObfuscatedName("pw.as(I)I")
    public int method6894() {
        return this.field4470 - this.field4471;
    }

    @ObfuscatedName("pw.ax(Lpb;I)Z")
    public boolean method6878(class395 arg0) {
        if (this.field4468.field4433 == 2) {
            return true;
        } else if (this.field4468.field4433 == 0) {
            return false;
        } else {
            return this.field4468.method6619() != arg0;
        }
    }

    @ObfuscatedName("pw.ap(I)I")
    public int method6879() {
        if (this.method6876()) {
            return 0;
        }
        class395 var1 = this.field4468.method6618(this.field4470 - 1);
        if (var1.field4439 == '\n') {
            return 0;
        } else if (this.method6878(var1)) {
            return this.field4468.field4432.field4458[42];
        } else {
            int var2 = this.field4468.field4432.field4458[var1.field4439];
            if (var2 == 0) {
                return var1.field4439 == '\t' ? this.field4468.field4432.field4458[32] * 3 : this.field4468.field4432.field4458[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("pw.ab(I)Lsf;")
    public class474 method6886() {
        if (this.method6876()) {
            return new class474(0, 0);
        } else {
            class395 var1 = this.field4468.method6618(this.field4470 - 1);
            return new class474(var1.field4442 + this.method6879(), var1.field4441);
        }
    }

    @ObfuscatedName("pw.ak(II)Lpb;")
    public class395 method6881(int arg0) {
        return arg0 >= 0 && arg0 < this.method6894() ? this.field4468.method6618(this.field4471 + arg0) : null;
    }
}
