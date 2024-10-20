package deob;

@ObfuscatedName("og")
public class class383 {

    @ObfuscatedName("og.ac")
    public byte field4401;

    @ObfuscatedName("og.al")
    public int field4399;

    @ObfuscatedName("og.ak")
    public int field4400;

    @ObfuscatedName("og.ax")
    public int field4398;

    @ObfuscatedName("og.ao")
    public int field4402;

    @ObfuscatedName("og.ah")
    public int field4403;

    public class383() {
    }

    public class383(class530 arg0, boolean arg1) {
        this.field4401 = arg0.method8366();
        this.field4399 = arg0.method8598();
        this.field4400 = arg0.method8371();
        this.field4398 = arg0.method8371();
        this.field4402 = arg0.method8371();
        this.field4403 = arg0.method8371();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method8365();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method6440(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method8365();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field5140--;
                    if (arg0.method8598() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method8371();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("og.ac(Ljava/lang/Integer;S)V")
    public void method6440(Integer arg0) {
    }

    @ObfuscatedName("og.al(I)I")
    public int method6441() {
        return this.field4401 & 0x7;
    }

    @ObfuscatedName("og.ak(B)I")
    public int method6453() {
        return (this.field4401 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("og.ax(II)V")
    public void method6442(int arg0) {
        this.field4401 &= 0xFFFFFFF8;
        this.field4401 = (byte) (this.field4401 | arg0 & 0x7);
    }

    @ObfuscatedName("og.ao(II)V")
    public void method6444(int arg0) {
        this.field4401 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4401 = (byte) (this.field4401 | 0x8);
        }
    }
}
