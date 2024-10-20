package deob;

@ObfuscatedName("ng")
public class class389 extends class396 {

    @ObfuscatedName("ng.v")
    public final class447 field4506;

    @ObfuscatedName("ng.x")
    public int field4507 = 1;

    @ObfuscatedName("ng.m")
    public class355 field4505 = new class355();

    public class389(class447 arg0) {
        super(400);
        this.field4506 = arg0;
    }

    @ObfuscatedName("ng.h(B)Lov;")
    public class394 method6769() {
        return new class391();
    }

    @ObfuscatedName("ng.e(II)[Lov;")
    public class394[] method6765(int arg0) {
        return new class391[arg0];
    }

    @ObfuscatedName("ng.v(Lrp;ZS)Z")
    public boolean method6777(class490 arg0, boolean arg1) {
        class391 var3 = (class391) this.method6886(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4543 != 0;
        }
    }

    @ObfuscatedName("ng.g(Lqy;IB)V")
    public void method6775(class467 arg0, int arg1) {
        while (true) {
            if (arg0.field4915 < arg1) {
                boolean var3 = arg0.method7792() == 1;
                class490 var4 = new class490(arg0.method7801(), this.field4506);
                class490 var5 = new class490(arg0.method7801(), this.field4506);
                int var6 = arg0.method7794();
                int var7 = arg0.method7792();
                int var8 = arg0.method7792();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method7801();
                    arg0.method7792();
                    arg0.method7946();
                }
                arg0.method7801();
                if (var4 != null && var4.method8385()) {
                    class391 var11 = (class391) this.method6883(var4);
                    if (var3) {
                        class391 var12 = (class391) this.method6883(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method6872(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method6865() >= 400) {
                            continue;
                        }
                        var11 = (class391) this.method6874(var4, var5);
                    } else {
                        this.method6876(var11, var4, var5);
                        if (var11.field4543 != var6) {
                            boolean var13 = true;
                            for (class392 var14 = (class392) this.field4505.method6208(); var14 != null; var14 = (class392) this.field4505.method6210()) {
                                if (var14.field4522.equals(var4)) {
                                    if (var6 != 0 && var14.field4523 == 0) {
                                        var14.method7223();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4523 != 0) {
                                        var14.method7223();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4505.method6209(new class392(var4, var6));
                            }
                        }
                    }
                    if (var11.field4543 != var6) {
                        var11.field4545 = ++this.field4507 - 1;
                        if (var11.field4543 == -1 && var6 == 0) {
                            var11.field4545 = -(var11.field4545 * -388257165) * 1595280059;
                        }
                        var11.field4543 = var6;
                    }
                    var11.field4544 = var7;
                    var11.field4520 = var9;
                    var11.field4519 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method6917();
            return;
        }
    }
}
