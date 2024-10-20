package deob;

@ObfuscatedName("av")
public class class44 extends class187 {

    @ObfuscatedName("av.e")
    public static class176 field988 = new class176(64);

    @ObfuscatedName("av.i")
    public char field989;

    @ObfuscatedName("av.k")
    public char field990;

    @ObfuscatedName("av.h")
    public String field991 = "null";

    @ObfuscatedName("av.p")
    public int field987;

    @ObfuscatedName("av.n")
    public int field992 = 0;

    @ObfuscatedName("av.o")
    public int[] field996;

    @ObfuscatedName("av.g")
    public int[] field995;

    @ObfuscatedName("av.z")
    public String[] field999;

    @ObfuscatedName("av.b(Ldc;I)V")
    public void method836(class110 arg0) {
        while (true) {
            int var2 = arg0.method2142();
            if (var2 == 0) {
                return;
            }
            this.method838(arg0, var2);
        }
    }

    @ObfuscatedName("av.e(Ldc;IB)V")
    public void method838(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field989 = (char) arg0.method2142();
        } else if (arg1 == 2) {
            this.field990 = (char) arg0.method2142();
        } else if (arg1 == 3) {
            this.field991 = arg0.method2150();
        } else if (arg1 == 4) {
            this.field987 = arg0.method2195();
        } else if (arg1 == 5) {
            this.field992 = arg0.method2292();
            this.field996 = new int[this.field992];
            this.field999 = new String[this.field992];
            for (int var3 = 0; var3 < this.field992; var3++) {
                this.field996[var3] = arg0.method2195();
                this.field999[var3] = arg0.method2150();
            }
        } else if (arg1 == 6) {
            this.field992 = arg0.method2292();
            this.field996 = new int[this.field992];
            this.field995 = new int[this.field992];
            for (int var4 = 0; var4 < this.field992; var4++) {
                this.field996[var4] = arg0.method2195();
                this.field995[var4] = arg0.method2195();
            }
        }
    }
}
