package deob;

@ObfuscatedName("hy")
public class class213 {

    @ObfuscatedName("hy.d")
    public int field2591;

    @ObfuscatedName("hy.q")
    public int field2592;

    @ObfuscatedName("hy.x")
    public int field2593;

    public class213() {
        this.field2591 = -1;
    }

    public class213(int arg0, int arg1, int arg2) {
        this.field2591 = arg0;
        this.field2592 = arg1;
        this.field2593 = arg2;
    }

    public class213(class213 arg0) {
        this.field2591 = arg0.field2591;
        this.field2592 = arg0.field2592;
        this.field2593 = arg0.field2593;
    }

    public class213(int arg0) {
        if (arg0 == -1) {
            this.field2591 = -1;
        } else {
            this.field2591 = arg0 >> 28 & 0x3;
            this.field2592 = arg0 >> 14 & 0x3FFF;
            this.field2593 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hy.d(IIII)V")
    public void method3597(int arg0, int arg1, int arg2) {
        this.field2591 = arg0;
        this.field2592 = arg1;
        this.field2593 = arg2;
    }

    @ObfuscatedName("hy.q(I)I")
    public int method3598() {
        return this.field2591 << 28 | this.field2592 << 14 | this.field2593;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class213)) {
            return this.method3596((class213) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hy.x(Lhy;I)Z")
    public boolean method3596(class213 arg0) {
        if (this.field2591 != arg0.field2591) {
            return false;
        } else if (this.field2592 == arg0.field2592) {
            return this.field2593 == arg0.field2593;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3598();
    }

    public String toString() {
        return this.field2591 + "," + (this.field2592 >> 6) + "," + (this.field2593 >> 6) + "," + (this.field2592 & 0x3F) + "," + (this.field2593 & 0x3F);
    }
}
