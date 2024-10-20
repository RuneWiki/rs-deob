package deob;

@ObfuscatedName("qm")
public class class427 extends class436 {

    @ObfuscatedName("qm.as")
    public final class494 field4629;

    public class427(class494 arg0) {
        super(400);
        this.field4629 = arg0;
    }

    @ObfuscatedName("qm.aw(S)Lqe;")
    public class434 method7164() {
        return new class437();
    }

    @ObfuscatedName("qm.ay(IB)[Lqe;")
    public class434[] method7163(int arg0) {
        return new class437[arg0];
    }

    @ObfuscatedName("qm.ar(Lty;II)V")
    public void method7167(class514 arg0, int arg1) {
        while (arg0.field5072 < arg1) {
            int var3 = arg0.method8244();
            if (var3 == 4) {
                class538 var4 = new class538(arg0.method8369(), this.field4629);
                if (!var4.method8883()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field1858.method1776(var4.method8881(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class538 var7 = new class538(arg0.method8369(), this.field4629);
                class538 var8 = new class538(arg0.method8369(), this.field4629);
                arg0.method8369();
                if (!var7.method8883()) {
                    throw new IllegalStateException();
                }
                class437 var9 = (class437) this.method7264(var7);
                if (var6) {
                    class437 var10 = (class437) this.method7264(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method7267(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method7272(var9, var7, var8);
                } else if (this.method7308() < 400) {
                    int var11 = this.method7308();
                    class437 var12 = (class437) this.method7269(var7, var8);
                    var12.field4667 = var11;
                }
            }
        }
    }
}
