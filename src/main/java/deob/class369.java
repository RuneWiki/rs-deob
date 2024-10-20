package deob;

@ObfuscatedName("oc")
public class class369 {

    @ObfuscatedName("oc.aw")
    public byte field4357;

    @ObfuscatedName("oc.ay")
    public int field4352;

    @ObfuscatedName("oc.ar")
    public int field4355;

    @ObfuscatedName("oc.am")
    public int field4354;

    @ObfuscatedName("oc.as")
    public int field4353;

    @ObfuscatedName("oc.aj")
    public int field4356;

    public class369() {
    }

    public class369(class514 arg0, boolean arg1) {
        this.field4357 = arg0.method8264();
        this.field4352 = arg0.method8246();
        this.field4355 = arg0.method8496();
        this.field4354 = arg0.method8496();
        this.field4353 = arg0.method8496();
        this.field4356 = arg0.method8496();
        if (arg1) {
            this.method6284(method260(arg0));
        }
    }

    @ObfuscatedName("ad.aw(Lty;I)Ljava/lang/Integer;")
    public static Integer method260(class514 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method8244();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method8244();
                if (var4 == 255) {
                    break;
                }
                arg0.field5072--;
                if (arg0.method8246() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method8496();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("oc.ay(Ljava/lang/Integer;B)V")
    public void method6284(Integer arg0) {
    }

    @ObfuscatedName("oc.ar(I)I")
    public int method6304() {
        return this.field4357 & 0x7;
    }

    @ObfuscatedName("oc.am(I)I")
    public int method6286() {
        return (this.field4357 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("oc.as(II)V")
    public void method6293(int arg0) {
        this.field4357 &= 0xFFFFFFF8;
        this.field4357 = (byte) (this.field4357 | arg0 & 0x7);
    }

    @ObfuscatedName("oc.aj(II)V")
    public void method6283(int arg0) {
        this.field4357 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4357 = (byte) (this.field4357 | 0x8);
        }
    }
}
