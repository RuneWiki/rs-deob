package deob;

@ObfuscatedName("hx")
public class class229 {

    @ObfuscatedName("hx.f")
    public int field2633;

    @ObfuscatedName("hx.l")
    public int field2634;

    @ObfuscatedName("hx.w")
    public int field2632;

    public class229() {
        this.field2633 = -1;
    }

    public class229(int arg0, int arg1, int arg2) {
        this.field2633 = arg0;
        this.field2634 = arg1;
        this.field2632 = arg2;
    }

    public class229(class229 arg0) {
        this.field2633 = arg0.field2633;
        this.field2634 = arg0.field2634;
        this.field2632 = arg0.field2632;
    }

    public class229(int arg0) {
        if (arg0 == -1) {
            this.field2633 = -1;
        } else {
            this.field2633 = arg0 >> 28 & 0x3;
            this.field2634 = arg0 >> 14 & 0x3FFF;
            this.field2632 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hx.f(IIII)V")
    public void method4144(int arg0, int arg1, int arg2) {
        this.field2633 = arg0;
        this.field2634 = arg1;
        this.field2632 = arg2;
    }

    @ObfuscatedName("hx.l(B)I")
    public int method4133() {
        return this.field2633 << 28 | this.field2634 << 14 | this.field2632;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class229)) {
            return this.method4134((class229) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hx.w(Lhx;I)Z")
    public boolean method4134(class229 arg0) {
        if (this.field2633 != arg0.field2633) {
            return false;
        } else if (this.field2634 == arg0.field2634) {
            return this.field2632 == arg0.field2632;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4133();
    }

    public String toString() {
        return this.method4142(",");
    }

    @ObfuscatedName("hx.s(Ljava/lang/String;B)Ljava/lang/String;")
    public String method4142(String arg0) {
        return this.field2633 + arg0 + (this.field2634 >> 6) + arg0 + (this.field2632 >> 6) + arg0 + (this.field2634 & 0x3F) + arg0 + (this.field2632 & 0x3F);
    }
}
