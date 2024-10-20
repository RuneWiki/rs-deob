package deob;

@ObfuscatedName("ht")
public class class214 {

    @ObfuscatedName("ht.f")
    public int field2517;

    @ObfuscatedName("ht.i")
    public int field2516;

    @ObfuscatedName("ht.y")
    public int field2518;

    public class214(int arg0, int arg1, int arg2) {
        this.field2517 = arg0;
        this.field2516 = arg1;
        this.field2518 = arg2;
    }

    public class214(class214 arg0) {
        this.field2517 = arg0.field2517;
        this.field2516 = arg0.field2516;
        this.field2518 = arg0.field2518;
    }

    public class214(int arg0) {
        if (arg0 == -1) {
            this.field2517 = -1;
        } else {
            this.field2517 = arg0 >> 28 & 0x3;
            this.field2516 = arg0 >> 14 & 0x3FFF;
            this.field2518 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ht.f(B)I")
    public int method3597() {
        return this.field2517 << 28 | this.field2516 << 14 | this.field2518;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class214)) {
            return this.method3595((class214) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ht.i(Lht;I)Z")
    public boolean method3595(class214 arg0) {
        if (this.field2517 != arg0.field2517) {
            return false;
        } else if (this.field2516 == arg0.field2516) {
            return this.field2518 == arg0.field2518;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3597();
    }

    public String toString() {
        return this.method3600(",");
    }

    @ObfuscatedName("ht.y(Ljava/lang/String;B)Ljava/lang/String;")
    public String method3600(String arg0) {
        return this.field2517 + arg0 + (this.field2516 >> 6) + arg0 + (this.field2518 >> 6) + arg0 + (this.field2516 & 0x3F) + arg0 + (this.field2518 & 0x3F);
    }
}
