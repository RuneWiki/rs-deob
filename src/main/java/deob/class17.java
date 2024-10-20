package deob;

@ObfuscatedName("r")
public class class17 {

    @ObfuscatedName("r.i")
    public byte field299;

    @ObfuscatedName("r.c")
    public int field297;

    @ObfuscatedName("r.e")
    public int field303;

    @ObfuscatedName("r.v")
    public int field300;

    @ObfuscatedName("r.b")
    public int field298;

    @ObfuscatedName("r.y")
    public int field302;

    public class17() {
    }

    public class17(class174 arg0, boolean arg1) {
        this.field299 = arg0.method2938();
        this.field297 = arg0.method2872();
        this.field303 = arg0.method2875();
        this.field300 = arg0.method2875();
        this.field298 = arg0.method2875();
        this.field302 = arg0.method2875();
        if (arg1) {
            this.method77(Statics.method1712(arg0));
        }
    }

    @ObfuscatedName("r.c(Ljava/lang/Integer;B)V")
    public void method77(Integer arg0) {
    }

    @ObfuscatedName("r.e(I)I")
    public int method79() {
        return this.field299 & 0x7;
    }

    @ObfuscatedName("r.v(B)I")
    public int method86() {
        return (this.field299 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("r.b(IS)V")
    public void method88(int arg0) {
        this.field299 &= 0xFFFFFFF8;
        this.field299 = (byte) (this.field299 | arg0 & 0x7);
    }

    @ObfuscatedName("r.y(II)V")
    public void method81(int arg0) {
        this.field299 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field299 = (byte) (this.field299 | 0x8);
        }
    }
}
