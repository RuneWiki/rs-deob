package deob;

@ObfuscatedName("hb")
public class class214 {

    @ObfuscatedName("hb.n")
    public int field2516;

    @ObfuscatedName("hb.v")
    public int field2515;

    @ObfuscatedName("hb.u")
    public int field2514;

    public class214(int arg0, int arg1, int arg2) {
        this.field2516 = arg0;
        this.field2515 = arg1;
        this.field2514 = arg2;
    }

    public class214(class214 arg0) {
        this.field2516 = arg0.field2516;
        this.field2515 = arg0.field2515;
        this.field2514 = arg0.field2514;
    }

    public class214(int arg0) {
        if (arg0 == -1) {
            this.field2516 = -1;
        } else {
            this.field2516 = arg0 >> 28 & 0x3;
            this.field2515 = arg0 >> 14 & 0x3FFF;
            this.field2514 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hb.z(I)I")
    public int method3579() {
        return this.field2516 << 28 | this.field2515 << 14 | this.field2514;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class214)) {
            return this.method3581((class214) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hb.n(Lhb;I)Z")
    public boolean method3581(class214 arg0) {
        if (this.field2516 != arg0.field2516) {
            return false;
        } else if (this.field2515 == arg0.field2515) {
            return this.field2514 == arg0.field2514;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3579();
    }

    public String toString() {
        return this.method3582(",");
    }

    @ObfuscatedName("hb.v(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3582(String arg0) {
        return this.field2516 + arg0 + (this.field2515 >> 6) + arg0 + (this.field2514 >> 6) + arg0 + (this.field2515 & 0x3F) + arg0 + (this.field2514 & 0x3F);
    }
}
