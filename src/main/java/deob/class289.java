package deob;

@ObfuscatedName("kd")
public class class289 {

    @ObfuscatedName("kd.c")
    public int field3329;

    @ObfuscatedName("kd.v")
    public int field3328;

    @ObfuscatedName("kd.q")
    public int field3330;

    public class289(int arg0, int arg1, int arg2) {
        this.field3329 = arg0;
        this.field3328 = arg1;
        this.field3330 = arg2;
    }

    public class289(class289 arg0) {
        this.field3329 = arg0.field3329;
        this.field3328 = arg0.field3328;
        this.field3330 = arg0.field3330;
    }

    public class289(int arg0) {
        if (arg0 == -1) {
            this.field3329 = -1;
        } else {
            this.field3329 = arg0 >> 28 & 0x3;
            this.field3328 = arg0 >> 14 & 0x3FFF;
            this.field3330 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("kd.c(B)I")
    public int method5002() {
        int var1 = this.field3329;
        int var2 = this.field3328;
        int var3 = this.field3330;
        return var1 << 28 | var2 << 14 | var3;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class289)) {
            return this.method5004((class289) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kd.v(Lkd;I)Z")
    public boolean method5004(class289 arg0) {
        if (this.field3329 != arg0.field3329) {
            return false;
        } else if (this.field3328 == arg0.field3328) {
            return this.field3330 == arg0.field3330;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5002();
    }

    public String toString() {
        return this.method5005(",");
    }

    @ObfuscatedName("kd.q(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5005(String arg0) {
        return this.field3329 + arg0 + (this.field3328 >> 6) + arg0 + (this.field3330 >> 6) + arg0 + (this.field3328 & 0x3F) + arg0 + (this.field3330 & 0x3F);
    }
}
