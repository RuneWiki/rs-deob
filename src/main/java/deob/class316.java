package deob;

@ObfuscatedName("lm")
public class class316 {

    @ObfuscatedName("lm.c")
    public byte field3960;

    @ObfuscatedName("lm.l")
    public int field3959;

    @ObfuscatedName("lm.s")
    public int field3961;

    @ObfuscatedName("lm.e")
    public int field3962;

    @ObfuscatedName("lm.r")
    public int field3963;

    @ObfuscatedName("lm.o")
    public int field3964;

    public class316() {
    }

    public class316(class421 arg0, boolean arg1) {
        this.field3960 = arg0.method6664();
        this.field3959 = arg0.method6666();
        this.field3961 = arg0.method6669();
        this.field3962 = arg0.method6669();
        this.field3963 = arg0.method6669();
        this.field3964 = arg0.method6669();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method6686();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method5184(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method6686();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field4512--;
                    if (arg0.method6666() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method6669();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("lm.c(Ljava/lang/Integer;B)V")
    public void method5184(Integer arg0) {
    }

    @ObfuscatedName("lm.l(B)I")
    public int method5175() {
        return this.field3960 & 0x7;
    }

    @ObfuscatedName("lm.s(I)I")
    public int method5172() {
        return (this.field3960 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("lm.e(II)V")
    public void method5177(int arg0) {
        this.field3960 &= 0xFFFFFFF8;
        this.field3960 = (byte) (this.field3960 | arg0 & 0x7);
    }

    @ObfuscatedName("lm.r(II)V")
    public void method5173(int arg0) {
        this.field3960 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3960 = (byte) (this.field3960 | 0x8);
        }
    }
}
