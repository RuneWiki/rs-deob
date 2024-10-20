package deob;

@ObfuscatedName("nj")
public class class347 {

    @ObfuscatedName("nj.ak")
    public int field3715;

    @ObfuscatedName("nj.al")
    public int field3714;

    @ObfuscatedName("nj.aj")
    public int field3713;

    public class347(int arg0, int arg1, int arg2) {
        this.field3715 = arg0;
        this.field3714 = arg1;
        this.field3713 = arg2;
    }

    public class347(class347 arg0) {
        this.field3715 = arg0.field3715;
        this.field3714 = arg0.field3714;
        this.field3713 = arg0.field3713;
    }

    public class347(int arg0) {
        if (arg0 == -1) {
            this.field3715 = -1;
        } else {
            this.field3715 = arg0 >> 28 & 0x3;
            this.field3714 = arg0 >> 14 & 0x3FFF;
            this.field3713 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("nj.ak(B)I")
    public int method5886() {
        return method1127(this.field3715, this.field3714, this.field3713);
    }

    @ObfuscatedName("cf.al(IIII)I")
    public static int method1127(int arg0, int arg1, int arg2) {
        return arg0 << 28 | arg1 << 14 | arg2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class347)) {
            return this.method5887((class347) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("nj.aj(Lnj;B)Z")
    public boolean method5887(class347 arg0) {
        if (this.field3715 != arg0.field3715) {
            return false;
        } else if (this.field3714 == arg0.field3714) {
            return this.field3713 == arg0.field3713;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5886();
    }

    public String toString() {
        return this.method5894(",");
    }

    @ObfuscatedName("nj.az(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5894(String arg0) {
        return this.field3715 + arg0 + (this.field3714 >> 6) + arg0 + (this.field3713 >> 6) + arg0 + (this.field3714 & 0x3F) + arg0 + (this.field3713 & 0x3F);
    }
}
