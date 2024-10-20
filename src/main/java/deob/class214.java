package deob;

@ObfuscatedName("hf")
public class class214 {

    @ObfuscatedName("hf.a")
    public int field2509;

    @ObfuscatedName("hf.t")
    public int field2512;

    @ObfuscatedName("hf.n")
    public int field2510;

    public class214(int arg0, int arg1, int arg2) {
        this.field2509 = arg0;
        this.field2512 = arg1;
        this.field2510 = arg2;
    }

    public class214(class214 arg0) {
        this.field2509 = arg0.field2509;
        this.field2512 = arg0.field2512;
        this.field2510 = arg0.field2510;
    }

    public class214(int arg0) {
        if (arg0 == -1) {
            this.field2509 = -1;
        } else {
            this.field2509 = arg0 >> 28 & 0x3;
            this.field2512 = arg0 >> 14 & 0x3FFF;
            this.field2510 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hf.a(I)I")
    public int method3731() {
        return this.field2509 << 28 | this.field2512 << 14 | this.field2510;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class214)) {
            return this.method3717((class214) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hf.t(Lhf;I)Z")
    public boolean method3717(class214 arg0) {
        if (this.field2509 != arg0.field2509) {
            return false;
        } else if (this.field2512 == arg0.field2512) {
            return this.field2510 == arg0.field2510;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3731();
    }

    public String toString() {
        return this.method3735(",");
    }

    @ObfuscatedName("hf.n(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3735(String arg0) {
        return this.field2509 + arg0 + (this.field2512 >> 6) + arg0 + (this.field2510 >> 6) + arg0 + (this.field2512 & 0x3F) + arg0 + (this.field2510 & 0x3F);
    }
}
