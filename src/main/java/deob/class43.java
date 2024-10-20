package deob;

@ObfuscatedName("av")
public class class43 extends class182 {

    @ObfuscatedName("av.o")
    public static class171 field983 = new class171(64);

    @ObfuscatedName("av.i")
    public char field989;

    @ObfuscatedName("av.p")
    public char field982;

    @ObfuscatedName("av.c")
    public String field985 = "null";

    @ObfuscatedName("av.y")
    public int field980;

    @ObfuscatedName("av.g")
    public int field975 = 0;

    @ObfuscatedName("av.l")
    public int[] field979;

    @ObfuscatedName("av.h")
    public int[] field978;

    @ObfuscatedName("av.n")
    public String[] field984;

    @ObfuscatedName("av.t(Ldg;B)V")
    public void method811(class107 arg0) {
        while (true) {
            int var2 = arg0.method2118();
            if (var2 == 0) {
                return;
            }
            this.method812(arg0, var2);
        }
    }

    @ObfuscatedName("av.o(Ldg;II)V")
    public void method812(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field989 = (char) arg0.method2118();
        } else if (arg1 == 2) {
            this.field982 = (char) arg0.method2118();
        } else if (arg1 == 3) {
            this.field985 = arg0.method2126();
        } else if (arg1 == 4) {
            this.field980 = arg0.method2152();
        } else if (arg1 == 5) {
            this.field975 = arg0.method2120();
            this.field979 = new int[this.field975];
            this.field984 = new String[this.field975];
            for (int var3 = 0; var3 < this.field975; var3++) {
                this.field979[var3] = arg0.method2152();
                this.field984[var3] = arg0.method2126();
            }
        } else if (arg1 == 6) {
            this.field975 = arg0.method2120();
            this.field979 = new int[this.field975];
            this.field978 = new int[this.field975];
            for (int var4 = 0; var4 < this.field975; var4++) {
                this.field979[var4] = arg0.method2152();
                this.field978[var4] = arg0.method2152();
            }
        }
    }
}
