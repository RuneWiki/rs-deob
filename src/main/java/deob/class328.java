package deob;

@ObfuscatedName("lv")
public final class class328 {

    @ObfuscatedName("lv.x")
    public int field3852;

    @ObfuscatedName("lv.m")
    public class190[] field3853;

    @ObfuscatedName("lv.k")
    public class190 field3851;

    @ObfuscatedName("lv.d")
    public class190 field3850;

    @ObfuscatedName("lv.w")
    public int field3849 = 0;

    public class328(int arg0) {
        this.field3852 = arg0;
        this.field3853 = new class190[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class190 var3 = this.field3853[var2] = new class190();
            var3.field2118 = var3;
            var3.field2116 = var3;
        }
    }

    @ObfuscatedName("lv.x(J)Lga;")
    public class190 method5561(long arg0) {
        class190 var3 = this.field3853[(int) (arg0 & (long) (this.field3852 - 1))];
        for (this.field3851 = var3.field2118; this.field3851 != var3; this.field3851 = this.field3851.field2118) {
            if (this.field3851.field2117 == arg0) {
                class190 var4 = this.field3851;
                this.field3851 = this.field3851.field2118;
                return var4;
            }
        }
        this.field3851 = null;
        return null;
    }

    @ObfuscatedName("lv.m(Lga;J)V")
    public void method5548(class190 arg0, long arg1) {
        if (arg0.field2116 != null) {
            arg0.method3355();
        }
        class190 var4 = this.field3853[(int) (arg1 & (long) (this.field3852 - 1))];
        arg0.field2116 = var4.field2116;
        arg0.field2118 = var4;
        arg0.field2116.field2118 = arg0;
        arg0.field2118.field2116 = arg0;
        arg0.field2117 = arg1;
    }

    @ObfuscatedName("lv.k()Lga;")
    public class190 method5546() {
        this.field3849 = 0;
        return this.method5554();
    }

    @ObfuscatedName("lv.d()Lga;")
    public class190 method5554() {
        if (this.field3849 > 0 && this.field3853[this.field3849 - 1] != this.field3850) {
            class190 var1 = this.field3850;
            this.field3850 = var1.field2118;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3849 >= this.field3852) {
                return null;
            }
            var2 = this.field3853[this.field3849++].field2118;
        } while (this.field3853[this.field3849 - 1] == var2);
        this.field3850 = var2.field2118;
        return var2;
    }
}
