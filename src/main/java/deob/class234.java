package deob;

@ObfuscatedName("ho")
public class class234 {

    @ObfuscatedName("ho.n")
    public int field2639;

    @ObfuscatedName("ho.h")
    public int field2637;

    @ObfuscatedName("ho.l")
    public int field2638;

    public class234(int arg0, int arg1, int arg2) {
        this.field2639 = arg0;
        this.field2637 = arg1;
        this.field2638 = arg2;
    }

    public class234(class234 arg0) {
        this.field2639 = arg0.field2639;
        this.field2637 = arg0.field2637;
        this.field2638 = arg0.field2638;
    }

    public class234(int arg0) {
        if (arg0 == -1) {
            this.field2639 = -1;
        } else {
            this.field2639 = arg0 >> 28 & 0x3;
            this.field2637 = arg0 >> 14 & 0x3FFF;
            this.field2638 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ho.n(I)I")
    public int method4313() {
        return this.field2639 << 28 | this.field2637 << 14 | this.field2638;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class234)) {
            return this.method4316((class234) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ho.h(Lho;I)Z")
    public boolean method4316(class234 arg0) {
        if (this.field2639 != arg0.field2639) {
            return false;
        } else if (this.field2637 == arg0.field2637) {
            return this.field2638 == arg0.field2638;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4313();
    }

    public String toString() {
        return this.method4318(",");
    }

    @ObfuscatedName("ho.l(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4318(String arg0) {
        return this.field2639 + arg0 + (this.field2637 >> 6) + arg0 + (this.field2638 >> 6) + arg0 + (this.field2637 & 0x3F) + arg0 + (this.field2638 & 0x3F);
    }
}
