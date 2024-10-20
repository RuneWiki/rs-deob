package deob;

@ObfuscatedName("po")
public class class400 {

    @ObfuscatedName("po.aw")
    public class396 field4509;

    @ObfuscatedName("po.ay")
    public int field4507 = 0;

    @ObfuscatedName("po.ar")
    public int field4508 = 0;

    public class400(class396 arg0, int arg1, int arg2) {
        this.field4509 = arg0;
        this.field4507 = arg1;
        this.field4508 = arg2;
    }

    @ObfuscatedName("po.aw(I)Ljava/lang/String;")
    public String method6914() {
        if (this.method6916()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6917());
        for (int var2 = this.field4507; var2 < this.field4508; var2++) {
            class398 var3 = this.field4509.method6652(var2);
            var1.append(var3.field4481);
        }
        return var1.toString();
    }

    @ObfuscatedName("po.ay(II)Z")
    public boolean method6936(int arg0) {
        return this.field4509.method6683() == 2 || this.field4509.method6683() == 1 && (!this.field4509.field4463 || this.field4508 - 1 != arg0);
    }

    @ObfuscatedName("po.ar(I)Z")
    public boolean method6916() {
        return this.field4508 == this.field4507;
    }

    @ObfuscatedName("po.am(B)I")
    public int method6917() {
        return this.field4508 - this.field4507;
    }

    @ObfuscatedName("po.as(Lpz;I)Z")
    public boolean method6918(class398 arg0) {
        if (this.field4509.field4473 == 2) {
            return true;
        } else if (this.field4509.field4473 == 0) {
            return false;
        } else {
            return this.field4509.method6653() != arg0;
        }
    }

    @ObfuscatedName("po.aj(I)I")
    public int method6923() {
        if (this.method6916()) {
            return 0;
        }
        class398 var1 = this.field4509.method6652(this.field4508 - 1);
        if (var1.field4481 == '\n') {
            return 0;
        } else if (this.method6918(var1)) {
            return this.field4509.field4462.field4504[42];
        } else {
            int var2 = this.field4509.field4462.field4504[var1.field4481];
            if (var2 == 0) {
                return var1.field4481 == '\t' ? this.field4509.field4462.field4504[32] * 3 : this.field4509.field4462.field4504[32];
            } else {
                return var2;
            }
        }
    }

    @ObfuscatedName("po.ag(I)Lsf;")
    public class487 method6920() {
        if (this.method6916()) {
            return new class487(0, 0);
        } else {
            class398 var1 = this.field4509.method6652(this.field4508 - 1);
            return new class487(var1.field4480 + this.method6923(), var1.field4482);
        }
    }

    @ObfuscatedName("po.az(II)Lpz;")
    public class398 method6921(int arg0) {
        return arg0 >= 0 && arg0 < this.method6917() ? this.field4509.method6652(this.field4507 + arg0) : null;
    }
}
