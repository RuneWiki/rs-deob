package deob;

@ObfuscatedName("jc")
public class class283 extends class278 {

    @ObfuscatedName("jc.e")
    public final class339 field3641;

    @ObfuscatedName("jc.f")
    public int field3644 = 1;

    @ObfuscatedName("jc.m")
    public class263 field3643 = new class263();

    public class283(class339 arg0) {
        super(400);
        this.field3641 = arg0;
    }

    @ObfuscatedName("jc.q(I)Ljd;")
    public class275 method4683() {
        return new class285();
    }

    @ObfuscatedName("jc.w(II)[Ljd;")
    public class275[] method4685(int arg0) {
        return new class285[arg0];
    }

    @ObfuscatedName("jc.e(Ljv;ZI)Z")
    public boolean method4782(class284 arg0, boolean arg1) {
        class285 var3 = (class285) this.method4696(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3637 != 0;
        }
    }

    @ObfuscatedName("jc.c(Lkf;II)V")
    public void method4783(class301 arg0, int arg1) {
        while (true) {
            if (arg0.field3733 < arg1) {
                boolean var3 = arg0.method5077() == 1;
                class284 var4 = new class284(arg0.method5076(), this.field3641);
                class284 var5 = new class284(arg0.method5076(), this.field3641);
                int var6 = arg0.method5069();
                int var7 = arg0.method5077();
                int var8 = arg0.method5077();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5076();
                    arg0.method5077();
                    arg0.method5072();
                }
                arg0.method5076();
                if (var4 != null && var4.method4798()) {
                    class285 var11 = (class285) this.method4746(var4);
                    if (var3) {
                        class285 var12 = (class285) this.method4746(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4700(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4694() >= 400) {
                            continue;
                        }
                        var11 = (class285) this.method4702(var4, var5);
                    } else {
                        this.method4697(var11, var4, var5);
                        if (var11.field3637 != var6) {
                            boolean var13 = true;
                            for (class287 var14 = (class287) this.field3643.method4537(); var14 != null; var14 = (class287) this.field3643.method4538()) {
                                if (var14.field3663.equals(var4)) {
                                    if (var6 != 0 && var14.field3664 == 0) {
                                        var14.method3281();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3664 != 0) {
                                        var14.method3281();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3643.method4536(new class287(var4, var6));
                            }
                        }
                    }
                    if (var11.field3637 != var6) {
                        var11.field3634 = ++this.field3644 - 1;
                        if (var11.field3637 == -1 && var6 == 0) {
                            var11.field3634 = -(var11.field3634 * -782754599) * -1246846103;
                        }
                        var11.field3637 = var6;
                    }
                    var11.field3635 = var7;
                    var11.field3651 = var9;
                    var11.field3652 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4742();
            return;
        }
    }
}
