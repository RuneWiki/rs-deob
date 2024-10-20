package deob;

@ObfuscatedName("kr")
public class class291 extends class286 {

    @ObfuscatedName("kr.o")
    public final class327 field3731;

    @ObfuscatedName("kr.c")
    public int field3729 = 1;

    @ObfuscatedName("kr.u")
    public class216 field3733 = new class216();

    public class291(class327 arg0) {
        super(400);
        this.field3731 = arg0;
    }

    @ObfuscatedName("kr.b(I)Ljw;")
    public class283 method4814() {
        return new class293();
    }

    @ObfuscatedName("kr.q(IB)[Ljw;")
    public class283[] method4816(int arg0) {
        return new class293[arg0];
    }

    @ObfuscatedName("kr.o(Lkp;ZI)Z")
    public boolean method4920(class292 arg0, boolean arg1) {
        class293 var3 = (class293) this.method4895(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3721 != 0;
        }
    }

    @ObfuscatedName("kr.u(Lgn;IB)V")
    public void method4921(class194 arg0, int arg1) {
        while (true) {
            if (arg0.field2538 < arg1) {
                boolean var3 = arg0.method3247() == 1;
                class292 var4 = new class292(arg0.method3256(), this.field3731);
                class292 var5 = new class292(arg0.method3256(), this.field3731);
                int var6 = arg0.method3249();
                int var7 = arg0.method3247();
                int var8 = arg0.method3247();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3256();
                    arg0.method3247();
                    arg0.method3261();
                }
                arg0.method3256();
                if (var4 != null && var4.method4927()) {
                    class293 var11 = (class293) this.method4831(var3 ? var5 : var4);
                    if (var11 == null) {
                        if (this.method4827() >= 400) {
                            continue;
                        }
                        var11 = (class293) this.method4836(var4, var5);
                    } else {
                        this.method4839(var11, var4, var5);
                        if (var11.field3721 != var6) {
                            boolean var12 = true;
                            for (class295 var13 = (class295) this.field3733.method3771(); var13 != null; var13 = (class295) this.field3733.method3772()) {
                                if (var13.field3748.equals(var4)) {
                                    if (var6 != 0 && var13.field3750 == 0) {
                                        var13.method3780();
                                        var12 = false;
                                    } else if (var6 == 0 && var13.field3750 != 0) {
                                        var13.method3780();
                                        var12 = false;
                                    }
                                }
                            }
                            if (var12) {
                                this.field3733.method3770(new class295(var4, var6));
                            }
                        }
                    }
                    if (var11.field3721 != var6) {
                        var11.field3719 = ++this.field3729 - 1;
                        if (var11.field3721 == -1 && var6 == 0) {
                            var11.field3719 = -(var11.field3719 * 129726529) * 1220319169;
                        }
                        var11.field3721 = var6;
                    }
                    var11.field3720 = var7;
                    var11.field3737 = var9;
                    var11.field3738 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4838();
            return;
        }
    }
}
