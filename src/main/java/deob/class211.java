package deob;

@ObfuscatedName("hx")
public class class211 {

    @ObfuscatedName("hx.y")
    public byte field3073;

    @ObfuscatedName("hx.k")
    public int field3075;

    @ObfuscatedName("hx.g")
    public int field3076;

    @ObfuscatedName("hx.n")
    public int field3074;

    @ObfuscatedName("hx.t")
    public int field3071;

    @ObfuscatedName("hx.e")
    public int field3072;

    public class211() {
    }

    public class211(class111 arg0, boolean arg1) {
        this.field3073 = arg0.method2199();
        this.field3075 = arg0.method2339();
        this.field3076 = arg0.method2165();
        this.field3074 = arg0.method2165();
        this.field3071 = arg0.method2165();
        this.field3072 = arg0.method2165();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2205();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3576(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2205();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1902--;
                    if (arg0.method2339() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2165();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hx.y(Ljava/lang/Integer;I)V")
    public void method3576(Integer arg0) {
    }

    @ObfuscatedName("hx.k(B)I")
    public int method3595() {
        return this.field3073 & 0x7;
    }

    @ObfuscatedName("hx.g(I)I")
    public int method3575() {
        return (this.field3073 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hx.n(II)V")
    public void method3581(int arg0) {
        this.field3073 &= 0xFFFFFFF8;
        this.field3073 = (byte) (this.field3073 | arg0 & 0x7);
    }

    @ObfuscatedName("hx.t(IB)V")
    public void method3580(int arg0) {
        this.field3073 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3073 = (byte) (this.field3073 | 0x8);
        }
    }
}
