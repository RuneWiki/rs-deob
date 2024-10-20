package deob;

@ObfuscatedName("kn")
public class class291 extends class286 {

    @ObfuscatedName("kn.q")
    public final class323 field3657;

    @ObfuscatedName("kn.a")
    public int field3658 = 1;

    @ObfuscatedName("kn.l")
    public class209 field3659 = new class209();

    public class291(class323 arg0) {
        super(400);
        this.field3657 = arg0;
    }

    @ObfuscatedName("kn.w(B)Ljn;")
    public class283 method4946() {
        return new class293();
    }

    @ObfuscatedName("kn.m(II)[Ljn;")
    public class283[] method4943(int arg0) {
        return new class293[arg0];
    }

    @ObfuscatedName("kn.q(Lkm;ZI)Z")
    public boolean method5044(class292 arg0, boolean arg1) {
        class293 var3 = (class293) this.method4955(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3649 != 0;
        }
    }

    @ObfuscatedName("kn.d(Lgy;IB)V")
    public void method5041(class183 arg0, int arg1) {
        while (true) {
            if (arg0.field2360 < arg1) {
                boolean var3 = arg0.method3436() == 1;
                class292 var4 = new class292(arg0.method3271(), this.field3657);
                class292 var5 = new class292(arg0.method3271(), this.field3657);
                int var6 = arg0.method3268();
                int var7 = arg0.method3436();
                int var8 = arg0.method3436();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3271();
                    arg0.method3436();
                    arg0.method3267();
                }
                arg0.method3271();
                if (var4 != null && var4.method5049()) {
                    class293 var11 = (class293) this.method4979(var4);
                    if (var3) {
                        class293 var12 = (class293) this.method4979(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4969(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4952() >= 400) {
                            continue;
                        }
                        var11 = (class293) this.method4978(var4, var5);
                    } else {
                        this.method4950(var11, var4, var5);
                        if (var11.field3649 != var6) {
                            boolean var13 = true;
                            for (class295 var14 = (class295) this.field3659.method3823(); var14 != null; var14 = (class295) this.field3659.method3822()) {
                                if (var14.field3676.equals(var4)) {
                                    if (var6 != 0 && var14.field3678 == 0) {
                                        var14.method3832();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3678 != 0) {
                                        var14.method3832();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3659.method3825(new class295(var4, var6));
                            }
                        }
                    }
                    if (var11.field3649 != var6) {
                        var11.field3650 = ++this.field3658 - 1;
                        if (var11.field3649 == -1 && var6 == 0) {
                            var11.field3650 = -(var11.field3650 * 237190023) * -467035593;
                        }
                        var11.field3649 = var6;
                    }
                    var11.field3648 = var7;
                    var11.field3665 = var9;
                    var11.field3664 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4988();
            return;
        }
    }
}
