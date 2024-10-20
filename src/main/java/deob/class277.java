package deob;

@ObfuscatedName("ju")
public class class277 {

    @ObfuscatedName("ju.c")
    public int field3193;

    @ObfuscatedName("ju.b")
    public int field3188;

    @ObfuscatedName("ju.p")
    public int field3189;

    public class277(int arg0, int arg1, int arg2) {
        this.field3193 = arg0;
        this.field3188 = arg1;
        this.field3189 = arg2;
    }

    public class277(class277 arg0) {
        this.field3193 = arg0.field3193;
        this.field3188 = arg0.field3188;
        this.field3189 = arg0.field3189;
    }

    public class277(int arg0) {
        if (arg0 == -1) {
            this.field3193 = -1;
        } else {
            this.field3193 = arg0 >> 28 & 0x3;
            this.field3188 = arg0 >> 14 & 0x3FFF;
            this.field3189 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ju.c(I)I")
    public int method4833() {
        int var1 = this.field3193;
        int var2 = this.field3188;
        int var3 = this.field3189;
        return var1 << 28 | var2 << 14 | var3;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class277)) {
            return this.method4835((class277) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ju.b(Lju;B)Z")
    public boolean method4835(class277 arg0) {
        if (this.field3193 != arg0.field3193) {
            return false;
        } else if (this.field3188 == arg0.field3188) {
            return this.field3189 == arg0.field3189;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4833();
    }

    public String toString() {
        return this.method4837(",");
    }

    @ObfuscatedName("ju.p(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4837(String arg0) {
        return this.field3193 + arg0 + (this.field3188 >> 6) + arg0 + (this.field3189 >> 6) + arg0 + (this.field3188 & 0x3F) + arg0 + (this.field3189 & 0x3F);
    }
}
