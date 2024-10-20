package deob;

@ObfuscatedName("s")
public class class17 {

    @ObfuscatedName("s.p")
    public byte field306;

    @ObfuscatedName("s.m")
    public int field307;

    @ObfuscatedName("s.e")
    public int field308;

    @ObfuscatedName("s.t")
    public int field315;

    @ObfuscatedName("s.w")
    public int field310;

    @ObfuscatedName("s.z")
    public int field316;

    public class17() {
    }

    public class17(class174 arg0, boolean arg1) {
        this.field306 = arg0.method2811();
        this.field307 = arg0.method2824();
        this.field308 = arg0.method2803();
        this.field315 = arg0.method2803();
        this.field310 = arg0.method2803();
        this.field316 = arg0.method2803();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2810();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method103(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2810();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2408--;
                    if (arg0.method2824() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2803();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("s.p(Ljava/lang/Integer;I)V")
    public void method103(Integer arg0) {
    }

    @ObfuscatedName("s.m(I)I")
    public int method104() {
        return this.field306 & 0x7;
    }

    @ObfuscatedName("s.e(B)I")
    public int method105() {
        return (this.field306 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("s.t(II)V")
    public void method106(int arg0) {
        this.field306 &= 0xFFFFFFF8;
        this.field306 = (byte) (this.field306 | arg0 & 0x7);
    }

    @ObfuscatedName("s.w(II)V")
    public void method107(int arg0) {
        this.field306 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field306 = (byte) (this.field306 | 0x8);
        }
    }
}
