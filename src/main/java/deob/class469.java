package deob;

@ObfuscatedName("sd")
public class class469 extends class476 {

    @ObfuscatedName("sd.ag")
    public final class528 field4959;

    @ObfuscatedName("sd.am")
    public int field4962 = 1;

    @ObfuscatedName("sd.ax")
    public class413 field4963 = new class413();

    public class469(class528 arg0) {
        super(400);
        this.field4959 = arg0;
    }

    @ObfuscatedName("sd.ac(I)Lss;")
    public class474 method7986() {
        return new class471();
    }

    @ObfuscatedName("sd.ae(II)[Lss;")
    public class474[] method7985(int arg0) {
        return new class471[arg0];
    }

    @ObfuscatedName("sd.ag(Lwf;ZB)Z")
    public boolean method8000(class574 arg0, boolean arg1) {
        class471 var3 = (class471) this.method8090(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4998 != 0;
        }
    }

    @ObfuscatedName("sd.au(Lvf;II)V")
    public void method8001(class551 arg0, int arg1) {
        while (true) {
            if (arg0.field5415 < arg1) {
                boolean var3 = arg0.method8955() == 1;
                class574 var4 = new class574(arg0.method9166(), this.field4959);
                class574 var5 = new class574(arg0.method9166(), this.field4959);
                int var6 = arg0.method9119();
                int var7 = arg0.method8955();
                int var8 = arg0.method8955();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method9166();
                    arg0.method8955();
                    arg0.method9110();
                }
                arg0.method9166();
                if (var4 != null && var4.method9639()) {
                    class471 var11 = (class471) this.method8091(var4);
                    if (var3) {
                        class471 var12 = (class471) this.method8091(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method8094(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method8109() >= 400) {
                            continue;
                        }
                        var11 = (class471) this.method8145(var4, var5);
                    } else {
                        this.method8099(var11, var4, var5);
                        if (var11.field4998 != var6) {
                            boolean var13 = true;
                            for (class472 var14 = (class472) this.field4963.method7141(); var14 != null; var14 = (class472) this.field4963.method7142()) {
                                if (var14.field4977.equals(var4)) {
                                    if (var6 != 0 && var14.field4978 == 0) {
                                        var14.method8355();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4978 != 0) {
                                        var14.method8355();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4963.method7145(new class472(var4, var6));
                            }
                        }
                    }
                    if (var11.field4998 != var6) {
                        var11.field4997 = ++this.field4962 - 1;
                        if (var11.field4998 == -1 && var6 == 0) {
                            var11.field4997 = -(var11.field4997 * -1560980049) * -59694769;
                        }
                        var11.field4998 = var6;
                    }
                    var11.field4999 = var7;
                    var11.field4974 = var9;
                    var11.field4973 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method8098();
            return;
        }
    }
}
