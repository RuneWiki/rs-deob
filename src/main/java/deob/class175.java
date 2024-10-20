package deob;

@ObfuscatedName("fu")
public class class175 {

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.c(Lqt;Lpb;I)Lpb;")
    public static final class419 method2132(class443 arg0, class419 arg1) {
        int var2 = arg0.method7047();
        if (arg1 == null) {
            int var3 = class271.method2726(var2);
            arg1 = new class419(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method7047() == 1;
            int var6 = arg0.method7051();
            class410 var7;
            if (var5) {
                var7 = new class406(arg0.method7057());
            } else {
                var7 = new class409(arg0.method7052());
            }
            arg1.method6754(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("dj.v(Lpb;III)I")
    public static int method2678(class419 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class409 var3 = (class409) arg0.method6756((long) arg1);
            return var3 == null ? arg2 : var3.field4461;
        }
    }
}
