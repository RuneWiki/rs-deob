package deob;

@ObfuscatedName("hx")
public class class214 {

    @ObfuscatedName("hx.u")
    public int field2540;

    @ObfuscatedName("hx.f")
    public int field2536;

    @ObfuscatedName("hx.b")
    public int field2535;

    public class214(int arg0, int arg1, int arg2) {
        this.field2540 = arg0;
        this.field2536 = arg1;
        this.field2535 = arg2;
    }

    public class214(class214 arg0) {
        this.field2540 = arg0.field2540;
        this.field2536 = arg0.field2536;
        this.field2535 = arg0.field2535;
    }

    public class214(int arg0) {
        if (arg0 == -1) {
            this.field2540 = -1;
        } else {
            this.field2540 = arg0 >> 28 & 0x3;
            this.field2536 = arg0 >> 14 & 0x3FFF;
            this.field2535 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hx.u(I)I")
    public int method3677() {
        return this.field2540 << 28 | this.field2536 << 14 | this.field2535;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class214)) {
            return this.method3690((class214) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hx.f(Lhx;I)Z")
    public boolean method3690(class214 arg0) {
        if (this.field2540 != arg0.field2540) {
            return false;
        } else if (this.field2536 == arg0.field2536) {
            return this.field2535 == arg0.field2535;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method3677();
    }

    public String toString() {
        return this.method3678(",");
    }

    @ObfuscatedName("hx.b(Ljava/lang/String;B)Ljava/lang/String;")
    public String method3678(String arg0) {
        return this.field2540 + arg0 + (this.field2536 >> 6) + arg0 + (this.field2535 >> 6) + arg0 + (this.field2536 & 0x3F) + arg0 + (this.field2535 & 0x3F);
    }
}
