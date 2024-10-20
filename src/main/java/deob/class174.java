package deob;

@ObfuscatedName("fs")
public final class class174 {

    @ObfuscatedName("fs.t")
    public int field2841;

    @ObfuscatedName("fs.o")
    public class186[] field2840;

    @ObfuscatedName("fs.i")
    public class186 field2842;

    @ObfuscatedName("fs.p")
    public class186 field2843;

    @ObfuscatedName("fs.c")
    public int field2839 = 0;

    public class174(int arg0) {
        this.field2841 = arg0;
        this.field2840 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2840[var2] = new class186();
            var3.field2864 = var3;
            var3.field2865 = var3;
        }
    }

    @ObfuscatedName("fs.t(J)Lgh;")
    public class186 method3138(long arg0) {
        class186 var3 = this.field2840[(int) (arg0 & (long) (this.field2841 - 1))];
        for (this.field2842 = var3.field2864; this.field2842 != var3; this.field2842 = this.field2842.field2864) {
            if (this.field2842.field2866 == arg0) {
                class186 var4 = this.field2842;
                this.field2842 = this.field2842.field2864;
                return var4;
            }
        }
        this.field2842 = null;
        return null;
    }

    @ObfuscatedName("fs.o(Lgh;J)V")
    public void method3132(class186 arg0, long arg1) {
        if (arg0.field2865 != null) {
            arg0.method3261();
        }
        class186 var4 = this.field2840[(int) (arg1 & (long) (this.field2841 - 1))];
        arg0.field2865 = var4.field2865;
        arg0.field2864 = var4;
        arg0.field2865.field2864 = arg0;
        arg0.field2864.field2865 = arg0;
        arg0.field2866 = arg1;
    }

    @ObfuscatedName("fs.i()V")
    public void method3130() {
        for (int var1 = 0; var1 < this.field2841; var1++) {
            class186 var2 = this.field2840[var1];
            while (true) {
                class186 var3 = var2.field2864;
                if (var2 == var3) {
                    break;
                }
                var3.method3261();
            }
        }
        this.field2842 = null;
        this.field2843 = null;
    }

    @ObfuscatedName("fs.p()Lgh;")
    public class186 method3134() {
        this.field2839 = 0;
        return this.method3135();
    }

    @ObfuscatedName("fs.c()Lgh;")
    public class186 method3135() {
        if (this.field2839 > 0 && this.field2840[this.field2839 - 1] != this.field2843) {
            class186 var1 = this.field2843;
            this.field2843 = var1.field2864;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2839 >= this.field2841) {
                return null;
            }
            var2 = this.field2840[this.field2839++].field2864;
        } while (this.field2840[this.field2839 - 1] == var2);
        this.field2843 = var2.field2864;
        return var2;
    }
}
