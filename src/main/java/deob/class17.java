package deob;

@ObfuscatedName("u")
public class class17 {

    @ObfuscatedName("u.e")
    public byte field300;

    @ObfuscatedName("u.o")
    public int field299;

    @ObfuscatedName("u.m")
    public int field303;

    @ObfuscatedName("u.g")
    public int field301;

    @ObfuscatedName("u.d")
    public int field305;

    @ObfuscatedName("u.b")
    public int field302;

    public class17() {
    }

    public class17(class174 arg0, boolean arg1) {
        this.field300 = arg0.method2944();
        this.field299 = arg0.method2930();
        this.field303 = arg0.method2896();
        this.field301 = arg0.method2896();
        this.field305 = arg0.method2896();
        this.field302 = arg0.method2896();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2891();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method73(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2891();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2370--;
                    if (arg0.method2930() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2896();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("u.e(Ljava/lang/Integer;I)V")
    public void method73(Integer arg0) {
    }

    @ObfuscatedName("u.o(I)I")
    public int method74() {
        return this.field300 & 0x7;
    }

    @ObfuscatedName("u.m(I)I")
    public int method75() {
        return (this.field300 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("u.g(IB)V")
    public void method76(int arg0) {
        this.field300 &= 0xFFFFFFF8;
        this.field300 = (byte) (this.field300 | arg0 & 0x7);
    }

    @ObfuscatedName("u.d(IB)V")
    public void method81(int arg0) {
        this.field300 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field300 = (byte) (this.field300 | 0x8);
        }
    }
}
