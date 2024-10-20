package deob;

@ObfuscatedName("mi")
public class class339 {

    @ObfuscatedName("mi.a")
    public byte field4221;

    @ObfuscatedName("mi.f")
    public int field4215;

    @ObfuscatedName("mi.c")
    public int field4214;

    @ObfuscatedName("mi.x")
    public int field4217;

    @ObfuscatedName("mi.h")
    public int field4216;

    @ObfuscatedName("mi.j")
    public int field4219;

    public class339() {
    }

    public class339(class464 arg0, boolean arg1) {
        this.field4221 = arg0.method7881();
        this.field4215 = arg0.method7716();
        this.field4214 = arg0.method7720();
        this.field4217 = arg0.method7720();
        this.field4216 = arg0.method7720();
        this.field4219 = arg0.method7720();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method7735();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method5945(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method7735();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field4864--;
                    if (arg0.method7716() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method7720();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("mi.a(Ljava/lang/Integer;I)V")
    public void method5945(Integer arg0) {
    }

    @ObfuscatedName("mi.f(I)I")
    public int method5934() {
        return this.field4221 & 0x7;
    }

    @ObfuscatedName("mi.c(I)I")
    public int method5936() {
        return (this.field4221 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("mi.x(II)V")
    public void method5944(int arg0) {
        this.field4221 &= 0xFFFFFFF8;
        this.field4221 = (byte) (this.field4221 | arg0 & 0x7);
    }

    @ObfuscatedName("mi.h(II)V")
    public void method5938(int arg0) {
        this.field4221 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4221 = (byte) (this.field4221 | 0x8);
        }
    }
}
