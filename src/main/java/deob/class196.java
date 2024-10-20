package deob;

@ObfuscatedName("gx")
public class class196 extends class130 {

    @ObfuscatedName("gx.m")
    public static class125 field2855 = new class125(64);

    @ObfuscatedName("gx.b")
    public char field2857;

    @ObfuscatedName("gx.g")
    public char field2854;

    @ObfuscatedName("gx.h")
    public String field2858 = "null";

    @ObfuscatedName("gx.v")
    public int field2859;

    @ObfuscatedName("gx.l")
    public int field2860 = 0;

    @ObfuscatedName("gx.c")
    public int[] field2861;

    @ObfuscatedName("gx.u")
    public int[] field2862;

    @ObfuscatedName("gx.k")
    public String[] field2863;

    @ObfuscatedName("gx.o(Lez;B)V")
    public void method3270(class154 arg0) {
        while (true) {
            int var2 = arg0.method2552();
            if (var2 == 0) {
                return;
            }
            this.method3266(arg0, var2);
        }
    }

    @ObfuscatedName("gx.m(Lez;II)V")
    public void method3266(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2857 = (char) arg0.method2552();
        } else if (arg1 == 2) {
            this.field2854 = (char) arg0.method2552();
        } else if (arg1 == 3) {
            this.field2858 = arg0.method2606();
        } else if (arg1 == 4) {
            this.field2859 = arg0.method2557();
        } else if (arg1 == 5) {
            this.field2860 = arg0.method2554();
            this.field2861 = new int[this.field2860];
            this.field2863 = new String[this.field2860];
            for (int var3 = 0; var3 < this.field2860; var3++) {
                this.field2861[var3] = arg0.method2557();
                this.field2863[var3] = arg0.method2606();
            }
        } else if (arg1 == 6) {
            this.field2860 = arg0.method2554();
            this.field2861 = new int[this.field2860];
            this.field2862 = new int[this.field2860];
            for (int var4 = 0; var4 < this.field2860; var4++) {
                this.field2861[var4] = arg0.method2557();
                this.field2862[var4] = arg0.method2557();
            }
        }
    }
}
