package deob;

@ObfuscatedName("ha")
public class class227 {

    @ObfuscatedName("ha.w")
    public int field2568;

    @ObfuscatedName("ha.s")
    public int field2565;

    @ObfuscatedName("ha.l")
    public int field2566;

    public class227() {
        this.field2568 = -1;
    }

    public class227(int arg0, int arg1, int arg2) {
        this.field2568 = arg0;
        this.field2565 = arg1;
        this.field2566 = arg2;
    }

    public class227(class227 arg0) {
        this.field2568 = arg0.field2568;
        this.field2565 = arg0.field2565;
        this.field2566 = arg0.field2566;
    }

    public class227(int arg0) {
        if (arg0 == -1) {
            this.field2568 = -1;
        } else {
            this.field2568 = arg0 >> 28 & 0x3;
            this.field2565 = arg0 >> 14 & 0x3FFF;
            this.field2566 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ha.z(IIII)V")
    public void method4070(int arg0, int arg1, int arg2) {
        this.field2568 = arg0;
        this.field2565 = arg1;
        this.field2566 = arg2;
    }

    @ObfuscatedName("ha.w(I)I")
    public int method4071() {
        return this.field2568 << 28 | this.field2565 << 14 | this.field2566;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class227)) {
            return this.method4073((class227) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ha.s(Lha;I)Z")
    public boolean method4073(class227 arg0) {
        if (this.field2568 != arg0.field2568) {
            return false;
        } else if (this.field2565 == arg0.field2565) {
            return this.field2566 == arg0.field2566;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4071();
    }

    public String toString() {
        return this.method4075(",");
    }

    @ObfuscatedName("ha.l(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4075(String arg0) {
        return this.field2568 + arg0 + (this.field2565 >> 6) + arg0 + (this.field2566 >> 6) + arg0 + (this.field2565 & 0x3F) + arg0 + (this.field2566 & 0x3F);
    }
}
