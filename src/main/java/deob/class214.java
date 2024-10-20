package deob;

@ObfuscatedName("hd")
public class class214 {

    @ObfuscatedName("hd.s")
    public int field2515;

    @ObfuscatedName("hd.j")
    public int field2513;

    @ObfuscatedName("hd.i")
    public int field2511;

    public class214(int arg0, int arg1, int arg2) {
        this.field2515 = arg0;
        this.field2513 = arg1;
        this.field2511 = arg2;
    }

    public class214(class214 arg0) {
        this.field2515 = arg0.field2515;
        this.field2513 = arg0.field2513;
        this.field2511 = arg0.field2511;
    }

    public class214(int arg0) {
        if (arg0 == -1) {
            this.field2515 = -1;
        } else {
            this.field2515 = arg0 >> 28 & 0x3;
            this.field2513 = arg0 >> 14 & 0x3FFF;
            this.field2511 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hd.s(B)I")
    public int method3630() {
        return this.field2515 << 28 | this.field2513 << 14 | this.field2511;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class214)) {
            return this.method3631((class214) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hd.j(Lhd;B)Z")
    public boolean method3631(class214 arg0) {
        if (this.field2515 != arg0.field2515) {
            return false;
        } else if (this.field2513 == arg0.field2513) {
            return this.field2511 == arg0.field2511;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3630();
    }

    public String toString() {
        return this.method3633(",");
    }

    @ObfuscatedName("hd.i(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3633(String arg0) {
        return this.field2515 + arg0 + (this.field2513 >> 6) + arg0 + (this.field2511 >> 6) + arg0 + (this.field2513 & 0x3F) + arg0 + (this.field2511 & 0x3F);
    }
}
