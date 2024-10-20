package deob;

@ObfuscatedName("ky")
public class class293 extends class288 {

    @ObfuscatedName("ky.o")
    public final class326 field3671;

    @ObfuscatedName("ky.b")
    public int field3676 = 1;

    @ObfuscatedName("ky.c")
    public class211 field3673 = new class211();

    public class293(class326 arg0) {
        super(400);
        this.field3671 = arg0;
    }

    @ObfuscatedName("ky.v(I)Ljx;")
    public class285 method4986() {
        return new class295();
    }

    @ObfuscatedName("ky.s(II)[Ljx;")
    public class285[] method4976(int arg0) {
        return new class295[arg0];
    }

    @ObfuscatedName("ky.o(Lkk;ZB)Z")
    public boolean method5076(class294 arg0, boolean arg1) {
        class295 var3 = (class295) this.method5013(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3664 != 0;
        }
    }

    @ObfuscatedName("ky.z(Lgx;IS)V")
    public void method5077(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2386 < arg1) {
                boolean var3 = arg0.method3274() == 1;
                class294 var4 = new class294(arg0.method3490(), this.field3671);
                class294 var5 = new class294(arg0.method3490(), this.field3671);
                int var6 = arg0.method3276();
                int var7 = arg0.method3274();
                int var8 = arg0.method3274();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3490();
                    arg0.method3274();
                    arg0.method3279();
                }
                arg0.method3490();
                if (var4 != null && var4.method5084()) {
                    class295 var11 = (class295) this.method5015(var4);
                    if (var3) {
                        class295 var12 = (class295) this.method5015(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5020(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4991() >= 400) {
                            continue;
                        }
                        var11 = (class295) this.method5007(var4, var5);
                    } else {
                        this.method5036(var11, var4, var5);
                        if (var11.field3664 != var6) {
                            boolean var13 = true;
                            for (class297 var14 = (class297) this.field3673.method3836(); var14 != null; var14 = (class297) this.field3673.method3833()) {
                                if (var14.field3693.equals(var4)) {
                                    if (var6 != 0 && var14.field3694 == 0) {
                                        var14.method3839();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3694 != 0) {
                                        var14.method3839();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3673.method3832(new class297(var4, var6));
                            }
                        }
                    }
                    if (var11.field3664 != var6) {
                        var11.field3662 = ++this.field3676 - 1;
                        if (var11.field3664 == -1 && var6 == 0) {
                            var11.field3662 = -(var11.field3662 * -1542125359) * 2142785585;
                        }
                        var11.field3664 = var6;
                    }
                    var11.field3663 = var7;
                    var11.field3682 = var9;
                    var11.field3683 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5001();
            return;
        }
    }
}
