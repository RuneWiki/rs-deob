package deob;

@ObfuscatedName("js")
public class class286 extends class287 {

    @ObfuscatedName("js.s")
    public final class348 field3619;

    public class286(class348 arg0) {
        super(400);
        this.field3619 = arg0;
    }

    @ObfuscatedName("js.z(B)Ljc;")
    public class284 method4798() {
        return new class288();
    }

    @ObfuscatedName("js.k(IB)[Ljc;")
    public class284[] method4797(int arg0) {
        return new class288[arg0];
    }

    @ObfuscatedName("js.s(Lkf;IB)V")
    public void method4794(class310 arg0, int arg1) {
        while (true) {
            if (arg0.field3734 < arg1) {
                int var3 = arg0.method5193();
                boolean var4 = (var3 & 0x1) == 1;
                class293 var5 = new class293(arg0.method5202(), this.field3619);
                class293 var6 = new class293(arg0.method5202(), this.field3619);
                arg0.method5202();
                if (var5 != null && var5.method4886()) {
                    class288 var7 = (class288) this.method4805(var5);
                    if (var4) {
                        class288 var8 = (class288) this.method4805(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method4835(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method4813(var7, var5, var6);
                        continue;
                    }
                    if (this.method4801() < 400) {
                        int var9 = this.method4801();
                        class288 var10 = (class288) this.method4810(var5, var6);
                        var10.field3631 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
