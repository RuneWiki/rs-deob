package deob;

@ObfuscatedName("oa")
public class class388 {

    @ObfuscatedName("oa.az")
    public byte field4490;

    @ObfuscatedName("oa.ah")
    public int field4488;

    @ObfuscatedName("oa.af")
    public int field4489;

    @ObfuscatedName("oa.at")
    public int field4491;

    @ObfuscatedName("oa.an")
    public int field4487;

    @ObfuscatedName("oa.ao")
    public int field4492;

    public class388() {
    }

    public class388(class535 arg0, boolean arg1) {
        this.field4490 = arg0.method8463();
        this.field4488 = arg0.method8670();
        this.field4489 = arg0.method8682();
        this.field4491 = arg0.method8682();
        this.field4487 = arg0.method8682();
        this.field4492 = arg0.method8682();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method8462();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method6497(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method8462();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field5233--;
                    if (arg0.method8670() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method8682();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("oa.az(Ljava/lang/Integer;I)V")
    public void method6497(Integer arg0) {
    }

    @ObfuscatedName("oa.ah(B)I")
    public int method6498() {
        return this.field4490 & 0x7;
    }

    @ObfuscatedName("oa.af(I)I")
    public int method6508() {
        return (this.field4490 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("oa.at(II)V")
    public void method6513(int arg0) {
        this.field4490 &= 0xFFFFFFF8;
        this.field4490 = (byte) (this.field4490 | arg0 & 0x7);
    }

    @ObfuscatedName("oa.an(II)V")
    public void method6500(int arg0) {
        this.field4490 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4490 = (byte) (this.field4490 | 0x8);
        }
    }
}
