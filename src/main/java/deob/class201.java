package deob;

@ObfuscatedName("gz")
public class class201 {

    @ObfuscatedName("gz.x")
    public byte field2940;

    @ObfuscatedName("gz.v")
    public int field2937;

    @ObfuscatedName("gz.m")
    public int field2938;

    @ObfuscatedName("gz.e")
    public int field2939;

    @ObfuscatedName("gz.h")
    public int field2936;

    @ObfuscatedName("gz.p")
    public int field2941;

    public class201() {
    }

    public class201(class108 arg0, boolean arg1) {
        this.field2940 = arg0.method2128();
        this.field2937 = arg0.method2129();
        this.field2938 = arg0.method2132();
        this.field2939 = arg0.method2132();
        this.field2936 = arg0.method2132();
        this.field2941 = arg0.method2132();
        if (arg1 && arg0.method2299() != 255) {
            throw new IllegalStateException("");
        }
    }

    @ObfuscatedName("gz.x(B)I")
    public int method3450() {
        return this.field2940 & 0x7;
    }

    @ObfuscatedName("gz.v(I)I")
    public int method3451() {
        return (this.field2940 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("gz.m(IS)V")
    public void method3452(int arg0) {
        this.field2940 &= 0xFFFFFFF8;
        this.field2940 = (byte) (this.field2940 | arg0 & 0x7);
    }

    @ObfuscatedName("gz.e(II)V")
    public void method3453(int arg0) {
        this.field2940 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field2940 = (byte) (this.field2940 | 0x8);
        }
    }
}
