package deob;

@ObfuscatedName("lb")
public class class308 {

    @ObfuscatedName("lb.af")
    public int field3487;

    @ObfuscatedName("lb.an")
    public int field3486;

    @ObfuscatedName("lb.aw")
    public int field3488;

    public class308(int arg0, int arg1, int arg2) {
        this.field3487 = arg0;
        this.field3486 = arg1;
        this.field3488 = arg2;
    }

    public class308(class308 arg0) {
        this.field3487 = arg0.field3487;
        this.field3486 = arg0.field3486;
        this.field3488 = arg0.field3488;
    }

    public class308(int arg0) {
        if (arg0 == -1) {
            this.field3487 = -1;
        } else {
            this.field3487 = arg0 >> 28 & 0x3;
            this.field3486 = arg0 >> 14 & 0x3FFF;
            this.field3488 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("lb.af(I)I")
    public int method5414() {
        return method5129(this.field3487, this.field3486, this.field3488);
    }

    @ObfuscatedName("ks.an(IIIB)I")
    public static int method5129(int arg0, int arg1, int arg2) {
        return arg0 << 28 | arg1 << 14 | arg2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class308)) {
            return this.method5412((class308) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("lb.aw(Llb;I)Z")
    public boolean method5412(class308 arg0) {
        if (this.field3487 != arg0.field3487) {
            return false;
        } else if (this.field3486 == arg0.field3486) {
            return this.field3488 == arg0.field3488;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5414();
    }

    public String toString() {
        return this.method5415(",");
    }

    @ObfuscatedName("lb.ac(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5415(String arg0) {
        return this.field3487 + arg0 + (this.field3486 >> 6) + arg0 + (this.field3488 >> 6) + arg0 + (this.field3486 & 0x3F) + arg0 + (this.field3488 & 0x3F);
    }
}
