package deob;

@ObfuscatedName("hx")
public class class221 {

    @ObfuscatedName("hx.s")
    public byte field3176;

    @ObfuscatedName("hx.j")
    public int field3179;

    @ObfuscatedName("hx.p")
    public int field3177;

    @ObfuscatedName("hx.x")
    public int field3178;

    @ObfuscatedName("hx.d")
    public int field3175;

    @ObfuscatedName("hx.u")
    public int field3180;

    public class221() {
    }

    public class221(class120 arg0, boolean arg1) {
        this.field3176 = arg0.method2339();
        this.field3179 = arg0.method2430();
        this.field3177 = arg0.method2343();
        this.field3178 = arg0.method2343();
        this.field3175 = arg0.method2343();
        this.field3180 = arg0.method2343();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2338();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3707(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2338();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2006--;
                    if (arg0.method2430() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2343();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hx.s(Ljava/lang/Integer;I)V")
    public void method3707(Integer arg0) {
    }

    @ObfuscatedName("hx.j(I)I")
    public int method3715() {
        return this.field3176 & 0x7;
    }

    @ObfuscatedName("hx.p(S)I")
    public int method3709() {
        return (this.field3176 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hx.x(II)V")
    public void method3710(int arg0) {
        this.field3176 &= 0xFFFFFFF8;
        this.field3176 = (byte) (this.field3176 | arg0 & 0x7);
    }

    @ObfuscatedName("hx.d(II)V")
    public void method3711(int arg0) {
        this.field3176 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3176 = (byte) (this.field3176 | 0x8);
        }
    }
}
