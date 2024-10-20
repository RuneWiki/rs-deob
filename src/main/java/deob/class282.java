package deob;

@ObfuscatedName("jh")
public class class282 extends class277 {

    @ObfuscatedName("jh.n")
    public final class338 field3605;

    @ObfuscatedName("jh.d")
    public int field3604 = 1;

    @ObfuscatedName("jh.m")
    public class263 field3607 = new class263();

    public class282(class338 arg0) {
        super(400);
        this.field3605 = arg0;
    }

    @ObfuscatedName("jh.a(I)Ljg;")
    public class274 method4749() {
        return new class284();
    }

    @ObfuscatedName("jh.t(II)[Ljg;")
    public class274[] method4750(int arg0) {
        return new class284[arg0];
    }

    @ObfuscatedName("jh.n(Lju;ZI)Z")
    public boolean method4843(class283 arg0, boolean arg1) {
        class284 var3 = (class284) this.method4759(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3597 != 0;
        }
    }

    @ObfuscatedName("jh.cw(Lkc;II)V")
    public void method4842(class300 arg0, int arg1) {
        while (true) {
            if (arg0.field3694 < arg1) {
                boolean var3 = arg0.method5123() == 1;
                class283 var4 = new class283(arg0.method5132(), this.field3605);
                class283 var5 = new class283(arg0.method5132(), this.field3605);
                int var6 = arg0.method5166();
                int var7 = arg0.method5123();
                int var8 = arg0.method5123();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5132();
                    arg0.method5123();
                    arg0.method5155();
                }
                arg0.method5132();
                if (var4 != null && var4.method4854()) {
                    class284 var11 = (class284) this.method4760(var4);
                    if (var3) {
                        class284 var12 = (class284) this.method4760(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4763(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4756() >= 400) {
                            continue;
                        }
                        var11 = (class284) this.method4765(var4, var5);
                    } else {
                        this.method4768(var11, var4, var5);
                        if (var11.field3597 != var6) {
                            boolean var13 = true;
                            for (class286 var14 = (class286) this.field3607.method4605(); var14 != null; var14 = (class286) this.field3607.method4606()) {
                                if (var14.field3624.equals(var4)) {
                                    if (var6 != 0 && var14.field3623 == 0) {
                                        var14.method3384();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3623 != 0) {
                                        var14.method3384();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3607.method4604(new class286(var4, var6));
                            }
                        }
                    }
                    if (var11.field3597 != var6) {
                        var11.field3598 = ++this.field3604 - 1;
                        if (var11.field3597 == -1 && var6 == 0) {
                            var11.field3598 = -(var11.field3598 * 357239599) * 1797004239;
                        }
                        var11.field3597 = var6;
                    }
                    var11.field3599 = var7;
                    var11.field3614 = var9;
                    var11.field3612 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4767();
            return;
        }
    }
}
