package deob;

@ObfuscatedName("nn")
public class class339 {

    @ObfuscatedName("nn.az")
    public int field3637;

    @ObfuscatedName("nn.ah")
    public int field3638;

    @ObfuscatedName("nn.af")
    public int field3640;

    public class339(int arg0, int arg1, int arg2) {
        this.field3637 = arg0;
        this.field3638 = arg1;
        this.field3640 = arg2;
    }

    public class339(class339 arg0) {
        this.field3637 = arg0.field3637;
        this.field3638 = arg0.field3638;
        this.field3640 = arg0.field3640;
    }

    public class339(int arg0) {
        if (arg0 == -1) {
            this.field3637 = -1;
        } else {
            this.field3637 = arg0 >> 28 & 0x3;
            this.field3638 = arg0 >> 14 & 0x3FFF;
            this.field3640 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("nn.az(I)I")
    public int method5662() {
        return method2285(this.field3637, this.field3638, this.field3640);
    }

    @ObfuscatedName("de.ah(IIII)I")
    public static int method2285(int arg0, int arg1, int arg2) {
        return arg0 << 28 | arg1 << 14 | arg2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class339)) {
            return this.method5663((class339) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("nn.af(Lnn;I)Z")
    public boolean method5663(class339 arg0) {
        if (this.field3637 != arg0.field3637) {
            return false;
        } else if (this.field3638 == arg0.field3638) {
            return this.field3640 == arg0.field3640;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5662();
    }

    public String toString() {
        return this.method5669(",");
    }

    @ObfuscatedName("nn.at(Ljava/lang/String;S)Ljava/lang/String;")
    public String method5669(String arg0) {
        return this.field3637 + arg0 + (this.field3638 >> 6) + arg0 + (this.field3640 >> 6) + arg0 + (this.field3638 & 0x3F) + arg0 + (this.field3640 & 0x3F);
    }
}
