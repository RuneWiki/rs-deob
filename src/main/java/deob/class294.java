package deob;

@ObfuscatedName("ki")
public class class294 {

    @ObfuscatedName("ki.a")
    public int field3395;

    @ObfuscatedName("ki.f")
    public int field3397;

    @ObfuscatedName("ki.c")
    public int field3396;

    public class294(int arg0, int arg1, int arg2) {
        this.field3395 = arg0;
        this.field3397 = arg1;
        this.field3396 = arg2;
    }

    public class294(class294 arg0) {
        this.field3395 = arg0.field3395;
        this.field3397 = arg0.field3397;
        this.field3396 = arg0.field3396;
    }

    public class294(int arg0) {
        if (arg0 == -1) {
            this.field3395 = -1;
        } else {
            this.field3395 = arg0 >> 28 & 0x3;
            this.field3397 = arg0 >> 14 & 0x3FFF;
            this.field3396 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ki.a(I)I")
    public int method5143() {
        int var1 = this.field3395;
        int var2 = this.field3397;
        int var3 = this.field3396;
        return var1 << 28 | var2 << 14 | var3;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class294)) {
            return this.method5144((class294) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ki.f(Lki;I)Z")
    public boolean method5144(class294 arg0) {
        if (this.field3395 != arg0.field3395) {
            return false;
        } else if (this.field3397 == arg0.field3397) {
            return this.field3396 == arg0.field3396;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5143();
    }

    public String toString() {
        return this.method5149(",");
    }

    @ObfuscatedName("ki.c(Ljava/lang/String;B)Ljava/lang/String;")
    public String method5149(String arg0) {
        return this.field3395 + arg0 + (this.field3397 >> 6) + arg0 + (this.field3396 >> 6) + arg0 + (this.field3397 & 0x3F) + arg0 + (this.field3396 & 0x3F);
    }
}
