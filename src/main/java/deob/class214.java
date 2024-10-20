package deob;

@ObfuscatedName("hj")
public class class214 {

    @ObfuscatedName("hj.c")
    public int field2538;

    @ObfuscatedName("hj.t")
    public int field2539;

    @ObfuscatedName("hj.o")
    public int field2537;

    public class214(int arg0, int arg1, int arg2) {
        this.field2538 = arg0;
        this.field2539 = arg1;
        this.field2537 = arg2;
    }

    public class214(class214 arg0) {
        this.field2538 = arg0.field2538;
        this.field2539 = arg0.field2539;
        this.field2537 = arg0.field2537;
    }

    public class214(int arg0) {
        if (arg0 == -1) {
            this.field2538 = -1;
        } else {
            this.field2538 = arg0 >> 28 & 0x3;
            this.field2539 = arg0 >> 14 & 0x3FFF;
            this.field2537 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hj.c(I)I")
    public int method3676() {
        return this.field2538 << 28 | this.field2539 << 14 | this.field2537;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class214)) {
            return this.method3683((class214) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hj.t(Lhj;I)Z")
    public boolean method3683(class214 arg0) {
        if (this.field2538 != arg0.field2538) {
            return false;
        } else if (this.field2539 == arg0.field2539) {
            return this.field2537 == arg0.field2537;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3676();
    }

    public String toString() {
        return this.method3672(",");
    }

    @ObfuscatedName("hj.o(Ljava/lang/String;B)Ljava/lang/String;")
    public String method3672(String arg0) {
        return this.field2538 + arg0 + (this.field2539 >> 6) + arg0 + (this.field2537 >> 6) + arg0 + (this.field2539 & 0x3F) + arg0 + (this.field2537 & 0x3F);
    }
}
