package deob;

@ObfuscatedName("jz")
public class class282 extends class277 {

    @ObfuscatedName("jz.v")
    public final class338 field3610;

    @ObfuscatedName("jz.i")
    public int field3608 = 1;

    @ObfuscatedName("jz.c")
    public class263 field3609 = new class263();

    public class282(class338 arg0) {
        super(400);
        this.field3610 = arg0;
    }

    @ObfuscatedName("jz.z(B)Ljh;")
    public class274 method4599() {
        return new class284();
    }

    @ObfuscatedName("jz.n(II)[Ljh;")
    public class274[] method4598(int arg0) {
        return new class284[arg0];
    }

    @ObfuscatedName("jz.v(Ljq;ZB)Z")
    public boolean method4694(class283 arg0, boolean arg1) {
        class284 var3 = (class284) this.method4613(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3600 != 0;
        }
    }

    @ObfuscatedName("jz.m(Lkl;II)V")
    public void method4693(class300 arg0, int arg1) {
        while (true) {
            if (arg0.field3702 < arg1) {
                boolean var3 = arg0.method4990() == 1;
                class283 var4 = new class283(arg0.method4999(), this.field3610);
                class283 var5 = new class283(arg0.method4999(), this.field3610);
                int var6 = arg0.method4992();
                int var7 = arg0.method4990();
                int var8 = arg0.method4990();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method4999();
                    arg0.method4990();
                    arg0.method5085();
                }
                arg0.method4999();
                if (var4 != null && var4.method4699()) {
                    class284 var11 = (class284) this.method4652(var4);
                    if (var3) {
                        class284 var12 = (class284) this.method4652(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4678(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4637() >= 400) {
                            continue;
                        }
                        var11 = (class284) this.method4619(var4, var5);
                    } else {
                        this.method4622(var11, var4, var5);
                        if (var11.field3600 != var6) {
                            boolean var13 = true;
                            for (class286 var14 = (class286) this.field3609.method4468(); var14 != null; var14 = (class286) this.field3609.method4470()) {
                                if (var14.field3625.equals(var4)) {
                                    if (var6 != 0 && var14.field3626 == 0) {
                                        var14.method3243();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3626 != 0) {
                                        var14.method3243();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3609.method4467(new class286(var4, var6));
                            }
                        }
                    }
                    if (var11.field3600 != var6) {
                        var11.field3598 = ++this.field3608 - 1;
                        if (var11.field3600 == -1 && var6 == 0) {
                            var11.field3598 = -(var11.field3598 * 1171982777) * -1761858423;
                        }
                        var11.field3600 = var6;
                    }
                    var11.field3599 = var7;
                    var11.field3616 = var9;
                    var11.field3615 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4608();
            return;
        }
    }
}
