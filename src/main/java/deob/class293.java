package deob;

@ObfuscatedName("kl")
public class class293 extends class288 {

    @ObfuscatedName("kl.e")
    public final class331 field3717;

    @ObfuscatedName("kl.i")
    public int field3719 = 1;

    @ObfuscatedName("kl.p")
    public class211 field3718 = new class211();

    public class293(class331 arg0) {
        super(400);
        this.field3717 = arg0;
    }

    @ObfuscatedName("kl.g(I)Ljr;")
    public class285 method5158() {
        return new class295();
    }

    @ObfuscatedName("kl.r(II)[Ljr;")
    public class285[] method5159(int arg0) {
        return new class295[arg0];
    }

    @ObfuscatedName("kl.e(Lkg;ZI)Z")
    public boolean method5259(class294 arg0, boolean arg1) {
        class295 var3 = (class295) this.method5175(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3709 != 0;
        }
    }

    @ObfuscatedName("kl.d(Lgl;IB)V")
    public void method5260(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2406 < arg1) {
                boolean var3 = arg0.method3679() == 1;
                class294 var4 = new class294(arg0.method3474(), this.field3717);
                class294 var5 = new class294(arg0.method3474(), this.field3717);
                int var6 = arg0.method3467();
                int var7 = arg0.method3679();
                int var8 = arg0.method3679();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3474();
                    arg0.method3679();
                    arg0.method3588();
                }
                arg0.method3474();
                if (var4 != null && var4.method5270()) {
                    class295 var11 = (class295) this.method5176(var4);
                    if (var3) {
                        class295 var12 = (class295) this.method5176(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5220(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5172() >= 400) {
                            continue;
                        }
                        var11 = (class295) this.method5180(var4, var5);
                    } else {
                        this.method5177(var11, var4, var5);
                        if (var11.field3709 != var6) {
                            boolean var13 = true;
                            for (class297 var14 = (class297) this.field3718.method3993(); var14 != null; var14 = (class297) this.field3718.method3994()) {
                                if (var14.field3735.equals(var4)) {
                                    if (var6 != 0 && var14.field3736 == 0) {
                                        var14.method3999();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3736 != 0) {
                                        var14.method3999();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3718.method3992(new class297(var4, var6));
                            }
                        }
                    }
                    if (var11.field3709 != var6) {
                        var11.field3707 = ++this.field3719 - 1;
                        if (var11.field3709 == -1 && var6 == 0) {
                            var11.field3707 = -(var11.field3707 * -602300361) * 845682055;
                        }
                        var11.field3709 = var6;
                    }
                    var11.field3711 = var7;
                    var11.field3724 = var9;
                    var11.field3725 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5187();
            return;
        }
    }
}
