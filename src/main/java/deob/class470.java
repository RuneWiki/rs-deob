package deob;

@ObfuscatedName("ss")
public class class470 extends class477 {

    @ObfuscatedName("ss.ak")
    public final class535 field4989;

    @ObfuscatedName("ss.aj")
    public int field4988 = 1;

    @ObfuscatedName("ss.ai")
    public class414 field4987 = new class414();

    public class470(class535 arg0) {
        super(400);
        this.field4989 = arg0;
    }

    @ObfuscatedName("ss.ap(I)Lse;")
    public class475 method8257() {
        return new class472();
    }

    @ObfuscatedName("ss.aw(II)[Lse;")
    public class475[] method8258(int arg0) {
        return new class472[arg0];
    }

    @ObfuscatedName("ss.ak(Lwx;ZI)Z")
    public boolean method8272(class581 arg0, boolean arg1) {
        class472 var3 = (class472) this.method8359(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field5022 != 0;
        }
    }

    @ObfuscatedName("ss.at(Lvl;IB)V")
    public void method8271(class558 arg0, int arg1) {
        while (true) {
            if (arg0.field5462 < arg1) {
                boolean var3 = arg0.method9258() == 1;
                class581 var4 = new class581(arg0.method9269(), this.field4989);
                class581 var5 = new class581(arg0.method9269(), this.field4989);
                int var6 = arg0.method9260();
                int var7 = arg0.method9258();
                int var8 = arg0.method9258();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method9269();
                    arg0.method9258();
                    arg0.method9264();
                }
                arg0.method9269();
                if (var4 != null && var4.method9994()) {
                    class472 var11 = (class472) this.method8360(var4);
                    if (var3) {
                        class472 var12 = (class472) this.method8360(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method8363(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method8356() >= 400) {
                            continue;
                        }
                        var11 = (class472) this.method8365(var4, var5);
                    } else {
                        this.method8368(var11, var4, var5);
                        if (var11.field5022 != var6) {
                            boolean var13 = true;
                            for (class473 var14 = (class473) this.field4987.method7380(); var14 != null; var14 = (class473) this.field4987.method7381()) {
                                if (var14.field5002.equals(var4)) {
                                    if (var6 != 0 && var14.field5004 == 0) {
                                        var14.method8661();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field5004 != 0) {
                                        var14.method8661();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4987.method7378(new class473(var4, var6));
                            }
                        }
                    }
                    if (var11.field5022 != var6) {
                        var11.field5025 = ++this.field4988 - 1;
                        if (var11.field5022 == -1 && var6 == 0) {
                            var11.field5025 = -(var11.field5025 * -1821959387) * -1071937363;
                        }
                        var11.field5022 = var6;
                    }
                    var11.field5024 = var7;
                    var11.field5000 = var9;
                    var11.field4998 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method8367();
            return;
        }
    }
}
