package deob;

@ObfuscatedName("j")
public class class5 {

    @ObfuscatedName("j.q")
    public byte field54;

    @ObfuscatedName("j.d")
    public int field45;

    @ObfuscatedName("j.h")
    public int field55;

    @ObfuscatedName("j.p")
    public int field48;

    @ObfuscatedName("j.j")
    public int field49;

    @ObfuscatedName("j.n")
    public int field50;

    public class5() {
    }

    public class5(class154 arg0, boolean arg1) {
        this.field54 = arg0.method2835();
        this.field45 = arg0.method2668();
        this.field55 = arg0.method2798();
        this.field48 = arg0.method2798();
        this.field49 = arg0.method2798();
        this.field50 = arg0.method2798();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2666();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method50(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2666();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2091--;
                    if (arg0.method2668() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2798();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("j.q(Ljava/lang/Integer;I)V")
    public void method50(Integer arg0) {
    }

    @ObfuscatedName("j.d(I)I")
    public int method56() {
        return this.field54 & 0x7;
    }

    @ObfuscatedName("j.h(I)I")
    public int method44() {
        return (this.field54 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("j.p(II)V")
    public void method45(int arg0) {
        this.field54 &= 0xFFFFFFF8;
        this.field54 = (byte) (this.field54 | arg0 & 0x7);
    }

    @ObfuscatedName("j.j(IB)V")
    public void method46(int arg0) {
        this.field54 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field54 = (byte) (this.field54 | 0x8);
        }
    }
}
