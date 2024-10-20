package deob;

@ObfuscatedName("pr")
public class class416 extends class423 {

    @ObfuscatedName("pr.av")
    public final class481 field4575;

    @ObfuscatedName("pr.as")
    public int field4576 = 1;

    @ObfuscatedName("pr.ax")
    public class379 field4577 = new class379();

    public class416(class481 arg0) {
        super(400);
        this.field4575 = arg0;
    }

    @ObfuscatedName("pr.at(I)Lqm;")
    public class421 method7075() {
        return new class418();
    }

    @ObfuscatedName("pr.an(IB)[Lqm;")
    public class421[] method7070(int arg0) {
        return new class418[arg0];
    }

    @ObfuscatedName("pr.av(Lun;ZB)Z")
    public boolean method7077(class525 arg0, boolean arg1) {
        class418 var3 = (class418) this.method7177(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4612 != 0;
        }
    }

    @ObfuscatedName("pr.ab(Ltz;IB)V")
    public void method7078(class501 arg0, int arg1) {
        while (true) {
            if (arg0.field5017 < arg1) {
                boolean var3 = arg0.method8129() == 1;
                class525 var4 = new class525(arg0.method8253(), this.field4575);
                class525 var5 = new class525(arg0.method8253(), this.field4575);
                int var6 = arg0.method8195();
                int var7 = arg0.method8129();
                int var8 = arg0.method8129();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method8253();
                    arg0.method8129();
                    arg0.method8134();
                }
                arg0.method8253();
                if (var4 != null && var4.method8772()) {
                    class418 var11 = (class418) this.method7178(var4);
                    if (var3) {
                        class418 var12 = (class418) this.method7178(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method7232(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method7181() >= 400) {
                            continue;
                        }
                        var11 = (class418) this.method7183(var4, var5);
                    } else {
                        this.method7186(var11, var4, var5);
                        if (var11.field4612 != var6) {
                            boolean var13 = true;
                            for (class419 var14 = (class419) this.field4577.method6434(); var14 != null; var14 = (class419) this.field4577.method6436()) {
                                if (var14.field4593.equals(var4)) {
                                    if (var6 != 0 && var14.field4594 == 0) {
                                        var14.method7553();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4594 != 0) {
                                        var14.method7553();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4577.method6433(new class419(var4, var6));
                            }
                        }
                    }
                    if (var11.field4612 != var6) {
                        var11.field4613 = ++this.field4576 - 1;
                        if (var11.field4612 == -1 && var6 == 0) {
                            var11.field4613 = -(var11.field4613 * -1981175651) * 819600821;
                        }
                        var11.field4612 = var6;
                    }
                    var11.field4614 = var7;
                    var11.field4590 = var9;
                    var11.field4591 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method7185();
            return;
        }
    }
}
