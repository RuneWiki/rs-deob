package deob;

@ObfuscatedName("jo")
public class class282 extends class277 {

    @ObfuscatedName("jo.i")
    public final class338 field3598;

    @ObfuscatedName("jo.d")
    public int field3601 = 1;

    @ObfuscatedName("jo.f")
    public class263 field3602 = new class263();

    public class282(class338 arg0) {
        super(400);
        this.field3598 = arg0;
    }

    @ObfuscatedName("jo.s(I)Lju;")
    public class274 method4665() {
        return new class284();
    }

    @ObfuscatedName("jo.j(II)[Lju;")
    public class274[] method4663(int arg0) {
        return new class284[arg0];
    }

    @ObfuscatedName("jo.i(Ljx;ZI)Z")
    public boolean method4755(class283 arg0, boolean arg1) {
        class284 var3 = (class284) this.method4674(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3588 != 0;
        }
    }

    @ObfuscatedName("jo.q(Lky;IB)V")
    public void method4759(class300 arg0, int arg1) {
        while (true) {
            if (arg0.field3704 < arg1) {
                boolean var3 = arg0.method5179() == 1;
                class283 var4 = new class283(arg0.method5150(), this.field3598);
                class283 var5 = new class283(arg0.method5150(), this.field3598);
                int var6 = arg0.method5054();
                int var7 = arg0.method5179();
                int var8 = arg0.method5179();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5150();
                    arg0.method5179();
                    arg0.method5056();
                }
                arg0.method5150();
                if (var4 != null && var4.method4768()) {
                    class284 var11 = (class284) this.method4713(var4);
                    if (var3) {
                        class284 var12 = (class284) this.method4713(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4678(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4699() >= 400) {
                            continue;
                        }
                        var11 = (class284) this.method4737(var4, var5);
                    } else {
                        this.method4724(var11, var4, var5);
                        if (var11.field3588 != var6) {
                            boolean var13 = true;
                            for (class286 var14 = (class286) this.field3602.method4515(); var14 != null; var14 = (class286) this.field3602.method4509()) {
                                if (var14.field3621.equals(var4)) {
                                    if (var6 != 0 && var14.field3623 == 0) {
                                        var14.method3301();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3623 != 0) {
                                        var14.method3301();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3602.method4510(new class286(var4, var6));
                            }
                        }
                    }
                    if (var11.field3588 != var6) {
                        var11.field3589 = ++this.field3601 - 1;
                        if (var11.field3588 == -1 && var6 == 0) {
                            var11.field3589 = -(var11.field3589 * 1037739243) * 1487463363;
                        }
                        var11.field3588 = var6;
                    }
                    var11.field3592 = var7;
                    var11.field3608 = var9;
                    var11.field3607 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4672();
            return;
        }
    }
}
