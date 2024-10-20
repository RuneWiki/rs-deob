package deob;

@ObfuscatedName("jh")
public class class282 extends class277 {

    @ObfuscatedName("jh.b")
    public final class338 field3621;

    @ObfuscatedName("jh.i")
    public int field3622 = 1;

    @ObfuscatedName("jh.k")
    public class263 field3620 = new class263();

    public class282(class338 arg0) {
        super(400);
        this.field3621 = arg0;
    }

    @ObfuscatedName("jh.u(I)Ljr;")
    public class274 method4732() {
        return new class284();
    }

    @ObfuscatedName("jh.f(IB)[Ljr;")
    public class274[] method4742(int arg0) {
        return new class284[arg0];
    }

    @ObfuscatedName("jh.b(Ljb;ZI)Z")
    public boolean method4827(class283 arg0, boolean arg1) {
        class284 var3 = (class284) this.method4750(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3614 != 0;
        }
    }

    @ObfuscatedName("jh.o(Lkg;IB)V")
    public void method4828(class300 arg0, int arg1) {
        while (true) {
            if (arg0.field3707 < arg1) {
                boolean var3 = arg0.method5138() == 1;
                class283 var4 = new class283(arg0.method5147(), this.field3621);
                class283 var5 = new class283(arg0.method5147(), this.field3621);
                int var6 = arg0.method5337();
                int var7 = arg0.method5138();
                int var8 = arg0.method5138();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5147();
                    arg0.method5138();
                    arg0.method5277();
                }
                arg0.method5147();
                if (var4 != null && var4.method4835()) {
                    class284 var11 = (class284) this.method4751(var4);
                    if (var3) {
                        class284 var12 = (class284) this.method4751(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4768(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4747() >= 400) {
                            continue;
                        }
                        var11 = (class284) this.method4756(var4, var5);
                    } else {
                        this.method4791(var11, var4, var5);
                        if (var11.field3614 != var6) {
                            boolean var13 = true;
                            for (class286 var14 = (class286) this.field3620.method4599(); var14 != null; var14 = (class286) this.field3620.method4600()) {
                                if (var14.field3643.equals(var4)) {
                                    if (var6 != 0 && var14.field3646 == 0) {
                                        var14.method3326();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3646 != 0) {
                                        var14.method3326();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3620.method4598(new class286(var4, var6));
                            }
                        }
                    }
                    if (var11.field3614 != var6) {
                        var11.field3613 = ++this.field3622 - 1;
                        if (var11.field3614 == -1 && var6 == 0) {
                            var11.field3613 = -(var11.field3613 * -460007471) * 1502929201;
                        }
                        var11.field3614 = var6;
                    }
                    var11.field3612 = var7;
                    var11.field3630 = var9;
                    var11.field3631 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4758();
            return;
        }
    }
}
