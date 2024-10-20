package deob;

@ObfuscatedName("kg")
public class class294 extends class289 {

    @ObfuscatedName("kg.q")
    public final class335 field3711;

    @ObfuscatedName("kg.x")
    public int field3712 = 1;

    @ObfuscatedName("kg.d")
    public class274 field3713 = new class274();

    public class294(class335 arg0) {
        super(400);
        this.field3711 = arg0;
    }

    @ObfuscatedName("kg.m(I)Ljs;")
    public class286 method5022() {
        return new class296();
    }

    @ObfuscatedName("kg.f(II)[Ljs;")
    public class286[] method5031(int arg0) {
        return new class296[arg0];
    }

    @ObfuscatedName("kg.q(Lkp;ZI)Z")
    public boolean method5126(class295 arg0, boolean arg1) {
        class296 var3 = (class296) this.method5039(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3703 != 0;
        }
    }

    @ObfuscatedName("kg.x(Lgr;IB)V")
    public void method5125(class202 arg0, int arg1) {
        while (true) {
            if (arg0.field2439 < arg1) {
                boolean var3 = arg0.method3551() == 1;
                class295 var4 = new class295(arg0.method3426(), this.field3711);
                class295 var5 = new class295(arg0.method3426(), this.field3711);
                int var6 = arg0.method3530();
                int var7 = arg0.method3551();
                int var8 = arg0.method3551();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3426();
                    arg0.method3551();
                    arg0.method3620();
                }
                arg0.method3426();
                if (var4 != null && var4.method5133()) {
                    class296 var11 = (class296) this.method5040(var4);
                    if (var3) {
                        class296 var12 = (class296) this.method5040(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5043(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5036() >= 400) {
                            continue;
                        }
                        var11 = (class296) this.method5052(var4, var5);
                    } else {
                        this.method5057(var11, var4, var5);
                        if (var11.field3703 != var6) {
                            boolean var13 = true;
                            for (class298 var14 = (class298) this.field3713.method4894(); var14 != null; var14 = (class298) this.field3713.method4895()) {
                                if (var14.field3730.equals(var4)) {
                                    if (var6 != 0 && var14.field3731 == 0) {
                                        var14.method3299();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3731 != 0) {
                                        var14.method3299();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3713.method4900(new class298(var4, var6));
                            }
                        }
                    }
                    if (var11.field3703 != var6) {
                        var11.field3701 = ++this.field3712 - 1;
                        if (var11.field3703 == -1 && var6 == 0) {
                            var11.field3701 = -(var11.field3701 * -1377538447) * 120689297;
                        }
                        var11.field3703 = var6;
                    }
                    var11.field3700 = var7;
                    var11.field3720 = var9;
                    var11.field3719 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5047();
            return;
        }
    }
}
