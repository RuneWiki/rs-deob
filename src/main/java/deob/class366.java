package deob;

@ObfuscatedName("oe")
public class class366 {

    @ObfuscatedName("oe.at")
    public byte field4316;

    @ObfuscatedName("oe.an")
    public int field4321;

    @ObfuscatedName("oe.av")
    public int field4315;

    @ObfuscatedName("oe.as")
    public int field4317;

    @ObfuscatedName("oe.ax")
    public int field4318;

    @ObfuscatedName("oe.ap")
    public int field4319;

    public class366() {
    }

    public class366(class501 arg0, boolean arg1) {
        this.field4316 = arg0.method8130();
        this.field4321 = arg0.method8195();
        this.field4315 = arg0.method8134();
        this.field4317 = arg0.method8134();
        this.field4318 = arg0.method8134();
        this.field4319 = arg0.method8134();
        if (arg1) {
            this.method6220(method2939(arg0));
        }
    }

    @ObfuscatedName("fd.at(Ltz;S)Ljava/lang/Integer;")
    public static Integer method2939(class501 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method8129();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method8129();
                if (var4 == 255) {
                    break;
                }
                arg0.field5017--;
                if (arg0.method8195() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method8134();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("oe.an(Ljava/lang/Integer;I)V")
    public void method6220(Integer arg0) {
    }

    @ObfuscatedName("oe.av(I)I")
    public int method6221() {
        return this.field4316 & 0x7;
    }

    @ObfuscatedName("oe.as(B)I")
    public int method6224() {
        return (this.field4316 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("oe.ax(II)V")
    public void method6219(int arg0) {
        this.field4316 &= 0xFFFFFFF8;
        this.field4316 = (byte) (this.field4316 | arg0 & 0x7);
    }

    @ObfuscatedName("oe.ap(II)V")
    public void method6229(int arg0) {
        this.field4316 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4316 = (byte) (this.field4316 | 0x8);
        }
    }
}
