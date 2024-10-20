package deob;

@ObfuscatedName("gh")
public class class186 extends class404 {

    @ObfuscatedName("gh.c")
    public static class257 field1991 = new class257(64);

    @ObfuscatedName("gh.i")
    public class418 field1987;

    @ObfuscatedName("gj.v(II)Lgh;")
    public static class186 method3368(int arg0) {
        class186 var1 = (class186) field1991.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1986.method5296(34, arg0);
        class186 var3 = new class186();
        if (var2 != null) {
            var3.method3280(new class438(var2));
        }
        var3.method3262();
        field1991.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gh.c(B)V")
    public void method3262() {
    }

    @ObfuscatedName("gh.i(Lpi;I)V")
    public void method3280(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3264(arg0, var2);
        }
    }

    @ObfuscatedName("gh.f(Lpi;II)V")
    public void method3264(class438 arg0, int arg1) {
        if (arg1 == 249) {
            this.field1987 = class176.method3942(arg0, this.field1987);
        }
    }

    @ObfuscatedName("gh.b(III)I")
    public int method3265(int arg0, int arg1) {
        class418 var3 = this.field1987;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class408 var5 = (class408) var3.method6760((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4409;
            }
        }
        return var4;
    }

    @ObfuscatedName("gh.n(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3266(int arg0, String arg1) {
        class418 var3 = this.field1987;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class405 var5 = (class405) var3.method6760((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4406;
            }
        }
        return var4;
    }
}
