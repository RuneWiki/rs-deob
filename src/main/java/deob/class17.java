package deob;

@ObfuscatedName("v")
public class class17 {

    @ObfuscatedName("v.d")
    public byte field308;

    @ObfuscatedName("v.z")
    public int field307;

    @ObfuscatedName("v.n")
    public int field306;

    @ObfuscatedName("v.r")
    public int field314;

    @ObfuscatedName("v.e")
    public int field309;

    @ObfuscatedName("v.y")
    public int field311;

    public class17() {
    }

    public class17(class195 arg0, boolean arg1) {
        this.field308 = arg0.method3421();
        this.field307 = arg0.method3269();
        this.field306 = arg0.method3264();
        this.field314 = arg0.method3264();
        this.field309 = arg0.method3264();
        this.field311 = arg0.method3264();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method3330();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method92(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method3330();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2568--;
                    if (arg0.method3269() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method3264();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("v.d(Ljava/lang/Integer;B)V")
    public void method92(Integer arg0) {
    }

    @ObfuscatedName("v.z(B)I")
    public int method93() {
        return this.field308 & 0x7;
    }

    @ObfuscatedName("v.n(B)I")
    public int method91() {
        return (this.field308 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("v.r(II)V")
    public void method107(int arg0) {
        this.field308 &= 0xFFFFFFF8;
        this.field308 = (byte) (this.field308 | arg0 & 0x7);
    }

    @ObfuscatedName("v.e(IB)V")
    public void method95(int arg0) {
        this.field308 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field308 = (byte) (this.field308 | 0x8);
        }
    }
}
