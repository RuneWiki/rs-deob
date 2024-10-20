package deob;

@ObfuscatedName("qb")
public class class442 extends class451 {

    @ObfuscatedName("qb.aq")
    public final class509 field4700;

    public class442(class509 arg0) {
        super(400);
        this.field4700 = arg0;
    }

    @ObfuscatedName("qb.am(I)Lrq;")
    public class449 method7469() {
        return new class452();
    }

    @ObfuscatedName("qb.ap(IB)[Lrq;")
    public class449[] method7476(int arg0) {
        return new class452[arg0];
    }

    @ObfuscatedName("qb.af(Luk;IB)V")
    public void method7471(class531 arg0, int arg1) {
        while (arg0.field5181 < arg1) {
            int var3 = arg0.method8561();
            if (var3 == 4) {
                class554 var4 = new class554(arg0.method8641(), this.field4700);
                if (!var4.method9168()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field3588.method1888(var4.method9164(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class554 var7 = new class554(arg0.method8641(), this.field4700);
                class554 var8 = new class554(arg0.method8641(), this.field4700);
                arg0.method8641();
                if (!var7.method9168()) {
                    throw new IllegalStateException();
                }
                class452 var9 = (class452) this.method7576(var7);
                if (var6) {
                    class452 var10 = (class452) this.method7576(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method7579(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method7584(var9, var7, var8);
                } else if (this.method7622() < 400) {
                    int var11 = this.method7622();
                    class452 var12 = (class452) this.method7581(var7, var8);
                    var12.field4738 = var11;
                }
            }
        }
    }
}
