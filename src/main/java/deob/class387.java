package deob;

@ObfuscatedName("oa")
public class class387 {

    @ObfuscatedName("oa.aq")
    public byte field4465;

    @ObfuscatedName("oa.aw")
    public int field4459;

    @ObfuscatedName("oa.al")
    public int field4463;

    @ObfuscatedName("oa.ai")
    public int field4461;

    @ObfuscatedName("oa.ar")
    public int field4460;

    @ObfuscatedName("oa.as")
    public int field4458;

    public class387() {
    }

    public class387(class534 arg0, boolean arg1) {
        this.field4465 = arg0.method8592();
        this.field4459 = arg0.method8593();
        this.field4463 = arg0.method8597();
        this.field4461 = arg0.method8597();
        this.field4460 = arg0.method8597();
        this.field4458 = arg0.method8597();
        if (arg1) {
            this.method6597(method5476(arg0));
        }
    }

    @ObfuscatedName("ml.aq(Luq;B)Ljava/lang/Integer;")
    public static Integer method5476(class534 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method8591();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method8591();
                if (var4 == 255) {
                    break;
                }
                arg0.field5200--;
                if (arg0.method8593() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method8597();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("oa.aw(Ljava/lang/Integer;I)V")
    public void method6597(Integer arg0) {
    }

    @ObfuscatedName("oa.al(B)I")
    public int method6598() {
        return this.field4465 & 0x7;
    }

    @ObfuscatedName("oa.ai(I)I")
    public int method6609() {
        return (this.field4465 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("oa.ar(II)V")
    public void method6600(int arg0) {
        this.field4465 &= 0xFFFFFFF8;
        this.field4465 = (byte) (this.field4465 | arg0 & 0x7);
    }

    @ObfuscatedName("oa.as(II)V")
    public void method6601(int arg0) {
        this.field4465 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4465 = (byte) (this.field4465 | 0x8);
        }
    }
}
