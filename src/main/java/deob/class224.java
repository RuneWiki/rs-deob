package deob;

@ObfuscatedName("ht")
public class class224 {

    @ObfuscatedName("ht.n")
    public int field2729;

    @ObfuscatedName("ht.v")
    public int field2730;

    @ObfuscatedName("ht.y")
    public int field2731;

    public class224() {
        this.field2729 = -1;
    }

    public class224(int arg0, int arg1, int arg2) {
        this.field2729 = arg0;
        this.field2730 = arg1;
        this.field2731 = arg2;
    }

    public class224(class224 arg0) {
        this.field2729 = arg0.field2729;
        this.field2730 = arg0.field2730;
        this.field2731 = arg0.field2731;
    }

    public class224(int arg0) {
        if (arg0 == -1) {
            this.field2729 = -1;
        } else {
            this.field2729 = arg0 >> 28 & 0x3;
            this.field2730 = arg0 >> 14 & 0x3FFF;
            this.field2731 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ht.n(IIIB)V")
    public void method3772(int arg0, int arg1, int arg2) {
        this.field2729 = arg0;
        this.field2730 = arg1;
        this.field2731 = arg2;
    }

    @ObfuscatedName("ht.v(I)I")
    public int method3786() {
        return this.field2729 << 28 | this.field2730 << 14 | this.field2731;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class224)) {
            return this.method3775((class224) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ht.y(Lht;I)Z")
    public boolean method3775(class224 arg0) {
        if (this.field2729 != arg0.field2729) {
            return false;
        } else if (this.field2730 == arg0.field2730) {
            return this.field2731 == arg0.field2731;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3786();
    }

    public String toString() {
        return this.field2729 + "," + (this.field2730 >> 6) + "," + (this.field2731 >> 6) + "," + (this.field2730 & 0x3F) + "," + (this.field2731 & 0x3F);
    }
}
