package deob;

@ObfuscatedName("kj")
public class class293 extends class288 {

    @ObfuscatedName("kj.e")
    public final class331 field3705;

    @ObfuscatedName("kj.g")
    public int field3706 = 1;

    @ObfuscatedName("kj.a")
    public class211 field3707 = new class211();

    public class293(class331 arg0) {
        super(400);
        this.field3705 = arg0;
    }

    @ObfuscatedName("kj.f(B)Ljw;")
    public class285 method4952() {
        return new class295();
    }

    @ObfuscatedName("kj.h(II)[Ljw;")
    public class285[] method4962(int arg0) {
        return new class295[arg0];
    }

    @ObfuscatedName("kj.e(Lkh;ZI)Z")
    public boolean method5056(class294 arg0, boolean arg1) {
        class295 var3 = (class295) this.method4986(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3696 != 0;
        }
    }

    @ObfuscatedName("kj.m(Lgx;II)V")
    public void method5055(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2397 < arg1) {
                boolean var3 = arg0.method3323() == 1;
                class294 var4 = new class294(arg0.method3435(), this.field3705);
                class294 var5 = new class294(arg0.method3435(), this.field3705);
                int var6 = arg0.method3325();
                int var7 = arg0.method3323();
                int var8 = arg0.method3323();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3435();
                    arg0.method3323();
                    arg0.method3328();
                }
                arg0.method3435();
                if (var4 != null && var4.method5060()) {
                    class295 var11 = (class295) this.method4967(var4);
                    if (var3) {
                        class295 var12 = (class295) this.method4967(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4973(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4966() >= 400) {
                            continue;
                        }
                        var11 = (class295) this.method4975(var4, var5);
                    } else {
                        this.method4978(var11, var4, var5);
                        if (var11.field3696 != var6) {
                            boolean var13 = true;
                            for (class297 var14 = (class297) this.field3707.method3849(); var14 != null; var14 = (class297) this.field3707.method3850()) {
                                if (var14.field3728.equals(var4)) {
                                    if (var6 != 0 && var14.field3729 == 0) {
                                        var14.method3858();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3729 != 0) {
                                        var14.method3858();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3707.method3848(new class297(var4, var6));
                            }
                        }
                    }
                    if (var11.field3696 != var6) {
                        var11.field3694 = ++this.field3706 - 1;
                        if (var11.field3696 == -1 && var6 == 0) {
                            var11.field3694 = -(var11.field3694 * -1009602011) * 685250989;
                        }
                        var11.field3696 = var6;
                    }
                    var11.field3695 = var7;
                    var11.field3715 = var9;
                    var11.field3714 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4977();
            return;
        }
    }
}
