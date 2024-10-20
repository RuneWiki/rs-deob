package deob;

@ObfuscatedName("lr")
public class class331 extends class340 {

    @ObfuscatedName("lr.s")
    public final class383 field3927;

    public class331(class383 arg0) {
        super(400);
        this.field3927 = arg0;
    }

    @ObfuscatedName("lr.i(I)Lla;")
    public class338 method5402() {
        return new class341();
    }

    @ObfuscatedName("lr.w(IB)[Lla;")
    public class338[] method5403(int arg0) {
        return new class341[arg0];
    }

    @ObfuscatedName("lr.s(Lop;IB)V")
    public void method5407(class401 arg0, int arg1) {
        while (true) {
            if (arg0.field4300 < arg1) {
                int var3 = arg0.method6240();
                boolean var4 = (var3 & 0x1) == 1;
                class422 var5 = new class422(arg0.method6335(), this.field3927);
                class422 var6 = new class422(arg0.method6335(), this.field3927);
                arg0.method6335();
                if (var5 != null && var5.method6816()) {
                    class341 var7 = (class341) this.method5558(var5);
                    if (var4) {
                        class341 var8 = (class341) this.method5558(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5520(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5507(var7, var5, var6);
                        continue;
                    }
                    if (this.method5496() < 400) {
                        int var9 = this.method5496();
                        class341 var10 = (class341) this.method5518(var5, var6);
                        var10.field3961 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
