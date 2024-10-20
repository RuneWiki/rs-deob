package deob;

@ObfuscatedName("qu")
public class class441 extends class450 {

    @ObfuscatedName("qu.ao")
    public final class508 field4672;

    public class441(class508 arg0) {
        super(400);
        this.field4672 = arg0;
    }

    @ObfuscatedName("qu.ac(I)Lrp;")
    public class448 method7257() {
        return new class451();
    }

    @ObfuscatedName("qu.al(II)[Lrp;")
    public class448[] method7263(int arg0) {
        return new class451[arg0];
    }

    @ObfuscatedName("qu.ak(Lul;IB)V")
    public void method7258(class530 arg0, int arg1) {
        while (arg0.field5140 < arg1) {
            int var3 = arg0.method8365();
            if (var3 == 4) {
                class553 var4 = new class553(arg0.method8588(), this.field4672);
                if (!var4.method8994()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field1907.method1806(var4.method8985(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class553 var7 = new class553(arg0.method8588(), this.field4672);
                class553 var8 = new class553(arg0.method8588(), this.field4672);
                arg0.method8588();
                if (!var7.method8994()) {
                    throw new IllegalStateException();
                }
                class451 var9 = (class451) this.method7371(var7);
                if (var6) {
                    class451 var10 = (class451) this.method7371(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method7356(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method7369(var9, var7, var8);
                } else if (this.method7406() < 400) {
                    int var11 = this.method7406();
                    class451 var12 = (class451) this.method7355(var7, var8);
                    var12.field4710 = var11;
                }
            }
        }
    }
}
