package deob;

@ObfuscatedName("jo")
public class class240 extends class246 {

    @ObfuscatedName("jo.at")
    public int field2511;

    @ObfuscatedName("jo.ah")
    public int field2510;

    @ObfuscatedName("jo.ar")
    public int field2509;

    @ObfuscatedName("jo.ao")
    public int field2508;

    @ObfuscatedName("jo.at(Luj;I)V")
    public void method4393(class527 arg0) {
        int var2 = arg0.method8410();
        if (class252.field2608.field2607 != var2) {
            throw new IllegalStateException("");
        }
        this.field2565 = arg0.method8410();
        this.field2573 = arg0.method8410();
        this.field2575 = arg0.method8412();
        this.field2562 = arg0.method8412();
        this.field2511 = arg0.method8410();
        this.field2510 = arg0.method8410();
        this.field2563 = arg0.method8412();
        this.field2564 = arg0.method8412();
        this.field2509 = arg0.method8410();
        this.field2508 = arg0.method8410();
        this.field2567 = arg0.method8430();
        this.field2568 = arg0.method8430();
    }

    @ObfuscatedName("jo.ah(Luj;B)V")
    public void method4104(class527 arg0) {
        this.field2573 = Math.min(this.field2573, 4);
        this.field2569 = new short[1][64][64];
        this.field2570 = new short[this.field2573][64][64];
        this.field2561 = new byte[this.field2573][64][64];
        this.field2572 = new byte[this.field2573][64][64];
        this.field2571 = new class248[this.field2573][64][64][];
        int var2 = arg0.method8410();
        if (class251.field2603.field2604 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8410();
        int var4 = arg0.method8410();
        int var5 = arg0.method8410();
        int var6 = arg0.method8410();
        if (this.field2563 != var3 || this.field2564 != var4 || this.field2509 != var5 || this.field2508 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4450(this.field2509 * 8 + var7, this.field2508 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class240)) {
            return false;
        }
        class240 var2 = (class240) arg0;
        if (this.field2563 == var2.field2563 && this.field2564 == var2.field2564) {
            return this.field2509 == var2.field2509 && this.field2508 == var2.field2508;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2563 | this.field2564 << 8 | this.field2509 << 16 | this.field2508 << 24;
    }

    @ObfuscatedName("jo.ar(I)I")
    public int method4395() {
        return this.field2511;
    }

    @ObfuscatedName("jo.ao(B)I")
    public int method4396() {
        return this.field2510;
    }

    @ObfuscatedName("jo.ab(B)I")
    public int method4412() {
        return this.field2509;
    }

    @ObfuscatedName("jo.az(B)I")
    public int method4409() {
        return this.field2508;
    }
}
