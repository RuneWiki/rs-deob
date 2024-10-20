package deob;

@ObfuscatedName("hr")
public class class229 {

    @ObfuscatedName("hr.c")
    public int field2601;

    @ObfuscatedName("hr.q")
    public int field2600;

    @ObfuscatedName("hr.m")
    public int field2602;

    public class229() {
        this.field2601 = -1;
    }

    public class229(int arg0, int arg1, int arg2) {
        this.field2601 = arg0;
        this.field2600 = arg1;
        this.field2602 = arg2;
    }

    public class229(class229 arg0) {
        this.field2601 = arg0.field2601;
        this.field2600 = arg0.field2600;
        this.field2602 = arg0.field2602;
    }

    public class229(int arg0) {
        if (arg0 == -1) {
            this.field2601 = -1;
        } else {
            this.field2601 = arg0 >> 28 & 0x3;
            this.field2600 = arg0 >> 14 & 0x3FFF;
            this.field2602 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hr.c(IIII)V")
    public void method4045(int arg0, int arg1, int arg2) {
        this.field2601 = arg0;
        this.field2600 = arg1;
        this.field2602 = arg2;
    }

    @ObfuscatedName("hr.q(I)I")
    public int method4038() {
        return this.field2601 << 28 | this.field2600 << 14 | this.field2602;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class229)) {
            return this.method4048((class229) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hr.m(Lhr;I)Z")
    public boolean method4048(class229 arg0) {
        if (this.field2601 != arg0.field2601) {
            return false;
        } else if (this.field2600 == arg0.field2600) {
            return this.field2602 == arg0.field2602;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4038();
    }

    public String toString() {
        return this.method4040(",");
    }

    @ObfuscatedName("hr.j(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4040(String arg0) {
        return this.field2601 + arg0 + (this.field2600 >> 6) + arg0 + (this.field2602 >> 6) + arg0 + (this.field2600 & 0x3F) + arg0 + (this.field2602 & 0x3F);
    }
}
