package deob;

@ObfuscatedName("py")
public class class399 extends class406 {

    @ObfuscatedName("py.ac")
    public final class458 field4500;

    @ObfuscatedName("py.ab")
    public int field4499 = 1;

    @ObfuscatedName("py.an")
    public class362 field4497 = new class362();

    public class399(class458 arg0) {
        super(400);
        this.field4500 = arg0;
    }

    @ObfuscatedName("py.aj(I)Lpb;")
    public class404 method6843() {
        return new class401();
    }

    @ObfuscatedName("py.al(IB)[Lpb;")
    public class404[] method6844(int arg0) {
        return new class401[arg0];
    }

    @ObfuscatedName("py.ac(Ltj;ZB)Z")
    public boolean method6856(class501 arg0, boolean arg1) {
        class401 var3 = (class401) this.method6954(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4533 != 0;
        }
    }

    @ObfuscatedName("py.ar(Lsy;IB)V")
    public void method6857(class478 arg0, int arg1) {
        while (true) {
            if (arg0.field4904 < arg1) {
                boolean var3 = arg0.method7909() == 1;
                class501 var4 = new class501(arg0.method7950(), this.field4500);
                class501 var5 = new class501(arg0.method7950(), this.field4500);
                int var6 = arg0.method7905();
                int var7 = arg0.method7909();
                int var8 = arg0.method7909();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method7950();
                    arg0.method7909();
                    arg0.method7908();
                }
                arg0.method7950();
                if (var4 != null && var4.method8489()) {
                    class401 var11 = (class401) this.method6955(var4);
                    if (var3) {
                        class401 var12 = (class401) this.method6955(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method6974(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method6951() >= 400) {
                            continue;
                        }
                        var11 = (class401) this.method6989(var4, var5);
                    } else {
                        this.method6963(var11, var4, var5);
                        if (var11.field4533 != var6) {
                            boolean var13 = true;
                            for (class402 var14 = (class402) this.field4497.method6213(); var14 != null; var14 = (class402) this.field4497.method6214()) {
                                if (var14.field4514.equals(var4)) {
                                    if (var6 != 0 && var14.field4515 == 0) {
                                        var14.method7327();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4515 != 0) {
                                        var14.method7327();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4497.method6212(new class402(var4, var6));
                            }
                        }
                    }
                    if (var11.field4533 != var6) {
                        var11.field4534 = ++this.field4499 - 1;
                        if (var11.field4533 == -1 && var6 == 0) {
                            var11.field4534 = -(var11.field4534 * 446520237) * -58671067;
                        }
                        var11.field4533 = var6;
                    }
                    var11.field4532 = var7;
                    var11.field4510 = var9;
                    var11.field4509 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method6962();
            return;
        }
    }
}
