package deob;

@ObfuscatedName("kd")
public class class293 extends class288 {

    @ObfuscatedName("kd.l")
    public final class349 field3652;

    @ObfuscatedName("kd.t")
    public int field3650 = 1;

    @ObfuscatedName("kd.e")
    public class274 field3653 = new class274();

    public class293(class349 arg0) {
        super(400);
        this.field3652 = arg0;
    }

    @ObfuscatedName("kd.f(I)Ljh;")
    public class285 method4799() {
        return new class295();
    }

    @ObfuscatedName("kd.b(IB)[Ljh;")
    public class285[] method4797(int arg0) {
        return new class295[arg0];
    }

    @ObfuscatedName("kd.l(Lkm;ZB)Z")
    public boolean method4896(class294 arg0, boolean arg1) {
        class295 var3 = (class295) this.method4812(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3641 != 0;
        }
    }

    @ObfuscatedName("kd.u(Lkb;II)V")
    public void method4897(class311 arg0, int arg1) {
        while (true) {
            if (arg0.field3741 < arg1) {
                boolean var3 = arg0.method5276() == 1;
                class294 var4 = new class294(arg0.method5189(), this.field3652);
                class294 var5 = new class294(arg0.method5189(), this.field3652);
                int var6 = arg0.method5163();
                int var7 = arg0.method5276();
                int var8 = arg0.method5276();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5189();
                    arg0.method5276();
                    arg0.method5330();
                }
                arg0.method5189();
                if (var4 != null && var4.method4902()) {
                    class295 var11 = (class295) this.method4827(var4);
                    if (var3) {
                        class295 var12 = (class295) this.method4827(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4815(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4816() >= 400) {
                            continue;
                        }
                        var11 = (class295) this.method4826(var4, var5);
                    } else {
                        this.method4836(var11, var4, var5);
                        if (var11.field3641 != var6) {
                            boolean var13 = true;
                            for (class297 var14 = (class297) this.field3653.method4660(); var14 != null; var14 = (class297) this.field3653.method4661()) {
                                if (var14.field3670.equals(var4)) {
                                    if (var6 != 0 && var14.field3669 == 0) {
                                        var14.method3404();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3669 != 0) {
                                        var14.method3404();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3653.method4659(new class297(var4, var6));
                            }
                        }
                    }
                    if (var11.field3641 != var6) {
                        var11.field3642 = ++this.field3650 - 1;
                        if (var11.field3641 == -1 && var6 == 0) {
                            var11.field3642 = -(var11.field3642 * 325522823) * -152395721;
                        }
                        var11.field3641 = var6;
                    }
                    var11.field3643 = var7;
                    var11.field3660 = var9;
                    var11.field3661 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4841();
            return;
        }
    }
}
