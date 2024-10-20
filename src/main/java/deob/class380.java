package deob;

@ObfuscatedName("ow")
public class class380 {

    @ObfuscatedName("ow.at")
    public byte field4378;

    @ObfuscatedName("ow.ah")
    public int field4374;

    @ObfuscatedName("ow.ar")
    public int field4373;

    @ObfuscatedName("ow.ao")
    public int field4376;

    @ObfuscatedName("ow.ab")
    public int field4377;

    @ObfuscatedName("ow.au")
    public int field4375;

    public class380() {
    }

    public class380(class527 arg0, boolean arg1) {
        this.field4378 = arg0.method8616();
        this.field4374 = arg0.method8412();
        this.field4373 = arg0.method8416();
        this.field4376 = arg0.method8416();
        this.field4377 = arg0.method8416();
        this.field4375 = arg0.method8416();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method8410();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method6458(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method8410();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field5137--;
                    if (arg0.method8412() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method8416();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("ow.at(Ljava/lang/Integer;I)V")
    public void method6458(Integer arg0) {
    }

    @ObfuscatedName("ow.ah(I)I")
    public int method6456() {
        return this.field4378 & 0x7;
    }

    @ObfuscatedName("ow.ar(I)I")
    public int method6457() {
        return (this.field4378 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("ow.ao(II)V")
    public void method6465(int arg0) {
        this.field4378 &= 0xFFFFFFF8;
        this.field4378 = (byte) (this.field4378 | arg0 & 0x7);
    }

    @ObfuscatedName("ow.ab(II)V")
    public void method6455(int arg0) {
        this.field4378 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4378 = (byte) (this.field4378 | 0x8);
        }
    }
}
