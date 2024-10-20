package deob;

@ObfuscatedName("hj")
public class class220 {

    @ObfuscatedName("hj.d")
    public byte field3155;

    @ObfuscatedName("hj.p")
    public int field3153;

    @ObfuscatedName("hj.v")
    public int field3154;

    @ObfuscatedName("hj.l")
    public int field3152;

    @ObfuscatedName("hj.y")
    public int field3157;

    @ObfuscatedName("hj.w")
    public int field3156;

    public class220() {
    }

    public class220(class119 arg0, boolean arg1) {
        this.field3155 = arg0.method2477();
        this.field3153 = arg0.method2359();
        this.field3154 = arg0.method2362();
        this.field3152 = arg0.method2362();
        this.field3157 = arg0.method2362();
        this.field3156 = arg0.method2362();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method2357();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method3792(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method2357();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field1966--;
                    if (arg0.method2359() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method2362();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("hj.d(Ljava/lang/Integer;I)V")
    public void method3792(Integer arg0) {
    }

    @ObfuscatedName("hj.p(I)I")
    public int method3802() {
        return this.field3155 & 0x7;
    }

    @ObfuscatedName("hj.v(I)I")
    public int method3790() {
        return (this.field3155 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("hj.l(II)V")
    public void method3795(int arg0) {
        this.field3155 &= 0xFFFFFFF8;
        this.field3155 = (byte) (this.field3155 | arg0 & 0x7);
    }

    @ObfuscatedName("hj.y(II)V")
    public void method3794(int arg0) {
        this.field3155 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field3155 = (byte) (this.field3155 | 0x8);
        }
    }
}
