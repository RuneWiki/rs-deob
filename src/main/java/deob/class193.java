package deob;

@ObfuscatedName("gg")
public final class class193 {

    @ObfuscatedName("gg.k")
    public class204 field3076 = new class204();

    @ObfuscatedName("gg.h")
    public int field3074;

    @ObfuscatedName("gg.o")
    public int field3073;

    @ObfuscatedName("gg.z")
    public class196 field3075;

    @ObfuscatedName("gg.c")
    public class203 field3077 = new class203();

    public class193(int arg0) {
        this.field3074 = arg0;
        this.field3073 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3075 = new class196(var2);
    }

    @ObfuscatedName("gg.k(J)Lgl;")
    public class204 method3510(long arg0) {
        class204 var3 = (class204) this.field3075.method3559(arg0);
        if (var3 != null) {
            this.field3077.method3627(var3);
        }
        return var3;
    }

    @ObfuscatedName("gg.h(J)V")
    public void method3511(long arg0) {
        class204 var3 = (class204) this.field3075.method3559(arg0);
        if (var3 != null) {
            var3.method3679();
            var3.method3649();
            this.field3073++;
        }
    }

    @ObfuscatedName("gg.o(Lgl;J)V")
    public void method3512(class204 arg0, long arg1) {
        if (this.field3073 == 0) {
            class204 var4 = this.field3077.method3630();
            var4.method3679();
            var4.method3649();
            if (this.field3076 == var4) {
                class204 var5 = this.field3077.method3630();
                var5.method3679();
                var5.method3649();
            }
        } else {
            this.field3073--;
        }
        this.field3075.method3560(arg0, arg1);
        this.field3077.method3627(arg0);
    }

    @ObfuscatedName("gg.z()V")
    public void method3518() {
        this.field3077.method3633();
        this.field3075.method3547();
        this.field3076 = new class204();
        this.field3073 = this.field3074;
    }
}
