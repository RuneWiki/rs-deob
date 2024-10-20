package deob;

@ObfuscatedName("pg")
public class class414 extends class423 {

    @ObfuscatedName("pg.ax")
    public final class481 field4570;

    public class414(class481 arg0) {
        super(400);
        this.field4570 = arg0;
    }

    @ObfuscatedName("pg.at(I)Lqm;")
    public class421 method7075() {
        return new class424();
    }

    @ObfuscatedName("pg.an(IB)[Lqm;")
    public class421[] method7070(int arg0) {
        return new class424[arg0];
    }

    @ObfuscatedName("pg.av(Ltz;II)V")
    public void method7073(class501 arg0, int arg1) {
        while (arg0.field5017 < arg1) {
            int var3 = arg0.method8129();
            if (var3 == 4) {
                class525 var4 = new class525(arg0.method8253(), this.field4570);
                if (!var4.method8772()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field497.method1726(var4.method8756(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class525 var7 = new class525(arg0.method8253(), this.field4570);
                class525 var8 = new class525(arg0.method8253(), this.field4570);
                arg0.method8253();
                if (!var7.method8772()) {
                    throw new IllegalStateException();
                }
                class424 var9 = (class424) this.method7178(var7);
                if (var6) {
                    class424 var10 = (class424) this.method7178(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method7232(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method7186(var9, var7, var8);
                } else if (this.method7181() < 400) {
                    int var11 = this.method7181();
                    class424 var12 = (class424) this.method7183(var7, var8);
                    var12.field4610 = var11;
                }
            }
        }
    }
}
