package deob;

@ObfuscatedName("ko")
public class class293 extends class288 {

    @ObfuscatedName("ko.x")
    public final class349 field3659;

    @ObfuscatedName("ko.z")
    public int field3658 = 1;

    @ObfuscatedName("ko.u")
    public class274 field3657 = new class274();

    public class293(class349 arg0) {
        super(400);
        this.field3659 = arg0;
    }

    @ObfuscatedName("ko.h(B)Lju;")
    public class285 method4716() {
        return new class295();
    }

    @ObfuscatedName("ko.v(II)[Lju;")
    public class285[] method4717(int arg0) {
        return new class295[arg0];
    }

    @ObfuscatedName("ko.x(Lki;ZB)Z")
    public boolean method4811(class294 arg0, boolean arg1) {
        class295 var3 = (class295) this.method4734(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3651 != 0;
        }
    }

    @ObfuscatedName("ko.u(Lkj;II)V")
    public void method4812(class311 arg0, int arg1) {
        while (true) {
            if (arg0.field3752 < arg1) {
                boolean var3 = arg0.method5274() == 1;
                class294 var4 = new class294(arg0.method5202(), this.field3659);
                class294 var5 = new class294(arg0.method5202(), this.field3659);
                int var6 = arg0.method5342();
                int var7 = arg0.method5274();
                int var8 = arg0.method5274();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5202();
                    arg0.method5274();
                    arg0.method5120();
                }
                arg0.method5202();
                if (var4 != null && var4.method4822()) {
                    class295 var11 = (class295) this.method4777(var4);
                    if (var3) {
                        class295 var12 = (class295) this.method4777(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4738(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4731() >= 400) {
                            continue;
                        }
                        var11 = (class295) this.method4732(var4, var5);
                    } else {
                        this.method4742(var11, var4, var5);
                        if (var11.field3651 != var6) {
                            boolean var13 = true;
                            for (class297 var14 = (class297) this.field3657.method4570(); var14 != null; var14 = (class297) this.field3657.method4573()) {
                                if (var14.field3679.equals(var4)) {
                                    if (var6 != 0 && var14.field3680 == 0) {
                                        var14.method3357();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3680 != 0) {
                                        var14.method3357();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3657.method4571(new class297(var4, var6));
                            }
                        }
                    }
                    if (var11.field3651 != var6) {
                        var11.field3650 = ++this.field3658 - 1;
                        if (var11.field3651 == -1 && var6 == 0) {
                            var11.field3650 = -(var11.field3650 * -579950033) * 503110863;
                        }
                        var11.field3651 = var6;
                    }
                    var11.field3652 = var7;
                    var11.field3667 = var9;
                    var11.field3668 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4741();
            return;
        }
    }
}
