package deob;

@ObfuscatedName("mi")
public class class350 extends class357 {

    @ObfuscatedName("mi.s")
    public final class405 field4131;

    @ObfuscatedName("mi.e")
    public int field4128 = 1;

    @ObfuscatedName("mi.r")
    public class329 field4133 = new class329();

    public class350(class405 arg0) {
        super(400);
        this.field4131 = arg0;
    }

    @ObfuscatedName("mi.c(I)Lmy;")
    public class355 method5678() {
        return new class351();
    }

    @ObfuscatedName("mi.l(IB)[Lmy;")
    public class355[] method5679(int arg0) {
        return new class351[arg0];
    }

    @ObfuscatedName("mi.s(Lpb;ZI)Z")
    public boolean method5690(class442 arg0, boolean arg1) {
        class351 var3 = (class351) this.method5784(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4172 != 0;
        }
    }

    @ObfuscatedName("mi.v(Lpi;IB)V")
    public void method5691(class421 arg0, int arg1) {
        while (true) {
            if (arg0.field4512 < arg1) {
                boolean var3 = arg0.method6686() == 1;
                class442 var4 = new class442(arg0.method6674(), this.field4131);
                class442 var5 = new class442(arg0.method6674(), this.field4131);
                int var6 = arg0.method6666();
                int var7 = arg0.method6686();
                int var8 = arg0.method6686();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method6674();
                    arg0.method6686();
                    arg0.method6669();
                }
                arg0.method6674();
                if (var4 != null && var4.method7230()) {
                    class351 var11 = (class351) this.method5789(var4);
                    if (var3) {
                        class351 var12 = (class351) this.method5789(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5824(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5790() >= 400) {
                            continue;
                        }
                        var11 = (class351) this.method5810(var4, var5);
                    } else {
                        this.method5797(var11, var4, var5);
                        if (var11.field4172 != var6) {
                            boolean var13 = true;
                            for (class353 var14 = (class353) this.field4133.method5384(); var14 != null; var14 = (class353) this.field4133.method5388()) {
                                if (var14.field4150.equals(var4)) {
                                    if (var6 != 0 && var14.field4151 == 0) {
                                        var14.method6161();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4151 != 0) {
                                        var14.method6161();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4133.method5383(new class353(var4, var6));
                            }
                        }
                    }
                    if (var11.field4172 != var6) {
                        var11.field4173 = ++this.field4128 - 1;
                        if (var11.field4172 == -1 && var6 == 0) {
                            var11.field4173 = -(var11.field4173 * 650111289) * 2142778633;
                        }
                        var11.field4172 = var6;
                    }
                    var11.field4174 = var7;
                    var11.field4134 = var9;
                    var11.field4135 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5796();
            return;
        }
    }
}
