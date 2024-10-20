package deob;

@ObfuscatedName("nn")
public class class351 {

    @ObfuscatedName("nn.ap")
    public int field3779;

    @ObfuscatedName("nn.aw")
    public int field3777;

    @ObfuscatedName("nn.ak")
    public int field3778;

    public class351() {
        this.field3779 = -1;
    }

    public class351(int arg0, int arg1, int arg2) {
        this.field3779 = arg0;
        this.field3777 = arg1;
        this.field3778 = arg2;
    }

    public class351(class351 arg0) {
        this.field3779 = arg0.field3779;
        this.field3777 = arg0.field3777;
        this.field3778 = arg0.field3778;
    }

    public class351(int arg0) {
        if (arg0 == -1) {
            this.field3779 = -1;
        } else {
            this.field3779 = arg0 >> 28 & 0x3;
            this.field3777 = arg0 >> 14 & 0x3FFF;
            this.field3778 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("nn.ap(IB)V")
    public void method6249(int arg0) {
        if (arg0 == -1) {
            this.field3779 = -1;
        } else {
            this.field3779 = arg0 >> 28 & 0x3;
            this.field3777 = arg0 >> 14 & 0x3FFF;
            this.field3778 = arg0 & 0x3FFF;
        }
    }

    @ObfuscatedName("nn.aw(I)I")
    public int method6250() {
        return method6256(this.field3779, this.field3777, this.field3778);
    }

    @ObfuscatedName("nn.ak(IIII)I")
    public static int method6256(int arg0, int arg1, int arg2) {
        return arg0 << 28 | arg1 << 14 | arg2;
    }

    @ObfuscatedName("nn.aj(II)I")
    public static int method6269(int arg0) {
        return arg0 >> 28;
    }

    @ObfuscatedName("nn.ay(II)I")
    public static int method6289(int arg0) {
        return arg0 & 0x3FFF;
    }

    @ObfuscatedName("nn.as(I)I")
    public int method6255() {
        return method6256(this.field3779, this.field3777 >> 13, this.field3778 >> 13);
    }

    @ObfuscatedName("nn.ae(IIIB)V")
    public void method6288(int arg0, int arg1, int arg2) {
        int var4 = arg0 >> 14 & 0xFF;
        int var5 = arg0 & 0xFF;
        this.field3779 = arg0 >> 28;
        this.field3777 = (var4 << 13) + arg1;
        this.field3778 = (var5 << 13) + arg2;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof class351)) {
            return this.method6257((class351) arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("nn.am(Lnn;I)Z")
    public boolean method6257(class351 arg0) {
        if (this.field3779 != arg0.field3779) {
            return false;
        } else if (this.field3777 == arg0.field3777) {
            return this.field3778 == arg0.field3778;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.method6250();
    }

    public String toString() {
        return this.method6258(",");
    }

    @ObfuscatedName("nn.at(Ljava/lang/String;I)Ljava/lang/String;")
    public String method6258(String arg0) {
        return this.field3779 + arg0 + (this.field3777 >> 6) + arg0 + (this.field3778 >> 6) + arg0 + (this.field3777 & 0x3F) + arg0 + (this.field3778 & 0x3F);
    }

    @ObfuscatedName("nn.au(IB)I")
    public static int method6259(int arg0) {
        return arg0 << 3;
    }

    @ObfuscatedName("nn.an(II)I")
    public static int method6260(int arg0) {
        return arg0 << 7;
    }

    @ObfuscatedName("nn.ao(II)I")
    public static int method6261(int arg0) {
        return (arg0 << 7) + 64;
    }
}
