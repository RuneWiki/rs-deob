package deob;

@ObfuscatedName("jd")
public class class282 {

    @ObfuscatedName("jd.c")
    public int field3227;

    @ObfuscatedName("jd.l")
    public int field3228;

    @ObfuscatedName("jd.s")
    public int field3229;

    public class282(int arg0, int arg1, int arg2) {
        this.field3227 = arg0;
        this.field3228 = arg1;
        this.field3229 = arg2;
    }

    public class282(class282 arg0) {
        this.field3227 = arg0.field3227;
        this.field3228 = arg0.field3228;
        this.field3229 = arg0.field3229;
    }

    public class282(int arg0) {
        if (arg0 == -1) {
            this.field3227 = -1;
        } else {
            this.field3227 = arg0 >> 28 & 0x3;
            this.field3228 = arg0 >> 14 & 0x3FFF;
            this.field3229 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("jd.c(B)I")
    public int method4817() {
        return method2628(this.field3227, this.field3228, this.field3229);
    }

    @ObfuscatedName("eh.l(IIIB)I")
    public static int method2628(int arg0, int arg1, int arg2) {
        return arg0 << 28 | arg1 << 14 | arg2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class282)) {
            return this.method4805((class282) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("jd.s(Ljd;B)Z")
    public boolean method4805(class282 arg0) {
        if (this.field3227 != arg0.field3227) {
            return false;
        } else if (this.field3228 == arg0.field3228) {
            return this.field3229 == arg0.field3229;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4817();
    }

    public String toString() {
        return this.method4807(",");
    }

    @ObfuscatedName("jd.e(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4807(String arg0) {
        return this.field3227 + arg0 + (this.field3228 >> 6) + arg0 + (this.field3229 >> 6) + arg0 + (this.field3228 & 0x3F) + arg0 + (this.field3229 & 0x3F);
    }
}
