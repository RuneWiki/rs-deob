package deob;

@ObfuscatedName("ky")
public class class297 {

    @ObfuscatedName("ky.h")
    public int field3450;

    @ObfuscatedName("ky.e")
    public int field3451;

    @ObfuscatedName("ky.v")
    public int field3452;

    public class297(int arg0, int arg1, int arg2) {
        this.field3450 = arg0;
        this.field3451 = arg1;
        this.field3452 = arg2;
    }

    public class297(class297 arg0) {
        this.field3450 = arg0.field3450;
        this.field3451 = arg0.field3451;
        this.field3452 = arg0.field3452;
    }

    public class297(int arg0) {
        if (arg0 == -1) {
            this.field3450 = -1;
        } else {
            this.field3450 = arg0 >> 28 & 0x3;
            this.field3451 = arg0 >> 14 & 0x3FFF;
            this.field3452 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("ky.h(B)I")
    public int method5225() {
        return method2907(this.field3450, this.field3451, this.field3452);
    }

    @ObfuscatedName("ea.e(IIIB)I")
    public static int method2907(int arg0, int arg1, int arg2) {
        return arg0 << 28 | arg1 << 14 | arg2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class297)) {
            return this.method5224((class297) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ky.v(Lky;I)Z")
    public boolean method5224(class297 arg0) {
        if (this.field3450 != arg0.field3450) {
            return false;
        } else if (this.field3451 == arg0.field3451) {
            return this.field3452 == arg0.field3452;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5225();
    }

    public String toString() {
        return this.method5236(",");
    }

    @ObfuscatedName("ky.x(Ljava/lang/String;B)Ljava/lang/String;")
    public String method5236(String arg0) {
        return this.field3450 + arg0 + (this.field3451 >> 6) + arg0 + (this.field3452 >> 6) + arg0 + (this.field3451 & 0x3F) + arg0 + (this.field3452 & 0x3F);
    }
}
