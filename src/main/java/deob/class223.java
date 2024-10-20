package deob;

@ObfuscatedName("hg")
public class class223 {

    @ObfuscatedName("hg.k")
    public int field2568;

    @ObfuscatedName("hg.s")
    public int field2563;

    @ObfuscatedName("hg.t")
    public int field2565;

    public class223(int arg0, int arg1, int arg2) {
        this.field2568 = arg0;
        this.field2563 = arg1;
        this.field2565 = arg2;
    }

    public class223(class223 arg0) {
        this.field2568 = arg0.field2568;
        this.field2563 = arg0.field2563;
        this.field2565 = arg0.field2565;
    }

    public class223(int arg0) {
        if (arg0 == -1) {
            this.field2568 = -1;
        } else {
            this.field2568 = arg0 >> 28 & 0x3;
            this.field2563 = arg0 >> 14 & 0x3FFF;
            this.field2565 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hg.z(B)I")
    public int method3725() {
        return this.field2568 << 28 | this.field2563 << 14 | this.field2565;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class223)) {
            return this.method3727((class223) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hg.k(Lhg;I)Z")
    public boolean method3727(class223 arg0) {
        if (this.field2568 != arg0.field2568) {
            return false;
        } else if (this.field2563 == arg0.field2563) {
            return this.field2565 == arg0.field2565;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3725();
    }

    public String toString() {
        return this.method3726(",");
    }

    @ObfuscatedName("hg.s(Ljava/lang/String;B)Ljava/lang/String;")
    public String method3726(String arg0) {
        return this.field2568 + arg0 + (this.field2563 >> 6) + arg0 + (this.field2565 >> 6) + arg0 + (this.field2563 & 0x3F) + arg0 + (this.field2565 & 0x3F);
    }
}
