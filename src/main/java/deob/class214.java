package deob;

@ObfuscatedName("hj")
public class class214 {

    @ObfuscatedName("hj.c")
    public int field2501;

    @ObfuscatedName("hj.x")
    public int field2503;

    @ObfuscatedName("hj.t")
    public int field2502;

    public class214(int arg0, int arg1, int arg2) {
        this.field2501 = arg0;
        this.field2502 = arg1;
        this.field2503 = arg2;
    }

    public class214(class214 arg0) {
        this.field2501 = arg0.field2501;
        this.field2502 = arg0.field2502;
        this.field2503 = arg0.field2503;
    }

    public class214(int arg0) {
        if (arg0 == -1) {
            this.field2501 = -1;
        } else {
            this.field2501 = arg0 >> 28 & 0x3;
            this.field2502 = arg0 >> 14 & 0x3FFF;
            this.field2503 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hj.c(B)I")
    public int method3669() {
        return this.field2501 << 28 | this.field2502 << 14 | this.field2503;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class214)) {
            return this.method3665((class214) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hj.x(Lhj;I)Z")
    public boolean method3665(class214 arg0) {
        if (this.field2501 != arg0.field2501) {
            return false;
        } else if (this.field2502 == arg0.field2502) {
            return this.field2503 == arg0.field2503;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3669();
    }

    public String toString() {
        return this.method3664(",");
    }

    @ObfuscatedName("hj.t(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3664(String arg0) {
        return this.field2501 + arg0 + (this.field2502 >> 6) + arg0 + (this.field2503 >> 6) + arg0 + (this.field2502 & 0x3F) + arg0 + (this.field2503 & 0x3F);
    }
}
