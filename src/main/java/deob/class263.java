package deob;

@ObfuscatedName("jw")
public class class263 extends class181 {

    @ObfuscatedName("jw.f")
    public static class146 field3387 = new class146(64);

    @ObfuscatedName("jw.q")
    public char field3394;

    @ObfuscatedName("jw.w")
    public char field3389;

    @ObfuscatedName("jw.o")
    public String field3390 = class236.field2980;

    @ObfuscatedName("jw.u")
    public int field3391;

    @ObfuscatedName("jw.g")
    public int field3392 = 0;

    @ObfuscatedName("jw.l")
    public int[] field3395;

    @ObfuscatedName("jw.e")
    public int[] field3393;

    @ObfuscatedName("jw.x")
    public String[] field3386;

    @ObfuscatedName("jw.f(Lgr;I)V")
    public void method4542(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4539(arg0, var2);
        }
    }

    @ObfuscatedName("jw.q(Lgr;II)V")
    public void method4539(class202 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3394 = (char) arg0.method3551();
        } else if (arg1 == 2) {
            this.field3389 = (char) arg0.method3551();
        } else if (arg1 == 3) {
            this.field3390 = arg0.method3426();
        } else if (arg1 == 4) {
            this.field3391 = arg0.method3620();
        } else if (arg1 == 5) {
            this.field3392 = arg0.method3530();
            this.field3395 = new int[this.field3392];
            this.field3386 = new String[this.field3392];
            for (int var3 = 0; var3 < this.field3392; var3++) {
                this.field3395[var3] = arg0.method3620();
                this.field3386[var3] = arg0.method3426();
            }
        } else if (arg1 == 6) {
            this.field3392 = arg0.method3530();
            this.field3395 = new int[this.field3392];
            this.field3393 = new int[this.field3392];
            for (int var4 = 0; var4 < this.field3392; var4++) {
                this.field3395[var4] = arg0.method3620();
                this.field3393[var4] = arg0.method3620();
            }
        }
    }

    @ObfuscatedName("jw.w(B)I")
    public int method4541() {
        return this.field3392;
    }
}
