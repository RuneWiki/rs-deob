package deob;

@ObfuscatedName("ry")
public class class466 extends class473 {

    @ObfuscatedName("ry.ag")
    public final class525 field4919;

    @ObfuscatedName("ry.ak")
    public int field4920 = 1;

    @ObfuscatedName("ry.ap")
    public class410 field4921 = new class410();

    public class466(class525 arg0) {
        super(400);
        this.field4919 = arg0;
    }

    @ObfuscatedName("ry.aq(B)Lsk;")
    public class471 method7759() {
        return new class468();
    }

    @ObfuscatedName("ry.ad(II)[Lsk;")
    public class471[] method7760(int arg0) {
        return new class468[arg0];
    }

    @ObfuscatedName("ry.ag(Lvo;ZI)Z")
    public boolean method7772(class569 arg0, boolean arg1) {
        class468 var3 = (class468) this.method7870(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4957 != 0;
        }
    }

    @ObfuscatedName("ry.ab(Lvp;II)V")
    public void method7771(class547 arg0, int arg1) {
        while (true) {
            if (arg0.field5363 < arg1) {
                boolean var3 = arg0.method8804() == 1;
                class569 var4 = new class569(arg0.method8739(), this.field4919);
                class569 var5 = new class569(arg0.method8739(), this.field4919);
                int var6 = arg0.method8899();
                int var7 = arg0.method8804();
                int var8 = arg0.method8804();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method8739();
                    arg0.method8804();
                    arg0.method8734();
                }
                arg0.method8739();
                if (var4 != null && var4.method9359()) {
                    class468 var11 = (class468) this.method7886(var4);
                    if (var3) {
                        class468 var12 = (class468) this.method7886(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method7874(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method7889() >= 400) {
                            continue;
                        }
                        var11 = (class468) this.method7875(var4, var5);
                    } else {
                        this.method7878(var11, var4, var5);
                        if (var11.field4957 != var6) {
                            boolean var13 = true;
                            for (class469 var14 = (class469) this.field4921.method6905(); var14 != null; var14 = (class469) this.field4921.method6913()) {
                                if (var14.field4936.equals(var4)) {
                                    if (var6 != 0 && var14.field4935 == 0) {
                                        var14.method8123();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4935 != 0) {
                                        var14.method8123();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4921.method6904(new class469(var4, var6));
                            }
                        }
                    }
                    if (var11.field4957 != var6) {
                        var11.field4956 = ++this.field4920 - 1;
                        if (var11.field4957 == -1 && var6 == 0) {
                            var11.field4956 = -(var11.field4956 * 415892275) * 1329967099;
                        }
                        var11.field4957 = var6;
                    }
                    var11.field4955 = var7;
                    var11.field4933 = var9;
                    var11.field4934 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method7877();
            return;
        }
    }
}
