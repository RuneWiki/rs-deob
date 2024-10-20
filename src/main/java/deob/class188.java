package deob;

@ObfuscatedName("gq")
public class class188 extends class435 {

    @ObfuscatedName("gq.w")
    public static class273 field2009 = new class273(64);

    @ObfuscatedName("gq.v")
    public char field2000;

    @ObfuscatedName("gq.s")
    public char field2006;

    @ObfuscatedName("gq.z")
    public String field2002 = class330.field3846;

    @ObfuscatedName("gq.j")
    public int field2003;

    @ObfuscatedName("gq.i")
    public int field2004 = 0;

    @ObfuscatedName("gq.n")
    public int[] field2005;

    @ObfuscatedName("gq.l")
    public int[] field2001;

    @ObfuscatedName("gq.k")
    public String[] field2007;

    @ObfuscatedName("cp.f(Lln;B)V")
    public static void method2205(class337 arg0) {
        Statics.field1999 = arg0;
    }

    @ObfuscatedName("dt.w(IB)Lgq;")
    public static class188 method2810(int arg0) {
        class188 var1 = (class188) field2009.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1999.method5990(8, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3394(new class474(var2));
        }
        field2009.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gq.v(Lrd;I)V")
    public void method3394(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3395(arg0, var2);
        }
    }

    @ObfuscatedName("gq.s(Lrd;II)V")
    public void method3395(class474 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2000 = (char) arg0.method7964();
        } else if (arg1 == 2) {
            this.field2006 = (char) arg0.method7964();
        } else if (arg1 == 3) {
            this.field2002 = arg0.method7983();
        } else if (arg1 == 4) {
            this.field2003 = arg0.method7979();
        } else if (arg1 == 5) {
            this.field2004 = arg0.method8032();
            this.field2005 = new int[this.field2004];
            this.field2007 = new String[this.field2004];
            for (int var3 = 0; var3 < this.field2004; var3++) {
                this.field2005[var3] = arg0.method7979();
                this.field2007[var3] = arg0.method7983();
            }
        } else if (arg1 == 6) {
            this.field2004 = arg0.method8032();
            this.field2005 = new int[this.field2004];
            this.field2001 = new int[this.field2004];
            for (int var4 = 0; var4 < this.field2004; var4++) {
                this.field2005[var4] = arg0.method7979();
                this.field2001[var4] = arg0.method7979();
            }
        }
    }

    @ObfuscatedName("gq.z(B)I")
    public int method3407() {
        return this.field2004;
    }
}
