package deob;

@ObfuscatedName("ii")
public class class243 {

    @ObfuscatedName("ii.v")
    public int field2924;

    @ObfuscatedName("ii.n")
    public int field2926;

    @ObfuscatedName("ii.f")
    public int field2925;

    public class243(int arg0, int arg1, int arg2) {
        this.field2924 = arg0;
        this.field2926 = arg1;
        this.field2925 = arg2;
    }

    public class243(class243 arg0) {
        this.field2924 = arg0.field2924;
        this.field2926 = arg0.field2926;
        this.field2925 = arg0.field2925;
    }

    public class243(int arg0) {
        if (arg0 == -1) {
            this.field2924 = -1;
        } else {
            this.field2924 = arg0 >> 28 & 0x3;
            this.field2926 = arg0 >> 14 & 0x3FFF;
            this.field2925 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ii.v(I)I")
    public int method4224() {
        return this.field2924 << 28 | this.field2926 << 14 | this.field2925;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class243)) {
            return this.method4236((class243) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ii.n(Lii;B)Z")
    public boolean method4236(class243 arg0) {
        if (this.field2924 != arg0.field2924) {
            return false;
        } else if (this.field2926 == arg0.field2926) {
            return this.field2925 == arg0.field2925;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4224();
    }

    public String toString() {
        return this.method4223(",");
    }

    @ObfuscatedName("ii.f(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4223(String arg0) {
        return this.field2924 + arg0 + (this.field2926 >> 6) + arg0 + (this.field2925 >> 6) + arg0 + (this.field2926 & 0x3F) + arg0 + (this.field2925 & 0x3F);
    }
}
