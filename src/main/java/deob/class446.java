package deob;

@ObfuscatedName("rp")
public class class446 extends class455 {

    @ObfuscatedName("rp.an")
    public final class513 field4769;

    public class446(class513 arg0) {
        super(400);
        this.field4769 = arg0;
    }

    @ObfuscatedName("rp.az(I)Lrr;")
    public class453 method7359() {
        return new class456();
    }

    @ObfuscatedName("rp.ah(IB)[Lrr;")
    public class453[] method7360(int arg0) {
        return new class456[arg0];
    }

    @ObfuscatedName("rp.af(Lur;IB)V")
    public void method7361(class535 arg0, int arg1) {
        while (arg0.field5233 < arg1) {
            int var3 = arg0.method8462();
            if (var3 == 4) {
                class558 var4 = new class558(arg0.method8473(), this.field4769);
                if (!var4.method9076()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field3621.method1768(var4.method9077(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class558 var7 = new class558(arg0.method8473(), this.field4769);
                class558 var8 = new class558(arg0.method8473(), this.field4769);
                arg0.method8473();
                if (!var7.method9076()) {
                    throw new IllegalStateException();
                }
                class456 var9 = (class456) this.method7458(var7);
                if (var6) {
                    class456 var10 = (class456) this.method7458(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method7474(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method7466(var9, var7, var8);
                } else if (this.method7461() < 400) {
                    int var11 = this.method7461();
                    class456 var12 = (class456) this.method7479(var7, var8);
                    var12.field4803 = var11;
                }
            }
        }
    }
}
