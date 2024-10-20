package deob;

@ObfuscatedName("hh")
public class class220 {

    @ObfuscatedName("hh.o")
    public byte field3158;

    @ObfuscatedName("hh.e")
    public int field3155;

    @ObfuscatedName("hh.u")
    public int field3156;

    @ObfuscatedName("hh.b")
    public int field3160;

    @ObfuscatedName("hh.p")
    public int field3157;

    @ObfuscatedName("hh.s")
    public int field3159;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3158 = arg0.method2338();
        this.field3155 = arg0.method2339();
        this.field3156 = arg0.method2342();
        this.field3160 = arg0.method2342();
        this.field3157 = arg0.method2342();
        this.field3159 = arg0.method2342();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2427();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3733(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2427();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1974--;
                    if (arg0.method2339() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2342();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hh.o(Ljava/lang/Integer;S)V")
    public void method3733(Integer arg0) {
    }

    @ObfuscatedName("hh.e(I)I")
    public int method3734() {
        return this.field3158 & 0x7;
    }

    @ObfuscatedName("hh.u(I)I")
    public int method3742() {
        return (this.field3158 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hh.b(II)V")
    public void method3732(int arg0) {
        this.field3158 &= 0xFFFFFFF8;
        this.field3158 = (byte) (this.field3158 | arg0 & 0x7);
    }

    @ObfuscatedName("hh.p(II)V")
    public void method3736(int arg0) {
        this.field3158 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3158 = (byte) (this.field3158 | 0x8);
        }
    }
}
