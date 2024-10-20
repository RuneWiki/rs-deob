package deob;

@ObfuscatedName("t")
public class class5 {

    @ObfuscatedName("t.d")
    public byte field46;

    @ObfuscatedName("t.c")
    public int field40;

    @ObfuscatedName("t.n")
    public int field39;

    @ObfuscatedName("t.q")
    public int field42;

    @ObfuscatedName("t.t")
    public int field43;

    @ObfuscatedName("t.p")
    public int field44;

    public class5() {
    }

    public class5(class130 arg0, boolean arg1) {
        this.field46 = arg0.method2230();
        this.field40 = arg0.method2232();
        this.field39 = arg0.method2246();
        this.field42 = arg0.method2246();
        this.field43 = arg0.method2246();
        this.field44 = arg0.method2246();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2379();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method44(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2379();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1956--;
                    if (arg0.method2232() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2246();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("t.d(Ljava/lang/Integer;B)V")
    public void method44(Integer arg0) {
    }

    @ObfuscatedName("t.c(I)I")
    public int method45() {
        return this.field46 & 0x7;
    }

    @ObfuscatedName("t.n(B)I")
    public int method43() {
        return (this.field46 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("t.q(II)V")
    public void method47(int arg0) {
        this.field46 &= 0xFFFFFFF8;
        this.field46 = (byte) (this.field46 | arg0 & 0x7);
    }

    @ObfuscatedName("t.t(II)V")
    public void method48(int arg0) {
        this.field46 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field46 = (byte) (this.field46 | 0x8);
        }
    }
}
