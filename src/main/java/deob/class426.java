package deob;

@ObfuscatedName("qq")
public class class426 extends class435 {

    @ObfuscatedName("qq.ac")
    public final class493 field4629;

    public class426(class493 arg0) {
        super(400);
        this.field4629 = arg0;
    }

    @ObfuscatedName("qq.au(I)Lqs;")
    public class433 method7188() {
        return new class436();
    }

    @ObfuscatedName("qq.ae(IB)[Lqs;")
    public class433[] method7185(int arg0) {
        return new class436[arg0];
    }

    @ObfuscatedName("qq.ao(Ltm;II)V")
    public void method7186(class515 arg0, int arg1) {
        while (arg0.field5111 < arg1) {
            int var3 = arg0.method8300();
            if (var3 == 4) {
                class538 var4 = new class538(arg0.method8311(), this.field4629);
                if (!var4.method8930()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field3367.method1782(var4.method8917(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class538 var7 = new class538(arg0.method8311(), this.field4629);
                class538 var8 = new class538(arg0.method8311(), this.field4629);
                arg0.method8311();
                if (!var7.method8930()) {
                    throw new IllegalStateException();
                }
                class436 var9 = (class436) this.method7277(var7);
                if (var6) {
                    class436 var10 = (class436) this.method7277(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method7280(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method7284(var9, var7, var8);
                } else if (this.method7328() < 400) {
                    int var11 = this.method7328();
                    class436 var12 = (class436) this.method7281(var7, var8);
                    var12.field4669 = var11;
                }
            }
        }
    }
}
