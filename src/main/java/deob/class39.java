package deob;

@ObfuscatedName("al")
public class class39 extends class174 {

    @ObfuscatedName("al.l")
    public static class170 field955 = new class170(64);

    @ObfuscatedName("al.d")
    public char field966;

    @ObfuscatedName("al.x")
    public char field963;

    @ObfuscatedName("al.o")
    public String field957 = "null";

    @ObfuscatedName("al.a")
    public int field954;

    @ObfuscatedName("al.w")
    public int field960 = 0;

    @ObfuscatedName("al.i")
    public int[] field961;

    @ObfuscatedName("al.y")
    public int[] field962;

    @ObfuscatedName("al.m")
    public String[] field959;

    @ObfuscatedName("x.p(Leh;I)V")
    public static void method22(class153 arg0) {
        Statics.field967 = arg0;
    }

    @ObfuscatedName("o.l(IB)Lal;")
    public static class39 method34(int arg0) {
        class39 var1 = (class39) field955.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field967.method3078(8, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method838(new class127(var2));
        }
        field955.method3364(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.d(Lds;I)V")
    public void method838(class127 arg0) {
        while (true) {
            int var2 = arg0.method2498();
            if (var2 == 0) {
                return;
            }
            this.method822(arg0, var2);
        }
    }

    @ObfuscatedName("al.x(Lds;II)V")
    public void method822(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field966 = (char) arg0.method2498();
        } else if (arg1 == 2) {
            this.field963 = (char) arg0.method2498();
        } else if (arg1 == 3) {
            this.field957 = arg0.method2506();
        } else if (arg1 == 4) {
            this.field954 = arg0.method2489();
        } else if (arg1 == 5) {
            this.field960 = arg0.method2581();
            this.field961 = new int[this.field960];
            this.field959 = new String[this.field960];
            for (int var3 = 0; var3 < this.field960; var3++) {
                this.field961[var3] = arg0.method2489();
                this.field959[var3] = arg0.method2506();
            }
        } else if (arg1 == 6) {
            this.field960 = arg0.method2581();
            this.field961 = new int[this.field960];
            this.field962 = new int[this.field960];
            for (int var4 = 0; var4 < this.field960; var4++) {
                this.field961[var4] = arg0.method2489();
                this.field962[var4] = arg0.method2489();
            }
        }
    }
}
