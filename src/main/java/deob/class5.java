package deob;

@ObfuscatedName("w")
public class class5 {

    @ObfuscatedName("w.n")
    public byte field40;

    @ObfuscatedName("w.d")
    public int field41;

    @ObfuscatedName("w.m")
    public int field43;

    @ObfuscatedName("w.h")
    public int field49;

    @ObfuscatedName("w.w")
    public int field44;

    @ObfuscatedName("w.r")
    public int field45;

    public class5() {
    }

    public class5(class161 arg0, boolean arg1) {
        this.field40 = arg0.method2837();
        this.field41 = arg0.method2887();
        this.field43 = arg0.method2785();
        this.field49 = arg0.method2785();
        this.field44 = arg0.method2785();
        this.field45 = arg0.method2785();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2823();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method71(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2823();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2285--;
                    if (arg0.method2887() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2785();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("w.n(Ljava/lang/Integer;I)V")
    public void method71(Integer arg0) {
    }

    @ObfuscatedName("w.d(B)I")
    public int method49() {
        return this.field40 & 0x7;
    }

    @ObfuscatedName("w.m(I)I")
    public int method64() {
        return (this.field40 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("w.h(IB)V")
    public void method60(int arg0) {
        this.field40 &= 0xFFFFFFF8;
        this.field40 = (byte) (this.field40 | arg0 & 0x7);
    }

    @ObfuscatedName("w.w(IB)V")
    public void method68(int arg0) {
        this.field40 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field40 = (byte) (this.field40 | 0x8);
        }
    }
}
