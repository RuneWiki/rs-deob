package deob;

@ObfuscatedName("ds")
public class class81 extends class484 {

    @ObfuscatedName("ds.ac")
    public static class302 field1006 = new class302(128);

    @ObfuscatedName("ds.al")
    public String field1005;

    @ObfuscatedName("ds.ak")
    public int[] field1013;

    @ObfuscatedName("ds.ax")
    public int[] field1007;

    @ObfuscatedName("ds.ao")
    public String[] field1014;

    @ObfuscatedName("ds.ah")
    public int field1010;

    @ObfuscatedName("ds.ar")
    public int field1004;

    @ObfuscatedName("ds.ab")
    public int field1011;

    @ObfuscatedName("ds.am")
    public int field1012;

    @ObfuscatedName("ds.av")
    public class503[] field1008;

    @ObfuscatedName("by.ac(IB)Lds;")
    public static class81 method411(int arg0) {
        class81 var1 = (class81) field1006.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4578.method6342(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class81 var3 = method3911(var2);
            field1006.method5289(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("bv.al(IIIB)Lds;")
    public static class81 method448(int arg0, int arg1, int arg2) {
        int var3 = class365.method2905(arg1, arg0);
        class81 var4 = method661(var3, arg0);
        if (var4 != null) {
            return var4;
        }
        int var5 = class365.method6134(arg2, arg0);
        class81 var6 = method661(var5, arg0);
        if (var6 == null) {
            int var7 = class365.method287(arg0);
            class81 var8 = method661(var7, arg0);
            return var8 == null ? null : var8;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("bo.ak(III)Lds;")
    public static class81 method661(int arg0, int arg1) {
        class81 var2 = (class81) field1006.method5286((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field4578.method6279(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field4578.method6269(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class81 var6 = method3911(var5);
            if (var6 != null) {
                field1006.method5289(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("ib.ax([BI)Lds;")
    public static class81 method3911(byte[] arg0) {
        class81 var1 = new class81();
        class530 var2 = new class530(arg0);
        var2.field5140 = var2.field5139.length - 2;
        int var3 = var2.method8598();
        int var4 = var2.field5139.length - 2 - var3 - 12;
        var2.field5140 = var4;
        int var5 = var2.method8371();
        var1.field1010 = var2.method8598();
        var1.field1004 = var2.method8598();
        var1.field1011 = var2.method8598();
        var1.field1012 = var2.method8598();
        int var6 = var2.method8365();
        if (var6 > 0) {
            var1.field1008 = var1.method2105(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method8598();
                class503 var9 = new class503(var8 > 0 ? class318.method3444(var8) : 1);
                var1.field1008[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method8371();
                    int var11 = var2.method8371();
                    var9.method8071(new class487(var11), (long) var10);
                }
            }
        }
        var2.field5140 = 0;
        var1.field1005 = var2.method8375();
        var1.field1013 = new int[var5];
        var1.field1007 = new int[var5];
        var1.field1014 = new String[var5];
        int var12 = 0;
        while (var2.field5140 < var4) {
            int var13 = var2.method8598();
            if (var13 == 3) {
                var1.field1014[var12] = var2.method8588();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1007[var12] = var2.method8365();
            } else {
                var1.field1007[var12] = var2.method8371();
            }
            var1.field1013[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("ds.ao(II)[Ltp;")
    public class503[] method2105(int arg0) {
        return new class503[arg0];
    }
}
