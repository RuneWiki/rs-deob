package deob;

@ObfuscatedName("as")
public class class45 extends class195 {

    @ObfuscatedName("as.e")
    public static class184 field1013 = new class184(64);

    @ObfuscatedName("as.a")
    public char field1010;

    @ObfuscatedName("as.k")
    public char field1004;

    @ObfuscatedName("as.p")
    public String field1005 = "null";

    @ObfuscatedName("as.l")
    public int field1008;

    @ObfuscatedName("as.u")
    public int field1007 = 0;

    @ObfuscatedName("as.o")
    public int[] field1002;

    @ObfuscatedName("as.m")
    public int[] field1009;

    @ObfuscatedName("as.q")
    public String[] field1001;

    @ObfuscatedName("y.b(Lfj;B)V")
    public static void method526(class158 arg0) {
        Statics.field1006 = arg0;
    }

    @ObfuscatedName("cj.e(II)Las;")
    public static class45 method2057(int arg0) {
        class45 var1 = (class45) field1013.method3254((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1006.method2819(8, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method843(new class111(var2));
        }
        field1013.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.a(Ldj;I)V")
    public void method843(class111 arg0) {
        while (true) {
            int var2 = arg0.method2127();
            if (var2 == 0) {
                return;
            }
            this.method847(arg0, var2);
        }
    }

    @ObfuscatedName("as.k(Ldj;II)V")
    public void method847(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1010 = (char) arg0.method2127();
        } else if (arg1 == 2) {
            this.field1004 = (char) arg0.method2127();
        } else if (arg1 == 3) {
            this.field1005 = arg0.method2166();
        } else if (arg1 == 4) {
            this.field1008 = arg0.method2194();
        } else if (arg1 == 5) {
            this.field1007 = arg0.method2129();
            this.field1002 = new int[this.field1007];
            this.field1001 = new String[this.field1007];
            for (int var3 = 0; var3 < this.field1007; var3++) {
                this.field1002[var3] = arg0.method2194();
                this.field1001[var3] = arg0.method2166();
            }
        } else if (arg1 == 6) {
            this.field1007 = arg0.method2129();
            this.field1002 = new int[this.field1007];
            this.field1009 = new int[this.field1007];
            for (int var4 = 0; var4 < this.field1007; var4++) {
                this.field1002[var4] = arg0.method2194();
                this.field1009[var4] = arg0.method2194();
            }
        }
    }
}
