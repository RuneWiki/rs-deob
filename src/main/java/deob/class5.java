package deob;

@ObfuscatedName("y")
public class class5 {

    @ObfuscatedName("y.b")
    public byte field39;

    @ObfuscatedName("y.e")
    public int field40;

    @ObfuscatedName("y.c")
    public int field43;

    @ObfuscatedName("y.l")
    public int field50;

    @ObfuscatedName("y.y")
    public int field42;

    @ObfuscatedName("y.j")
    public int field44;

    public class5() {
    }

    public class5(class154 arg0, boolean arg1) {
        this.field39 = arg0.method2670();
        this.field40 = arg0.method2671();
        this.field43 = arg0.method2815();
        this.field50 = arg0.method2815();
        this.field42 = arg0.method2815();
        this.field44 = arg0.method2815();
        if (arg1) {
            this.method45(Statics.method15(arg0));
        }
    }

    @ObfuscatedName("y.e(Ljava/lang/Integer;B)V")
    public void method45(Integer arg0) {
    }

    @ObfuscatedName("y.c(I)I")
    public int method46() {
        return this.field39 & 0x7;
    }

    @ObfuscatedName("y.l(I)I")
    public int method47() {
        return (this.field39 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("y.y(II)V")
    public void method48(int arg0) {
        this.field39 &= 0xFFFFFFF8;
        this.field39 = (byte) (this.field39 | arg0 & 0x7);
    }

    @ObfuscatedName("y.j(II)V")
    public void method44(int arg0) {
        this.field39 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field39 = (byte) (this.field39 | 0x8);
        }
    }
}
