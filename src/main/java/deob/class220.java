package deob;

@ObfuscatedName("hk")
public class class220 {

    @ObfuscatedName("hk.b")
    public int field2682;

    @ObfuscatedName("hk.s")
    public int field2683;

    @ObfuscatedName("hk.r")
    public int field2684;

    public class220() {
        this.field2682 = -1;
    }

    public class220(int arg0, int arg1, int arg2) {
        this.field2682 = arg0;
        this.field2683 = arg1;
        this.field2684 = arg2;
    }

    public class220(class220 arg0) {
        this.field2682 = arg0.field2682;
        this.field2683 = arg0.field2683;
        this.field2684 = arg0.field2684;
    }

    public class220(int arg0) {
        if (arg0 == -1) {
            this.field2682 = -1;
        } else {
            this.field2682 = arg0 >> 28 & 0x3;
            this.field2683 = arg0 >> 14 & 0x3FFF;
            this.field2684 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hk.b(IIII)V")
    public void method3694(int arg0, int arg1, int arg2) {
        this.field2682 = arg0;
        this.field2683 = arg1;
        this.field2684 = arg2;
    }

    @ObfuscatedName("hk.s(I)I")
    public int method3685() {
        return this.field2682 << 28 | this.field2683 << 14 | this.field2684;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class220)) {
            return this.method3686((class220) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hk.r(Lhk;I)Z")
    public boolean method3686(class220 arg0) {
        if (this.field2682 != arg0.field2682) {
            return false;
        } else if (this.field2683 == arg0.field2683) {
            return this.field2684 == arg0.field2684;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3685();
    }

    public String toString() {
        return this.field2682 + "," + (this.field2683 >> 6) + "," + (this.field2684 >> 6) + "," + (this.field2683 & 0x3F) + "," + (this.field2684 & 0x3F);
    }
}
