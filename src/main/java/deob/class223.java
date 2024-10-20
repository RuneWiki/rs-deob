package deob;

@ObfuscatedName("hs")
public class class223 {

    @ObfuscatedName("hs.h")
    public int field2550;

    @ObfuscatedName("hs.v")
    public int field2547;

    @ObfuscatedName("hs.x")
    public int field2548;

    public class223(int arg0, int arg1, int arg2) {
        this.field2550 = arg0;
        this.field2547 = arg1;
        this.field2548 = arg2;
    }

    public class223(class223 arg0) {
        this.field2550 = arg0.field2550;
        this.field2547 = arg0.field2547;
        this.field2548 = arg0.field2548;
    }

    public class223(int arg0) {
        if (arg0 == -1) {
            this.field2550 = -1;
        } else {
            this.field2550 = arg0 >> 28 & 0x3;
            this.field2547 = arg0 >> 14 & 0x3FFF;
            this.field2548 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hs.h(B)I")
    public int method3675() {
        return this.field2550 << 28 | this.field2547 << 14 | this.field2548;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class223)) {
            return this.method3676((class223) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hs.v(Lhs;I)Z")
    public boolean method3676(class223 arg0) {
        if (this.field2550 != arg0.field2550) {
            return false;
        } else if (this.field2547 == arg0.field2547) {
            return this.field2548 == arg0.field2548;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3675();
    }

    public String toString() {
        return this.method3689(",");
    }

    @ObfuscatedName("hs.x(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3689(String arg0) {
        return this.field2550 + arg0 + (this.field2547 >> 6) + arg0 + (this.field2548 >> 6) + arg0 + (this.field2547 & 0x3F) + arg0 + (this.field2548 & 0x3F);
    }
}
