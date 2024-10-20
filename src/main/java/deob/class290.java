package deob;

@ObfuscatedName("kd")
public class class290 {

    @ObfuscatedName("kd.o")
    public int field3350;

    @ObfuscatedName("kd.q")
    public int field3351;

    @ObfuscatedName("kd.l")
    public int field3354;

    public class290(int arg0, int arg1, int arg2) {
        this.field3350 = arg0;
        this.field3351 = arg1;
        this.field3354 = arg2;
    }

    public class290(class290 arg0) {
        this.field3350 = arg0.field3350;
        this.field3351 = arg0.field3351;
        this.field3354 = arg0.field3354;
    }

    public class290(int arg0) {
        if (arg0 == -1) {
            this.field3350 = -1;
        } else {
            this.field3350 = arg0 >> 28 & 0x3;
            this.field3351 = arg0 >> 14 & 0x3FFF;
            this.field3354 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("kd.o(B)I")
    public int method4908() {
        int var1 = this.field3350;
        int var2 = this.field3351;
        int var3 = this.field3354;
        return var1 << 28 | var2 << 14 | var3;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class290)) {
            return this.method4909((class290) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kd.q(Lkd;I)Z")
    public boolean method4909(class290 arg0) {
        if (this.field3350 != arg0.field3350) {
            return false;
        } else if (this.field3351 == arg0.field3351) {
            return this.field3354 == arg0.field3354;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method4908();
    }

    public String toString() {
        return this.method4923(",");
    }

    @ObfuscatedName("kd.l(Ljava/lang/String;I)Ljava/lang/String;")
    public String method4923(String arg0) {
        return this.field3350 + arg0 + (this.field3351 >> 6) + arg0 + (this.field3354 >> 6) + arg0 + (this.field3351 & 0x3F) + arg0 + (this.field3354 & 0x3F);
    }
}
