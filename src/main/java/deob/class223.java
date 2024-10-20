package deob;

@ObfuscatedName("hg")
public class class223 {

    @ObfuscatedName("hg.m")
    public int field2567;

    @ObfuscatedName("hg.o")
    public int field2566;

    @ObfuscatedName("hg.q")
    public int field2565;

    public class223(int arg0, int arg1, int arg2) {
        this.field2567 = arg0;
        this.field2566 = arg1;
        this.field2565 = arg2;
    }

    public class223(class223 arg0) {
        this.field2567 = arg0.field2567;
        this.field2566 = arg0.field2566;
        this.field2565 = arg0.field2565;
    }

    public class223(int arg0) {
        if (arg0 == -1) {
            this.field2567 = -1;
        } else {
            this.field2567 = arg0 >> 28 & 0x3;
            this.field2566 = arg0 >> 14 & 0x3FFF;
            this.field2565 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hg.m(B)I")
    public int method3718() {
        return this.field2567 << 28 | this.field2566 << 14 | this.field2565;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class223)) {
            return this.method3717((class223) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hg.o(Lhg;I)Z")
    public boolean method3717(class223 arg0) {
        if (this.field2567 != arg0.field2567) {
            return false;
        } else if (this.field2566 == arg0.field2566) {
            return this.field2565 == arg0.field2565;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3718();
    }

    public String toString() {
        return this.method3721(",");
    }

    @ObfuscatedName("hg.q(Ljava/lang/String;S)Ljava/lang/String;")
    public String method3721(String arg0) {
        return this.field2567 + arg0 + (this.field2566 >> 6) + arg0 + (this.field2565 >> 6) + arg0 + (this.field2566 & 0x3F) + arg0 + (this.field2565 & 0x3F);
    }
}
