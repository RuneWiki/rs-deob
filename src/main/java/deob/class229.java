package deob;

@ObfuscatedName("hc")
public class class229 {

    @ObfuscatedName("hc.f")
    public int field2623;

    @ObfuscatedName("hc.h")
    public int field2620;

    @ObfuscatedName("hc.e")
    public int field2621;

    public class229() {
        this.field2623 = -1;
    }

    public class229(int arg0, int arg1, int arg2) {
        this.field2623 = arg0;
        this.field2620 = arg1;
        this.field2621 = arg2;
    }

    public class229(class229 arg0) {
        this.field2623 = arg0.field2623;
        this.field2620 = arg0.field2620;
        this.field2621 = arg0.field2621;
    }

    public class229(int arg0) {
        if (arg0 == -1) {
            this.field2623 = -1;
        } else {
            this.field2623 = arg0 >> 28 & 0x3;
            this.field2620 = arg0 >> 14 & 0x3FFF;
            this.field2621 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hc.f(IIII)V")
    public void method4128(int arg0, int arg1, int arg2) {
        this.field2623 = arg0;
        this.field2620 = arg1;
        this.field2621 = arg2;
    }

    @ObfuscatedName("hc.h(I)I")
    public int method4129() {
        return this.field2623 << 28 | this.field2620 << 14 | this.field2621;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class229)) {
            return this.method4112((class229) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hc.e(Lhc;S)Z")
    public boolean method4112(class229 arg0) {
        if (this.field2623 != arg0.field2623) {
            return false;
        } else if (this.field2620 == arg0.field2620) {
            return this.field2621 == arg0.field2621;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4129();
    }

    public String toString() {
        return this.method4114(",");
    }

    @ObfuscatedName("hc.b(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4114(String arg0) {
        return this.field2623 + arg0 + (this.field2620 >> 6) + arg0 + (this.field2621 >> 6) + arg0 + (this.field2620 & 0x3F) + arg0 + (this.field2621 & 0x3F);
    }
}
