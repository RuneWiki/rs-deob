package deob;

@ObfuscatedName("h")
public class class17 {

    @ObfuscatedName("h.m")
    public byte field306;

    @ObfuscatedName("h.p")
    public int field299;

    @ObfuscatedName("h.i")
    public int field300;

    @ObfuscatedName("h.j")
    public int field298;

    @ObfuscatedName("h.v")
    public int field302;

    @ObfuscatedName("h.x")
    public int field303;

    public class17() {
    }

    public class17(class181 arg0, boolean arg1) {
        this.field306 = arg0.method3013();
        this.field299 = arg0.method3009();
        this.field300 = arg0.method3017();
        this.field298 = arg0.method3017();
        this.field302 = arg0.method3017();
        this.field303 = arg0.method3017();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method3012();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method105(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method3012();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field2498--;
                    if (arg0.method3009() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method3017();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("h.m(Ljava/lang/Integer;B)V")
    public void method105(Integer arg0) {
    }

    @ObfuscatedName("h.p(I)I")
    public int method106() {
        return this.field306 & 0x7;
    }

    @ObfuscatedName("h.i(I)I")
    public int method107() {
        return (this.field306 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("h.j(II)V")
    public void method108(int arg0) {
        this.field306 &= 0xFFFFFFF8;
        this.field306 = (byte) (this.field306 | arg0 & 0x7);
    }

    @ObfuscatedName("h.v(II)V")
    public void method109(int arg0) {
        this.field306 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field306 = (byte) (this.field306 | 0x8);
        }
    }
}
