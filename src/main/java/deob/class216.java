package deob;

@ObfuscatedName("hp")
public class class216 {

    @ObfuscatedName("hp.s")
    public int field2631;

    @ObfuscatedName("hp.c")
    public int field2626;

    @ObfuscatedName("hp.f")
    public int field2632;

    public class216() {
        this.field2631 = -1;
    }

    public class216(int arg0, int arg1, int arg2) {
        this.field2631 = arg0;
        this.field2626 = arg1;
        this.field2632 = arg2;
    }

    public class216(class216 arg0) {
        this.field2631 = arg0.field2631;
        this.field2626 = arg0.field2626;
        this.field2632 = arg0.field2632;
    }

    public class216(int arg0) {
        if (arg0 == -1) {
            this.field2631 = -1;
        } else {
            this.field2631 = arg0 >> 28 & 0x3;
            this.field2626 = arg0 >> 14 & 0x3FFF;
            this.field2632 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hp.s(IIIB)V")
    public void method3689(int arg0, int arg1, int arg2) {
        this.field2631 = arg0;
        this.field2626 = arg1;
        this.field2632 = arg2;
    }

    @ObfuscatedName("hp.c(I)I")
    public int method3682() {
        return this.field2631 << 28 | this.field2626 << 14 | this.field2632;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class216)) {
            return this.method3683((class216) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hp.f(Lhp;B)Z")
    public boolean method3683(class216 arg0) {
        if (this.field2631 != arg0.field2631) {
            return false;
        } else if (this.field2626 == arg0.field2626) {
            return this.field2632 == arg0.field2632;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3682();
    }

    public String toString() {
        return this.field2631 + "," + (this.field2626 >> 6) + "," + (this.field2632 >> 6) + "," + (this.field2626 & 0x3F) + "," + (this.field2632 & 0x3F);
    }
}
