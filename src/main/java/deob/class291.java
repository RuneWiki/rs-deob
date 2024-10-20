package deob;

@ObfuscatedName("kz")
public class class291 {

    @ObfuscatedName("kz.c")
    public int field3351;

    @ObfuscatedName("kz.p")
    public int field3349;

    @ObfuscatedName("kz.f")
    public int field3350;

    public class291(int arg0, int arg1, int arg2) {
        this.field3351 = arg0;
        this.field3349 = arg1;
        this.field3350 = arg2;
    }

    public class291(class291 arg0) {
        this.field3351 = arg0.field3351;
        this.field3349 = arg0.field3349;
        this.field3350 = arg0.field3350;
    }

    public class291(int arg0) {
        if (arg0 == -1) {
            this.field3351 = -1;
        } else {
            this.field3351 = arg0 >> 28 & 0x3;
            this.field3349 = arg0 >> 14 & 0x3FFF;
            this.field3350 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("kz.c(B)I")
    public int method5123() {
        int var1 = this.field3351;
        int var2 = this.field3349;
        int var3 = this.field3350;
        return var1 << 28 | var2 << 14 | var3;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class291)) {
            return this.method5125((class291) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kz.p(Lkz;I)Z")
    public boolean method5125(class291 arg0) {
        if (this.field3351 != arg0.field3351) {
            return false;
        } else if (this.field3349 == arg0.field3349) {
            return this.field3350 == arg0.field3350;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5123();
    }

    public String toString() {
        return this.method5126(",");
    }

    @ObfuscatedName("kz.f(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5126(String arg0) {
        return this.field3351 + arg0 + (this.field3349 >> 6) + arg0 + (this.field3350 >> 6) + arg0 + (this.field3349 & 0x3F) + arg0 + (this.field3350 & 0x3F);
    }
}
