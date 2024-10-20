package deob;

@ObfuscatedName("jx")
public class class282 extends class277 {

    @ObfuscatedName("jx.t")
    public final class338 field3590;

    @ObfuscatedName("jx.z")
    public int field3588 = 1;

    @ObfuscatedName("jx.n")
    public class263 field3593 = new class263();

    public class282(class338 arg0) {
        super(400);
        this.field3590 = arg0;
    }

    @ObfuscatedName("jx.c(I)Ljw;")
    public class274 method4718() {
        return new class284();
    }

    @ObfuscatedName("jx.x(II)[Ljw;")
    public class274[] method4712(int arg0) {
        return new class284[arg0];
    }

    @ObfuscatedName("jx.t(Ljt;ZB)Z")
    public boolean method4810(class283 arg0, boolean arg1) {
        class284 var3 = (class284) this.method4727(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3582 != 0;
        }
    }

    @ObfuscatedName("jx.v(Lkz;II)V")
    public void method4812(class300 arg0, int arg1) {
        while (true) {
            if (arg0.field3696 < arg1) {
                boolean var3 = arg0.method5103() == 1;
                class283 var4 = new class283(arg0.method5112(), this.field3590);
                class283 var5 = new class283(arg0.method5112(), this.field3590);
                int var6 = arg0.method5304();
                int var7 = arg0.method5103();
                int var8 = arg0.method5103();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5112();
                    arg0.method5103();
                    arg0.method5208();
                }
                arg0.method5112();
                if (var4 != null && var4.method4814()) {
                    class284 var11 = (class284) this.method4728(var4);
                    if (var3) {
                        class284 var12 = (class284) this.method4728(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4731(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4784() >= 400) {
                            continue;
                        }
                        var11 = (class284) this.method4764(var4, var5);
                    } else {
                        this.method4736(var11, var4, var5);
                        if (var11.field3582 != var6) {
                            boolean var13 = true;
                            for (class286 var14 = (class286) this.field3593.method4584(); var14 != null; var14 = (class286) this.field3593.method4585()) {
                                if (var14.field3613.equals(var4)) {
                                    if (var6 != 0 && var14.field3615 == 0) {
                                        var14.method3322();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3615 != 0) {
                                        var14.method3322();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3593.method4583(new class286(var4, var6));
                            }
                        }
                    }
                    if (var11.field3582 != var6) {
                        var11.field3581 = ++this.field3588 - 1;
                        if (var11.field3582 == -1 && var6 == 0) {
                            var11.field3581 = -(var11.field3581 * -2054461169) * 725247471;
                        }
                        var11.field3582 = var6;
                    }
                    var11.field3580 = var7;
                    var11.field3600 = var9;
                    var11.field3599 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4735();
            return;
        }
    }
}
