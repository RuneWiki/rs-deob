package deob;

@ObfuscatedName("f")
public class class5 {

    @ObfuscatedName("f.w")
    public byte field34;

    @ObfuscatedName("f.m")
    public int field27;

    @ObfuscatedName("f.q")
    public int field28;

    @ObfuscatedName("f.b")
    public int field29;

    @ObfuscatedName("f.f")
    public int field30;

    @ObfuscatedName("f.n")
    public int field31;

    public class5() {
    }

    public class5(class183 arg0, boolean arg1) {
        this.field34 = arg0.method3263();
        this.field27 = arg0.method3268();
        this.field28 = arg0.method3267();
        this.field29 = arg0.method3267();
        this.field30 = arg0.method3267();
        this.field31 = arg0.method3267();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method3436();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method52(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method3436();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2360--;
                    if (arg0.method3268() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method3267();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("f.w(Ljava/lang/Integer;I)V")
    public void method52(Integer arg0) {
    }

    @ObfuscatedName("f.m(B)I")
    public int method39() {
        return this.field34 & 0x7;
    }

    @ObfuscatedName("f.q(I)I")
    public int method43() {
        return (this.field34 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("f.x(IB)V")
    public void method53(int arg0) {
        this.field34 &= 0xFFFFFFF8;
        this.field34 = (byte) (this.field34 | arg0 & 0x7);
    }

    @ObfuscatedName("f.j(II)V")
    public void method37(int arg0) {
        this.field34 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field34 = (byte) (this.field34 | 0x8);
        }
    }
}
