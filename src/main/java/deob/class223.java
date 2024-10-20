package deob;

@ObfuscatedName("hd")
public class class223 {

    @ObfuscatedName("hd.n")
    public int field2559;

    @ObfuscatedName("hd.v")
    public int field2560;

    @ObfuscatedName("hd.d")
    public int field2558;

    public class223(int arg0, int arg1, int arg2) {
        this.field2559 = arg0;
        this.field2560 = arg1;
        this.field2558 = arg2;
    }

    public class223(class223 arg0) {
        this.field2559 = arg0.field2559;
        this.field2560 = arg0.field2560;
        this.field2558 = arg0.field2558;
    }

    public class223(int arg0) {
        if (arg0 == -1) {
            this.field2559 = -1;
        } else {
            this.field2559 = arg0 >> 28 & 0x3;
            this.field2560 = arg0 >> 14 & 0x3FFF;
            this.field2558 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hd.n(I)I")
    public int method3822() {
        return this.field2559 << 28 | this.field2560 << 14 | this.field2558;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class223)) {
            return this.method3823((class223) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hd.v(Lhd;S)Z")
    public boolean method3823(class223 arg0) {
        if (this.field2559 != arg0.field2559) {
            return false;
        } else if (this.field2560 == arg0.field2560) {
            return this.field2558 == arg0.field2558;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3822();
    }

    public String toString() {
        return this.method3824(",");
    }

    @ObfuscatedName("hd.d(Ljava/lang/String;B)Ljava/lang/String;")
    public String method3824(String arg0) {
        return this.field2559 + arg0 + (this.field2560 >> 6) + arg0 + (this.field2558 >> 6) + arg0 + (this.field2560 & 0x3F) + arg0 + (this.field2558 & 0x3F);
    }
}
