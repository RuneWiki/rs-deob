package deob;

@ObfuscatedName("gp")
public class class203 {

    @ObfuscatedName("gp.v")
    public byte field2963;

    @ObfuscatedName("gp.t")
    public int field2961;

    @ObfuscatedName("gp.f")
    public int field2965;

    @ObfuscatedName("gp.j")
    public int field2962;

    @ObfuscatedName("gp.l")
    public int field2964;

    @ObfuscatedName("gp.g")
    public int field2960;

    public class203() {
    }

    public class203(class110 arg0, boolean arg1) {
        this.field2963 = arg0.method2162();
        this.field2961 = arg0.method2194();
        this.field2965 = arg0.method2297();
        this.field2962 = arg0.method2297();
        this.field2964 = arg0.method2297();
        this.field2960 = arg0.method2297();
        if (arg1 && arg0.method2257() != 255) {
            throw new IllegalStateException("");
        }
    }

    @ObfuscatedName("gp.v(B)I")
    public int method3463() {
        return this.field2963 & 0x7;
    }

    @ObfuscatedName("gp.t(I)I")
    public int method3464() {
        return (this.field2963 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("gp.f(IB)V")
    public void method3465(int arg0) {
        this.field2963 &= 0xFFFFFFF8;
        this.field2963 = (byte) (this.field2963 | arg0 & 0x7);
    }

    @ObfuscatedName("gp.j(IB)V")
    public void method3466(int arg0) {
        this.field2963 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field2963 = (byte) (this.field2963 | 0x8);
        }
    }
}
