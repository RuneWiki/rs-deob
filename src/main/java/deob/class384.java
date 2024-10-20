package deob;

@ObfuscatedName("ob")
public class class384 {

    @ObfuscatedName("ob.am")
    public byte field4425;

    @ObfuscatedName("ob.ap")
    public int field4429;

    @ObfuscatedName("ob.af")
    public int field4427;

    @ObfuscatedName("ob.aj")
    public int field4428;

    @ObfuscatedName("ob.aq")
    public int field4426;

    @ObfuscatedName("ob.ar")
    public int field4430;

    public class384() {
    }

    public class384(class531 arg0, boolean arg1) {
        this.field4425 = arg0.method8562();
        this.field4429 = arg0.method8775();
        this.field4427 = arg0.method8566();
        this.field4428 = arg0.method8566();
        this.field4426 = arg0.method8566();
        this.field4430 = arg0.method8566();
        if (arg1) {
            this.method6577(method5735(arg0));
        }
    }

    @ObfuscatedName("mu.am(Luk;B)Ljava/lang/Integer;")
    public static Integer method5735(class531 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method8561();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method8561();
                if (var4 == 255) {
                    break;
                }
                arg0.field5181--;
                if (arg0.method8775() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method8566();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("ob.ap(Ljava/lang/Integer;B)V")
    public void method6577(Integer arg0) {
    }

    @ObfuscatedName("ob.af(B)I")
    public int method6570() {
        return this.field4425 & 0x7;
    }

    @ObfuscatedName("ob.aj(I)I")
    public int method6571() {
        return (this.field4425 & 0x8) == 8 ? 1 : 0;
    }

    @ObfuscatedName("ob.aq(II)V")
    public void method6572(int arg0) {
        this.field4425 &= 0xFFFFFFF8;
        this.field4425 = (byte) (this.field4425 | arg0 & 0x7);
    }

    @ObfuscatedName("ob.ar(IB)V")
    public void method6588(int arg0) {
        this.field4425 &= 0xFFFFFFF7;
        if (arg0 == 1) {
            this.field4425 = (byte) (this.field4425 | 0x8);
        }
    }
}
