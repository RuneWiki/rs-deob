package deob;

@ObfuscatedName("fk")
public final class class170 {

    @ObfuscatedName("fk.g")
    public class174 field2804 = new class174();

    @ObfuscatedName("fk.h")
    public int field2802;

    @ObfuscatedName("fk.s")
    public int field2803;

    @ObfuscatedName("fk.o")
    public class175 field2801;

    @ObfuscatedName("fk.p")
    public class172 field2805 = new class172();

    public class170(int arg0) {
        this.field2802 = arg0;
        this.field2803 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2801 = new class175(var2);
    }

    @ObfuscatedName("fk.g(J)Lfh;")
    public class174 method3303(long arg0) {
        class174 var3 = (class174) this.field2801.method3354(arg0);
        if (var3 != null) {
            this.field2805.method3318(var3);
        }
        return var3;
    }

    @ObfuscatedName("fk.h(J)V")
    public void method3316(long arg0) {
        class174 var3 = (class174) this.field2801.method3354(arg0);
        if (var3 != null) {
            var3.method3404();
            var3.method3345();
            this.field2803++;
        }
    }

    @ObfuscatedName("fk.s(Lfh;J)V")
    public void method3313(class174 arg0, long arg1) {
        if (this.field2803 == 0) {
            class174 var4 = this.field2805.method3320();
            var4.method3404();
            var4.method3345();
            if (this.field2804 == var4) {
                class174 var5 = this.field2805.method3320();
                var5.method3404();
                var5.method3345();
            }
        } else {
            this.field2803--;
        }
        this.field2801.method3364(arg0, arg1);
        this.field2805.method3318(arg0);
    }

    @ObfuscatedName("fk.o()V")
    public void method3306() {
        this.field2805.method3317();
        this.field2801.method3349();
        this.field2804 = new class174();
        this.field2803 = this.field2802;
    }
}
