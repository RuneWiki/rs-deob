package deob;

@ObfuscatedName("mg")
public class class321 {

    @ObfuscatedName("mg.at")
    public int field3516;

    @ObfuscatedName("mg.an")
    public int field3517;

    @ObfuscatedName("mg.av")
    public int field3515;

    public class321(int arg0, int arg1, int arg2) {
        this.field3516 = arg0;
        this.field3517 = arg1;
        this.field3515 = arg2;
    }

    public class321(class321 arg0) {
        this.field3516 = arg0.field3516;
        this.field3517 = arg0.field3517;
        this.field3515 = arg0.field3515;
    }

    public class321(int arg0) {
        if (arg0 == -1) {
            this.field3516 = -1;
        } else {
            this.field3516 = arg0 >> 28 & 0x3;
            this.field3517 = arg0 >> 14 & 0x3FFF;
            this.field3515 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("mg.at(I)I")
    public int method5394() {
        int var1 = this.field3516;
        int var2 = this.field3517;
        int var3 = this.field3515;
        return var1 << 28 | var2 << 14 | var3;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class321)) {
            return this.method5395((class321) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("mg.an(Lmg;B)Z")
    public boolean method5395(class321 arg0) {
        if (this.field3516 != arg0.field3516) {
            return false;
        } else if (this.field3517 == arg0.field3517) {
            return this.field3515 == arg0.field3515;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5394();
    }

    public String toString() {
        return this.method5397(",");
    }

    @ObfuscatedName("mg.av(Ljava/lang/String;B)Ljava/lang/String;")
    public String method5397(String arg0) {
        return this.field3516 + arg0 + (this.field3517 >> 6) + arg0 + (this.field3515 >> 6) + arg0 + (this.field3517 & 0x3F) + arg0 + (this.field3515 & 0x3F);
    }
}
