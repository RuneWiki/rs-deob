package deob;

@ObfuscatedName("ks")
public class class290 {

    @ObfuscatedName("ks.v")
    public int field3288;

    @ObfuscatedName("ks.c")
    public int field3287;

    @ObfuscatedName("ks.i")
    public int field3286;

    public class290(int arg0, int arg1, int arg2) {
        this.field3288 = arg0;
        this.field3287 = arg1;
        this.field3286 = arg2;
    }

    public class290(class290 arg0) {
        this.field3288 = arg0.field3288;
        this.field3287 = arg0.field3287;
        this.field3286 = arg0.field3286;
    }

    public class290(int arg0) {
        if (arg0 == -1) {
            this.field3288 = -1;
        } else {
            this.field3288 = arg0 >> 28 & 0x3;
            this.field3287 = arg0 >> 14 & 0x3FFF;
            this.field3286 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ks.v(B)I")
    public int method4980() {
        return method5694(this.field3288, this.field3287, this.field3286);
    }

    @ObfuscatedName("mq.c(IIII)I")
    public static int method5694(int arg0, int arg1, int arg2) {
        return arg0 << 28 | arg1 << 14 | arg2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class290)) {
            return this.method4998((class290) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ks.i(Lks;B)Z")
    public boolean method4998(class290 arg0) {
        if (this.field3288 != arg0.field3288) {
            return false;
        } else if (this.field3287 == arg0.field3287) {
            return this.field3286 == arg0.field3286;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4980();
    }

    public String toString() {
        return this.method4982(",");
    }

    @ObfuscatedName("ks.f(Ljava/lang/String;B)Ljava/lang/String;")
    public String method4982(String arg0) {
        return this.field3288 + arg0 + (this.field3287 >> 6) + arg0 + (this.field3286 >> 6) + arg0 + (this.field3287 & 0x3F) + arg0 + (this.field3286 & 0x3F);
    }
}
