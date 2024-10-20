package deob;

@ObfuscatedName("qh")
public class class440 extends class447 {

    @ObfuscatedName("qh.ar")
    public final class505 field4665;

    @ObfuscatedName("qh.ao")
    public int field4667 = 1;

    @ObfuscatedName("qh.ab")
    public class393 field4668 = new class393();

    public class440(class505 arg0) {
        super(400);
        this.field4665 = arg0;
    }

    @ObfuscatedName("qh.at(I)Lrf;")
    public class445 method7337() {
        return new class442();
    }

    @ObfuscatedName("qh.ah(II)[Lrf;")
    public class445[] method7338(int arg0) {
        return new class442[arg0];
    }

    @ObfuscatedName("qh.ar(Lvj;ZI)Z")
    public boolean method7350(class550 arg0, boolean arg1) {
        class442 var3 = (class442) this.method7442(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4703 != 0;
        }
    }

    @ObfuscatedName("qh.al(Luj;II)V")
    public void method7352(class527 arg0, int arg1) {
        while (true) {
            if (arg0.field5137 < arg1) {
                boolean var3 = arg0.method8410() == 1;
                class550 var4 = new class550(arg0.method8535(), this.field4665);
                class550 var5 = new class550(arg0.method8535(), this.field4665);
                int var6 = arg0.method8412();
                int var7 = arg0.method8410();
                int var8 = arg0.method8410();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method8535();
                    arg0.method8410();
                    arg0.method8416();
                }
                arg0.method8535();
                if (var4 != null && var4.method9075()) {
                    class442 var11 = (class442) this.method7473(var4);
                    if (var3) {
                        class442 var12 = (class442) this.method7473(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method7445(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method7456() >= 400) {
                            continue;
                        }
                        var11 = (class442) this.method7447(var4, var5);
                    } else {
                        this.method7450(var11, var4, var5);
                        if (var11.field4703 != var6) {
                            boolean var13 = true;
                            for (class443 var14 = (class443) this.field4668.method6678(); var14 != null; var14 = (class443) this.field4668.method6676()) {
                                if (var14.field4683.equals(var4)) {
                                    if (var6 != 0 && var14.field4685 == 0) {
                                        var14.method7820();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4685 != 0) {
                                        var14.method7820();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4668.method6679(new class443(var4, var6));
                            }
                        }
                    }
                    if (var11.field4703 != var6) {
                        var11.field4702 = ++this.field4667 - 1;
                        if (var11.field4703 == -1 && var6 == 0) {
                            var11.field4702 = -(var11.field4702 * 1393374135) * -977987065;
                        }
                        var11.field4703 = var6;
                    }
                    var11.field4704 = var7;
                    var11.field4682 = var9;
                    var11.field4680 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method7449();
            return;
        }
    }
}
