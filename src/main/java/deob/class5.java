package deob;

@ObfuscatedName("w")
public class class5 {

    @ObfuscatedName("w.x")
    public byte field50;

    @ObfuscatedName("w.j")
    public int field43;

    @ObfuscatedName("w.c")
    public int field44;

    @ObfuscatedName("w.d")
    public int field45;

    @ObfuscatedName("w.w")
    public int field46;

    @ObfuscatedName("w.h")
    public int field47;

    public class5() {
    }

    public class5(class154 arg0, boolean arg1) {
        this.field50 = arg0.method2640();
        this.field43 = arg0.method2745();
        this.field44 = arg0.method2644();
        this.field45 = arg0.method2644();
        this.field46 = arg0.method2644();
        this.field47 = arg0.method2644();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2701();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method51(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2701();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2086--;
                    if (arg0.method2745() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2644();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("w.x(Ljava/lang/Integer;I)V")
    public void method51(Integer arg0) {
    }

    @ObfuscatedName("w.j(I)I")
    public int method67() {
        return this.field50 & 0x7;
    }

    @ObfuscatedName("w.c(B)I")
    public int method52() {
        return (this.field50 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("w.d(II)V")
    public void method53(int arg0) {
        this.field50 &= 0xFFFFFFF8;
        this.field50 = (byte) (this.field50 | arg0 & 0x7);
    }

    @ObfuscatedName("w.w(II)V")
    public void method54(int arg0) {
        this.field50 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field50 = (byte) (this.field50 | 0x8);
        }
    }
}
