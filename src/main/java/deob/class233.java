package deob;

@ObfuscatedName("hp")
public class class233 {

    @ObfuscatedName("hp.b")
    public int field2741;

    @ObfuscatedName("hp.q")
    public int field2742;

    @ObfuscatedName("hp.o")
    public int field2743;

    public class233() {
        this.field2741 = -1;
    }

    public class233(int arg0, int arg1, int arg2) {
        this.field2741 = arg0;
        this.field2742 = arg1;
        this.field2743 = arg2;
    }

    public class233(class233 arg0) {
        this.field2741 = arg0.field2741;
        this.field2742 = arg0.field2742;
        this.field2743 = arg0.field2743;
    }

    public class233(int arg0) {
        if (arg0 == -1) {
            this.field2741 = -1;
        } else {
            this.field2741 = arg0 >> 28 & 0x3;
            this.field2742 = arg0 >> 14 & 0x3FFF;
            this.field2743 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hp.b(IIII)V")
    public void method4025(int arg0, int arg1, int arg2) {
        this.field2741 = arg0;
        this.field2742 = arg1;
        this.field2743 = arg2;
    }

    @ObfuscatedName("hp.q(B)I")
    public int method4027() {
        return this.field2741 << 28 | this.field2742 << 14 | this.field2743;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class233)) {
            return this.method4026((class233) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hp.o(Lhp;I)Z")
    public boolean method4026(class233 arg0) {
        if (this.field2741 != arg0.field2741) {
            return false;
        } else if (this.field2742 == arg0.field2742) {
            return this.field2743 == arg0.field2743;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4027();
    }

    public String toString() {
        return this.field2741 + "," + (this.field2742 >> 6) + "," + (this.field2743 >> 6) + "," + (this.field2742 & 0x3F) + "," + (this.field2743 & 0x3F);
    }
}
