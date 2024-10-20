package deob;

@ObfuscatedName("ap")
public class class45 extends class195 {

    @ObfuscatedName("ap.k")
    public static class184 field1023 = new class184(64);

    @ObfuscatedName("ap.e")
    public char field1024;

    @ObfuscatedName("ap.f")
    public char field1025;

    @ObfuscatedName("ap.w")
    public String field1033 = "null";

    @ObfuscatedName("ap.t")
    public int field1026;

    @ObfuscatedName("ap.s")
    public int field1029 = 0;

    @ObfuscatedName("ap.c")
    public int[] field1028;

    @ObfuscatedName("ap.d")
    public int[] field1030;

    @ObfuscatedName("ap.v")
    public String[] field1031;

    @ObfuscatedName("f.p(Lff;I)V")
    public static void method32(class158 arg0) {
        Statics.field1022 = arg0;
    }

    @ObfuscatedName("fr.k(IB)Lap;")
    public static class45 method3031(int arg0) {
        class45 var1 = (class45) field1023.method3371((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1022.method2896(8, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method860(new class111(var2));
        }
        field1023.method3370(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.e(Lde;I)V")
    public void method860(class111 arg0) {
        while (true) {
            int var2 = arg0.method2314();
            if (var2 == 0) {
                return;
            }
            this.method861(arg0, var2);
        }
    }

    @ObfuscatedName("ap.f(Lde;IS)V")
    public void method861(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1024 = (char) arg0.method2314();
        } else if (arg1 == 2) {
            this.field1025 = (char) arg0.method2314();
        } else if (arg1 == 3) {
            this.field1033 = arg0.method2265();
        } else if (arg1 == 4) {
            this.field1026 = arg0.method2350();
        } else if (arg1 == 5) {
            this.field1029 = arg0.method2177();
            this.field1028 = new int[this.field1029];
            this.field1031 = new String[this.field1029];
            for (int var3 = 0; var3 < this.field1029; var3++) {
                this.field1028[var3] = arg0.method2350();
                this.field1031[var3] = arg0.method2265();
            }
        } else if (arg1 == 6) {
            this.field1029 = arg0.method2177();
            this.field1028 = new int[this.field1029];
            this.field1030 = new int[this.field1029];
            for (int var4 = 0; var4 < this.field1029; var4++) {
                this.field1028[var4] = arg0.method2350();
                this.field1030[var4] = arg0.method2350();
            }
        }
    }
}
