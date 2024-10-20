package deob;

@ObfuscatedName("rn")
public class class445 extends class454 {

    @ObfuscatedName("rn.ar")
    public final class512 field4727;

    public class445(class512 arg0) {
        super(400);
        this.field4727 = arg0;
    }

    @ObfuscatedName("rn.aq(B)Lra;")
    public class452 method7487() {
        return new class455();
    }

    @ObfuscatedName("rn.aw(IS)[Lra;")
    public class452[] method7488(int arg0) {
        return new class455[arg0];
    }

    @ObfuscatedName("rn.al(Luq;IB)V")
    public void method7489(class534 arg0, int arg1) {
        while (arg0.field5200 < arg1) {
            int var3 = arg0.method8591();
            if (var3 == 4) {
                class557 var4 = new class557(arg0.method8741(), this.field4727);
                if (!var4.method9181()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field1091.method1786(var4.method9185(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class557 var7 = new class557(arg0.method8741(), this.field4727);
                class557 var8 = new class557(arg0.method8741(), this.field4727);
                arg0.method8741();
                if (!var7.method9181()) {
                    throw new IllegalStateException();
                }
                class455 var9 = (class455) this.method7649(var7);
                if (var6) {
                    class455 var10 = (class455) this.method7649(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method7595(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method7599(var9, var7, var8);
                } else if (this.method7588() < 400) {
                    int var11 = this.method7588();
                    class455 var12 = (class455) this.method7597(var7, var8);
                    var12.field4768 = var11;
                }
            }
        }
    }
}
