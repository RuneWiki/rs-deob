package deob;

@ObfuscatedName("pj")
public class class400 {

    @ObfuscatedName("pj.ac")
    public byte field4622;

    @ObfuscatedName("pj.ae")
    public int field4620;

    @ObfuscatedName("pj.ag")
    public int field4625;

    @ObfuscatedName("pj.am")
    public int field4623;

    @ObfuscatedName("pj.ax")
    public int field4624;

    @ObfuscatedName("pj.aq")
    public int field4621;

    public class400() {
    }

    public class400(class551 arg0, boolean arg1) {
        this.field4622 = arg0.method8975();
        this.field4620 = arg0.method9119();
        this.field4625 = arg0.method9110();
        this.field4623 = arg0.method9110();
        this.field4624 = arg0.method9110();
        this.field4621 = arg0.method9110();
        if (arg1) {
            this.method6953(method2170(arg0));
        }
    }

    @ObfuscatedName("cp.ac(Lvf;I)Ljava/lang/Integer;")
    public static Integer method2170(class551 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method8955();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method8955();
                if (var4 == 255) {
                    break;
                }
                arg0.field5415--;
                if (arg0.method9119() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method9110();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("pj.ae(Ljava/lang/Integer;I)V")
    public void method6953(Integer arg0) {
    }

    @ObfuscatedName("pj.ag(B)I")
    public int method6944() {
        return this.field4622 & 0x7;
    }

    @ObfuscatedName("pj.am(B)I")
    public int method6955() {
        return (this.field4622 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("pj.ax(IB)V")
    public void method6946(int arg0) {
        this.field4622 &= 0xFFFFFFF8;
        this.field4622 = (byte) (this.field4622 | arg0 & 0x7);
    }

    @ObfuscatedName("pj.aq(II)V")
    public void method6947(int arg0) {
        this.field4622 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4622 = (byte) (this.field4622 | 0x8);
        }
    }
}
