package deob;

@ObfuscatedName("fk")
public final class class171 {

    @ObfuscatedName("fk.e")
    public class182 field2836 = new class182();

    @ObfuscatedName("fk.o")
    public int field2837;

    @ObfuscatedName("fk.y")
    public int field2838;

    @ObfuscatedName("fk.b")
    public class174 field2839;

    @ObfuscatedName("fk.w")
    public class181 field2840 = new class181();

    public class171(int arg0) {
        this.field2837 = arg0;
        this.field2838 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2839 = new class174(var2);
    }

    @ObfuscatedName("fk.e(J)Lfm;")
    public class182 method3058(long arg0) {
        class182 var3 = (class182) this.field2839.method3092(arg0);
        if (var3 != null) {
            this.field2840.method3171(var3);
        }
        return var3;
    }

    @ObfuscatedName("fk.o(J)V")
    public void method3059(long arg0) {
        class182 var3 = (class182) this.field2839.method3092(arg0);
        if (var3 != null) {
            var3.method3204();
            var3.method3187();
            this.field2838++;
        }
    }

    @ObfuscatedName("fk.y(Lfm;J)V")
    public void method3057(class182 arg0, long arg1) {
        if (this.field2838 == 0) {
            class182 var4 = this.field2840.method3170();
            var4.method3204();
            var4.method3187();
            if (this.field2836 == var4) {
                class182 var5 = this.field2840.method3170();
                var5.method3204();
                var5.method3187();
            }
        } else {
            this.field2838--;
        }
        this.field2839.method3091(arg0, arg1);
        this.field2840.method3171(arg0);
    }

    @ObfuscatedName("fk.b()V")
    public void method3065() {
        this.field2840.method3175();
        this.field2839.method3094();
        this.field2836 = new class182();
        this.field2838 = this.field2837;
    }
}
