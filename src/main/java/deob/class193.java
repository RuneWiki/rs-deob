package deob;

@ObfuscatedName("gb")
public final class class193 {

    @ObfuscatedName("gb.s")
    public class198 field2477 = new class198();

    @ObfuscatedName("gb.c")
    public int field2476;

    @ObfuscatedName("gb.f")
    public int field2474;

    @ObfuscatedName("gb.m")
    public class194 field2475;

    @ObfuscatedName("gb.h")
    public class188 field2478 = new class188();

    public class193(int arg0) {
        this.field2476 = arg0;
        this.field2474 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2475 = new class194(var2);
    }

    @ObfuscatedName("gb.s(J)Lgf;")
    public class198 method3319(long arg0) {
        class198 var3 = (class198) this.field2475.method3339(arg0);
        if (var3 != null) {
            this.field2478.method3268(var3);
        }
        return var3;
    }

    @ObfuscatedName("gb.c(J)V")
    public void method3314(long arg0) {
        class198 var3 = (class198) this.field2475.method3339(arg0);
        if (var3 != null) {
            var3.method3372();
            var3.method3413();
            this.field2474++;
        }
    }

    @ObfuscatedName("gb.f(Lgf;J)V")
    public void method3315(class198 arg0, long arg1) {
        if (this.field2474 == 0) {
            class198 var4 = this.field2478.method3270();
            var4.method3372();
            var4.method3413();
            if (this.field2477 == var4) {
                class198 var5 = this.field2478.method3270();
                var5.method3372();
                var5.method3413();
            }
        } else {
            this.field2474--;
        }
        this.field2475.method3330(arg0, arg1);
        this.field2478.method3268(arg0);
    }

    @ObfuscatedName("gb.m()V")
    public void method3316() {
        this.field2478.method3272();
        this.field2475.method3331();
        this.field2477 = new class198();
        this.field2474 = this.field2476;
    }
}
