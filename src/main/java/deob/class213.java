package deob;

@ObfuscatedName("hl")
public class class213 {

    @ObfuscatedName("hl.n")
    public int field2619;

    @ObfuscatedName("hl.p")
    public int field2621;

    @ObfuscatedName("hl.i")
    public int field2618;

    public class213() {
        this.field2619 = -1;
    }

    public class213(int arg0, int arg1, int arg2) {
        this.field2619 = arg0;
        this.field2621 = arg1;
        this.field2618 = arg2;
    }

    public class213(class213 arg0) {
        this.field2619 = arg0.field2619;
        this.field2621 = arg0.field2621;
        this.field2618 = arg0.field2618;
    }

    public class213(int arg0) {
        if (arg0 == -1) {
            this.field2619 = -1;
        } else {
            this.field2619 = arg0 >> 28 & 0x3;
            this.field2621 = arg0 >> 14 & 0x3FFF;
            this.field2618 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hl.n(IIII)V")
    public void method3674(int arg0, int arg1, int arg2) {
        this.field2619 = arg0;
        this.field2621 = arg1;
        this.field2618 = arg2;
    }

    @ObfuscatedName("hl.p(I)I")
    public int method3675() {
        return this.field2619 << 28 | this.field2621 << 14 | this.field2618;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class213)) {
            return this.method3679((class213) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hl.i(Lhl;I)Z")
    public boolean method3679(class213 arg0) {
        if (this.field2619 != arg0.field2619) {
            return false;
        } else if (this.field2621 == arg0.field2621) {
            return this.field2618 == arg0.field2618;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3675();
    }

    public String toString() {
        return this.field2619 + "," + (this.field2621 >> 6) + "," + (this.field2618 >> 6) + "," + (this.field2621 & 0x3F) + "," + (this.field2618 & 0x3F);
    }
}
