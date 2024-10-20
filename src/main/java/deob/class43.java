package deob;

@ObfuscatedName("ac")
public class class43 extends class182 {

    @ObfuscatedName("ac.c")
    public static class171 field991 = new class171(64);

    @ObfuscatedName("ac.h")
    public char field990;

    @ObfuscatedName("ac.v")
    public char field993;

    @ObfuscatedName("ac.q")
    public String field994 = "null";

    @ObfuscatedName("ac.s")
    public int field992;

    @ObfuscatedName("ac.g")
    public int field997 = 0;

    @ObfuscatedName("ac.u")
    public int[] field998;

    @ObfuscatedName("ac.d")
    public int[] field996;

    @ObfuscatedName("ac.y")
    public String[] field999;

    @ObfuscatedName("ac.i(Ldm;B)V")
    public void method834(class107 arg0) {
        while (true) {
            int var2 = arg0.method2151();
            if (var2 == 0) {
                return;
            }
            this.method833(arg0, var2);
        }
    }

    @ObfuscatedName("ac.c(Ldm;II)V")
    public void method833(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field990 = (char) arg0.method2151();
        } else if (arg1 == 2) {
            this.field993 = (char) arg0.method2151();
        } else if (arg1 == 3) {
            this.field994 = arg0.method2159();
        } else if (arg1 == 4) {
            this.field992 = arg0.method2156();
        } else if (arg1 == 5) {
            this.field997 = arg0.method2313();
            this.field998 = new int[this.field997];
            this.field999 = new String[this.field997];
            for (int var3 = 0; var3 < this.field997; var3++) {
                this.field998[var3] = arg0.method2156();
                this.field999[var3] = arg0.method2159();
            }
        } else if (arg1 == 6) {
            this.field997 = arg0.method2313();
            this.field998 = new int[this.field997];
            this.field996 = new int[this.field997];
            for (int var4 = 0; var4 < this.field997; var4++) {
                this.field998[var4] = arg0.method2156();
                this.field996[var4] = arg0.method2156();
            }
        }
    }
}
