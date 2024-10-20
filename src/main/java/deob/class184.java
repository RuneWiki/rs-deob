package deob;

@ObfuscatedName("go")
public class class184 extends class428 {

    @ObfuscatedName("go.e")
    public static class269 field2004 = new class269(64);

    @ObfuscatedName("go.v")
    public char field1999;

    @ObfuscatedName("go.x")
    public char field2000;

    @ObfuscatedName("go.m")
    public String field2001 = class326.field3819;

    @ObfuscatedName("go.q")
    public int field2002;

    @ObfuscatedName("go.f")
    public int field2003 = 0;

    @ObfuscatedName("go.r")
    public int[] field1998;

    @ObfuscatedName("go.u")
    public int[] field2006;

    @ObfuscatedName("go.b")
    public String[] field2005;

    @ObfuscatedName("ip.h(Lly;I)V")
    public static void method4472(class333 arg0) {
        Statics.field4263 = arg0;
    }

    @ObfuscatedName("cp.e(II)Lgo;")
    public static class184 method2161(int arg0) {
        class184 var1 = (class184) field2004.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4263.method5909(8, arg0);
        class184 var3 = new class184();
        if (var2 != null) {
            var3.method3297(new class467(var2));
        }
        field2004.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("go.v(Lqy;I)V")
    public void method3297(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3299(arg0, var2);
        }
    }

    @ObfuscatedName("go.x(Lqy;IS)V")
    public void method3299(class467 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1999 = (char) arg0.method7792();
        } else if (arg1 == 2) {
            this.field2000 = (char) arg0.method7792();
        } else if (arg1 == 3) {
            this.field2001 = arg0.method7801();
        } else if (arg1 == 4) {
            this.field2002 = arg0.method7946();
        } else if (arg1 == 5) {
            this.field2003 = arg0.method7794();
            this.field1998 = new int[this.field2003];
            this.field2005 = new String[this.field2003];
            for (int var3 = 0; var3 < this.field2003; var3++) {
                this.field1998[var3] = arg0.method7946();
                this.field2005[var3] = arg0.method7801();
            }
        } else if (arg1 == 6) {
            this.field2003 = arg0.method7794();
            this.field1998 = new int[this.field2003];
            this.field2006 = new int[this.field2003];
            for (int var4 = 0; var4 < this.field2003; var4++) {
                this.field1998[var4] = arg0.method7946();
                this.field2006[var4] = arg0.method7946();
            }
        }
    }

    @ObfuscatedName("go.m(I)I")
    public int method3302() {
        return this.field2003;
    }
}
