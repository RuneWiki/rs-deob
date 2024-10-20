package deob;

@ObfuscatedName("mm")
public class class345 extends class352 {

    @ObfuscatedName("mm.p")
    public final class400 field4081;

    @ObfuscatedName("mm.m")
    public int field4082 = 1;

    @ObfuscatedName("mm.t")
    public class324 field4083 = new class324();

    public class345(class400 arg0) {
        super(400);
        this.field4081 = arg0;
    }

    @ObfuscatedName("mm.c(B)Lmv;")
    public class350 method5691() {
        return new class346();
    }

    @ObfuscatedName("mm.b(II)[Lmv;")
    public class350[] method5692(int arg0) {
        return new class346[arg0];
    }

    @ObfuscatedName("mm.p(Lpo;ZI)Z")
    public boolean method5700(class440 arg0, boolean arg1) {
        class346 var3 = (class346) this.method5797(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4121 != 0;
        }
    }

    @ObfuscatedName("mm.w(Lpi;II)V")
    public void method5701(class419 arg0, int arg1) {
        while (true) {
            if (arg0.field4475 < arg1) {
                boolean var3 = arg0.method6781() == 1;
                class440 var4 = new class440(arg0.method6707(), this.field4081);
                class440 var5 = new class440(arg0.method6707(), this.field4081);
                int var6 = arg0.method6672();
                int var7 = arg0.method6781();
                int var8 = arg0.method6781();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method6707();
                    arg0.method6781();
                    arg0.method6675();
                }
                arg0.method6707();
                if (var4 != null && var4.method7189()) {
                    class346 var11 = (class346) this.method5798(var4);
                    if (var3) {
                        class346 var12 = (class346) this.method5798(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5815(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5794() >= 400) {
                            continue;
                        }
                        var11 = (class346) this.method5803(var4, var5);
                    } else {
                        this.method5806(var11, var4, var5);
                        if (var11.field4121 != var6) {
                            boolean var13 = true;
                            for (class348 var14 = (class348) this.field4083.method5411(); var14 != null; var14 = (class348) this.field4083.method5415()) {
                                if (var14.field4099.equals(var4)) {
                                    if (var6 != 0 && var14.field4100 == 0) {
                                        var14.method6154();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4100 != 0) {
                                        var14.method6154();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4083.method5410(new class348(var4, var6));
                            }
                        }
                    }
                    if (var11.field4121 != var6) {
                        var11.field4120 = ++this.field4082 - 1;
                        if (var11.field4121 == -1 && var6 == 0) {
                            var11.field4120 = -(var11.field4120 * -818070345) * -79798009;
                        }
                        var11.field4121 = var6;
                    }
                    var11.field4119 = var7;
                    var11.field4086 = var9;
                    var11.field4087 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5805();
            return;
        }
    }
}
