package deob;

@ObfuscatedName("hn")
public class class224 {

    @ObfuscatedName("hn.p")
    public int field2700;

    @ObfuscatedName("hn.i")
    public int field2697;

    @ObfuscatedName("hn.w")
    public int field2698;

    public class224() {
        this.field2700 = -1;
    }

    public class224(int arg0, int arg1, int arg2) {
        this.field2700 = arg0;
        this.field2697 = arg1;
        this.field2698 = arg2;
    }

    public class224(class224 arg0) {
        this.field2700 = arg0.field2700;
        this.field2697 = arg0.field2697;
        this.field2698 = arg0.field2698;
    }

    public class224(int arg0) {
        if (arg0 == -1) {
            this.field2700 = -1;
        } else {
            this.field2700 = arg0 >> 28 & 0x3;
            this.field2697 = arg0 >> 14 & 0x3FFF;
            this.field2698 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hn.p(IIIB)V")
    public void method3868(int arg0, int arg1, int arg2) {
        this.field2700 = arg0;
        this.field2697 = arg1;
        this.field2698 = arg2;
    }

    @ObfuscatedName("hn.i(I)I")
    public int method3877() {
        return this.field2700 << 28 | this.field2697 << 14 | this.field2698;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class224)) {
            return this.method3869((class224) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hn.w(Lhn;S)Z")
    public boolean method3869(class224 arg0) {
        if (this.field2700 != arg0.field2700) {
            return false;
        } else if (this.field2697 == arg0.field2697) {
            return this.field2698 == arg0.field2698;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3877();
    }

    public String toString() {
        return this.field2700 + "," + (this.field2697 >> 6) + "," + (this.field2698 >> 6) + "," + (this.field2697 & 0x3F) + "," + (this.field2698 & 0x3F);
    }
}
