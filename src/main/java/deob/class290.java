package deob;

@ObfuscatedName("ku")
public class class290 {

    @ObfuscatedName("ku.s")
    public int field3318;

    @ObfuscatedName("ku.h")
    public int field3320;

    @ObfuscatedName("ku.w")
    public int field3317;

    public class290(int arg0, int arg1, int arg2) {
        this.field3318 = arg0;
        this.field3320 = arg1;
        this.field3317 = arg2;
    }

    public class290(class290 arg0) {
        this.field3318 = arg0.field3318;
        this.field3320 = arg0.field3320;
        this.field3317 = arg0.field3317;
    }

    public class290(int arg0) {
        if (arg0 == -1) {
            this.field3318 = -1;
        } else {
            this.field3318 = arg0 >> 28 & 0x3;
            this.field3320 = arg0 >> 14 & 0x3FFF;
            this.field3317 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ku.s(B)I")
    public int method4907() {
        int var1 = this.field3318;
        int var2 = this.field3320;
        int var3 = this.field3317;
        return var1 << 28 | var2 << 14 | var3;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class290)) {
            return this.method4920((class290) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ku.h(Lku;I)Z")
    public boolean method4920(class290 arg0) {
        if (this.field3318 != arg0.field3318) {
            return false;
        } else if (this.field3320 == arg0.field3320) {
            return this.field3317 == arg0.field3317;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4907();
    }

    public String toString() {
        return this.method4909(",");
    }

    @ObfuscatedName("ku.w(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4909(String arg0) {
        return this.field3318 + arg0 + (this.field3320 >> 6) + arg0 + (this.field3317 >> 6) + arg0 + (this.field3320 & 0x3F) + arg0 + (this.field3317 & 0x3F);
    }
}
