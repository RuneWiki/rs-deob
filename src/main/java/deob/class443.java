package deob;

@ObfuscatedName("rt")
public class class443 extends class450 {

    @ObfuscatedName("rt.ak")
    public final class508 field4679;

    @ObfuscatedName("rt.ax")
    public int field4677 = 1;

    @ObfuscatedName("rt.ao")
    public class396 field4678 = new class396();

    public class443(class508 arg0) {
        super(400);
        this.field4679 = arg0;
    }

    @ObfuscatedName("rt.ac(I)Lrp;")
    public class448 method7257() {
        return new class445();
    }

    @ObfuscatedName("rt.al(II)[Lrp;")
    public class448[] method7263(int arg0) {
        return new class445[arg0];
    }

    @ObfuscatedName("rt.ak(Lvf;ZI)Z")
    public boolean method7267(class553 arg0, boolean arg1) {
        class445 var3 = (class445) this.method7360(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4712 != 0;
        }
    }

    @ObfuscatedName("rt.am(Lul;IB)V")
    public void method7268(class530 arg0, int arg1) {
        while (true) {
            if (arg0.field5140 < arg1) {
                boolean var3 = arg0.method8365() == 1;
                class553 var4 = new class553(arg0.method8588(), this.field4679);
                class553 var5 = new class553(arg0.method8588(), this.field4679);
                int var6 = arg0.method8598();
                int var7 = arg0.method8365();
                int var8 = arg0.method8365();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method8588();
                    arg0.method8365();
                    arg0.method8371();
                }
                arg0.method8588();
                if (var4 != null && var4.method8994()) {
                    class445 var11 = (class445) this.method7371(var4);
                    if (var3) {
                        class445 var12 = (class445) this.method7371(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method7356(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method7406() >= 400) {
                            continue;
                        }
                        var11 = (class445) this.method7355(var4, var5);
                    } else {
                        this.method7369(var11, var4, var5);
                        if (var11.field4712 != var6) {
                            boolean var13 = true;
                            for (class446 var14 = (class446) this.field4678.method6639(); var14 != null; var14 = (class446) this.field4678.method6640()) {
                                if (var14.field4691.equals(var4)) {
                                    if (var6 != 0 && var14.field4693 == 0) {
                                        var14.method7766();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4693 != 0) {
                                        var14.method7766();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4678.method6638(new class446(var4, var6));
                            }
                        }
                    }
                    if (var11.field4712 != var6) {
                        var11.field4711 = ++this.field4677 - 1;
                        if (var11.field4712 == -1 && var6 == 0) {
                            var11.field4711 = -(var11.field4711 * 1199192167) * 885089111;
                        }
                        var11.field4712 = var6;
                    }
                    var11.field4713 = var7;
                    var11.field4690 = var9;
                    var11.field4689 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method7368();
            return;
        }
    }
}
