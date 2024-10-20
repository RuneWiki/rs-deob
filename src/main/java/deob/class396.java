package deob;

@ObfuscatedName("pg")
public class class396 {

    @ObfuscatedName("pg.ak")
    public byte field4575;

    @ObfuscatedName("pg.al")
    public int field4571;

    @ObfuscatedName("pg.aj")
    public int field4572;

    @ObfuscatedName("pg.az")
    public int field4573;

    @ObfuscatedName("pg.af")
    public int field4574;

    @ObfuscatedName("pg.aa")
    public int field4570;

    public class396() {
    }

    public class396(class546 arg0, boolean arg1) {
        this.field4575 = arg0.method8797();
        this.field4571 = arg0.method8798();
        this.field4572 = arg0.method8801();
        this.field4573 = arg0.method8801();
        this.field4574 = arg0.method8801();
        this.field4570 = arg0.method8801();
        if (arg1) {
            int var3 = 0;
            boolean var4 = false;
            while (true) {
                int var5 = arg0.method8796();
                if (var5 == 255) {
                    Integer var6 = var4 ? var3 : null;
                    this.method6749(var6);
                    break;
                }
                if (var5 != 0) {
                    throw new IllegalStateException("");
                }
                while (true) {
                    int var7 = arg0.method8796();
                    if (var7 == 255) {
                        break;
                    }
                    arg0.field5344--;
                    if (arg0.method8798() != 0) {
                        throw new IllegalStateException("");
                    }
                    if (var4) {
                        throw new IllegalStateException("");
                    }
                    var3 = arg0.method8801();
                    var4 = true;
                }
            }
        }
    }

    @ObfuscatedName("pg.ak(Ljava/lang/Integer;B)V")
    public void method6749(Integer arg0) {
    }

    @ObfuscatedName("pg.al(B)I")
    public int method6744() {
        return this.field4575 & 0x7;
    }

    @ObfuscatedName("pg.aj(I)I")
    public int method6745() {
        return (this.field4575 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("pg.az(IS)V")
    public void method6747(int arg0) {
        this.field4575 &= 0xFFFFFFF8;
        this.field4575 = (byte) (this.field4575 | arg0 & 0x7);
    }

    @ObfuscatedName("pg.af(II)V")
    public void method6752(int arg0) {
        this.field4575 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4575 = (byte) (this.field4575 | 0x8);
        }
    }
}
