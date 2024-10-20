package deob;

@ObfuscatedName("w")
public class class17 {

    @ObfuscatedName("w.d")
    public byte field291;

    @ObfuscatedName("w.q")
    public int field292;

    @ObfuscatedName("w.x")
    public int field297;

    @ObfuscatedName("w.y")
    public int field293;

    @ObfuscatedName("w.e")
    public int field294;

    @ObfuscatedName("w.f")
    public int field295;

    public class17() {
    }

    public class17(class174 arg0, boolean arg1) {
        this.field291 = arg0.method3082();
        this.field292 = arg0.method2916();
        this.field297 = arg0.method2935();
        this.field293 = arg0.method2935();
        this.field294 = arg0.method2935();
        this.field295 = arg0.method2935();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2921();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method89(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2921();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2364--;
                    if (arg0.method2916() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2935();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("w.d(Ljava/lang/Integer;I)V")
    public void method89(Integer arg0) {
    }

    @ObfuscatedName("w.q(I)I")
    public int method96() {
        return this.field291 & 0x7;
    }

    @ObfuscatedName("w.x(I)I")
    public int method90() {
        return (this.field291 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("w.y(II)V")
    public void method94(int arg0) {
        this.field291 &= 0xFFFFFFF8;
        this.field291 = (byte) (this.field291 | arg0 & 0x7);
    }

    @ObfuscatedName("w.e(II)V")
    public void method93(int arg0) {
        this.field291 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field291 = (byte) (this.field291 | 0x8);
        }
    }
}
