package deob;

@ObfuscatedName("kc")
public class class293 extends class288 {

    @ObfuscatedName("kc.w")
    public final class331 field3708;

    @ObfuscatedName("kc.m")
    public int field3707 = 1;

    @ObfuscatedName("kc.d")
    public class211 field3710 = new class211();

    public class293(class331 arg0) {
        super(400);
        this.field3708 = arg0;
    }

    @ObfuscatedName("kc.f(I)Ljb;")
    public class285 method5023() {
        return new class295();
    }

    @ObfuscatedName("kc.l(IS)[Ljb;")
    public class285[] method5024(int arg0) {
        return new class295[arg0];
    }

    @ObfuscatedName("kc.w(Lka;ZI)Z")
    public boolean method5123(class294 arg0, boolean arg1) {
        class295 var3 = (class295) this.method5039(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3703 != 0;
        }
    }

    @ObfuscatedName("kc.x(Lgm;IB)V")
    public void method5120(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2414 < arg1) {
                boolean var3 = arg0.method3344() == 1;
                class294 var4 = new class294(arg0.method3353(), this.field3708);
                class294 var5 = new class294(arg0.method3353(), this.field3708);
                int var6 = arg0.method3346();
                int var7 = arg0.method3344();
                int var8 = arg0.method3344();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3353();
                    arg0.method3344();
                    arg0.method3432();
                }
                arg0.method3353();
                if (var4 != null && var4.method5131()) {
                    class295 var11 = (class295) this.method5040(var4);
                    if (var3) {
                        class295 var12 = (class295) this.method5040(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5043(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5049() >= 400) {
                            continue;
                        }
                        var11 = (class295) this.method5060(var4, var5);
                    } else {
                        this.method5094(var11, var4, var5);
                        if (var11.field3703 != var6) {
                            boolean var13 = true;
                            for (class297 var14 = (class297) this.field3710.method3855(); var14 != null; var14 = (class297) this.field3710.method3858()) {
                                if (var14.field3729.equals(var4)) {
                                    if (var6 != 0 && var14.field3728 == 0) {
                                        var14.method3868();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3728 != 0) {
                                        var14.method3868();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3710.method3856(new class297(var4, var6));
                            }
                        }
                    }
                    if (var11.field3703 != var6) {
                        var11.field3700 = ++this.field3707 - 1;
                        if (var11.field3703 == -1 && var6 == 0) {
                            var11.field3700 = -(var11.field3700 * 1717545099) * 1607302947;
                        }
                        var11.field3703 = var6;
                    }
                    var11.field3699 = var7;
                    var11.field3718 = var9;
                    var11.field3717 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5047();
            return;
        }
    }
}
