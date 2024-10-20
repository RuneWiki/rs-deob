package deob;

@ObfuscatedName("mu")
public class class337 {

    @ObfuscatedName("mu.am")
    public int field3605;

    @ObfuscatedName("mu.ap")
    public int field3604;

    @ObfuscatedName("mu.af")
    public int field3603;

    public class337(int arg0, int arg1, int arg2) {
        this.field3605 = arg0;
        this.field3604 = arg1;
        this.field3603 = arg2;
    }

    public class337(class337 arg0) {
        this.field3605 = arg0.field3605;
        this.field3604 = arg0.field3604;
        this.field3603 = arg0.field3603;
    }

    public class337(int arg0) {
        if (arg0 == -1) {
            this.field3605 = -1;
        } else {
            this.field3605 = arg0 >> 28 & 0x3;
            this.field3604 = arg0 >> 14 & 0x3FFF;
            this.field3603 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("mu.am(I)I")
    public int method5721() {
        int var1 = this.field3605;
        int var2 = this.field3604;
        int var3 = this.field3603;
        return var1 << 28 | var2 << 14 | var3;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class337)) {
            return this.method5722((class337) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("mu.ap(Lmu;I)Z")
    public boolean method5722(class337 arg0) {
        if (this.field3605 != arg0.field3605) {
            return false;
        } else if (this.field3604 == arg0.field3604) {
            return this.field3603 == arg0.field3603;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method5721();
    }

    public String toString() {
        return this.method5724(",");
    }

    @ObfuscatedName("mu.af(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5724(String arg0) {
        return this.field3605 + arg0 + (this.field3604 >> 6) + arg0 + (this.field3603 >> 6) + arg0 + (this.field3604 & 0x3F) + arg0 + (this.field3603 & 0x3F);
    }
}
