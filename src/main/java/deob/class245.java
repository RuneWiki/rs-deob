package deob;

@ObfuscatedName("ij")
public class class245 {

    @ObfuscatedName("ij.s")
    public int field2921;

    @ObfuscatedName("ij.t")
    public int field2920;

    @ObfuscatedName("ij.v")
    public int field2922;

    public class245(int arg0, int arg1, int arg2) {
        this.field2921 = arg0;
        this.field2920 = arg1;
        this.field2922 = arg2;
    }

    public class245(class245 arg0) {
        this.field2921 = arg0.field2921;
        this.field2920 = arg0.field2920;
        this.field2922 = arg0.field2922;
    }

    public class245(int arg0) {
        if (arg0 == -1) {
            this.field2921 = -1;
        } else {
            this.field2921 = arg0 >> 28 & 0x3;
            this.field2920 = arg0 >> 14 & 0x3FFF;
            this.field2922 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ij.s(B)I")
    public int method4200() {
        return this.field2921 << 28 | this.field2920 << 14 | this.field2922;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class245)) {
            return this.method4197((class245) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ij.t(Lij;I)Z")
    public boolean method4197(class245 arg0) {
        if (this.field2921 != arg0.field2921) {
            return false;
        } else if (this.field2920 == arg0.field2920) {
            return this.field2922 == arg0.field2922;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4200();
    }

    public String toString() {
        return this.method4198(",");
    }

    @ObfuscatedName("ij.v(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4198(String arg0) {
        return this.field2921 + arg0 + (this.field2920 >> 6) + arg0 + (this.field2922 >> 6) + arg0 + (this.field2920 & 0x3F) + arg0 + (this.field2922 & 0x3F);
    }
}
