package deob;

@ObfuscatedName("hg")
public class class213 {

    @ObfuscatedName("hg.p")
    public int field2620;

    @ObfuscatedName("hg.m")
    public int field2619;

    @ObfuscatedName("hg.e")
    public int field2622;

    public class213() {
        this.field2620 = -1;
    }

    public class213(int arg0, int arg1, int arg2) {
        this.field2620 = arg0;
        this.field2619 = arg1;
        this.field2622 = arg2;
    }

    public class213(class213 arg0) {
        this.field2620 = arg0.field2620;
        this.field2619 = arg0.field2619;
        this.field2622 = arg0.field2622;
    }

    public class213(int arg0) {
        if (arg0 == -1) {
            this.field2620 = -1;
        } else {
            this.field2620 = arg0 >> 28 & 0x3;
            this.field2619 = arg0 >> 14 & 0x3FFF;
            this.field2622 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hg.p(IIII)V")
    public void method3553(int arg0, int arg1, int arg2) {
        this.field2620 = arg0;
        this.field2619 = arg1;
        this.field2622 = arg2;
    }

    @ObfuscatedName("hg.m(I)I")
    public int method3554() {
        return this.field2620 << 28 | this.field2619 << 14 | this.field2622;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class213)) {
            return this.method3555((class213) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hg.e(Lhg;I)Z")
    public boolean method3555(class213 arg0) {
        if (this.field2620 != arg0.field2620) {
            return false;
        } else if (this.field2619 == arg0.field2619) {
            return this.field2622 == arg0.field2622;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3554();
    }

    public String toString() {
        return this.field2620 + "," + (this.field2619 >> 6) + "," + (this.field2622 >> 6) + "," + (this.field2619 & 0x3F) + "," + (this.field2622 & 0x3F);
    }
}
