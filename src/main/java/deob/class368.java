package deob;

@ObfuscatedName("oh")
public class class368 {

    @ObfuscatedName("oh.au")
    public byte field4352;

    @ObfuscatedName("oh.ae")
    public int field4351;

    @ObfuscatedName("oh.ao")
    public int field4356;

    @ObfuscatedName("oh.at")
    public int field4353;

    @ObfuscatedName("oh.ac")
    public int field4354;

    @ObfuscatedName("oh.ai")
    public int field4350;

    public class368() {
    }

    public class368(class515 arg0, boolean arg1) {
        this.field4352 = arg0.method8301();
        this.field4351 = arg0.method8448();
        this.field4356 = arg0.method8306();
        this.field4353 = arg0.method8306();
        this.field4354 = arg0.method8306();
        this.field4350 = arg0.method8306();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method8300();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method6294(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method8300();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field5111--;
                    if (arg0.method8448() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method8306();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("oh.au(Ljava/lang/Integer;I)V")
    public void method6294(Integer arg0) {
    }

    @ObfuscatedName("oh.ae(B)I")
    public int method6295() {
        return this.field4352 & 0x7;
    }

    @ObfuscatedName("oh.ao(I)I")
    public int method6296() {
        return (this.field4352 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("oh.at(II)V")
    public void method6293(int arg0) {
        this.field4352 &= 0xFFFFFFF8;
        this.field4352 = (byte) (this.field4352 | arg0 & 0x7);
    }

    @ObfuscatedName("oh.ac(IB)V")
    public void method6300(int arg0) {
        this.field4352 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4352 = (byte) (this.field4352 | 0x8);
        }
    }
}
