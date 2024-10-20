package deob;

@ObfuscatedName("mc")
public class class323 {

    @ObfuscatedName("mc.au")
    public int field3544;

    @ObfuscatedName("mc.ae")
    public int field3543;

    @ObfuscatedName("mc.ao")
    public int field3545;

    public class323(int arg0, int arg1, int arg2) {
        this.field3544 = arg0;
        this.field3543 = arg1;
        this.field3545 = arg2;
    }

    public class323(class323 arg0) {
        this.field3544 = arg0.field3544;
        this.field3543 = arg0.field3543;
        this.field3545 = arg0.field3545;
    }

    public class323(int arg0) {
        if (arg0 == -1) {
            this.field3544 = -1;
        } else {
            this.field3544 = arg0 >> 28 & 0x3;
            this.field3543 = arg0 >> 14 & 0x3FFF;
            this.field3545 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("mc.au(I)I")
    public int method5500() {
        int var1 = this.field3544;
        int var2 = this.field3543;
        int var3 = this.field3545;
        return var1 << 28 | var2 << 14 | var3;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class323)) {
            return this.method5487((class323) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("mc.ae(Lmc;B)Z")
    public boolean method5487(class323 arg0) {
        if (this.field3544 != arg0.field3544) {
            return false;
        } else if (this.field3543 == arg0.field3543) {
            return this.field3545 == arg0.field3545;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5500();
    }

    public String toString() {
        return this.method5488(",");
    }

    @ObfuscatedName("mc.ao(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5488(String arg0) {
        return this.field3544 + arg0 + (this.field3543 >> 6) + arg0 + (this.field3545 >> 6) + arg0 + (this.field3543 & 0x3F) + arg0 + (this.field3545 & 0x3F);
    }
}
