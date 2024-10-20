package deob;

@ObfuscatedName("ii")
public class class232 extends class246 {

    @ObfuscatedName("ii.at(Luj;B)V")
    public void method4091(class527 arg0) {
        int var2 = arg0.method8410();
        if (class252.field2609.field2607 != var2) {
            throw new IllegalStateException("");
        }
        this.field2565 = arg0.method8410();
        this.field2573 = arg0.method8410();
        this.field2575 = arg0.method8412();
        this.field2562 = arg0.method8412();
        this.field2563 = arg0.method8412();
        this.field2564 = arg0.method8412();
        this.field2567 = arg0.method8430();
        this.field2568 = arg0.method8430();
    }

    @ObfuscatedName("ii.ah(Luj;B)V")
    public void method4104(class527 arg0) {
        this.field2573 = Math.min(this.field2573, 4);
        this.field2569 = new short[1][64][64];
        this.field2570 = new short[this.field2573][64][64];
        this.field2561 = new byte[this.field2573][64][64];
        this.field2572 = new byte[this.field2573][64][64];
        this.field2571 = new class248[this.field2573][64][64][];
        int var2 = arg0.method8410();
        if (class251.field2606.field2604 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8410();
        int var4 = arg0.method8410();
        if (this.field2563 != var3 || this.field2564 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4450(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class232)) {
            class232 var2 = (class232) arg0;
            return this.field2563 == var2.field2563 && this.field2564 == var2.field2564;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2563 | this.field2564 << 8;
    }
}
