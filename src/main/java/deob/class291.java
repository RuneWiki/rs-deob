package deob;

@ObfuscatedName("kf")
public class class291 extends class286 {

    @ObfuscatedName("kf.s")
    public final class323 field3636;

    @ObfuscatedName("kf.e")
    public int field3638 = 1;

    @ObfuscatedName("kf.p")
    public class209 field3640 = new class209();

    public class291(class323 arg0) {
        super(400);
        this.field3636 = arg0;
    }

    @ObfuscatedName("kf.z(I)Ljx;")
    public class283 method4921() {
        return new class293();
    }

    @ObfuscatedName("kf.w(II)[Ljx;")
    public class283[] method4924(int arg0) {
        return new class293[arg0];
    }

    @ObfuscatedName("kf.s(Lkm;ZI)Z")
    public boolean method5014(class292 arg0, boolean arg1) {
        class293 var3 = (class293) this.method4936(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3629 != 0;
        }
    }

    @ObfuscatedName("kf.e(Lgk;II)V")
    public void method5015(class183 arg0, int arg1) {
        while (true) {
            if (arg0.field2340 < arg1) {
                boolean var3 = arg0.method3247() == 1;
                class292 var4 = new class292(arg0.method3441(), this.field3636);
                class292 var5 = new class292(arg0.method3441(), this.field3636);
                int var6 = arg0.method3253();
                int var7 = arg0.method3247();
                int var8 = arg0.method3247();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3441();
                    arg0.method3247();
                    arg0.method3374();
                }
                arg0.method3441();
                if (var4 != null && var4.method5027()) {
                    class293 var11 = (class293) this.method4937(var4);
                    if (var3) {
                        class293 var12 = (class293) this.method4937(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4940(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4933() >= 400) {
                            continue;
                        }
                        var11 = (class293) this.method4941(var4, var5);
                    } else {
                        this.method4944(var11, var4, var5);
                        if (var11.field3629 != var6) {
                            boolean var13 = true;
                            for (class295 var14 = (class295) this.field3640.method3795(); var14 != null; var14 = (class295) this.field3640.method3798()) {
                                if (var14.field3663.equals(var4)) {
                                    if (var6 != 0 && var14.field3665 == 0) {
                                        var14.method3805();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3665 != 0) {
                                        var14.method3805();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3640.method3796(new class295(var4, var6));
                            }
                        }
                    }
                    if (var11.field3629 != var6) {
                        var11.field3628 = ++this.field3638 - 1;
                        if (var11.field3629 == -1 && var6 == 0) {
                            var11.field3628 = -(var11.field3628 * -1772374531) * -745943211;
                        }
                        var11.field3629 = var6;
                    }
                    var11.field3630 = var7;
                    var11.field3649 = var9;
                    var11.field3651 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4943();
            return;
        }
    }
}
