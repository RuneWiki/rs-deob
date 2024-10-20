package deob;

@ObfuscatedName("qk")
public class class428 extends class435 {

    @ObfuscatedName("qk.ao")
    public final class493 field4633;

    @ObfuscatedName("qk.at")
    public int field4634 = 1;

    @ObfuscatedName("qk.ac")
    public class381 field4632 = new class381();

    public class428(class493 arg0) {
        super(400);
        this.field4633 = arg0;
    }

    @ObfuscatedName("qk.au(I)Lqs;")
    public class433 method7188() {
        return new class430();
    }

    @ObfuscatedName("qk.ae(IB)[Lqs;")
    public class433[] method7185(int arg0) {
        return new class430[arg0];
    }

    @ObfuscatedName("qk.ao(Luc;ZI)Z")
    public boolean method7195(class538 arg0, boolean arg1) {
        class430 var3 = (class430) this.method7276(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4671 != 0;
        }
    }

    @ObfuscatedName("qk.az(Ltm;IB)V")
    public void method7197(class515 arg0, int arg1) {
        while (true) {
            if (arg0.field5111 < arg1) {
                boolean var3 = arg0.method8300() == 1;
                class538 var4 = new class538(arg0.method8311(), this.field4633);
                class538 var5 = new class538(arg0.method8311(), this.field4633);
                int var6 = arg0.method8448();
                int var7 = arg0.method8300();
                int var8 = arg0.method8300();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method8311();
                    arg0.method8300();
                    arg0.method8306();
                }
                arg0.method8311();
                if (var4 != null && var4.method8930()) {
                    class430 var11 = (class430) this.method7277(var4);
                    if (var3) {
                        class430 var12 = (class430) this.method7277(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method7280(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method7328() >= 400) {
                            continue;
                        }
                        var11 = (class430) this.method7281(var4, var5);
                    } else {
                        this.method7284(var11, var4, var5);
                        if (var11.field4671 != var6) {
                            boolean var13 = true;
                            for (class431 var14 = (class431) this.field4632.method6522(); var14 != null; var14 = (class431) this.field4632.method6518()) {
                                if (var14.field4649.equals(var4)) {
                                    if (var6 != 0 && var14.field4650 == 0) {
                                        var14.method7693();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4650 != 0) {
                                        var14.method7693();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4632.method6516(new class431(var4, var6));
                            }
                        }
                    }
                    if (var11.field4671 != var6) {
                        var11.field4670 = ++this.field4634 - 1;
                        if (var11.field4671 == -1 && var6 == 0) {
                            var11.field4670 = -(var11.field4670 * -1297576351) * -585067103;
                        }
                        var11.field4671 = var6;
                    }
                    var11.field4672 = var7;
                    var11.field4645 = var9;
                    var11.field4646 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method7330();
            return;
        }
    }
}
