package deob;

@ObfuscatedName("il")
public class class248 {

    public class248() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.q(Lkf;Lla;I)Lla;")
    public static final class317 method347(class301 arg0, class317 arg1) {
        int var2 = arg0.method5077();
        if (arg1 == null) {
            int var3 = var2 - 1;
            int var4 = var3 | var3 >>> 1;
            int var5 = var4 | var4 >>> 2;
            int var6 = var5 | var5 >>> 4;
            int var7 = var6 | var6 >>> 8;
            int var8 = var7 | var7 >>> 16;
            int var9 = var8 + 1;
            arg1 = new class317(var9);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            boolean var12 = arg0.method5077() == 1;
            int var13 = arg0.method5140();
            class181 var14;
            if (var12) {
                var14 = new class177(arg0.method5076());
            } else {
                var14 = new class180(arg0.method5072());
            }
            arg1.method5465(var14, (long) var13);
        }
        return arg1;
    }

    @ObfuscatedName("l.w(Lla;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method40(class317 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class177 var3 = (class177) arg0.method5451((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2108;
        }
    }
}
