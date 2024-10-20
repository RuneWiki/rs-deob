package deob;

@ObfuscatedName("nj")
public class class387 extends class396 {

    @ObfuscatedName("nj.v")
    public final class447 field4502;

    public class387(class447 arg0) {
        super(400);
        this.field4502 = arg0;
    }

    @ObfuscatedName("nj.h(B)Lov;")
    public class394 method6769() {
        return new class397();
    }

    @ObfuscatedName("nj.e(II)[Lov;")
    public class394[] method6765(int arg0) {
        return new class397[arg0];
    }

    @ObfuscatedName("nj.v(Lqy;II)V")
    public void method6763(class467 arg0, int arg1) {
        while (true) {
            if (arg0.field4915 < arg1) {
                int var3 = arg0.method7792();
                boolean var4 = (var3 & 0x1) == 1;
                class490 var5 = new class490(arg0.method7801(), this.field4502);
                class490 var6 = new class490(arg0.method7801(), this.field4502);
                arg0.method7801();
                if (var5 != null && var5.method8385()) {
                    class397 var7 = (class397) this.method6883(var5);
                    if (var4) {
                        class397 var8 = (class397) this.method6883(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method6872(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method6876(var7, var5, var6);
                        continue;
                    }
                    if (this.method6865() < 400) {
                        int var9 = this.method6865();
                        class397 var10 = (class397) this.method6874(var5, var6);
                        var10.field4541 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
