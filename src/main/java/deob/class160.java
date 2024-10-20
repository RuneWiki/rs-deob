package deob;

@ObfuscatedName("fe")
public class class160 extends class142 {

    @ObfuscatedName("fe.j")
    public static class100 field2425 = new class100(64);

    @ObfuscatedName("fe.z")
    public int field2423;

    @ObfuscatedName("fe.g")
    public char field2424;

    @ObfuscatedName("fe.q")
    public String field2428 = "null";

    @ObfuscatedName("fe.i")
    public int field2426;

    @ObfuscatedName("fe.s")
    public int field2427 = 0;

    @ObfuscatedName("fe.u")
    public int[] field2421;

    @ObfuscatedName("fe.v")
    public int[] field2429;

    @ObfuscatedName("fe.w")
    public String[] field2430;

    @ObfuscatedName("ek.z(II)Lfe;")
    public static class160 method1844(int arg0) {
        class160 var1 = (class160) field2425.method1244((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2422.method1044(8, arg0);
        class160 var3 = new class160();
        if (var2 != null) {
            var3.method2509(new class135(var2));
        }
        field2425.method1246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fe.g(Lev;I)V")
    public void method2509(class135 arg0) {
        while (true) {
            int var2 = arg0.method1600();
            if (var2 == 0) {
                return;
            }
            this.method2512(arg0, var2);
        }
    }

    @ObfuscatedName("fe.q(Lev;IB)V")
    public void method2512(class135 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2423 = arg0.method1600();
        } else if (arg1 == 2) {
            this.field2424 = (char) arg0.method1600();
        } else if (arg1 == 3) {
            this.field2428 = arg0.method1693();
        } else if (arg1 == 4) {
            this.field2426 = arg0.method1605();
        } else if (arg1 == 5) {
            this.field2427 = arg0.method1602();
            this.field2421 = new int[this.field2427];
            this.field2430 = new String[this.field2427];
            for (int var3 = 0; var3 < this.field2427; var3++) {
                this.field2421[var3] = arg0.method1605();
                this.field2430[var3] = arg0.method1693();
            }
        } else if (arg1 == 6) {
            this.field2427 = arg0.method1602();
            this.field2421 = new int[this.field2427];
            this.field2429 = new int[this.field2427];
            for (int var4 = 0; var4 < this.field2427; var4++) {
                this.field2421[var4] = arg0.method1605();
                this.field2429[var4] = arg0.method1605();
            }
        }
    }
}
