package deob;

@ObfuscatedName("ic")
public class class253 extends class196 {

    @ObfuscatedName("ic.h")
    public static class191 field3380 = new class191(64);

    @ObfuscatedName("ic.f")
    public char field3377;

    @ObfuscatedName("ic.p")
    public int field3378;

    @ObfuscatedName("ic.x")
    public String field3375;

    @ObfuscatedName("ic.g")
    public boolean field3379 = true;

    @ObfuscatedName("hv.j(II)Lic;")
    public static class253 method3764(int arg0) {
        class253 var1 = (class253) field3380.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3376.method3773(11, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4101(new class175(var2));
        }
        var3.method4100();
        field3380.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.h(I)V")
    public void method4100() {
    }

    @ObfuscatedName("ic.f(Lfb;I)V")
    public void method4101(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method4111(arg0, var2);
        }
    }

    @ObfuscatedName("ic.p(Lfb;IB)V")
    public void method4111(class175 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method2980();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class268.field3651[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3377 = var6;
        } else if (arg1 == 2) {
            this.field3378 = arg0.method2908();
        } else if (arg1 == 4) {
            this.field3379 = false;
        } else if (arg1 == 5) {
            this.field3375 = arg0.method2911();
        }
    }

    @ObfuscatedName("ic.x(I)Z")
    public boolean method4103() {
        return this.field3377 == 's';
    }
}
