package deob;

@ObfuscatedName("lt")
public class class304 {

    @ObfuscatedName("lt.aj")
    public int field3434;

    @ObfuscatedName("lt.al")
    public int field3429;

    @ObfuscatedName("lt.ac")
    public int field3431;

    public class304(int arg0, int arg1, int arg2) {
        this.field3434 = arg0;
        this.field3429 = arg1;
        this.field3431 = arg2;
    }

    public class304(class304 arg0) {
        this.field3434 = arg0.field3434;
        this.field3429 = arg0.field3429;
        this.field3431 = arg0.field3431;
    }

    public class304(int arg0) {
        if (arg0 == -1) {
            this.field3434 = -1;
        } else {
            this.field3434 = arg0 >> 28 & 0x3;
            this.field3429 = arg0 >> 14 & 0x3FFF;
            this.field3431 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("lt.aj(I)I")
    public int method5208() {
        return method4737(this.field3434, this.field3429, this.field3431);
    }

    @ObfuscatedName("jh.al(IIII)I")
    public static int method4737(int arg0, int arg1, int arg2) {
        return arg0 << 28 | arg1 << 14 | arg2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class304)) {
            return this.method5205((class304) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("lt.ac(Llt;I)Z")
    public boolean method5205(class304 arg0) {
        if (this.field3434 != arg0.field3434) {
            return false;
        } else if (this.field3429 == arg0.field3429) {
            return this.field3431 == arg0.field3431;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5208();
    }

    public String toString() {
        return this.method5203(",");
    }

    @ObfuscatedName("lt.ab(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5203(String arg0) {
        return this.field3434 + arg0 + (this.field3429 >> 6) + arg0 + (this.field3431 >> 6) + arg0 + (this.field3429 & 0x3F) + arg0 + (this.field3431 & 0x3F);
    }
}
