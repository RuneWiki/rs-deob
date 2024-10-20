package deob;

@ObfuscatedName("mo")
public class class337 {

    @ObfuscatedName("mo.ac")
    public int field3575;

    @ObfuscatedName("mo.al")
    public int field3578;

    @ObfuscatedName("mo.ak")
    public int field3574;

    public class337(int arg0, int arg1, int arg2) {
        this.field3575 = arg0;
        this.field3578 = arg1;
        this.field3574 = arg2;
    }

    public class337(class337 arg0) {
        this.field3575 = arg0.field3575;
        this.field3578 = arg0.field3578;
        this.field3574 = arg0.field3574;
    }

    public class337(int arg0) {
        if (arg0 == -1) {
            this.field3575 = -1;
        } else {
            this.field3575 = arg0 >> 28 & 0x3;
            this.field3578 = arg0 >> 14 & 0x3FFF;
            this.field3574 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("mo.ac(I)I")
    public int method5621() {
        return Statics.method2298(this.field3575, this.field3578, this.field3574);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class337)) {
            return this.method5620((class337) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("mo.ak(Lmo;I)Z")
    public boolean method5620(class337 arg0) {
        if (this.field3575 != arg0.field3575) {
            return false;
        } else if (this.field3578 == arg0.field3578) {
            return this.field3574 == arg0.field3574;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5621();
    }

    public String toString() {
        return this.method5623(",");
    }

    @ObfuscatedName("mo.ax(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5623(String arg0) {
        return this.field3575 + arg0 + (this.field3578 >> 6) + arg0 + (this.field3574 >> 6) + arg0 + (this.field3578 & 0x3F) + arg0 + (this.field3574 & 0x3F);
    }
}
