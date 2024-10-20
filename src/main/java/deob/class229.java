package deob;

@ObfuscatedName("hm")
public class class229 {

    @ObfuscatedName("hm.y")
    public int field2610;

    @ObfuscatedName("hm.c")
    public int field2605;

    @ObfuscatedName("hm.n")
    public int field2606;

    public class229() {
        this.field2610 = -1;
    }

    public class229(int arg0, int arg1, int arg2) {
        this.field2610 = arg0;
        this.field2605 = arg1;
        this.field2606 = arg2;
    }

    public class229(class229 arg0) {
        this.field2610 = arg0.field2610;
        this.field2605 = arg0.field2605;
        this.field2606 = arg0.field2606;
    }

    public class229(int arg0) {
        if (arg0 == -1) {
            this.field2610 = -1;
        } else {
            this.field2610 = arg0 >> 28 & 0x3;
            this.field2605 = arg0 >> 14 & 0x3FFF;
            this.field2606 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("hm.y(IIII)V")
    public void method4074(int arg0, int arg1, int arg2) {
        this.field2610 = arg0;
        this.field2605 = arg1;
        this.field2606 = arg2;
    }

    @ObfuscatedName("hm.c(B)I")
    public int method4088() {
        return this.field2610 << 28 | this.field2605 << 14 | this.field2606;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class229)) {
            return this.method4076((class229) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("hm.n(Lhm;S)Z")
    public boolean method4076(class229 arg0) {
        if (this.field2610 != arg0.field2610) {
            return false;
        } else if (this.field2605 == arg0.field2605) {
            return this.field2606 == arg0.field2606;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4088();
    }

    public String toString() {
        return this.method4078(",");
    }

    @ObfuscatedName("hm.u(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4078(String arg0) {
        return this.field2610 + arg0 + (this.field2605 >> 6) + arg0 + (this.field2606 >> 6) + arg0 + (this.field2605 & 0x3F) + arg0 + (this.field2606 & 0x3F);
    }
}
