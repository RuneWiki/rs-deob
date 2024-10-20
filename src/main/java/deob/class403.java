package deob;

@ObfuscatedName("po")
public class class403 extends class410 {

    @ObfuscatedName("po.aw")
    public final class469 field4557;

    @ObfuscatedName("po.ac")
    public int field4556 = 1;

    @ObfuscatedName("po.au")
    public class366 field4559 = new class366();

    public class403(class469 arg0) {
        super(400);
        this.field4557 = arg0;
    }

    @ObfuscatedName("po.af(I)Lpw;")
    public class408 method7085() {
        return new class405();
    }

    @ObfuscatedName("po.an(II)[Lpw;")
    public class408[] method7088(int arg0) {
        return new class405[arg0];
    }

    @ObfuscatedName("po.aw(Ltm;ZI)Z")
    public boolean method7105(class513 arg0, boolean arg1) {
        class405 var3 = (class405) this.method7224(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4600 != 0;
        }
    }

    @ObfuscatedName("po.ay(Lsg;IB)V")
    public void method7097(class489 arg0, int arg1) {
        while (true) {
            if (arg0.field4989 < arg1) {
                boolean var3 = arg0.method8248() == 1;
                class513 var4 = new class513(arg0.method8259(), this.field4557);
                class513 var5 = new class513(arg0.method8259(), this.field4557);
                int var6 = arg0.method8250();
                int var7 = arg0.method8248();
                int var8 = arg0.method8248();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method8259();
                    arg0.method8248();
                    arg0.method8254();
                }
                arg0.method8259();
                if (var4 != null && var4.method8843()) {
                    class405 var11 = (class405) this.method7198(var4);
                    if (var3) {
                        class405 var12 = (class405) this.method7198(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method7208(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method7195() >= 400) {
                            continue;
                        }
                        var11 = (class405) this.method7221(var4, var5);
                    } else {
                        this.method7210(var11, var4, var5);
                        if (var11.field4600 != var6) {
                            boolean var13 = true;
                            for (class406 var14 = (class406) this.field4559.method6446(); var14 != null; var14 = (class406) this.field4559.method6449()) {
                                if (var14.field4573.equals(var4)) {
                                    if (var6 != 0 && var14.field4575 == 0) {
                                        var14.method7639();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4575 != 0) {
                                        var14.method7639();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4559.method6451(new class406(var4, var6));
                            }
                        }
                    }
                    if (var11.field4600 != var6) {
                        var11.field4598 = ++this.field4556 - 1;
                        if (var11.field4600 == -1 && var6 == 0) {
                            var11.field4598 = -(var11.field4598 * 1270747397) * 1907692493;
                        }
                        var11.field4600 = var6;
                    }
                    var11.field4599 = var7;
                    var11.field4572 = var9;
                    var11.field4571 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method7205();
            return;
        }
    }
}
