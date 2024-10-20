package deob;

@ObfuscatedName("jd")
public class class280 extends class276 {

    @ObfuscatedName("jd.m")
    public final class314 field3722;

    @ObfuscatedName("jd.z")
    public int field3723 = 1;

    @ObfuscatedName("jd.k")
    public class207 field3720 = new class207();

    public class280(class314 arg0) {
        super(400);
        this.field3722 = arg0;
    }

    @ObfuscatedName("jd.s(I)Ljq;")
    public class274 method4826() {
        return new class283();
    }

    @ObfuscatedName("jd.g(II)[Ljq;")
    public class274[] method4830(int arg0) {
        return new class283[arg0];
    }

    @ObfuscatedName("jd.m(Lja;ZI)Z")
    public boolean method4914(class281 arg0, boolean arg1) {
        class283 var3 = (class283) this.method4840(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3740 != 0;
        }
    }

    @ObfuscatedName("jd.cx(Lgy;IB)V")
    public void method4913(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2514 < arg1) {
                boolean var3 = arg0.method3239() == 1;
                class281 var4 = new class281(arg0.method3248(), this.field3722);
                class281 var5 = new class281(arg0.method3248(), this.field3722);
                int var6 = arg0.method3241();
                int var7 = arg0.method3239();
                int var8 = arg0.method3239();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3248();
                    arg0.method3239();
                    arg0.method3292();
                }
                arg0.method3248();
                if (var4 != null && var4.method4923()) {
                    class283 var11 = (class283) this.method4842(var3 ? var5 : var4);
                    if (var11 == null) {
                        if (this.method4838() >= 400) {
                            continue;
                        }
                        var11 = (class283) this.method4847(var4, var5);
                    } else {
                        this.method4885(var11, var4, var5);
                        if (var11.field3740 != var6) {
                            boolean var12 = true;
                            for (class284 var13 = (class284) this.field3720.method3790(); var13 != null; var13 = (class284) this.field3720.method3787()) {
                                if (var13.field3747.equals(var4)) {
                                    if (var6 != 0 && var13.field3745 == 0) {
                                        var13.method3797();
                                        var12 = false;
                                    } else if (var6 == 0 && var13.field3745 != 0) {
                                        var13.method3797();
                                        var12 = false;
                                    }
                                }
                            }
                            if (var12) {
                                this.field3720.method3786(new class284(var4, var6));
                            }
                        }
                    }
                    if (var11.field3740 != var6) {
                        var11.field3739 = ++this.field3723 - 1;
                        if (var11.field3740 == -1 && var6 == 0) {
                            var11.field3739 = -(var11.field3739 * 333724485) * -91873395;
                        }
                        var11.field3740 = var6;
                    }
                    var11.field3741 = var7;
                    var11.field3742 = var9;
                    var11.field3743 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4849();
            return;
        }
    }
}
