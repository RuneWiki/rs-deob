package deob;

@ObfuscatedName("rx")
public class class465 extends class472 {

    @ObfuscatedName("rx.aj")
    public final class524 field4901;

    @ObfuscatedName("rx.az")
    public int field4902 = 1;

    @ObfuscatedName("rx.af")
    public class409 field4903 = new class409();

    public class465(class524 arg0) {
        super(400);
        this.field4901 = arg0;
    }

    @ObfuscatedName("rx.ak(B)Lsg;")
    public class470 method7796() {
        return new class467();
    }

    @ObfuscatedName("rx.al(II)[Lsg;")
    public class470[] method7805(int arg0) {
        return new class467[arg0];
    }

    @ObfuscatedName("rx.aj(Lvv;ZB)Z")
    public boolean method7813(class568 arg0, boolean arg1) {
        class467 var3 = (class467) this.method7911(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4932 != 0;
        }
    }

    @ObfuscatedName("rx.at(Lua;II)V")
    public void method7806(class546 arg0, int arg1) {
        while (true) {
            if (arg0.field5344 < arg1) {
                boolean var3 = arg0.method8796() == 1;
                class568 var4 = new class568(arg0.method8806(), this.field4901);
                class568 var5 = new class568(arg0.method8806(), this.field4901);
                int var6 = arg0.method8798();
                int var7 = arg0.method8796();
                int var8 = arg0.method8796();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method8806();
                    arg0.method8796();
                    arg0.method8801();
                }
                arg0.method8806();
                if (var4 != null && var4.method9387()) {
                    class467 var11 = (class467) this.method7912(var4);
                    if (var3) {
                        class467 var12 = (class467) this.method7912(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method7970(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method7931() >= 400) {
                            continue;
                        }
                        var11 = (class467) this.method7932(var4, var5);
                    } else {
                        this.method7918(var11, var4, var5);
                        if (var11.field4932 != var6) {
                            boolean var13 = true;
                            for (class468 var14 = (class468) this.field4903.method6960(); var14 != null; var14 = (class468) this.field4903.method6962()) {
                                if (var14.field4914.equals(var4)) {
                                    if (var6 != 0 && var14.field4916 == 0) {
                                        var14.method8181();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4916 != 0) {
                                        var14.method8181();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4903.method6969(new class468(var4, var6));
                            }
                        }
                    }
                    if (var11.field4932 != var6) {
                        var11.field4933 = ++this.field4902 - 1;
                        if (var11.field4932 == -1 && var6 == 0) {
                            var11.field4933 = -(var11.field4933 * 2057375033) * 1407439113;
                        }
                        var11.field4932 = var6;
                    }
                    var11.field4934 = var7;
                    var11.field4913 = var9;
                    var11.field4912 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method7917();
            return;
        }
    }
}
