package deob;

@ObfuscatedName("dc")
public class class79 extends class470 {

    @ObfuscatedName("dc.aw")
    public static class289 field993 = new class289(128);

    @ObfuscatedName("dc.ay")
    public String field994;

    @ObfuscatedName("dc.ar")
    public int[] field997;

    @ObfuscatedName("dc.am")
    public int[] field998;

    @ObfuscatedName("dc.as")
    public String[] field995;

    @ObfuscatedName("dc.aj")
    public int field1000;

    @ObfuscatedName("dc.ag")
    public int field999;

    @ObfuscatedName("dc.az")
    public int field996;

    @ObfuscatedName("dc.av")
    public int field1001;

    @ObfuscatedName("dc.ap")
    public class489[] field1002;

    @ObfuscatedName("ck.aw(IB)Ldc;")
    public static class79 method1983(int arg0) {
        class79 var1 = (class79) field993.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1499.method6117(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class79 var3 = Statics.method846(var2);
            field993.method5149(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("bq.ay(IIIB)Ldc;")
    public static class79 method467(int arg0, int arg1, int arg2) {
        int var3 = class351.method2755(arg1, arg0);
        class79 var4 = method441(var3, arg0);
        if (var4 != null) {
            return var4;
        }
        int var5 = class351.method2905(arg2, arg0);
        class79 var6 = method441(var5, arg0);
        if (var6 == null) {
            int var7 = arg0 + -512;
            class79 var9 = method441(var7, arg0);
            return var9 == null ? null : var9;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("bf.ar(III)Ldc;")
    public static class79 method441(int arg0, int arg1) {
        class79 var2 = (class79) field993.method5152((long) (arg0 << 16));
        if (var2 != null) {
            return var2;
        }
        String var3 = String.valueOf(arg0);
        int var4 = Statics.field1499.method6129(var3);
        if (var4 == -1) {
            return null;
        }
        byte[] var5 = Statics.field1499.method6123(var4);
        if (var5 != null) {
            if (var5.length <= 1) {
                return null;
            }
            class79 var6 = Statics.method846(var5);
            if (var6 != null) {
                field993.method5149(var6, (long) (arg0 << 16));
                return var6;
            }
        }
        return null;
    }

    @ObfuscatedName("dc.as(II)[Lsa;")
    public class489[] method2065(int arg0) {
        return new class489[arg0];
    }
}
