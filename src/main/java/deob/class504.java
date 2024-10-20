package deob;

@ObfuscatedName("tx")
public class class504 {

    public class504() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.af(Lnm;III)[Ltc;")
    public static class502[] method1934(class344 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6090(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method8185(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class502[] var5 = new class502[Statics.field5102];
        for (int var6 = 0; var6 < Statics.field5102; var6++) {
            class502 var7 = var5[var6] = new class502();
            var7.field5079 = Statics.field5100;
            var7.field5085 = Statics.field5099;
            var7.field5086 = Statics.field5101[var6];
            var7.field5084 = Statics.field94[var6];
            var7.field5081 = Statics.field1302[var6];
            var7.field5082 = Statics.field1644[var6];
            var7.field5080 = Statics.field4525;
            var7.field5083 = Statics.field2113[var6];
        }
        method7059();
        return var5;
    }

    @ObfuscatedName("eb.an(Lnm;III)[Ltq;")
    public static class503[] method2775(class344 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6090(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method8185(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class503[] var5 = new class503[Statics.field5102];
        for (int var6 = 0; var6 < Statics.field5102; var6++) {
            class503 var7 = var5[var6] = new class503();
            var7.field5092 = Statics.field5100;
            var7.field5087 = Statics.field5099;
            var7.field5090 = Statics.field5101[var6];
            var7.field5091 = Statics.field94[var6];
            var7.field5088 = Statics.field1302[var6];
            var7.field5093 = Statics.field1644[var6];
            int var8 = var7.field5093 * var7.field5088;
            byte[] var9 = Statics.field2113[var6];
            var7.field5089 = new int[var8];
            for (int var10 = 0; var10 < var8; var10++) {
                var7.field5089[var10] = Statics.field4525[var9[var10] & 0xFF];
            }
        }
        method7059();
        return var5;
    }

    @ObfuscatedName("sc.aw(Lnm;III)Ltq;")
    public static class503 method8178(class344 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6090(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            method8185(var3);
            var4 = true;
        }
        return var4 ? method3323() : null;
    }

    @ObfuscatedName("mz.ac(Lnm;Ljava/lang/String;Ljava/lang/String;I)[Ltc;")
    public static class502[] method5758(class344 arg0, String arg1, String arg2) {
        if (arg0.method6088(arg1, arg2)) {
            int var3 = arg0.method6086(arg1);
            int var4 = arg0.method6075(var3, arg2);
            return method1934(arg0, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("pv.ab(Lnm;Lnm;Ljava/lang/String;Ljava/lang/String;I)Lon;")
    public static class379 method7310(class344 arg0, class344 arg1, String arg2, String arg3) {
        if (!arg0.method6088(arg2, arg3)) {
            return null;
        }
        int var4 = arg0.method6086(arg2);
        int var5 = arg0.method6075(var4, arg3);
        byte[] var6 = arg0.method6090(var4, var5);
        boolean var7;
        if (var6 == null) {
            var7 = false;
        } else {
            method8185(var6);
            var7 = true;
        }
        class379 var8;
        if (var7) {
            byte[] var9 = arg1.method6090(var4, var5);
            class379 var10;
            if (var9 == null) {
                var10 = null;
            } else {
                class379 var11 = new class379(var9, Statics.field5101, Statics.field94, Statics.field1302, Statics.field1644, Statics.field4525, Statics.field2113);
                method7059();
                var10 = var11;
            }
            var8 = var10;
        } else {
            var8 = null;
        }
        return var8;
    }

    @ObfuscatedName("rr.aq(Lnm;II)Ltc;")
    public static class502 method7681(class344 arg0, int arg1) {
        byte[] var2 = arg0.method6117(arg1);
        boolean var3;
        if (var2 == null) {
            var3 = false;
        } else {
            method8185(var2);
            var3 = true;
        }
        return var3 ? Statics.method5989() : null;
    }

    @ObfuscatedName("gx.at(I)Ltq;")
    public static class503 method3323() {
        class503 var0 = new class503();
        var0.field5092 = Statics.field5100;
        var0.field5087 = Statics.field5099;
        var0.field5090 = Statics.field5101[0];
        var0.field5091 = Statics.field94[0];
        var0.field5088 = Statics.field1302[0];
        var0.field5093 = Statics.field1644[0];
        int var1 = var0.field5093 * var0.field5088;
        byte[] var2 = Statics.field2113[0];
        var0.field5089 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field5089[var3] = Statics.field4525[var2[var3] & 0xFF];
        }
        method7059();
        return var0;
    }

    @ObfuscatedName("sb.aa([BI)V")
    public static void method8185(byte[] arg0) {
        class489 var1 = new class489(arg0);
        var1.field4989 = arg0.length - 2;
        Statics.field5102 = var1.method8250();
        Statics.field5101 = new int[Statics.field5102];
        Statics.field94 = new int[Statics.field5102];
        Statics.field1302 = new int[Statics.field5102];
        Statics.field1644 = new int[Statics.field5102];
        Statics.field2113 = new byte[Statics.field5102][];
        var1.field4989 = arg0.length - 7 - Statics.field5102 * 8;
        Statics.field5100 = var1.method8250();
        Statics.field5099 = var1.method8250();
        int var2 = (var1.method8248() & 0xFF) + 1;
        for (int var3 = 0; var3 < Statics.field5102; var3++) {
            Statics.field5101[var3] = var1.method8250();
        }
        for (int var4 = 0; var4 < Statics.field5102; var4++) {
            Statics.field94[var4] = var1.method8250();
        }
        for (int var5 = 0; var5 < Statics.field5102; var5++) {
            Statics.field1302[var5] = var1.method8250();
        }
        for (int var6 = 0; var6 < Statics.field5102; var6++) {
            Statics.field1644[var6] = var1.method8250();
        }
        var1.field4989 = arg0.length - 7 - Statics.field5102 * 8 - (var2 - 1) * 3;
        Statics.field4525 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            Statics.field4525[var7] = var1.method8252();
            if (Statics.field4525[var7] == 0) {
                Statics.field4525[var7] = 1;
            }
        }
        var1.field4989 = 0;
        for (int var8 = 0; var8 < Statics.field5102; var8++) {
            int var9 = Statics.field1302[var8];
            int var10 = Statics.field1644[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            Statics.field2113[var8] = var12;
            int var13 = var1.method8248();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method8249();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method8249();
                    }
                }
            }
        }
    }

    @ObfuscatedName("pk.ay(I)V")
    public static void method7059() {
        Statics.field5101 = null;
        Statics.field94 = null;
        Statics.field1302 = null;
        Statics.field1644 = null;
        Statics.field4525 = null;
        Statics.field2113 = (byte[][]) null;
    }
}
