package deob;

@ObfuscatedName("rs")
public class class444 extends class451 {

    @ObfuscatedName("rs.af")
    public final class509 field4705;

    @ObfuscatedName("rs.aj")
    public int field4704 = 1;

    @ObfuscatedName("rs.aq")
    public class397 field4706 = new class397();

    public class444(class509 arg0) {
        super(400);
        this.field4705 = arg0;
    }

    @ObfuscatedName("rs.am(I)Lrq;")
    public class449 method7469() {
        return new class446();
    }

    @ObfuscatedName("rs.ap(IB)[Lrq;")
    public class449[] method7476(int arg0) {
        return new class446[arg0];
    }

    @ObfuscatedName("rs.af(Lvs;ZI)Z")
    public boolean method7480(class554 arg0, boolean arg1) {
        class446 var3 = (class446) this.method7575(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4743 != 0;
        }
    }

    @ObfuscatedName("rs.ag(Luk;II)V")
    public void method7477(class531 arg0, int arg1) {
        while (true) {
            if (arg0.field5181 < arg1) {
                boolean var3 = arg0.method8561() == 1;
                class554 var4 = new class554(arg0.method8641(), this.field4705);
                class554 var5 = new class554(arg0.method8641(), this.field4705);
                int var6 = arg0.method8775();
                int var7 = arg0.method8561();
                int var8 = arg0.method8561();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method8641();
                    arg0.method8561();
                    arg0.method8566();
                }
                arg0.method8641();
                if (var4 != null && var4.method9168()) {
                    class446 var11 = (class446) this.method7576(var4);
                    if (var3) {
                        class446 var12 = (class446) this.method7576(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method7579(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method7622() >= 400) {
                            continue;
                        }
                        var11 = (class446) this.method7581(var4, var5);
                    } else {
                        this.method7584(var11, var4, var5);
                        if (var11.field4743 != var6) {
                            boolean var13 = true;
                            for (class447 var14 = (class447) this.field4706.method6787(); var14 != null; var14 = (class447) this.field4706.method6785()) {
                                if (var14.field4722.equals(var4)) {
                                    if (var6 != 0 && var14.field4723 == 0) {
                                        var14.method7984();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4723 != 0) {
                                        var14.method7984();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4706.method6786(new class447(var4, var6));
                            }
                        }
                    }
                    if (var11.field4743 != var6) {
                        var11.field4741 = ++this.field4704 - 1;
                        if (var11.field4743 == -1 && var6 == 0) {
                            var11.field4741 = -(var11.field4741 * -994296281) * 493572503;
                        }
                        var11.field4743 = var6;
                    }
                    var11.field4742 = var7;
                    var11.field4719 = var9;
                    var11.field4718 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method7607();
            return;
        }
    }
}
