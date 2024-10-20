package deob;

@ObfuscatedName("kf")
public class class293 extends class288 {

    @ObfuscatedName("kf.n")
    public final class331 field3692;

    @ObfuscatedName("kf.s")
    public int field3694 = 1;

    @ObfuscatedName("kf.v")
    public class211 field3695 = new class211();

    public class293(class331 arg0) {
        super(400);
        this.field3692 = arg0;
    }

    @ObfuscatedName("kf.y(I)Ljd;")
    public class285 method4988() {
        return new class295();
    }

    @ObfuscatedName("kf.c(II)[Ljd;")
    public class285[] method4989(int arg0) {
        return new class295[arg0];
    }

    @ObfuscatedName("kf.n(Lkx;ZI)Z")
    public boolean method5071(class294 arg0, boolean arg1) {
        class295 var3 = (class295) this.method5005(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3686 != 0;
        }
    }

    @ObfuscatedName("kf.o(Lge;IB)V")
    public void method5074(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2374 < arg1) {
                boolean var3 = arg0.method3299() == 1;
                class294 var4 = new class294(arg0.method3277(), this.field3692);
                class294 var5 = new class294(arg0.method3277(), this.field3692);
                int var6 = arg0.method3280();
                int var7 = arg0.method3299();
                int var8 = arg0.method3299();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3277();
                    arg0.method3299();
                    arg0.method3374();
                }
                arg0.method3277();
                if (var4 != null && var4.method5096()) {
                    class295 var11 = (class295) this.method5043(var4);
                    if (var3) {
                        class295 var12 = (class295) this.method5043(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5009(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5002() >= 400) {
                            continue;
                        }
                        var11 = (class295) this.method5011(var4, var5);
                    } else {
                        this.method5041(var11, var4, var5);
                        if (var11.field3686 != var6) {
                            boolean var13 = true;
                            for (class297 var14 = (class297) this.field3695.method3815(); var14 != null; var14 = (class297) this.field3695.method3818()) {
                                if (var14.field3711.equals(var4)) {
                                    if (var6 != 0 && var14.field3709 == 0) {
                                        var14.method3821();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3709 != 0) {
                                        var14.method3821();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3695.method3814(new class297(var4, var6));
                            }
                        }
                    }
                    if (var11.field3686 != var6) {
                        var11.field3683 = ++this.field3694 - 1;
                        if (var11.field3686 == -1 && var6 == 0) {
                            var11.field3683 = -(var11.field3683 * -857353611) * 72871389;
                        }
                        var11.field3686 = var6;
                    }
                    var11.field3685 = var7;
                    var11.field3698 = var9;
                    var11.field3699 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5045();
            return;
        }
    }
}
