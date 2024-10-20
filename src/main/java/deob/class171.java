package deob;

@ObfuscatedName("ft")
public final class class171 {

    @ObfuscatedName("ft.l")
    public class175 field2817 = new class175();

    @ObfuscatedName("ft.b")
    public int field2815;

    @ObfuscatedName("ft.o")
    public int field2814;

    @ObfuscatedName("ft.w")
    public class176 field2816;

    @ObfuscatedName("ft.r")
    public class173 field2818 = new class173();

    public class171(int arg0) {
        this.field2815 = arg0;
        this.field2814 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2816 = new class176(var2);
    }

    @ObfuscatedName("ft.l(J)Lfi;")
    public class175 method3255(long arg0) {
        class175 var3 = (class175) this.field2816.method3300(arg0);
        if (var3 != null) {
            this.field2818.method3265(var3);
        }
        return var3;
    }

    @ObfuscatedName("ft.b(J)V")
    public void method3252(long arg0) {
        class175 var3 = (class175) this.field2816.method3300(arg0);
        if (var3 != null) {
            var3.method3360();
            var3.method3298();
            this.field2814++;
        }
    }

    @ObfuscatedName("ft.o(Lfi;J)V")
    public void method3253(class175 arg0, long arg1) {
        if (this.field2814 == 0) {
            class175 var4 = this.field2818.method3279();
            var4.method3360();
            var4.method3298();
            if (this.field2817 == var4) {
                class175 var5 = this.field2818.method3279();
                var5.method3360();
                var5.method3298();
            }
        } else {
            this.field2814--;
        }
        this.field2816.method3301(arg0, arg1);
        this.field2818.method3265(arg0);
    }

    @ObfuscatedName("ft.w()V")
    public void method3254() {
        this.field2818.method3275();
        this.field2816.method3302();
        this.field2817 = new class175();
        this.field2814 = this.field2815;
    }
}
