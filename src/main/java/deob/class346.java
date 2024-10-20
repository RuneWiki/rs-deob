package deob;

@ObfuscatedName("mi")
public class class346 {

    @ObfuscatedName("mi.f")
    public byte field4292;

    @ObfuscatedName("mi.w")
    public int field4297;

    @ObfuscatedName("mi.v")
    public int field4291;

    @ObfuscatedName("mi.s")
    public int field4294;

    @ObfuscatedName("mi.z")
    public int field4295;

    @ObfuscatedName("mi.j")
    public int field4296;

    public class346() {
    }

    public class346(class474 arg0, boolean arg1) {
        this.field4292 = arg0.method7965();
        this.field4297 = arg0.method8032();
        this.field4291 = arg0.method7979();
        this.field4294 = arg0.method7979();
        this.field4295 = arg0.method7979();
        this.field4296 = arg0.method7979();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method7964();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method6147(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method7964();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field4939--;
                    if (arg0.method8032() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method7979();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("mi.f(Ljava/lang/Integer;I)V")
    public void method6147(Integer arg0) {
    }

    @ObfuscatedName("mi.w(B)I")
    public int method6158() {
        return this.field4292 & 0x7;
    }

    @ObfuscatedName("mi.v(I)I")
    public int method6146() {
        return (this.field4292 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("mi.s(II)V")
    public void method6160(int arg0) {
        this.field4292 &= 0xFFFFFFF8;
        this.field4292 = (byte) (this.field4292 | arg0 & 0x7);
    }

    @ObfuscatedName("mi.z(IB)V")
    public void method6151(int arg0) {
        this.field4292 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4292 = (byte) (this.field4292 | 0x8);
        }
    }
}
