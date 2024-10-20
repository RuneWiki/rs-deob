package deob;

@ObfuscatedName("hw")
public class class223 {

    @ObfuscatedName("hw.f")
    public int field2555;

    @ObfuscatedName("hw.b")
    public int field2557;

    @ObfuscatedName("hw.l")
    public int field2554;

    public class223(int arg0, int arg1, int arg2) {
        this.field2555 = arg0;
        this.field2557 = arg1;
        this.field2554 = arg2;
    }

    public class223(class223 arg0) {
        this.field2555 = arg0.field2555;
        this.field2557 = arg0.field2557;
        this.field2554 = arg0.field2554;
    }

    public class223(int arg0) {
        if (arg0 == -1) {
            this.field2555 = -1;
        } else {
            this.field2555 = arg0 >> 28 & 0x3;
            this.field2557 = arg0 >> 14 & 0x3FFF;
            this.field2554 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hw.f(I)I")
    public int method3753() {
        return this.field2555 << 28 | this.field2557 << 14 | this.field2554;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class223)) {
            return this.method3760((class223) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hw.b(Lhw;I)Z")
    public boolean method3760(class223 arg0) {
        if (this.field2555 != arg0.field2555) {
            return false;
        } else if (this.field2557 == arg0.field2557) {
            return this.field2554 == arg0.field2554;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3753();
    }

    public String toString() {
        return this.method3750(",");
    }

    @ObfuscatedName("hw.l(Ljava/lang/String;B)Ljava/lang/String;")
    public String method3750(String arg0) {
        return this.field2555 + arg0 + (this.field2557 >> 6) + arg0 + (this.field2554 >> 6) + arg0 + (this.field2557 & 0x3F) + arg0 + (this.field2554 & 0x3F);
    }
}
