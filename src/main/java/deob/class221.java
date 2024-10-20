package deob;

@ObfuscatedName("hv")
public class class221 {

    @ObfuscatedName("hv.j")
    public byte field3175;

    @ObfuscatedName("hv.h")
    public int field3178;

    @ObfuscatedName("hv.m")
    public int field3176;

    @ObfuscatedName("hv.z")
    public int field3177;

    @ObfuscatedName("hv.x")
    public int field3174;

    @ObfuscatedName("hv.e")
    public int field3179;

    public class221() {
    }

    public class221(class120 arg0, boolean arg1) {
        this.field3175 = arg0.method2531();
        this.field3178 = arg0.method2363();
        this.field3176 = arg0.method2366();
        this.field3177 = arg0.method2366();
        this.field3174 = arg0.method2366();
        this.field3179 = arg0.method2366();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2361();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3725(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2361();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1972--;
                    if (arg0.method2363() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2366();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hv.j(Ljava/lang/Integer;I)V")
    public void method3725(Integer arg0) {
    }

    @ObfuscatedName("hv.h(B)I")
    public int method3747() {
        return this.field3175 & 0x7;
    }

    @ObfuscatedName("hv.m(I)I")
    public int method3728() {
        return (this.field3175 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hv.z(II)V")
    public void method3740(int arg0) {
        this.field3175 &= 0xFFFFFFF8;
        this.field3175 = (byte) (this.field3175 | arg0 & 0x7);
    }

    @ObfuscatedName("hv.x(IB)V")
    public void method3729(int arg0) {
        this.field3175 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3175 = (byte) (this.field3175 | 0x8);
        }
    }
}
