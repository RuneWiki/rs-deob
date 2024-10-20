package deob;

@ObfuscatedName("b")
public class class17 {

    @ObfuscatedName("b.n")
    public byte field311;

    @ObfuscatedName("b.p")
    public int field308;

    @ObfuscatedName("b.i")
    public int field309;

    @ObfuscatedName("b.j")
    public int field310;

    @ObfuscatedName("b.f")
    public int field315;

    @ObfuscatedName("b.m")
    public int field312;

    public class17() {
    }

    public class17(class174 arg0, boolean arg1) {
        this.field311 = arg0.method2922();
        this.field308 = arg0.method3065();
        this.field309 = arg0.method3058();
        this.field310 = arg0.method3058();
        this.field315 = arg0.method3058();
        this.field312 = arg0.method3058();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2925();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method125(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2925();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2400--;
                    if (arg0.method3065() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method3058();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("b.n(Ljava/lang/Integer;B)V")
    public void method125(Integer arg0) {
    }

    @ObfuscatedName("b.p(I)I")
    public int method109() {
        return this.field311 & 0x7;
    }

    @ObfuscatedName("b.i(I)I")
    public int method106() {
        return (this.field311 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("b.j(II)V")
    public void method107(int arg0) {
        this.field311 &= 0xFFFFFFF8;
        this.field311 = (byte) (this.field311 | arg0 & 0x7);
    }

    @ObfuscatedName("b.f(II)V")
    public void method108(int arg0) {
        this.field311 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field311 = (byte) (this.field311 | 0x8);
        }
    }
}
