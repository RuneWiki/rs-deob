package deob;

@ObfuscatedName("pj")
public class class401 {

    @ObfuscatedName("pj.ap")
    public byte field4673;

    @ObfuscatedName("pj.aw")
    public int field4668;

    @ObfuscatedName("pj.ak")
    public int field4667;

    @ObfuscatedName("pj.aj")
    public int field4670;

    @ObfuscatedName("pj.ai")
    public int field4669;

    @ObfuscatedName("pj.ay")
    public int field4672;

    public class401() {
    }

    public class401(class558 arg0, boolean arg1) {
        this.field4673 = arg0.method9259();
        this.field4668 = arg0.method9260();
        this.field4667 = arg0.method9264();
        this.field4670 = arg0.method9264();
        this.field4669 = arg0.method9264();
        this.field4672 = arg0.method9264();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method9258();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method7158(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method9258();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field5462--;
                    if (arg0.method9260() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method9264();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("pj.ap(Ljava/lang/Integer;S)V")
    public void method7158(Integer arg0) {
    }

    @ObfuscatedName("pj.aw(I)I")
    public int method7160() {
        return this.field4673 & 0x7;
    }

    @ObfuscatedName("pj.ak(B)I")
    public int method7175() {
        return (this.field4673 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("pj.aj(IB)V")
    public void method7161(int arg0) {
        this.field4673 &= 0xFFFFFFF8;
        this.field4673 = (byte) (this.field4673 | arg0 & 0x7);
    }

    @ObfuscatedName("pj.ai(II)V")
    public void method7162(int arg0) {
        this.field4673 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4673 = (byte) (this.field4673 | 0x8);
        }
    }
}
