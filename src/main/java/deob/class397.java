package deob;

@ObfuscatedName("ps")
public class class397 {

    @ObfuscatedName("ps.aq")
    public byte field4597;

    @ObfuscatedName("ps.ad")
    public int field4600;

    @ObfuscatedName("ps.ag")
    public int field4599;

    @ObfuscatedName("ps.ak")
    public int field4598;

    @ObfuscatedName("ps.ap")
    public int field4601;

    @ObfuscatedName("ps.an")
    public int field4602;

    public class397() {
    }

    public class397(class547 arg0, boolean arg1) {
        this.field4597 = arg0.method8857();
        this.field4600 = arg0.method8899();
        this.field4599 = arg0.method8734();
        this.field4598 = arg0.method8734();
        this.field4601 = arg0.method8734();
        this.field4602 = arg0.method8734();
        if (arg1) {
            this.method6704(method4554(arg0));
        }
    }

    @ObfuscatedName("jk.aq(Lvp;I)Ljava/lang/Integer;")
    public static Integer method4554(class547 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method8804();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method8804();
                if (var4 == 255) {
                    break;
                }
                arg0.field5363--;
                if (arg0.method8899() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method8734();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("ps.ad(Ljava/lang/Integer;B)V")
    public void method6704(Integer arg0) {
    }

    @ObfuscatedName("ps.ag(B)I")
    public int method6705() {
        return this.field4597 & 0x7;
    }

    @ObfuscatedName("ps.ak(I)I")
    public int method6706() {
        return (this.field4597 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("ps.ap(IB)V")
    public void method6707(int arg0) {
        this.field4597 &= 0xFFFFFFF8;
        this.field4597 = (byte) (this.field4597 | arg0 & 0x7);
    }

    @ObfuscatedName("ps.an(II)V")
    public void method6710(int arg0) {
        this.field4597 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4597 = (byte) (this.field4597 | 0x8);
        }
    }
}
