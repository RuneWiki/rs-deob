package deob;

@ObfuscatedName("pc")
public class class398 {

    @ObfuscatedName("pc.ab")
    public byte field4569;

    @ObfuscatedName("pc.ay")
    public int field4566;

    @ObfuscatedName("pc.an")
    public int field4567;

    @ObfuscatedName("pc.au")
    public int field4568;

    @ObfuscatedName("pc.ax")
    public int field4565;

    @ObfuscatedName("pc.ao")
    public int field4570;

    public class398() {
    }

    public class398(class549 arg0, boolean arg1) {
        this.field4569 = arg0.method8798();
        this.field4566 = arg0.method8968();
        this.field4567 = arg0.method8803();
        this.field4568 = arg0.method8803();
        this.field4565 = arg0.method8803();
        this.field4570 = arg0.method8803();
        if (arg1) {
            this.method6811(method4236(arg0));
        }
    }

    @ObfuscatedName("io.ab(Lvg;I)Ljava/lang/Integer;")
    public static Integer method4236(class549 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method9025();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method9025();
                if (var4 == 255) {
                    break;
                }
                arg0.field5378--;
                if (arg0.method8968() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method8803();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("pc.ay(Ljava/lang/Integer;I)V")
    public void method6811(Integer arg0) {
    }

    @ObfuscatedName("pc.an(B)I")
    public int method6812() {
        return this.field4569 & 0x7;
    }

    @ObfuscatedName("pc.au(I)I")
    public int method6822() {
        return (this.field4569 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("pc.ax(IB)V")
    public void method6813(int arg0) {
        this.field4569 &= 0xFFFFFFF8;
        this.field4569 = (byte) (this.field4569 | arg0 & 0x7);
    }

    @ObfuscatedName("pc.ao(IB)V")
    public void method6815(int arg0) {
        this.field4569 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4569 = (byte) (this.field4569 | 0x8);
        }
    }
}
