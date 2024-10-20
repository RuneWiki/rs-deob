package deob;

@ObfuscatedName("fs")
public final class class174 {

    @ObfuscatedName("fs.g")
    public int field2851;

    @ObfuscatedName("fs.v")
    public class186[] field2850;

    @ObfuscatedName("fs.z")
    public class186 field2852;

    @ObfuscatedName("fs.h")
    public class186 field2853;

    @ObfuscatedName("fs.k")
    public int field2854 = 0;

    public class174(int arg0) {
        this.field2851 = arg0;
        this.field2850 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2850[var2] = new class186();
            var3.field2876 = var3;
            var3.field2877 = var3;
        }
    }

    @ObfuscatedName("fs.g(J)Lgc;")
    public class186 method3201(long arg0) {
        class186 var3 = this.field2850[(int) (arg0 & (long) (this.field2851 - 1))];
        for (this.field2852 = var3.field2876; this.field2852 != var3; this.field2852 = this.field2852.field2876) {
            if (this.field2852.field2875 == arg0) {
                class186 var4 = this.field2852;
                this.field2852 = this.field2852.field2876;
                return var4;
            }
        }
        this.field2852 = null;
        return null;
    }

    @ObfuscatedName("fs.v(Lgc;J)V")
    public void method3202(class186 arg0, long arg1) {
        if (arg0.field2877 != null) {
            arg0.method3322();
        }
        class186 var4 = this.field2850[(int) (arg1 & (long) (this.field2851 - 1))];
        arg0.field2877 = var4.field2877;
        arg0.field2876 = var4;
        arg0.field2877.field2876 = arg0;
        arg0.field2876.field2877 = arg0;
        arg0.field2875 = arg1;
    }

    @ObfuscatedName("fs.z()V")
    public void method3200() {
        for (int var1 = 0; var1 < this.field2851; var1++) {
            class186 var2 = this.field2850[var1];
            while (true) {
                class186 var3 = var2.field2876;
                if (var2 == var3) {
                    break;
                }
                var3.method3322();
            }
        }
        this.field2852 = null;
        this.field2853 = null;
    }

    @ObfuscatedName("fs.h()Lgc;")
    public class186 method3204() {
        this.field2854 = 0;
        return this.method3203();
    }

    @ObfuscatedName("fs.k()Lgc;")
    public class186 method3203() {
        if (this.field2854 > 0 && this.field2850[this.field2854 - 1] != this.field2853) {
            class186 var1 = this.field2853;
            this.field2853 = var1.field2876;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2854 >= this.field2851) {
                return null;
            }
            var2 = this.field2850[this.field2854++].field2876;
        } while (this.field2850[this.field2854 - 1] == var2);
        this.field2853 = var2.field2876;
        return var2;
    }
}
