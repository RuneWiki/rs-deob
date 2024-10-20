package deob;

@ObfuscatedName("im")
public class class239 {

    @ObfuscatedName("im.c")
    public int field2780;

    @ObfuscatedName("im.i")
    public int field2775;

    @ObfuscatedName("im.o")
    public int field2777;

    public class239() {
        this.field2780 = -1;
    }

    public class239(int arg0, int arg1, int arg2) {
        this.field2780 = arg0;
        this.field2775 = arg1;
        this.field2777 = arg2;
    }

    public class239(class239 arg0) {
        this.field2780 = arg0.field2780;
        this.field2775 = arg0.field2775;
        this.field2777 = arg0.field2777;
    }

    public class239(int arg0) {
        if (arg0 == -1) {
            this.field2780 = -1;
        } else {
            this.field2780 = arg0 >> 28 & 0x3;
            this.field2775 = arg0 >> 14 & 0x3FFF;
            this.field2777 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("im.c(IIIB)V")
    public void method4035(int arg0, int arg1, int arg2) {
        this.field2780 = arg0;
        this.field2775 = arg1;
        this.field2777 = arg2;
    }

    @ObfuscatedName("im.i(B)I")
    public int method4036() {
        return this.field2780 << 28 | this.field2775 << 14 | this.field2777;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class239)) {
            return this.method4042((class239) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("im.o(Lim;I)Z")
    public boolean method4042(class239 arg0) {
        if (this.field2780 != arg0.field2780) {
            return false;
        } else if (this.field2775 == arg0.field2775) {
            return this.field2777 == arg0.field2777;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4036();
    }

    public String toString() {
        return this.method4039(",");
    }

    @ObfuscatedName("im.j(Ljava/lang/String;B)Ljava/lang/String;")
    public String method4039(String arg0) {
        return this.field2780 + arg0 + (this.field2775 >> 6) + arg0 + (this.field2777 >> 6) + arg0 + (this.field2775 & 0x3F) + arg0 + (this.field2777 & 0x3F);
    }
}
