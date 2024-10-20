package deob;

@ObfuscatedName("ic")
public class class239 {

    @ObfuscatedName("ic.d")
    public int field2790;

    @ObfuscatedName("ic.n")
    public int field2791;

    @ObfuscatedName("ic.r")
    public int field2789;

    public class239() {
        this.field2790 = -1;
    }

    public class239(int arg0, int arg1, int arg2) {
        this.field2790 = arg0;
        this.field2791 = arg1;
        this.field2789 = arg2;
    }

    public class239(class239 arg0) {
        this.field2790 = arg0.field2790;
        this.field2791 = arg0.field2791;
        this.field2789 = arg0.field2789;
    }

    public class239(int arg0) {
        if (arg0 == -1) {
            this.field2790 = -1;
        } else {
            this.field2790 = arg0 >> 28 & 0x3;
            this.field2791 = arg0 >> 14 & 0x3FFF;
            this.field2789 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ic.d(IIII)V")
    public void method4101(int arg0, int arg1, int arg2) {
        this.field2790 = arg0;
        this.field2791 = arg1;
        this.field2789 = arg2;
    }

    @ObfuscatedName("ic.z(I)I")
    public int method4124() {
        return this.field2790 << 28 | this.field2791 << 14 | this.field2789;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class239)) {
            return this.method4100((class239) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ic.n(Lic;B)Z")
    public boolean method4100(class239 arg0) {
        if (this.field2790 != arg0.field2790) {
            return false;
        } else if (this.field2791 == arg0.field2791) {
            return this.field2789 == arg0.field2789;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4124();
    }

    public String toString() {
        return this.method4104(",");
    }

    @ObfuscatedName("ic.r(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4104(String arg0) {
        return this.field2790 + arg0 + (this.field2791 >> 6) + arg0 + (this.field2789 >> 6) + arg0 + (this.field2791 & 0x3F) + arg0 + (this.field2789 & 0x3F);
    }
}
