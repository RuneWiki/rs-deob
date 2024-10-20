package deob;

@ObfuscatedName("hu")
public class class225 {

    @ObfuscatedName("hu.m")
    public int field2608;

    @ObfuscatedName("hu.f")
    public int field2605;

    @ObfuscatedName("hu.q")
    public int field2606;

    public class225(int arg0, int arg1, int arg2) {
        this.field2608 = arg0;
        this.field2605 = arg1;
        this.field2606 = arg2;
    }

    public class225(class225 arg0) {
        this.field2608 = arg0.field2608;
        this.field2605 = arg0.field2605;
        this.field2606 = arg0.field2606;
    }

    public class225(int arg0) {
        if (arg0 == -1) {
            this.field2608 = -1;
        } else {
            this.field2608 = arg0 >> 28 & 0x3;
            this.field2605 = arg0 >> 14 & 0x3FFF;
            this.field2606 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hu.m(I)I")
    public int method4009() {
        return this.field2608 << 28 | this.field2605 << 14 | this.field2606;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class225)) {
            return this.method4023((class225) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hu.f(Lhu;B)Z")
    public boolean method4023(class225 arg0) {
        if (this.field2608 != arg0.field2608) {
            return false;
        } else if (this.field2605 == arg0.field2605) {
            return this.field2606 == arg0.field2606;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4009();
    }

    public String toString() {
        return this.method4008(",");
    }

    @ObfuscatedName("hu.q(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4008(String arg0) {
        return this.field2608 + arg0 + (this.field2605 >> 6) + arg0 + (this.field2606 >> 6) + arg0 + (this.field2605 & 0x3F) + arg0 + (this.field2606 & 0x3F);
    }
}
