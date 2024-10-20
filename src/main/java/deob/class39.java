package deob;

@ObfuscatedName("ay")
public class class39 extends class174 {

    @ObfuscatedName("ay.c")
    public static class170 field960 = new class170(64);

    @ObfuscatedName("ay.j")
    public char field974;

    @ObfuscatedName("ay.i")
    public char field962;

    @ObfuscatedName("ay.k")
    public String field969 = "null";

    @ObfuscatedName("ay.q")
    public int field964;

    @ObfuscatedName("ay.t")
    public int field965 = 0;

    @ObfuscatedName("ay.v")
    public int[] field966;

    @ObfuscatedName("ay.y")
    public int[] field963;

    @ObfuscatedName("ay.w")
    public String[] field961;

    @ObfuscatedName("fz.b(II)Lay;")
    public static class39 method3180(int arg0) {
        class39 var1 = (class39) field960.method3188((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field967.method2964(8, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method808(new class127(var2));
        }
        field960.method3190(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.c(Ldv;I)V")
    public void method808(class127 arg0) {
        while (true) {
            int var2 = arg0.method2416();
            if (var2 == 0) {
                return;
            }
            this.method809(arg0, var2);
        }
    }

    @ObfuscatedName("ay.j(Ldv;IB)V")
    public void method809(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field974 = (char) arg0.method2416();
        } else if (arg1 == 2) {
            this.field962 = (char) arg0.method2416();
        } else if (arg1 == 3) {
            this.field969 = arg0.method2473();
        } else if (arg1 == 4) {
            this.field964 = arg0.method2455();
        } else if (arg1 == 5) {
            this.field965 = arg0.method2394();
            this.field966 = new int[this.field965];
            this.field961 = new String[this.field965];
            for (int var3 = 0; var3 < this.field965; var3++) {
                this.field966[var3] = arg0.method2455();
                this.field961[var3] = arg0.method2473();
            }
        } else if (arg1 == 6) {
            this.field965 = arg0.method2394();
            this.field966 = new int[this.field965];
            this.field963 = new int[this.field965];
            for (int var4 = 0; var4 < this.field965; var4++) {
                this.field966[var4] = arg0.method2455();
                this.field963[var4] = arg0.method2455();
            }
        }
    }
}
