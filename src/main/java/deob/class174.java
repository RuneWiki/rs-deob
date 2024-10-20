package deob;

@ObfuscatedName("fh")
public final class class174 {

    @ObfuscatedName("fh.z")
    public int field2838;

    @ObfuscatedName("fh.j")
    public class184[] field2835;

    @ObfuscatedName("fh.a")
    public class184 field2834;

    @ObfuscatedName("fh.y")
    public class184 field2836;

    @ObfuscatedName("fh.i")
    public int field2837 = 0;

    public class174(int arg0) {
        this.field2838 = arg0;
        this.field2835 = new class184[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class184 var3 = this.field2835[var2] = new class184();
            var3.field2856 = var3;
            var3.field2855 = var3;
        }
    }

    @ObfuscatedName("fh.z(J)Lgj;")
    public class184 method3204(long arg0) {
        class184 var3 = this.field2835[(int) (arg0 & (long) (this.field2838 - 1))];
        for (this.field2834 = var3.field2856; this.field2834 != var3; this.field2834 = this.field2834.field2856) {
            if (this.field2834.field2857 == arg0) {
                class184 var4 = this.field2834;
                this.field2834 = this.field2834.field2856;
                return var4;
            }
        }
        this.field2834 = null;
        return null;
    }

    @ObfuscatedName("fh.j(Lgj;J)V")
    public void method3205(class184 arg0, long arg1) {
        if (arg0.field2855 != null) {
            arg0.method3311();
        }
        class184 var4 = this.field2835[(int) (arg1 & (long) (this.field2838 - 1))];
        arg0.field2855 = var4.field2855;
        arg0.field2856 = var4;
        arg0.field2855.field2856 = arg0;
        arg0.field2856.field2855 = arg0;
        arg0.field2857 = arg1;
    }

    @ObfuscatedName("fh.a()V")
    public void method3209() {
        for (int var1 = 0; var1 < this.field2838; var1++) {
            class184 var2 = this.field2835[var1];
            while (true) {
                class184 var3 = var2.field2856;
                if (var2 == var3) {
                    break;
                }
                var3.method3311();
            }
        }
        this.field2834 = null;
        this.field2836 = null;
    }

    @ObfuscatedName("fh.y()Lgj;")
    public class184 method3197() {
        this.field2837 = 0;
        return this.method3200();
    }

    @ObfuscatedName("fh.i()Lgj;")
    public class184 method3200() {
        if (this.field2837 > 0 && this.field2835[this.field2837 - 1] != this.field2836) {
            class184 var1 = this.field2836;
            this.field2836 = var1.field2856;
            return var1;
        }
        class184 var2;
        do {
            if (this.field2837 >= this.field2838) {
                return null;
            }
            var2 = this.field2835[this.field2837++].field2856;
        } while (this.field2835[this.field2837 - 1] == var2);
        this.field2836 = var2.field2856;
        return var2;
    }
}
