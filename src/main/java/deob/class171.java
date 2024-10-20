package deob;

@ObfuscatedName("fy")
public final class class171 {

    @ObfuscatedName("fy.z")
    public class181 field2823 = new class181();

    @ObfuscatedName("fy.j")
    public int field2824;

    @ObfuscatedName("fy.a")
    public int field2827;

    @ObfuscatedName("fy.y")
    public class174 field2826;

    @ObfuscatedName("fy.i")
    public class180 field2825 = new class180();

    public class171(int arg0) {
        this.field2824 = arg0;
        this.field2827 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2826 = new class174(var2);
    }

    @ObfuscatedName("fy.z(J)Lfe;")
    public class181 method3162(long arg0) {
        class181 var3 = (class181) this.field2826.method3204(arg0);
        if (var3 != null) {
            this.field2825.method3271(var3);
        }
        return var3;
    }

    @ObfuscatedName("fy.j(J)V")
    public void method3163(long arg0) {
        class181 var3 = (class181) this.field2826.method3204(arg0);
        if (var3 != null) {
            var3.method3311();
            var3.method3294();
            this.field2827++;
        }
    }

    @ObfuscatedName("fy.a(Lfe;J)V")
    public void method3171(class181 arg0, long arg1) {
        if (this.field2827 == 0) {
            class181 var4 = this.field2825.method3286();
            var4.method3311();
            var4.method3294();
            if (this.field2823 == var4) {
                class181 var5 = this.field2825.method3286();
                var5.method3311();
                var5.method3294();
            }
        } else {
            this.field2827--;
        }
        this.field2826.method3205(arg0, arg1);
        this.field2825.method3271(arg0);
    }

    @ObfuscatedName("fy.y()V")
    public void method3164() {
        this.field2825.method3292();
        this.field2826.method3209();
        this.field2823 = new class181();
        this.field2827 = this.field2824;
    }
}
