package deob;

@ObfuscatedName("hq")
public class class214 {

    @ObfuscatedName("hq.e")
    public int field2589;

    @ObfuscatedName("hq.n")
    public int field2588;

    @ObfuscatedName("hq.g")
    public int field2591;

    public class214() {
        this.field2589 = -1;
    }

    public class214(int arg0, int arg1, int arg2) {
        this.field2589 = arg0;
        this.field2588 = arg1;
        this.field2591 = arg2;
    }

    public class214(class214 arg0) {
        this.field2589 = arg0.field2589;
        this.field2588 = arg0.field2588;
        this.field2591 = arg0.field2591;
    }

    public class214(int arg0) {
        if (arg0 == -1) {
            this.field2589 = -1;
        } else {
            this.field2589 = arg0 >> 28 & 0x3;
            this.field2588 = arg0 >> 14 & 0x3FFF;
            this.field2591 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hq.e(IIIS)V")
    public void method3652(int arg0, int arg1, int arg2) {
        this.field2589 = arg0;
        this.field2588 = arg1;
        this.field2591 = arg2;
    }

    @ObfuscatedName("hq.n(B)I")
    public int method3653() {
        return this.field2589 << 28 | this.field2588 << 14 | this.field2591;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class214)) {
            return this.method3651((class214) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hq.g(Lhq;B)Z")
    public boolean method3651(class214 arg0) {
        if (this.field2589 != arg0.field2589) {
            return false;
        } else if (this.field2588 == arg0.field2588) {
            return this.field2591 == arg0.field2591;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3653();
    }

    public String toString() {
        return this.field2589 + "," + (this.field2588 >> 6) + "," + (this.field2591 >> 6) + "," + (this.field2588 & 0x3F) + "," + (this.field2591 & 0x3F);
    }
}
