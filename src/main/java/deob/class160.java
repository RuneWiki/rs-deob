package deob;

@ObfuscatedName("fm")
public class class160 extends class142 {

    @ObfuscatedName("fm.l")
    public static class100 field2418 = new class100(64);

    @ObfuscatedName("fm.i")
    public int field2425;

    @ObfuscatedName("fm.e")
    public char field2419;

    @ObfuscatedName("fm.a")
    public String field2420 = "null";

    @ObfuscatedName("fm.g")
    public int field2424;

    @ObfuscatedName("fm.w")
    public int field2422 = 0;

    @ObfuscatedName("fm.v")
    public int[] field2423;

    @ObfuscatedName("fm.u")
    public int[] field2417;

    @ObfuscatedName("fm.m")
    public String[] field2416;

    @ObfuscatedName("bj.i(Lcy;I)V")
    public static void method737(class86 arg0) {
        Statics.field2421 = arg0;
    }

    @ObfuscatedName("fm.e(Lec;I)V")
    public void method2491(class135 arg0) {
        while (true) {
            int var2 = arg0.method1571();
            if (var2 == 0) {
                return;
            }
            this.method2487(arg0, var2);
        }
    }

    @ObfuscatedName("fm.a(Lec;II)V")
    public void method2487(class135 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2425 = arg0.method1571();
        } else if (arg1 == 2) {
            this.field2419 = (char) arg0.method1571();
        } else if (arg1 == 3) {
            this.field2420 = arg0.method1716();
        } else if (arg1 == 4) {
            this.field2424 = arg0.method1616();
        } else if (arg1 == 5) {
            this.field2422 = arg0.method1725();
            this.field2423 = new int[this.field2422];
            this.field2416 = new String[this.field2422];
            for (int var3 = 0; var3 < this.field2422; var3++) {
                this.field2423[var3] = arg0.method1616();
                this.field2416[var3] = arg0.method1716();
            }
        } else if (arg1 == 6) {
            this.field2422 = arg0.method1725();
            this.field2423 = new int[this.field2422];
            this.field2417 = new int[this.field2422];
            for (int var4 = 0; var4 < this.field2422; var4++) {
                this.field2423[var4] = arg0.method1616();
                this.field2417[var4] = arg0.method1616();
            }
        }
    }
}
