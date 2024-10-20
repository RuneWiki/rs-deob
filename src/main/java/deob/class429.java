package deob;

@ObfuscatedName("qp")
public class class429 extends class436 {

    @ObfuscatedName("qp.ar")
    public final class494 field4634;

    @ObfuscatedName("qp.am")
    public int field4635 = 1;

    @ObfuscatedName("qp.as")
    public class382 field4636 = new class382();

    public class429(class494 arg0) {
        super(400);
        this.field4634 = arg0;
    }

    @ObfuscatedName("qp.aw(S)Lqe;")
    public class434 method7164() {
        return new class431();
    }

    @ObfuscatedName("qp.ay(IB)[Lqe;")
    public class434[] method7163(int arg0) {
        return new class431[arg0];
    }

    @ObfuscatedName("qp.ar(Lui;ZI)Z")
    public boolean method7172(class538 arg0, boolean arg1) {
        class431 var3 = (class431) this.method7263(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4669 != 0;
        }
    }

    @ObfuscatedName("qp.ag(Lty;IB)V")
    public void method7173(class514 arg0, int arg1) {
        while (true) {
            if (arg0.field5072 < arg1) {
                boolean var3 = arg0.method8244() == 1;
                class538 var4 = new class538(arg0.method8369(), this.field4634);
                class538 var5 = new class538(arg0.method8369(), this.field4634);
                int var6 = arg0.method8246();
                int var7 = arg0.method8244();
                int var8 = arg0.method8244();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method8369();
                    arg0.method8244();
                    arg0.method8496();
                }
                arg0.method8369();
                if (var4 != null && var4.method8883()) {
                    class431 var11 = (class431) this.method7264(var4);
                    if (var3) {
                        class431 var12 = (class431) this.method7264(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method7267(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method7308() >= 400) {
                            continue;
                        }
                        var11 = (class431) this.method7269(var4, var5);
                    } else {
                        this.method7272(var11, var4, var5);
                        if (var11.field4669 != var6) {
                            boolean var13 = true;
                            for (class432 var14 = (class432) this.field4636.method6490(); var14 != null; var14 = (class432) this.field4636.method6491()) {
                                if (var14.field4650.equals(var4)) {
                                    if (var6 != 0 && var14.field4651 == 0) {
                                        var14.method7657();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4651 != 0) {
                                        var14.method7657();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4636.method6489(new class432(var4, var6));
                            }
                        }
                    }
                    if (var11.field4669 != var6) {
                        var11.field4670 = ++this.field4635 - 1;
                        if (var11.field4669 == -1 && var6 == 0) {
                            var11.field4670 = -(var11.field4670 * -294863233) * -1422851713;
                        }
                        var11.field4669 = var6;
                    }
                    var11.field4671 = var7;
                    var11.field4647 = var9;
                    var11.field4648 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method7271();
            return;
        }
    }
}
